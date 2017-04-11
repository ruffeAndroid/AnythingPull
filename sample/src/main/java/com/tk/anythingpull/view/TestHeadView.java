package com.tk.anythingpull.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.tk.anythingpull.R;

/**
 * Created by TK on 2016/7/24.
 */
public class TestHeadView extends LinearLayout   {

    public TestHeadView(Context context) {
        this(context, null);
    }

    public TestHeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_test, this);
    }


}
