package com.general.mediaplayer.FindFormula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.Cat.CatDetailViewDialog;
import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;

import java.util.ArrayList;

/**
 * Created by donald on 2/20/14.
 */
public abstract class BaseSpotsActivity extends BaseActivity {

    protected ArrayList<STDetailInfo> dogSpotsList = null;
    protected Button btnFindFormula = null;

    public void onBtnLinkClicked() {
        btnFindFormula.performClick();
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void onBtnSpotClicked(int index) {
        if (dogSpotsList != null && dogSpotsList.size() > index)
        {
            STDetailInfo info = dogSpotsList.get(index);
            final CatDetailViewDialog dialog = new CatDetailViewDialog(BaseSpotsActivity.this, R.style.NoTitleDialog);
            dialog.show();
            dialog.ShowInfo(info.headline, info.copy, info.link);
        }
    }

    public void onBtnSibilingClickedWithSize(int size, Class<?> cls) {

        final int selectedSize = _appPrefs.getSelectedSize();
        if (selectedSize == size)
            return;

        _appPrefs.setSelectedSize(size);

        Intent intent = new Intent(this, cls);
        startActivity(intent);
        if (selectedSize < size)
            overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
        else
            overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
        finish();

    }
}