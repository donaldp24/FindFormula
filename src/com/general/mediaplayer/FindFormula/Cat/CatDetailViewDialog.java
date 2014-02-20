package com.general.mediaplayer.FindFormula.Cat;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.general.mediaplayer.FindFormula.BaseActivity;
import com.general.mediaplayer.FindFormula.BaseSpotsActivity;
import com.general.mediaplayer.FindFormula.R;
import com.general.mediaplayer.FindFormula.ResolutionSet;

/**
 * Created by MaHanYong on 14-2-20.
 */
public class CatDetailViewDialog extends Dialog {
    BaseSpotsActivity parentActivity = null;
    public CatDetailViewDialog(Context context, int layout)
    {
        super(context, layout);
        SetView(R.layout.cat_detailview);

        parentActivity = (BaseSpotsActivity)context;
    }

    public void SetView(int layoutName)
    {
        super.setContentView(layoutName);
        ResolutionSet._instance.iterateChild(findViewById(R.id.layoutCatDetailView));
    }

    public void ShowInfo(String headLine, String copy, String link)
    {
        Button dialogButton = (Button) this.findViewById(R.id.btnClose);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        TextView txtHeadLine, txtCopy, txtLink;
        txtHeadLine = (TextView)this.findViewById(R.id.txtHeadLine);
        txtHeadLine.setText(headLine);

        txtCopy = (TextView)this.findViewById(R.id.txtCopy);
        txtCopy.setText(copy);
        txtCopy.setMovementMethod(new ScrollingMovementMethod());

        txtLink = (TextView)this.findViewById(R.id.txtLink);
        SpannableString spanString = new SpannableString(link);
        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
        txtLink.setText(spanString);

        Button btnLink = (Button)findViewById(R.id.btnLink);
        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parentActivity.onBtnLinkClicked();
            }
        });
    }
}
