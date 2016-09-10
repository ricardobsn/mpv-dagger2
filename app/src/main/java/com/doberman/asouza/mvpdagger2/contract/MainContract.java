package com.doberman.asouza.mvpdagger2.contract;

/**
 * Created by asouza on 10/09/16.
 */
public interface MainContract {

    interface View {

        interface MainView {
        }

        interface SimpleView {

            void waitLoadStarterData();

            void notStarterDataFound();

            void errorWhileLoadData();

        }

        interface DetailedView {

            void waitLoadStarterData();

            void notStarterDataFound();

            void errorWhileLoadData();

        }

    }

    interface Presenter {

        interface MainPresenter {

            void attachMainView(MainContract.View.MainView mainView);
            void attachSimpleView(MainContract.View.SimpleView simpleView);
            void attachDetailedView(MainContract.View.DetailedView detailedView);

        }

    }

}
