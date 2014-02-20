package com.general.mediaplayer.FindFormula;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by donald on 2/20/14.
 */
public abstract class BaseSpotsActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract void onBtnLinkClicked();
}