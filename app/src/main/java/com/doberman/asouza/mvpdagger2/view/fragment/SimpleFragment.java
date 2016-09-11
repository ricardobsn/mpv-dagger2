package com.doberman.asouza.mvpdagger2.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.doberman.asouza.mvpdagger2.App;
import com.doberman.asouza.mvpdagger2.R;
import com.doberman.asouza.mvpdagger2.contract.MainContract;
import com.doberman.asouza.mvpdagger2.util.LayoutUtil;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by asouza on 10/09/16.
 */
public class SimpleFragment extends Fragment implements MainContract.View.SimpleView{

    private static final String ARG_SECTION_NUMBER = "section_number";

    @Inject
    MainContract.Presenter.MainPresenter presenter;

    @BindView(R.id.layout_item_loading)
    RelativeLayout layoutItemLoading;

    public SimpleFragment(){
    }

    public static SimpleFragment newInstance(int sectionNumber) {
        SimpleFragment fragment = new SimpleFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_detailed, container, false);

        ButterKnife.bind(this, rootView);

        ((App)getActivity().getApplication()).getAppComponent().inject(this);

        presenter.attachSimpleView(this);

        showWaitFeedbackOfViews();

        return rootView;
    }

    private void showWaitFeedbackOfViews(){
        LayoutUtil.showElement(layoutItemLoading);
    }

    @Override
    public void notStarterDataFound() {

    }

    @Override
    public void errorWhileLoadData() {

    }

}
