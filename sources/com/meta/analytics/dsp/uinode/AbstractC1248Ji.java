package com.meta.analytics.dsp.uinode;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ji, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1248Ji {
    public static EnumC1246Jg A00(DisplayMetrics displayMetrics) {
        int i9 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (LE.A04(i9, screenHeight)) {
            return EnumC1246Jg.A0H;
        }
        if (screenHeight > i9) {
            return EnumC1246Jg.A0J;
        }
        return EnumC1246Jg.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, EnumC1244Je enumC1244Je) {
        int ceil;
        int i9 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = enumC1244Je.A03();
        if (i9 >= screenWidth) {
            ceil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = enumC1244Je.A03();
            ceil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = enumC1244Je.A02();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
