package com.general.mediaplayer.FindFormula;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.general.mediaplayer.FindFormula.Cat.CatBreedSelActivity;
import com.general.mediaplayer.FindFormula.Cat.CatLifestyleSelActivity;
import com.general.mediaplayer.FindFormula.Dog.DogBreedSelActivity;
import com.general.mediaplayer.FindFormula.Dog.DogLifestyleSelActivity;
import com.hklt.hidusb.UsbManager;

public class ScanMediaActivity extends BaseActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (CommonData.APP_CATEGORY == CommonData.CATEGORY_CAT)
            setContentView(R.layout.main);
        else
            setContentView(R.layout.main_dog);

        /*-------------*/
        DataManager dataMgr = CommonData.GetDataMgr();
        if (dataMgr.ReadXml(getApplicationContext(), CommonData.APP_CATEGORY) == false)
            Toast.makeText(this, "Read Config Failure", Toast.LENGTH_SHORT).show();

        // breed button
        Button btnBreed = (Button)findViewById(R.id.start_btn_breed);
        btnBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CommonData.APP_CATEGORY == CommonData.CATEGORY_CAT)
                {
                    _appPrefs.setSelectedBasic(CommonData.BASIC_BREED);

                    Intent intent = new Intent(ScanMediaActivity.this, CatBreedSelActivity.class);
                    startActivity(intent);
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                    finish();
                }
                else
                {
                    _appPrefs.setSelectedBasic(CommonData.BASIC_BREED);

                    Intent intent = new Intent(ScanMediaActivity.this, DogBreedSelActivity.class);
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
                if (CommonData.APP_CATEGORY == CommonData.CATEGORY_CAT)
                {
                    _appPrefs.setSelectedBasic(CommonData.BASIC_LIFESTYLE);

                    Intent intent = new Intent(ScanMediaActivity.this, CatLifestyleSelActivity.class);
                    startActivity(intent);
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                    finish();
                }
                else
                {
                    _appPrefs.setSelectedBasic(CommonData.BASIC_LIFESTYLE);

                    Intent intent = new Intent(ScanMediaActivity.this, DogLifestyleSelActivity.class);
                    startActivity(intent);
                    overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                    finish();
                }
            }
        });

        Point ptSize = ResolutionSet.getScreenSize(ScanMediaActivity.this, true, false);
        ResolutionSet._instance.setResolution(ptSize.x, ptSize.y, false);
        if (CommonData.APP_CATEGORY == CommonData.CATEGORY_CAT)
            ResolutionSet._instance.iterateChild(findViewById(R.id.layout_main_cat));
        else
            ResolutionSet._instance.iterateChild(findViewById(R.id.layout_main_dog));

        if (CommonData.LIGHT_MODE == CommonData.LIGHT_USBHID)
        {
        Application application = (Application) getApplication();
        UsbManager usbManager = application.getUsbManager();
        usbManager.startUsb();
        }
    }
}
