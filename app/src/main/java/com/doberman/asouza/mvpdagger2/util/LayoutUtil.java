package com.doberman.asouza.mvpdagger2.util;

import android.view.View;

/**
 * Created by asouza on 10/09/16.
 */
public class LayoutUtil {

    public static void showElement(View view) {
        view.setVisibility(View.VISIBLE);
    }

    public static void hideElement(View view) {
        view.setVisibility(View.GONE);
    }

}
