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
public class CatRagdollSpotsActivity extends BaseSpotsActivity {

    ArrayList<STDetailInfo> catSpotsList = null;
    Button btnFindFormula = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_ragdoll_spots);

        // breed button (go back to cat breed sel screen)
        Button btnBreed = (Button)findViewById(R.id.cat_ragdoll_spots_btn_breed);
        btnBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatRagdollSpotsActivity.this, CatBreedSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // lifestyle button (go back to cat lifestyle sel screen)
        Button btnLifestyle = (Button)findViewById(R.id.cat_ragdoll_spots_btn_lifestyle);
        btnLifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatRagdollSpotsActivity.this, CatLifestyleSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // find formula button ( go to last result screen)
        btnFindFormula = (Button)findViewById(R.id.cat_ragdoll_spots_btn_findformula);
        btnFindFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatRagdollSpotsActivity.this, CatFormulaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_CATEGORY) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        catSpotsList = dataMgr.getSpotsFromName("RAGDOLL", CommonData.CATEGORY_CAT);

        // spot buttons --------------------------------------------------------------------------
        Button btnSpot1 = (Button)findViewById(R.id.cat_ragdoll_spots_btn_spot1);
        btnSpot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 0)
                {
                    STDetailInfo info = catSpotsList.get(0);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatRagdollSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        Button btnSpot2 = (Button)findViewById(R.id.cat_ragdoll_spots_btn_spot2);
        btnSpot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 1)
                {
                    STDetailInfo info = catSpotsList.get(1);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatRagdollSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot3 = (Button)findViewById(R.id.cat_ragdoll_spots_btn_spot3);
        btnSpot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 2)
                {
                    STDetailInfo info = catSpotsList.get(2);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatRagdollSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpotFood = (Button)findViewById(R.id.cat_ragdoll_spots_btn_food);
        btnSpotFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catSpotsList != null && catSpotsList.size() > 3)
                {
                    STDetailInfo info = catSpotsList.get(3);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(CatRagdollSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });


        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cat_ragdoll_spots));
    }

    @Override
    public void onBtnLinkClicked() {
        btnFindFormula.performClick();
    }
}