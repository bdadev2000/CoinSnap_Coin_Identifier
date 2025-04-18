package com.vungle.ads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public static final int AUTO_ROTATE = 2;
    public static final c Companion = new c(null);
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

    public final void setAdOrientation(int i10) {
        this.adOrientation = i10;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z10) {
        int i10;
        if (z10) {
            i10 = this.settings | 2;
        } else {
            i10 = this.settings & (-3);
        }
        this.settings = i10;
    }

    public final void setWatermark(String watermark) {
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.extras.put(WATERMARK, watermark);
    }
}
