package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1119aD implements C2X {
    public final SharedPreferences.Editor A00;

    public C1119aD(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1119aD A00(String str, long j3) {
        this.A00.putLong(str, j3);
        return this;
    }

    public final C1119aD A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
