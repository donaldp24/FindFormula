package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class DogFormulaActivity extends BaseFormulaActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_formula);


        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_formula_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = null;

                int selectedBreed = _appPrefs.getSelectedBreed();
                switch(selectedBreed)
                {
                    case CommonData.BREED_BEAGLE:
                        intent = new Intent(DogFormulaActivity.this, DogBeagleSpotsActivity.class);
                        subId = CommonData.SUBID_BEAGLE;
                        break;
                    case CommonData.BREED_BULLDOG:
                        intent = new Intent(DogFormulaActivity.this, DogBulldogSpotsActivity.class);
                        subId = CommonData.SUBID_BULLDOG;
                        break;
                    case CommonData.BREED_CHIHUAHUA:
                        intent = new Intent(DogFormulaActivity.this, DogChihuahuaSpotsActivity.class);
                        subId = CommonData.SUBID_CHIHUAHUA;
                        break;
                    case CommonData.BREED_GERMAN:
                        intent = new Intent(DogFormulaActivity.this, DogGermanSpotsActivity.class);
                        subId = CommonData.SUBID_GERMAN;
                        break;
                    case CommonData.BREED_LABRADOR:
                        intent = new Intent(DogFormulaActivity.this, DogLabradorSpotsActivity.class);
                        subId = CommonData.SUBID_LABRADOR;
                        break;
                    case CommonData.BREED_SHIH:
                        intent = new Intent(DogFormulaActivity.this, DogShihSpotsActivity.class);
                        subId = CommonData.SUBID_SHIH;
                        break;
                    case CommonData.BREED_WESTIE:
                        intent = new Intent(DogFormulaActivity.this, DogWestieSpotsActivity.class);
                        subId = CommonData.SUBID_WESTIE;
                        break;
                    case CommonData.BREED_YORKIE:
                        intent = new Intent(DogFormulaActivity.this, DogYorkieSpotsActivity.class);
                        subId = CommonData.SUBID_YORKIE;
                        break;
                    default:
                        intent = new Intent(DogFormulaActivity.this, DogBeagleSpotsActivity.class);
                        subId = CommonData.SUBID_BEAGLE;
                        break;
                }

                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        int selectedBreed = _appPrefs.getSelectedBreed();
        int nResSel = R.drawable.dog_beagle_sel;
        int nResFormula = R.drawable.dog_beagle_formula;
        switch (selectedBreed)
        {
            case CommonData.BREED_BEAGLE:
                nResSel = R.drawable.dog_beagle_sel;
                nResFormula = R.drawable.dog_beagle_formula;
                break;
            case CommonData.BREED_BULLDOG:
                nResSel = R.drawable.dog_bulldog_sel;
                nResFormula = R.drawable.dog_bulldog_formula;
                break;
            case CommonData.BREED_CHIHUAHUA:
                nResSel = R.drawable.dog_chihuahua_sel;
                nResFormula = R.drawable.dog_chihuahua_formula;
                break;
            case CommonData.BREED_GERMAN:
                nResSel = R.drawable.dog_german_sel;
                nResFormula = R.drawable.dog_german_formula;
                break;
            case CommonData.BREED_LABRADOR:
                nResSel = R.drawable.dog_labrador_sel;
                nResFormula = R.drawable.dog_labrador_formula;
                break;
            case CommonData.BREED_SHIH:
                nResSel = R.drawable.dog_shih_sel;
                nResFormula = R.drawable.dog_shih_formula;
                break;
            case CommonData.BREED_WESTIE:
                nResSel = R.drawable.dog_westie_sel;
                nResFormula = R.drawable.dog_westie_formula;
                break;
            case CommonData.BREED_YORKIE:
                nResSel = R.drawable.dog_yorkie_sel;
                nResFormula = R.drawable.dog_yorkie_formula;
                break;
            default:
                nResSel = R.drawable.dog_beagle_sel;
                nResFormula = R.drawable.dog_beagle_formula;
                break;
        }

        ImageView imgSel = (ImageView)findViewById(R.id.dog_formula_img_sel);
        imgSel.setBackgroundResource(nResSel);

        ImageView imgFormula = (ImageView)findViewById(R.id.dog_formula_img_formula);
        imgFormula.setBackgroundResource(nResFormula);

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_formula));
    }
}