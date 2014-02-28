package com.general.mediaplayer.FindFormula.Cat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class CatKittenFormulaActivity extends BaseFormulaActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_kitten_formula);

        subId = CommonData.SUBID_KITTEN;

        // Button Back
        Button btnBack = (Button)findViewById(R.id.cat_kitten_formula_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = null;

                int selectedLifestyle = _appPrefs.getSelectedLifestyle();
                switch(selectedLifestyle)
                {
                    case CommonData.LIFESTYLE_KITTEN:
                        intent = new Intent(CatKittenFormulaActivity.this, CatKittenSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_INDOOR:
                        intent = new Intent(CatKittenFormulaActivity.this, CatIndoorSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_SPAYED:
                        intent = new Intent(CatKittenFormulaActivity.this, CatSpayedSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_SPECIAL:
                        intent = new Intent(CatKittenFormulaActivity.this, CatSpecialSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_WET:
                        intent = new Intent(CatKittenFormulaActivity.this, CatWetSpotsActivity.class);
                        break;
                    default:
                        intent = new Intent(CatKittenFormulaActivity.this, CatKittenSpotsActivity.class);
                        break;
                }

                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        final int selectedFood = _appPrefs.getSelectedFood();

        Button btnKitten = (Button)findViewById(R.id.cat_btn_kitten);
        btnKitten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_KITTEN)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_KITTEN);


                Intent intent = new Intent(CatKittenFormulaActivity.this, CatKittenFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_KITTEN)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnIndoor = (Button)findViewById(R.id.cat_btn_indoor);
        btnIndoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_INDOOR)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_INDOOR);

                Intent intent = new Intent(CatKittenFormulaActivity.this, CatIndoorFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_INDOOR)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnSpayed = (Button)findViewById(R.id.cat_btn_spayed);
        btnSpayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_SPAYED)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_SPAYED);


                Intent intent = new Intent(CatKittenFormulaActivity.this, CatSpayedFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_SPAYED)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnSpecial = (Button)findViewById(R.id.cat_btn_special);
        btnSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_SPECIAL)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_SPECIAL);


                Intent intent = new Intent(CatKittenFormulaActivity.this, CatSpecialFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_SPECIAL)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnWet = (Button)findViewById(R.id.cat_btn_wet);
        btnWet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_WET)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_WET);


                Intent intent = new Intent(CatKittenFormulaActivity.this, CatWetFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_WET)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_kitten_formula));
    }
}