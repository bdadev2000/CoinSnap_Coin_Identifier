package com.vungle.ads;

import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.vungle.ads.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2073d {
    public static final int AUTO_ROTATE = 2;
    public static final C2071c Companion = new C2071c(null);
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    private static final String WATERMARK = "WATERMARK";
    private int settings;
    private Map<String, String> extras = new LinkedHashMap();
    private int adOrientation = 2;

    public static /* synthetic */ void getAdOrientation$annotations() {
    }

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    public final int getSettings() {
        return this.settings;
    }

    public final String getWatermark$vungle_ads_release() {
        return this.extras.get(WATERMARK);
    }

    public final void setAdOrientation(int i9) {
        this.adOrientation = i9;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z8) {
        int i9;
        if (z8) {
            i9 = this.settings | 2;
        } else {
            i9 = this.settings & (-3);
        }
        this.settings = i9;
    }

    public final void setWatermark(String str) {
        G7.j.e(str, MBridgeConstans.EXTRA_KEY_WM);
        this.extras.put(WATERMARK, str);
    }
}
