package com.general.mediaplayer.FindFormula.Cat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class CatFormulaActivity extends BaseFormulaActivity {

    private Button btnBack = null;
    private ImageView imgSel = null;
    private ImageView imgFormula = null;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_formula);


        // Button Back
        btnBack = (Button)findViewById(R.id.cat_formula_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = null;

                int selectedBreed = _appPrefs.getSelectedBreed();
                switch(selectedBreed)
                {
                    case CommonData.BREED_MAINECOON:
                        intent = new Intent(CatFormulaActivity.this, CatMaineCoonSpotsActivity.class);
                        subId = CommonData.SUBID_MAINECOON;
                        break;
                    case CommonData.BREED_PERSIAN:
                        intent = new Intent(CatFormulaActivity.this, CatPersianSpotsActivity.class);
                        subId = CommonData.SUBID_PERSIAN;
                        break;
                    case CommonData.BREED_RAGDOLL:
                        intent = new Intent(CatFormulaActivity.this, CatRagdollSpotsActivity.class);
                        subId = CommonData.SUBID_RAGDOLL;
                        break;
                    case CommonData.BREED_SIAMESE:
                        intent = new Intent(CatFormulaActivity.this, CatSiameseSpotsActivity.class);
                        subId = CommonData.SUBID_SIAMESE;
                        break;
                    default:
                        intent = new Intent(CatFormulaActivity.this, CatMaineCoonSpotsActivity.class);
                        subId = 0;
                        break;
                }

                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

       final int selectedFood = _appPrefs.getSelectedFood();
        int nResSel = R.drawable.cat_mainecoon_sel;
        int nResFormula = R.drawable.cat_mainecoon_formula;
        switch (selectedFood)
        {
            case CommonData.BREED_MAINECOON:
                nResSel = R.drawable.cat_mainecoon_sel;
                nResFormula = R.drawable.cat_mainecoon_formula;
                break;
            case CommonData.BREED_PERSIAN:
                nResSel = R.drawable.cat_persian_sel;
                nResFormula = R.drawable.cat_persian_formula;
                break;
            case CommonData.BREED_RAGDOLL:
                nResSel = R.drawable.cat_ragdoll_sel;
                nResFormula = R.drawable.cat_ragdoll_formula;
                break;
            case CommonData.BREED_SIAMESE:
                nResSel = R.drawable.cat_siamese_sel;
                nResFormula = R.drawable.cat_siamese_formula;
                break;
            default:
                nResSel = R.drawable.cat_mainecoon_sel;
                nResFormula = R.drawable.cat_mainecoon_formula;
                break;
        }

        imgSel = (ImageView)findViewById(R.id.cat_formula_img_sel);
        imgSel.setBackgroundResource(nResSel);

        imgFormula = (ImageView)findViewById(R.id.cat_formula_img_formula);
        imgFormula.setBackgroundResource(nResFormula);

        Button btnMainecoon = (Button)findViewById(R.id.cat_btn_mainecoon);
        btnMainecoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_MAINECOON)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_MAINECOON);

                Intent intent = new Intent(CatFormulaActivity.this, CatFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_MAINECOON)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnPersian = (Button)findViewById(R.id.cat_btn_persian);
        btnPersian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_PERSIAN)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_PERSIAN);


                Intent intent = new Intent(CatFormulaActivity.this, CatFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_PERSIAN)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnRagdoll = (Button)findViewById(R.id.cat_btn_ragdoll);
        btnRagdoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_RAGDOLL)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_RAGDOLL);

                Intent intent = new Intent(CatFormulaActivity.this, CatFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_RAGDOLL)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnSiamese = (Button)findViewById(R.id.cat_btn_siamese);
        btnSiamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_SIAMESE)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_SIAMESE);

                Intent intent = new Intent(CatFormulaActivity.this, CatFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_SIAMESE)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_formula));
    }
}