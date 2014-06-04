package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.general.mediaplayer.FindFormula.*;
import com.general.mediaplayer.FindFormula.Cat.CatDetailViewDialog;
import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;

import java.util.ArrayList;

/**
 * Created by donald on 2/19/14.
 */
public class DogIndoorSpotsActivity extends BaseSpotsActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_indoor_spots);

        // home button (go back to dog home screen)
        Button btnHome = (Button)findViewById(R.id.dog_home);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DogIndoorSpotsActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // find formula button ( go to last result screen)
        btnFindFormula = (Button)findViewById(R.id.dog_indoor_spots_btn_findformula);
        btnFindFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedFood(CommonData.SIZE_INDOOR);

                Intent intent = new Intent(DogIndoorSpotsActivity.this, DogIndoorFormulaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_CATEGORY) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        dogSpotsList = dataMgr.getSpotsFromName("INDOOR", CommonData.APP_CATEGORY);

        // spot buttons --------------------------------------------------------------------------
        Button btnSpot1 = (Button)findViewById(R.id.dog_indoor_spots_btn_spot1);
        btnSpot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnSpotClicked(0);
            }
        });

        Button btnSpot2 = (Button)findViewById(R.id.dog_indoor_spots_btn_spot2);
        btnSpot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnSpotClicked(1);
            }
        });
        Button btnSpot3 = (Button)findViewById(R.id.dog_indoor_spots_btn_spot3);
        btnSpot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnSpotClicked(2);
            }
        });
        Button btnSpot4 = (Button)findViewById(R.id.dog_indoor_spots_btn_spot4);
        btnSpot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnSpotClicked(3);
            }
        });

        Button btnSpotFood = (Button)findViewById(R.id.dog_indoor_spots_btn_food);
        btnSpotFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBtnSpotClicked(0);
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        final int selectedSize = _appPrefs.getSelectedSize();

        Button btnUrban = (Button)findViewById(R.id.dog_btn_urban);
        btnUrban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBtnSibilingClickedWithSize(CommonData.SIZE_URBAN, DogUrbanSpotsActivity.class);
            }
        });

        Button btnIndoor = (Button)findViewById(R.id.dog_btn_indoor);
        btnIndoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBtnSibilingClickedWithSize(CommonData.SIZE_INDOOR, DogIndoorSpotsActivity.class);
            }
        });

        Button btnSporting = (Button)findViewById(R.id.dog_btn_sporting);
        btnSporting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBtnSibilingClickedWithSize(CommonData.SIZE_SPORTING, DogSportingSpotsActivity.class);
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_indoor_spots));
    }

}