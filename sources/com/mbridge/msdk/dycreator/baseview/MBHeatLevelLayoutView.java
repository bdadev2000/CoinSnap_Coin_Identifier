package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.e.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class MBHeatLevelLayoutView extends MBLinearLayout {
    public MBHeatLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setHeatCount(int i10) {
        try {
            removeAllViews();
            double a = c.a(i10, 10000.0d, 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, c.a(getContext(), 30.0f));
            layoutParams.setMargins(15, 0, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setGravity(17);
            textView.setTextColor(Color.parseColor("#FF000000"));
            textView.setTextSize(10.0f);
            Drawable drawable = getResources().getDrawable(v.a(getContext(), "mbridge_reward_user", "drawable"));
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            textView.setCompoundDrawables(null, null, drawable, null);
            textView.setText(a + getResources().getString(getResources().getIdentifier("mbridge_reward_heat_count_unit", "string", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(textView, layoutParams);
        } catch (Exception e2) {
            ad.b("MBHeatLevelLayoutView", e2.getMessage());
        }
    }
}
