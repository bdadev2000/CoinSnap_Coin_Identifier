package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes3.dex */
public class StarLevelLayoutView extends LinearLayout {
    public StarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRating(int i9) {
        removeAllViews();
        if (i9 == 0) {
            i9 = 5;
        }
        for (int i10 = 0; i10 < 5; i10++) {
            View imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i10 < i9) {
                imageView.setBackgroundResource(v.a(getContext(), "mbridge_demo_star_sel", "drawable"));
            } else {
                imageView.setBackgroundResource(v.a(getContext(), "mbridge_demo_star_nor", "drawable"));
            }
            layoutParams.leftMargin = ai.a(getContext(), 7.0f);
            addView(imageView, layoutParams);
        }
    }

    public StarLevelLayoutView(Context context) {
        super(context);
    }

    public StarLevelLayoutView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
