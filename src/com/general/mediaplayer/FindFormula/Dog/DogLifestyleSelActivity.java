package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;
import com.general.mediaplayer.FindFormula.Cat.*;

/**
 * Created by donald on 2/19/14.
 */
public class DogLifestyleSelActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_lifestylesel);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_lifestyle_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = new Intent(DogLifestyleSelActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnKitten = (Button)findViewById(R.id.dog_lifestyle_btn_xsmall);
        btnKitten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_XSMALL);

                Intent intent = new Intent(DogLifestyleSelActivity.this, DogXsmallSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnIndoor = (Button)findViewById(R.id.dog_lifestyle_btn_mini);
        btnIndoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_MINI);

                Intent intent = new Intent(DogLifestyleSelActivity.this, DogMiniSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnSpayed = (Button)findViewById(R.id.dog_lifestyle_btn_medium);
        btnSpayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_MEDIUM);

                Intent intent = new Intent(DogLifestyleSelActivity.this, DogMediumSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnSpecial = (Button)findViewById(R.id.dog_lifestyle_btn_maxi);
        btnSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_MAXI);

                Intent intent = new Intent(DogLifestyleSelActivity.this, DogMaxiSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnWet = (Button)findViewById(R.id.dog_lifestyle_btn_giant);
        btnWet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedLifestyle(CommonData.LIFESTYLE_GIANT);

                Intent intent = new Intent(DogLifestyleSelActivity.this, DogGiantSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_lifestylesel));
    }
}