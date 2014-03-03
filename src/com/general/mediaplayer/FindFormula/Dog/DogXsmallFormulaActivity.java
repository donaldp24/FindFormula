package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;
import com.general.mediaplayer.FindFormula.Cat.CatKittenSpotsActivity;

/**
 * Created by donald on 2/19/14.
 */
public class DogXsmallFormulaActivity extends BaseFormulaActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_xsmall_formula);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_xsmall_formula_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                int selectedLifestyle = _appPrefs.getSelectedLifestyle();
                Intent intent = null;
                switch (selectedLifestyle)
                {
                    case CommonData.LIFESTYLE_XSMALL:
                        intent = new Intent(DogXsmallFormulaActivity.this, DogXsmallSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_MINI:
                        intent = new Intent(DogXsmallFormulaActivity.this, DogMiniSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_MEDIUM:
                        intent = new Intent(DogXsmallFormulaActivity.this, DogMediumSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_MAXI:
                        intent = new Intent(DogXsmallFormulaActivity.this, DogMaxiSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_GIANT:
                        intent = new Intent(DogXsmallFormulaActivity.this, DogGiantSpotsActivity.class);
                        break;
                    default:
                        intent = new Intent(DogXsmallFormulaActivity.this, DogXsmallSpotsActivity.class);
                        break;
                }

                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        final int selectedFood = _appPrefs.getSelectedFood();

        Button btnXsmall = (Button)findViewById(R.id.dog_btn_xsmall);
        btnXsmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_XSMALL)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_XSMALL);

                Intent intent = new Intent(DogXsmallFormulaActivity.this, DogXsmallFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_XSMALL)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnMini = (Button)findViewById(R.id.dog_btn_mini);
        btnMini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_MINI)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_MINI);

                Intent intent = new Intent(DogXsmallFormulaActivity.this, DogMiniFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_MINI)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnMedium = (Button)findViewById(R.id.dog_btn_medium);
        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_MEDIUM)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_MEDIUM);

                Intent intent = new Intent(DogXsmallFormulaActivity.this, DogMediumFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_MEDIUM)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnMaxi = (Button)findViewById(R.id.dog_btn_maxi);
        btnMaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_MAXI)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_MAXI);

                Intent intent = new Intent(DogXsmallFormulaActivity.this, DogMaxiFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_MAXI)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnGiant = (Button)findViewById(R.id.dog_btn_giant);
        btnGiant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.LIFESTYLE_GIANT)
                    return;

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_GIANT);

                Intent intent = new Intent(DogXsmallFormulaActivity.this, DogGiantFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_GIANT)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // lights
        Button btnMature = (Button)findViewById(R.id.btn_mature);
        btnMature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // turn LED on
                SendSubN(CommonData.SUBID_XSMALL_MATURE);
            }
        });

        Button btnAging = (Button)findViewById(R.id.btn_aging);
        btnAging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // turn LED on
                 SendSubN(CommonData.SUBID_XSMALL_AGING);
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_xsmall_formula));
    }
}