package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Mw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0715Mw implements RF {
    public int A00;
    public ValueAnimator A01;
    public RE A02 = RE.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public C0715Mw(View view, int i2, int i3, int i4) {
        this.A05 = view;
        this.A03 = i2;
        this.A00 = i3;
        this.A04 = i4;
    }

    private ValueAnimator A00(int i2, int i3, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new RI(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z2) {
        if (z2) {
            this.A02 = RE.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new RH(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        M3.A0H(this.A05);
        this.A02 = RE.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z2) {
        M3.A0L(this.A05);
        if (z2) {
            this.A02 = RE.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new RG(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = RE.A02;
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void A3u(boolean z2, boolean z3) {
        if (z3) {
            A07(z2);
        } else {
            A08(z2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final RE A8Q() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
