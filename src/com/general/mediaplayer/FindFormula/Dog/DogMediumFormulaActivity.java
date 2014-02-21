package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.*;

/**
 * Created by donald on 2/19/14.
 */
public class DogMediumFormulaActivity extends BaseFormulaActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_medium_formula);

        subId = CommonData.SUBID_MEDIUM;

        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_medium_formula_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = new Intent(DogMediumFormulaActivity.this, DogMediumSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_medium_formula));
    }
}