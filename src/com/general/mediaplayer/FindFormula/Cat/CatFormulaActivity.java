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
public class CatFormulaActivity extends BaseActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_formula);


        // Button Back
        Button btnBack = (Button)findViewById(R.id.cat_formula_btn_back);
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
                        break;
                    case CommonData.BREED_PERSIAN:
                        intent = new Intent(CatFormulaActivity.this, CatPersianSpotsActivity.class);
                        break;
                    case CommonData.BREED_RAGDOLL:
                        intent = new Intent(CatFormulaActivity.this, CatRagdollSpotsActivity.class);
                        break;
                    case CommonData.BREED_SIAMESE:
                        intent = new Intent(CatFormulaActivity.this, CatSiameseSpotsActivity.class);
                        break;
                    default:
                        intent = new Intent(CatFormulaActivity.this, CatMaineCoonSpotsActivity.class);
                        break;
                }

                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        int selectedBreed = _appPrefs.getSelectedBreed();
        int nResSel = R.drawable.cat_mainecoon_sel;
        int nResFormula = R.drawable.cat_mainecoon_formula;
        switch (selectedBreed)
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

        ImageView imgSel = (ImageView)findViewById(R.id.cat_formula_img_sel);
        imgSel.setBackgroundResource(nResSel);

        ImageView imgFormula = (ImageView)findViewById(R.id.cat_formula_img_formula);
        imgFormula.setBackgroundResource(nResFormula);



        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_formula));
    }
}