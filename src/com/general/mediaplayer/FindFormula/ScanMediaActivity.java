package com.general.mediaplayer.FindFormula;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.general.mediaplayer.FindFormula.Cat.CatBreedSelActivity;
import com.general.mediaplayer.FindFormula.Cat.CatDetailViewActivity;
import com.general.mediaplayer.FindFormula.Cat.CatLifestyleSelActivity;
import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;

import java.util.ArrayList;

public class ScanMediaActivity extends BaseActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /*-------------*/
        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_FOR_CAT) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        // breed button
        Button btnBreed = (Button)findViewById(R.id.start_btn_breed);
        btnBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CommonData.APP_FOR_CAT == 1)
                {
                    _appPrefs.setSelectedBasic(CommonData.BASIC_BREED);

                    Intent intent = new Intent(ScanMediaActivity.this, CatBreedSelActivity.class);
                    startActivity(intent);
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                    finish();
                }
            }
        });

        // lifestyle button
        Button btnLifestyle = (Button)findViewById(R.id.start_btn_lifestyle);
        btnLifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CommonData.APP_FOR_CAT == 1)
                {
                    _appPrefs.setSelectedBasic(CommonData.BASIC_LIFESTYLE);

                    Intent intent = new Intent(ScanMediaActivity.this, CatLifestyleSelActivity.class);
                    startActivity(intent);
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                    finish();
                }
            }
        });

        Point ptSize = ResolutionSet.getScreenSize(ScanMediaActivity.this, false, false);
        ResolutionSet._instance.setResolution(ptSize.x, ptSize.y, false);
        ResolutionSet._instance.iterateChild(findViewById(R.id.layoutMain));
    }
}
