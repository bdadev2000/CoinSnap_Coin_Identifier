package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0714Mv implements RF {
    public ViewPropertyAnimator A00;
    public RE A01 = RE.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public C0714Mv(View view, int i2, boolean z2) {
        this.A02 = i2;
        this.A03 = view;
        this.A04 = z2;
    }

    private void A04(boolean z2) {
        this.A01 = RE.A03;
        if (this.A04) {
            M3.A0L(this.A03);
        }
        if (!z2) {
            this.A03.setAlpha(1.0f);
            this.A01 = RE.A02;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new RJ(this));
        }
    }

    private void A05(boolean z2) {
        this.A01 = RE.A05;
        if (!z2) {
            this.A03.setAlpha(0.0f);
            this.A01 = RE.A04;
        } else {
            this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new RK(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void A3u(boolean z2, boolean z3) {
        if (z3) {
            A05(z2);
        } else {
            A04(z2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final RE A8Q() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.RF
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
