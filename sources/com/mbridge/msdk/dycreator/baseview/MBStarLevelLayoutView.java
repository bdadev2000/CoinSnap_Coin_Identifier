package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes3.dex */
public class MBStarLevelLayoutView extends MBLinearLayout {
    public MBStarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRating(int i9) {
        try {
            removeAllViews();
            if (i9 == 0) {
                i9 = 5;
            }
            for (int i10 = 0; i10 < 5; i10++) {
                ImageView imageView = new ImageView(getContext());
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i10 < i9) {
                    imageView.setImageResource(v.a(c.m().c(), "mbridge_download_message_dialog_star_sel", "drawable"));
                } else {
                    imageView.setImageResource(v.a(c.m().c(), "mbridge_download_message_dilaog_star_nor", "drawable"));
                }
                addView(imageView, layoutParams);
            }
        } catch (Exception e4) {
            ad.b("MBStarLevelLayoutView", e4.getMessage());
        }
    }
}
