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
public class CatMaineCoonSpotsActivity extends BaseSpotsActivity {

    ArrayList<STDetailInfo> catSpotsList = null;
    Button btnFindFormula = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_mainecoon_spots);

        // breed button (go back to cat breed sel screen)
        Button btnBreed = (Button)findViewById(R.id.cat_mainecoon_spots_btn_breed);
        btnBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatMaineCoonSpotsActivity.this, CatBreedSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // lifestyle button (go back to cat lifestyle sel screen)
        Button btnLifestyle = (Button)findViewById(R.id.cat_mainecoon_spots_btn_lifestyle);
        btnLifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatMaineCoonSpotsActivity.this, CatLifestyleSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // find formula button ( go to last result screen)
        btnFindFormula = (Button)findViewById(R.id.cat_mainecoon_spots_btn_findformula);
        btnFindFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _appPrefs.setSelectedBreed(CommonData.BREED_MAINECOON);

                Intent intent = new Intent(CatMaineCoonSpotsActivity.this, CatFormulaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_CATEGORY) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        catSpotsList = dataMgr.getSpotsFromName("MAINE COON", CommonData.APP_CATEGORY);

        // spot buttons --------------------------------------------------------------------------
        Button btnSpot1 = (Button)findViewById(R.id.cat_mainecoon_spots_btn_spot1);
        btnSpot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 0)
                {
                    STDetailInfo info = catSpotsList.get(0);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatMaineCoonSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        Button btnSpot2 = (Button)findViewById(R.id.cat_mainecoon_spots_btn_spot2);
        btnSpot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 1)
                {
                    STDetailInfo info = catSpotsList.get(1);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatMaineCoonSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot3 = (Button)findViewById(R.id.cat_mainecoon_spots_btn_spot3);
        btnSpot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 2)
                {
                    STDetailInfo info = catSpotsList.get(2);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatMaineCoonSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpotFood = (Button)findViewById(R.id.cat_mainecoon_spots_btn_food);
        btnSpotFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 3)
                {
                    STDetailInfo info = catSpotsList.get(3);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatMaineCoonSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        final int selectedBreed = _appPrefs.getSelectedBreed();

        Button btnMainecoon = (Button)findViewById(R.id.cat_btn_mainecoon);
        btnMainecoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedBreed == CommonData.BREED_MAINECOON)
                    return;

                _appPrefs.setSelectedBreed(CommonData.BREED_MAINECOON);

                Intent intent = new Intent(CatMaineCoonSpotsActivity.this, CatMaineCoonSpotsActivity.class);
                startActivity(intent);
                if (selectedBreed < CommonData.BREED_MAINECOON)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnPersian = (Button)findViewById(R.id.cat_btn_persian);
        btnPersian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedBreed == CommonData.BREED_PERSIAN)
                    return;

                _appPrefs.setSelectedBreed(CommonData.BREED_PERSIAN);


                Intent intent = new Intent(CatMaineCoonSpotsActivity.this, CatPersianSpotsActivity.class);
                startActivity(intent);
                if (selectedBreed < CommonData.BREED_PERSIAN)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnRagdoll = (Button)findViewById(R.id.cat_btn_ragdoll);
        btnRagdoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedBreed == CommonData.BREED_RAGDOLL)
                    return;

                _appPrefs.setSelectedBreed(CommonData.BREED_RAGDOLL);

                Intent intent = new Intent(CatMaineCoonSpotsActivity.this, CatRagdollSpotsActivity.class);
                startActivity(intent);
                if (selectedBreed < CommonData.BREED_RAGDOLL)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnSiamese = (Button)findViewById(R.id.cat_btn_siamese);
        btnSiamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedBreed == CommonData.BREED_SIAMESE)
                    return;

                _appPrefs.setSelectedBreed(CommonData.BREED_SIAMESE);

                Intent intent = new Intent(CatMaineCoonSpotsActivity.this, CatSiameseSpotsActivity.class);
                startActivity(intent);
                if (selectedBreed < CommonData.BREED_SIAMESE)
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                else
                    overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_mainecoon_spots));
    }

    @Override
    public void onBtnLinkClicked() {
        btnFindFormula.performClick();
    }
}