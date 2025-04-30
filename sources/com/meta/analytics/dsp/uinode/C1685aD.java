package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1685aD implements C2X {
    public final SharedPreferences.Editor A00;

    public C1685aD(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1685aD A00(String str, long j7) {
        this.A00.putLong(str, j7);
        return this;
    }

    public final C1685aD A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
