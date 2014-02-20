package com.general.mediaplayer.FindFormula.Cat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class CatBreedSelActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_breedsel);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.cat_breed_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = new Intent(CatBreedSelActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnMaineCoon = (Button)findViewById(R.id.cat_breed_btn_maincoon);
        btnMaineCoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_MAINECOON);

                Intent intent = new Intent(CatBreedSelActivity.this, CatMaineCoonSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnPersian = (Button)findViewById(R.id.cat_breed_btn_persian);
        btnPersian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_PERSIAN);

                Intent intent = new Intent(CatBreedSelActivity.this, CatPersianSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnRagdoll = (Button)findViewById(R.id.cat_breed_btn_ragdoll);
        btnRagdoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_RAGDOLL);

                Intent intent = new Intent(CatBreedSelActivity.this, CatRagdollSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnSiamese = (Button)findViewById(R.id.cat_breed_btn_siamese);
        btnSiamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_SIAMESE);

                Intent intent = new Intent(CatBreedSelActivity.this, CatSiameseSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_breedsel));
    }
}