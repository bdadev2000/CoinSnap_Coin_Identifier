package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0716Mx implements RF {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public RE A02 = RE.A04;

    public C0716Mx(View view, int i2, Drawable drawable, Drawable drawable2) {
        this.A03 = i2;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        M3.A0S(this.A07, this.A01);
    }

    private void A04(boolean z2) {
        this.A06.removeCallbacksAndMessages(null);
        if (z2) {
            this.A02 = RE.A05;
            M3.A0S(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C0717My(this), this.A03);
            return;
        }
        M3.A0S(this.A07, this.A05);
        this.A02 = RE.A04;
    }

    private void A05(boolean z2) {
        this.A06.removeCallbacksAndMessages(null);
        if (z2) {
            this.A02 = RE.A03;
            M3.A0S(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new N0(this), this.A03);
            return;
        }
        M3.A0S(this.A07, this.A04);
        this.A02 = RE.A02;
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void A3u(boolean z2, boolean z3) {
        if (z3) {
            A04(z2);
        } else {
            A05(z2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final RE A8Q() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void cancel() {
        RE re;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == RE.A03) {
            re = RE.A04;
        } else {
            re = RE.A02;
        }
        this.A02 = re;
    }
}
