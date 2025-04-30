package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1684aC implements C2Y {
    public final SharedPreferences A00;

    public C1684aC(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.meta.analytics.dsp.uinode.C2Y
    public final C1685aD A5S() {
        return new C1685aD(this.A00.edit());
    }

    @Override // com.meta.analytics.dsp.uinode.C2Y
    public final long A7K(String str, long j7) {
        return this.A00.getLong(str, j7);
    }

    @Override // com.meta.analytics.dsp.uinode.C2Y
    public final String A85(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
