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

                        break;
                    case CommonData.BREED_BULLDOG:
                        intent = new Intent(DogFormulaActivity.this, DogBulldogSpotsActivity.class);

                        break;
                    case CommonData.BREED_CHIHUAHUA:
                        intent = new Intent(DogFormulaActivity.this, DogChihuahuaSpotsActivity.class);

                        break;
                    case CommonData.BREED_GERMAN:
                        intent = new Intent(DogFormulaActivity.this, DogGermanSpotsActivity.class);

                        break;
                    case CommonData.BREED_LABRADOR:
                        intent = new Intent(DogFormulaActivity.this, DogLabradorSpotsActivity.class);

                        break;
                    case CommonData.BREED_SHIH:
                        intent = new Intent(DogFormulaActivity.this, DogShihSpotsActivity.class);

                        break;
                    case CommonData.BREED_WESTIE:
                        intent = new Intent(DogFormulaActivity.this, DogWestieSpotsActivity.class);

                        break;
                    case CommonData.BREED_YORKIE:
                        intent = new Intent(DogFormulaActivity.this, DogYorkieSpotsActivity.class);

                        break;
                    default:
                        intent = new Intent(DogFormulaActivity.this, DogBeagleSpotsActivity.class);

                        break;
                }

                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        final int selectedFood = _appPrefs.getSelectedFood();
        int nResSel = R.drawable.dog_beagle_sel;
        int nResFormula = R.drawable.dog_beagle_formula;
        switch (selectedFood)
        {
            case CommonData.BREED_BEAGLE:
                nResSel = R.drawable.dog_beagle_sel;
                nResFormula = R.drawable.dog_beagle_formula;
                subId = CommonData.SUBID_BEAGLE;
                break;
            case CommonData.BREED_BULLDOG:
                nResSel = R.drawable.dog_bulldog_sel;
                nResFormula = R.drawable.dog_bulldog_formula;
                subId = CommonData.SUBID_BULLDOG;
                break;
            case CommonData.BREED_CHIHUAHUA:
                nResSel = R.drawable.dog_chihuahua_sel;
                nResFormula = R.drawable.dog_chihuahua_formula;
                subId = CommonData.SUBID_CHIHUAHUA;
                break;
            case CommonData.BREED_GERMAN:
                nResSel = R.drawable.dog_german_sel;
                nResFormula = R.drawable.dog_german_formula;
                subId = CommonData.SUBID_GERMAN;
                break;
            case CommonData.BREED_LABRADOR:
                nResSel = R.drawable.dog_labrador_sel;
                nResFormula = R.drawable.dog_labrador_formula;
                subId = CommonData.SUBID_LABRADOR;
                break;
            case CommonData.BREED_SHIH:
                nResSel = R.drawable.dog_shih_sel;
                nResFormula = R.drawable.dog_shih_formula;
                subId = CommonData.SUBID_SHIH;
                break;
            case CommonData.BREED_WESTIE:
                nResSel = R.drawable.dog_westie_sel;
                nResFormula = R.drawable.dog_westie_formula;
                subId = CommonData.SUBID_WESTIE;
                break;
            case CommonData.BREED_YORKIE:
                nResSel = R.drawable.dog_yorkie_sel;
                nResFormula = R.drawable.dog_yorkie_formula;
                subId = CommonData.SUBID_YORKIE;
                break;
            default:
                nResSel = R.drawable.dog_beagle_sel;
                nResFormula = R.drawable.dog_beagle_formula;
                subId = CommonData.SUBID_BEAGLE;
                break;
        }

        ImageView imgSel = (ImageView)findViewById(R.id.dog_formula_img_sel);
        imgSel.setBackgroundResource(nResSel);

        ImageView imgFormula = (ImageView)findViewById(R.id.dog_formula_img_formula);
        imgFormula.setBackgroundResource(nResFormula);

        Button btnBeagle = (Button)findViewById(R.id.dog_btn_beagle);
        btnBeagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_BEAGLE)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_BEAGLE);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_BEAGLE)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button BtnBulldog = (Button)findViewById(R.id.dog_btn_bulldog);
        BtnBulldog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_BULLDOG)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_BULLDOG);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_BULLDOG)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnChihuahua = (Button)findViewById(R.id.dog_btn_chihuahua);
        btnChihuahua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_CHIHUAHUA)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_CHIHUAHUA);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_CHIHUAHUA)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnGerman = (Button)findViewById(R.id.dog_btn_german);
        btnGerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_GERMAN)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_GERMAN);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_GERMAN)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnLabrador = (Button)findViewById(R.id.dog_btn_labrador);
        btnLabrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_LABRADOR)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_LABRADOR);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_LABRADOR)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnShih = (Button)findViewById(R.id.dog_btn_shih);
        btnShih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_SHIH)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_SHIH);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_SHIH)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnWestie = (Button)findViewById(R.id.dog_btn_westie);
        btnWestie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_WESTIE)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_WESTIE);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_WESTIE)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnYorkie = (Button)findViewById(R.id.dog_btn_yorkie);
        btnYorkie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedFood == CommonData.BREED_YORKIE)
                    return;

                _appPrefs.setSelectedFood(CommonData.BREED_YORKIE);

                Intent intent = new Intent(DogFormulaActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                if (selectedFood < CommonData.BREED_YORKIE)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_formula));
    }

    @Override
    public void onStart()
    {
        super.onStart();

        // light
        if (CommonData.USE_SERIAL == 1)
        {
            SendSubN(subId);
        }
    }
}