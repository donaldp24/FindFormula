package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.general.mediaplayer.FindFormula.*;
import com.general.mediaplayer.FindFormula.Cat.CatDetailViewDialog;
import com.general.mediaplayer.FindFormula.Cat.CatKittenFormulaActivity;
import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;

import java.util.ArrayList;

/**
 * Created by donald on 2/19/14.
 */
public class DogMiniSpotsActivity extends BaseSpotsActivity {

    ArrayList<STDetailInfo> dogSpotsList = null;
    Button btnFindFormula = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_mini_spots);

        // breed button (go back to dog breed sel screen)
        Button btnBreed = (Button)findViewById(R.id.dog_mini_spots_btn_breed);
        btnBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DogMiniSpotsActivity.this, DogBreedSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // lifestyle button (go back to dog lifestyle sel screen)
        Button btnLifestyle = (Button)findViewById(R.id.dog_mini_spots_btn_lifestyle);
        btnLifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DogMiniSpotsActivity.this, DogLifestyleSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // find formula button ( go to last result screen)
        btnFindFormula = (Button)findViewById(R.id.dog_mini_spots_btn_findformula);
        btnFindFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_MINI);

                Intent intent = new Intent(DogMiniSpotsActivity.this, DogMiniFormulaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_CATEGORY) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        dogSpotsList = dataMgr.getSpotsFromName("MINI", CommonData.APP_CATEGORY);

        // spot buttons --------------------------------------------------------------------------
        Button btnSpot1 = (Button)findViewById(R.id.dog_mini_spots_btn_spot1);
        btnSpot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 1)
                {
                    STDetailInfo info = dogSpotsList.get(1);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogMiniSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        Button btnSpot2 = (Button)findViewById(R.id.dog_mini_spots_btn_spot2);
        btnSpot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 2)
                {
                    STDetailInfo info = dogSpotsList.get(2);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogMiniSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot3 = (Button)findViewById(R.id.dog_mini_spots_btn_spot3);
        btnSpot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 3)
                {
                    STDetailInfo info = dogSpotsList.get(3);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogMiniSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        Button btnSpotFood = (Button)findViewById(R.id.dog_mini_spots_btn_food);
        btnSpotFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 0)
                {
                    STDetailInfo info = dogSpotsList.get(0);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogMiniSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        final int selectedLifestyle = _appPrefs.getSelectedLifestyle();

        Button btnXsmall = (Button)findViewById(R.id.dog_btn_xsmall);
        btnXsmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedLifestyle == CommonData.LIFESTYLE_XSMALL)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_XSMALL);

                Intent intent = new Intent(DogMiniSpotsActivity.this, DogXsmallSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_XSMALL)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_MINI)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_MINI);

                Intent intent = new Intent(DogMiniSpotsActivity.this, DogMiniSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_MINI)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_MEDIUM)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_MEDIUM);

                Intent intent = new Intent(DogMiniSpotsActivity.this, DogMediumSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_MEDIUM)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_MAXI)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_MAXI);

                Intent intent = new Intent(DogMiniSpotsActivity.this, DogMaxiSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_MAXI)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_GIANT)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_GIANT);

                Intent intent = new Intent(DogMiniSpotsActivity.this, DogGiantSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_GIANT)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_mini_spots));
    }

    @Override
    public void onBtnLinkClicked() {
        btnFindFormula.performClick();
    }
}