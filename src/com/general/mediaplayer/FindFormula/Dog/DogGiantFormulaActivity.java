package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class DogGiantFormulaActivity extends BaseFormulaActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_giant_formula);

        subId = CommonData.SUBID_GIANT;

        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_giant_formula_btn_back);
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
                        intent = new Intent(DogGiantFormulaActivity.this, DogXsmallSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_MINI:
                        intent = new Intent(DogGiantFormulaActivity.this, DogMiniSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_MEDIUM:
                        intent = new Intent(DogGiantFormulaActivity.this, DogMediumSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_MAXI:
                        intent = new Intent(DogGiantFormulaActivity.this, DogMaxiSpotsActivity.class);
                        break;
                    case CommonData.LIFESTYLE_GIANT:
                        intent = new Intent(DogGiantFormulaActivity.this, DogGiantSpotsActivity.class);
                        break;
                    default:
                        intent = new Intent(DogGiantFormulaActivity.this, DogGiantSpotsActivity.class);
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

                Intent intent = new Intent(DogGiantFormulaActivity.this, DogXsmallFormulaActivity.class);
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

                Intent intent = new Intent(DogGiantFormulaActivity.this, DogMiniFormulaActivity.class);
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

                Intent intent = new Intent(DogGiantFormulaActivity.this, DogMediumFormulaActivity.class);
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

                Intent intent = new Intent(DogGiantFormulaActivity.this, DogMaxiFormulaActivity.class);
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

                Intent intent = new Intent(DogGiantFormulaActivity.this, DogGiantFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.LIFESTYLE_GIANT)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_giant_formula));
    }

    @Override
    public void onStart()
    {
        super.onStart();

        // light
        SendSubN(subId);
    }
}