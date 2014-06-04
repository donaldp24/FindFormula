package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class DogSizeSelActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_sizesel);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = new Intent(DogSizeSelActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnUrban = (Button)findViewById(R.id.dog_size_btn_urban);
        btnUrban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedSize(CommonData.SIZE_URBAN);

                Intent intent = new Intent(DogSizeSelActivity.this, DogUrbanSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnIndoor = (Button)findViewById(R.id.dog_size_btn_indoor);
        btnIndoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedSize(CommonData.SIZE_INDOOR);

                Intent intent = new Intent(DogSizeSelActivity.this, DogIndoorSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnSporting = (Button)findViewById(R.id.dog_size_btn_sporting);
        btnSporting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _appPrefs.setSelectedSize(CommonData.SIZE_SPORTING);

                Intent intent = new Intent(DogSizeSelActivity.this, DogSportingSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_sizesel));
    }
}