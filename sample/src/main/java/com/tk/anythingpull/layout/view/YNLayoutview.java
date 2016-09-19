package com.tk.anythingpull.layout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.tk.library.implement.IPullable;


/**
 * Created by TK on 2016/7/21.
 */
public class YNLayoutview extends LinearLayout implements IPullable {
    public YNLayoutview(Context context) {
        this(context, null);
    }

    public YNLayoutview(Context context, AttributeSet attrs) {
        super(context, attrs);
        setClickable(true);
    }

    @Override
    public boolean canPullDown(boolean hasHead) {
        return true;
    }

    @Override
    public boolean canPullUp(boolean hasFoot) {
        return false;
    }
}