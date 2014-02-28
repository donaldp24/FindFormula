package com.general.mediaplayer.FindFormula.Cat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.general.mediaplayer.FindFormula.*;
import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;

import java.util.ArrayList;

/**
 * Created by donald on 2/19/14.
 */
public class CatWetSpotsActivity extends BaseSpotsActivity {

    ArrayList<STDetailInfo> catSpotsList = null;
    Button btnFindFormula = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_wet_spots);

        // breed button (go back to cat breed sel screen)
        Button btnBreed = (Button)findViewById(R.id.cat_wet_spots_btn_breed);
        btnBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatWetSpotsActivity.this, CatBreedSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // lifestyle button (go back to cat lifestyle sel screen)
        Button btnLifestyle = (Button)findViewById(R.id.cat_wet_spots_btn_lifestyle);
        btnLifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatWetSpotsActivity.this, CatLifestyleSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // find formula button ( go to last result screen)
        btnFindFormula = (Button)findViewById(R.id.cat_wet_spots_btn_findformula);
        btnFindFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedFood(CommonData.LIFESTYLE_WET);


                Intent intent = new Intent(CatWetSpotsActivity.this, CatWetFormulaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_CATEGORY) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        catSpotsList = dataMgr.getSpotsFromName("WET", CommonData.APP_CATEGORY);

        // spot buttons --------------------------------------------------------------------------
        Button btnSpot1 = (Button)findViewById(R.id.cat_wet_spots_btn_spot1);
        btnSpot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 0)
                {
                    STDetailInfo info = catSpotsList.get(0);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatWetSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        Button btnSpot2 = (Button)findViewById(R.id.cat_wet_spots_btn_spot2);
        btnSpot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 1)
                {
                    STDetailInfo info = catSpotsList.get(1);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatWetSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot3 = (Button)findViewById(R.id.cat_wet_spots_btn_spot3);
        btnSpot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 2)
                {
                    STDetailInfo info = catSpotsList.get(2);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatWetSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot4 = (Button)findViewById(R.id.cat_wet_spots_btn_spot4);
        btnSpot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 3)
                {
                    STDetailInfo info = catSpotsList.get(3);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatWetSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot5 = (Button)findViewById(R.id.cat_wet_spots_btn_spot5);
        btnSpot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 4)
                {
                    STDetailInfo info = catSpotsList.get(4);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatWetSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        Button btnSpotFood = (Button)findViewById(R.id.cat_wet_spots_btn_food);
        btnSpotFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 5)
                {
                    STDetailInfo info = catSpotsList.get(5);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatWetSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        final int selectedLifestyle = _appPrefs.getSelectedLifestyle();

        Button btnKitten = (Button)findViewById(R.id.cat_btn_kitten);
        btnKitten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedLifestyle == CommonData.LIFESTYLE_KITTEN)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_KITTEN);


                Intent intent = new Intent(CatWetSpotsActivity.this, CatKittenSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_KITTEN)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_INDOOR)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_INDOOR);

                Intent intent = new Intent(CatWetSpotsActivity.this, CatIndoorSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_INDOOR)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_SPAYED)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_SPAYED);


                Intent intent = new Intent(CatWetSpotsActivity.this, CatSpayedSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_SPAYED)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_SPECIAL)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_SPECIAL);


                Intent intent = new Intent(CatWetSpotsActivity.this, CatSpecialSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_SPECIAL)
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

                if (selectedLifestyle == CommonData.LIFESTYLE_WET)
                    return;

                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_WET);


                Intent intent = new Intent(CatWetSpotsActivity.this, CatWetSpotsActivity.class);
                startActivity(intent);
                if (selectedLifestyle < CommonData.LIFESTYLE_WET)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_wet_spots));
    }

    @Override
    public void onBtnLinkClicked() {
        btnFindFormula.performClick();
    }
}