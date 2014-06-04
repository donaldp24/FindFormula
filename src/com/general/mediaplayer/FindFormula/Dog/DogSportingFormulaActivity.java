package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class DogSportingFormulaActivity extends BaseFormulaActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_sporting_formula);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_sporting_formula_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                int selectedSize = _appPrefs.getSelectedSize();
                Intent intent = null;
                switch (selectedSize)
                {
                    case CommonData.SIZE_URBAN:
                        intent = new Intent(DogSportingFormulaActivity.this, DogUrbanSpotsActivity.class);
                        break;
                    case CommonData.SIZE_INDOOR:
                        intent = new Intent(DogSportingFormulaActivity.this, DogIndoorSpotsActivity.class);
                        break;
                    case CommonData.SIZE_SPORTING:
                        intent = new Intent(DogSportingFormulaActivity.this, DogSportingSpotsActivity.class);
                        break;
                    default:
                        intent = new Intent(DogSportingFormulaActivity.this, DogUrbanSpotsActivity.class);
                        break;
                }


                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Button btnUrban = (Button)findViewById(R.id.dog_btn_urban);
        btnUrban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnSibilingClickedWithSize(CommonData.SIZE_URBAN, DogUrbanFormulaActivity.class);
            }
        });

        Button btnIndoor = (Button)findViewById(R.id.dog_btn_indoor);
        btnIndoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnSibilingClickedWithSize(CommonData.SIZE_INDOOR, DogIndoorFormulaActivity.class);
            }
        });

        Button btnSporting = (Button)findViewById(R.id.dog_btn_sporting);
        btnSporting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnSibilingClickedWithSize(CommonData.SIZE_SPORTING, DogSportingFormulaActivity.class);
            }
        });


        // lights
        Button btnJunior = (Button)findViewById(R.id.btn_agility);
        btnJunior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // turn LED on

                    SendSubN(CommonData.SUBID_SPORTING_AGILITY);

            }
        });

        Button btnAdult = (Button)findViewById(R.id.btn_trail);
        btnAdult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // turn LED on

                    SendSubN(CommonData.SUBID_SPORTING_TRAIL);

            }
        });


        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_sporting_formula));
    }
}