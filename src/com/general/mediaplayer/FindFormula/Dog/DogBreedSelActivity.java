package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;
import com.general.mediaplayer.FindFormula.Cat.CatMaineCoonSpotsActivity;
import com.general.mediaplayer.FindFormula.Cat.CatPersianSpotsActivity;
import com.general.mediaplayer.FindFormula.Cat.CatRagdollSpotsActivity;
import com.general.mediaplayer.FindFormula.Cat.CatSiameseSpotsActivity;

/**
 * Created by donald on 2/19/14.
 */
public class DogBreedSelActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_breedsel);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_breed_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = new Intent(DogBreedSelActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnBeagle = (Button)findViewById(R.id.dog_breed_btn_beagle);
        btnBeagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_BEAGLE);

                Intent intent = new Intent(DogBreedSelActivity.this, DogBeagleSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnBulldog = (Button)findViewById(R.id.dog_breed_btn_bulldog);
        btnBulldog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_BULLDOG);

                Intent intent = new Intent(DogBreedSelActivity.this, DogBulldogSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnChihuahua = (Button)findViewById(R.id.dog_breed_btn_chihuahua);
        btnChihuahua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_CHIHUAHUA);

                Intent intent = new Intent(DogBreedSelActivity.this, DogChihuahuaSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnGerman = (Button)findViewById(R.id.dog_breed_btn_german);
        btnGerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_GERMAN);

                Intent intent = new Intent(DogBreedSelActivity.this, DogGermanSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnLabrador = (Button)findViewById(R.id.dog_breed_btn_labrador);
        btnLabrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_LABRADOR);

                Intent intent = new Intent(DogBreedSelActivity.this, DogLabradorSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnShih = (Button)findViewById(R.id.dog_breed_btn_shih);
        btnShih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_SHIH);

                Intent intent = new Intent(DogBreedSelActivity.this, DogShihSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnWestie = (Button)findViewById(R.id.dog_breed_btn_westie);
        btnWestie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_WESTIE);

                Intent intent = new Intent(DogBreedSelActivity.this, DogWestieSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnYorkie = (Button)findViewById(R.id.dog_breed_btn_yorkie);
        btnYorkie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_YORKIE);

                Intent intent = new Intent(DogBreedSelActivity.this, DogYorkieSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_breedsel));
    }
}