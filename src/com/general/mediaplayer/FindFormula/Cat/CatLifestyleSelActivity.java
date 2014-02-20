package com.general.mediaplayer.FindFormula.Cat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class CatLifestyleSelActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_lifestylesel);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.cat_lifestyle_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = new Intent(CatLifestyleSelActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnKitten = (Button)findViewById(R.id.cat_lifestyle_btn_kitten);
        btnKitten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_KITTEN);

                Intent intent = new Intent(CatLifestyleSelActivity.this, CatKittenSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnIndoor = (Button)findViewById(R.id.cat_lifestyle_btn_indoor);
        btnIndoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_INDOOR);

                Intent intent = new Intent(CatLifestyleSelActivity.this, CatIndoorSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnSpayed = (Button)findViewById(R.id.cat_lifestyle_btn_spayed);
        btnSpayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_SPAYED);

                Intent intent = new Intent(CatLifestyleSelActivity.this, CatSpayedSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnSpecial = (Button)findViewById(R.id.cat_lifestyle_btn_special);
        btnSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_SPECIAL);

                Intent intent = new Intent(CatLifestyleSelActivity.this, CatSpecialSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnWet = (Button)findViewById(R.id.cat_lifestyle_btn_wet);
        btnWet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_WET);

                Intent intent = new Intent(CatLifestyleSelActivity.this, CatWetSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_lifestylesel));
    }
}