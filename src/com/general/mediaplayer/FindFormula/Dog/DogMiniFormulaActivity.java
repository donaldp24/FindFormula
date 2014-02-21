package com.general.mediaplayer.FindFormula.Dog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.general.mediaplayer.FindFormula.BaseActivity;
import com.general.mediaplayer.FindFormula.R;
import com.general.mediaplayer.FindFormula.ResolutionSet;
import com.general.mediaplayer.FindFormula.TransformManager;

/**
 * Created by donald on 2/19/14.
 */
public class DogMiniFormulaActivity extends BaseActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_mini_formula);
        // Button Back
        Button btnBack = (Button)findViewById(R.id.dog_mini_formula_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // reset current selection
                //_appPrefs.setSelectedBasic(CommonData.BASIC_NONE);

                Intent intent = new Intent(DogMiniFormulaActivity.this, DogMiniSpotsActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dog_mini_formula));
    }
}