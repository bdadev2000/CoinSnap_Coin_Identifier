package com.instagram.common.viewpoint.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class OY implements InterfaceC0816Qt {
    public View A00;
    public T7 A01;
    public R5 A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC0858Sj A05;
    public final AbstractC0852Sd A06;
    public final AbstractC0836Rn A07;
    public final AbstractC0820Qx A08;
    public final boolean A09;
    public final boolean A0A;

    public OY(View view, R5 r5, boolean z2) {
        this(view, r5, z2, false);
    }

    public OY(View view, R5 r5, boolean z2, boolean z3) {
        this.A06 = new AbstractC0852Sd() { // from class: com.facebook.ads.redexgen.X.8R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9P c9p) {
                OY.this.A06(1, 0);
            }
        };
        this.A07 = new AbstractC0836Rn() { // from class: com.facebook.ads.redexgen.X.8Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(SZ sz) {
                boolean z4;
                R5 r52;
                boolean z5;
                z4 = OY.this.A03;
                if (!z4) {
                    return;
                }
                r52 = OY.this.A02;
                if (r52 != R5.A02) {
                    z5 = OY.this.A09;
                    if (!z5) {
                        OY.this.A06(0, 8);
                        return;
                    }
                }
                OY.this.A02 = null;
                OY.this.A05();
            }
        };
        this.A05 = new AbstractC0858Sj() { // from class: com.facebook.ads.redexgen.X.8P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9R c9r) {
                R5 r52;
                View view2;
                View view3;
                r52 = OY.this.A02;
                if (r52 == R5.A03) {
                    return;
                }
                view2 = OY.this.A00;
                view2.setAlpha(1.0f);
                view3 = OY.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C8H(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z2;
        this.A0A = z3;
        A08(view, r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new R4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i2, int i3) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i2);
        this.A00.setVisibility(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, R5 r5) {
        this.A02 = r5;
        this.A00 = view;
        this.A00.clearAnimation();
        if (r5 == R5.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void A9r(T7 t7) {
        this.A01 = t7;
        t7.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void AHD(T7 t7) {
        A06(1, 0);
        t7.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
