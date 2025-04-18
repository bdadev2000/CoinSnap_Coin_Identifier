package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1212cc implements PQ {
    public final /* synthetic */ GL A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.PQ
    public final void A9k() {
        C0536Fn c0536Fn;
        C0515Ei c0515Ei;
        c0536Fn = this.A00.A03;
        String A00 = c0536Fn.A1S().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        L2 l2 = new L2();
        c0515Ei = this.A00.A04;
        L2.A0M(l2, c0515Ei, L5.A00(A00), this.A00.A6r());
    }

    public C1212cc(GL gl) {
        this.A00 = gl;
    }

    @Override // com.instagram.common.viewpoint.core.PQ
    public final void ABp(BN bn) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1213cd(this, bn), 1L);
    }

    @Override // com.instagram.common.viewpoint.core.PQ
    public final void AC4() {
    }

    @Override // com.instagram.common.viewpoint.core.PQ
    public final void ADo(View view, MotionEvent motionEvent) {
    }
}
