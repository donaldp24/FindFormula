package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.general.mediaplayer.FindFormula.*;
import com.general.mediaplayer.FindFormula.Cat.CatBreedSelActivity;
import com.general.mediaplayer.FindFormula.Cat.CatDetailViewDialog;
import com.general.mediaplayer.FindFormula.Cat.CatFormulaActivity;
import com.general.mediaplayer.FindFormula.Cat.CatLifestyleSelActivity;
import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;

import java.util.ArrayList;

/**
 * Created by donald on 2/19/14.
 */
public class DogLabradorSpotsActivity extends BaseSpotsActivity {

    ArrayList<STDetailInfo> dogSpotsList = null;
    Button btnFindFormula = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_labrador_spots);

        // breed button (go back to dog breed sel screen)
        Button btnBreed = (Button)findViewById(R.id.dog_labrador_spots_btn_breed);
        btnBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DogLabradorSpotsActivity.this, DogBreedSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // lifestyle button (go back to dog lifestyle sel screen)
        Button btnLifestyle = (Button)findViewById(R.id.dog_labrador_spots_btn_lifestyle);
        btnLifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DogLabradorSpotsActivity.this, DogLifestyleSelActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        // find formula button ( go to last result screen)
        btnFindFormula = (Button)findViewById(R.id.dog_labrador_spots_btn_findformula);
        btnFindFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DogLabradorSpotsActivity.this, DogFormulaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_CATEGORY) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        dogSpotsList = dataMgr.getSpotsFromName("Labrador Retriever", CommonData.APP_CATEGORY);

        // spot buttons --------------------------------------------------------------------------
        Button btnSpot1 = (Button)findViewById(R.id.dog_labrador_spots_btn_spot1);
        btnSpot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 0)
                {
                    STDetailInfo info = dogSpotsList.get(0);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogLabradorSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        Button btnSpot2 = (Button)findViewById(R.id.dog_labrador_spots_btn_spot2);
        btnSpot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 1)
                {
                    STDetailInfo info = dogSpotsList.get(1);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogLabradorSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot3 = (Button)findViewById(R.id.dog_labrador_spots_btn_spot3);
        btnSpot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 3)
                {
                    STDetailInfo info = dogSpotsList.get(3);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogLabradorSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpot4 = (Button)findViewById(R.id.dog_labrador_spots_btn_spot4);
        btnSpot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 4)
                {
                    STDetailInfo info = dogSpotsList.get(4);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogLabradorSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });
        Button btnSpotFood = (Button)findViewById(R.id.dog_labrador_spots_btn_food);
        btnSpotFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dogSpotsList != null && dogSpotsList.size() > 2)
                {
                    STDetailInfo info = dogSpotsList.get(2);
                    final CatDetailViewDialog dialog = new CatDetailViewDialog(DogLabradorSpotsActivity.this, R.style.NoTitleDialog);
                    dialog.show();
                    dialog.ShowInfo(info.headline, info.copy, info.link);
                }
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_labrador_spots));
    }

    @Override
    public void onBtnLinkClicked() {
        btnFindFormula.performClick();
    }
}