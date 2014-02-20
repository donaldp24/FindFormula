package com.general.mediaplayer.FindFormula.Cat;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.general.mediaplayer.FindFormula.BaseActivity;
import com.general.mediaplayer.FindFormula.R;
import com.general.mediaplayer.FindFormula.ResolutionSet;

/**
 * Created by MaHanYong on 14-2-20.
 */
public class CatDetailViewActivity extends BaseActivity {

    public static final String PARAM_HEADLINE = "HeadLine";
    public static final String PARAM_COPY = "Copy";
    public static final String PARAM_LINK = "Link";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_detailview);

        ResolutionSet._instance.iterateChild(findViewById(R.id.layoutCatDetailView));

        String strHeadLine= "", strCopy = "", strLink = "";
        strHeadLine = getIntent().getStringExtra(PARAM_HEADLINE);
        strCopy = getIntent().getStringExtra(PARAM_COPY);
        strLink = getIntent().getStringExtra(PARAM_LINK);

        TextView txtHeadLine, txtCopy, txtLink;
        txtHeadLine = (TextView)findViewById(R.id.txtHeadLine);
        txtHeadLine.setText(strHeadLine);

        txtCopy = (TextView)findViewById(R.id.txtCopy);
        txtCopy.setText(strCopy);
        txtCopy.setMovementMethod(new ScrollingMovementMethod());

        txtLink = (TextView)findViewById(R.id.txtLink);
        SpannableString spanString = new SpannableString(strLink);
        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
        txtLink.setText(spanString);

        Button btnClose = (Button)this.findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
