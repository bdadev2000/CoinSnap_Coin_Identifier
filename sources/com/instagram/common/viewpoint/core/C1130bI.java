package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1130bI implements C2X {
    public final SharedPreferences.Editor A00;

    public C1130bI(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1130bI A00(String str, long j2) {
        this.A00.putLong(str, j2);
        return this;
    }

    public final C1130bI A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
