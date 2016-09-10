package com.doberman.asouza.mvpdagger2.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doberman.asouza.mvpdagger2.R;
import com.doberman.asouza.mvpdagger2.contract.MainContract;
import com.doberman.asouza.mvpdagger2.di.contract.DaggerMainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;

import javax.inject.Inject;

/**
 * Created by asouza on 10/09/16.
 */
public class DetailedFragment extends Fragment implements MainContract.View.DetailedView{

    private static final String ARG_SECTION_NUMBER = "section_number";

    @Inject
    MainContract.Presenter.MainPresenter presenter;

    public DetailedFragment(){
    }

    public static DetailedFragment newInstance(int sectionNumber) {
        DetailedFragment fragment = new DetailedFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_detailed, container, false);

        DaggerMainPresenterComponent.builder()
                .mainPresenterModule(new MainPresenterModule()).build()
                .inject(this);

        presenter.attachDetailedView(this);

        return rootView;
    }

}
