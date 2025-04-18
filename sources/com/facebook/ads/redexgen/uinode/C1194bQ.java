package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1194bQ implements P0 {
    public final /* synthetic */ C1191bN A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void A9L() {
        FV fv;
        EQ eq;
        fv = this.A00.A03;
        String A00 = fv.A10().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        C0718Kv c0718Kv = new C0718Kv();
        eq = this.A00.A04;
        C0718Kv.A0M(c0718Kv, eq, AbstractC0721Ky.A00(A00), this.A00.A6T());
    }

    public C1194bQ(C1191bN c1191bN) {
        this.A00 = c1191bN;
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABO(B0 b02) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1195bR(this, b02), 1L);
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABd() {
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) {
    }
}
