package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1760bQ implements P0 {
    public final /* synthetic */ C1757bN A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.P0
    public final void A9L() {
        FV fv;
        EQ eq;
        fv = this.A00.A03;
        String A00 = fv.A10().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        C1284Kv c1284Kv = new C1284Kv();
        eq = this.A00.A04;
        C1284Kv.A0M(c1284Kv, eq, AbstractC1287Ky.A00(A00), this.A00.A6T());
    }

    public C1760bQ(C1757bN c1757bN) {
        this.A00 = c1757bN;
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABO(B0 b02) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1761bR(this, b02), 1L);
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABd() {
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) {
    }
}
