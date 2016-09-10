package com.doberman.asouza.mvpdagger2.view;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.doberman.asouza.mvpdagger2.App;
import com.doberman.asouza.mvpdagger2.R;
import com.doberman.asouza.mvpdagger2.contract.MainContract;

import com.doberman.asouza.mvpdagger2.di.contract.DaggerMainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;
import com.doberman.asouza.mvpdagger2.view.fragment.DetailedFragment;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View.MainView {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Inject
    public  MainContract.Presenter.MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainPresenterComponent.builder()
                .mainPresenterModule(new MainPresenterModule()).build()
                .inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        presenter.attachMainView(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0){
                DetailedFragment detailedFragment = DetailedFragment.newInstance(position + 1);
                return detailedFragment;
            }else if (position == 1) {
                DetailedFragment detailedFragment = DetailedFragment.newInstance(position + 1);
                return detailedFragment;
            } else {
                return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
            }
            return null;
        }
    }
}
