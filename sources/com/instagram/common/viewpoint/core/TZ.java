package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TZ extends FrameLayout implements MS {
    public static final RelativeLayout.LayoutParams A0B = new RelativeLayout.LayoutParams(-1, -1);
    public C5Q A00;
    public Intent A01;
    public Bundle A02;
    public MS A03;
    public final AbstractC1187cD A04;
    public final AbstractC1187cD A05;
    public final C5Q A06;
    public final C1045Zs A07;
    public final J7 A08;
    public final ViewOnSystemUiVisibilityChangeListenerC0683Lq A09;
    public final MR A0A;

    public TZ(C1045Zs c1045Zs, J7 j7, AbstractC1187cD abstractC1187cD, AbstractC1187cD abstractC1187cD2, MR mr, C5Q c5q) {
        super(c1045Zs);
        this.A07 = c1045Zs;
        this.A08 = j7;
        this.A05 = abstractC1187cD;
        this.A04 = abstractC1187cD2;
        this.A0A = mr;
        this.A06 = c5q;
        this.A09 = new ViewOnSystemUiVisibilityChangeListenerC0683Lq(this);
        this.A09.A05(EnumC0682Lp.A02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VA A05() {
        return new VA(this.A07, this.A08, new Ej(this.A06), this.A04, this.A04.A0m(), new V5(), true);
    }

    private C03839a A06() {
        if (this.A04.A1P().A0E().A06() != null) {
            this.A05.A0y(this.A04.A1P().A0E().A06().A0M());
            this.A05.A0z(this.A04.A1P().A0E().A06().A0O());
        }
        C03839a c03839a = new C03839a(this.A07, new V5(), this.A08, this.A05, new C03226f(this.A07), new Ej(this.A06));
        c03839a.setVideoLeadingPlayableAdListener(new C0875Ta(this));
        return c03839a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A03 != null) {
            this.A03.onDestroy();
            if (this.A03 instanceof View) {
                removeView((View) this.A03);
            }
        }
    }

    private final void A08(Intent intent, Bundle bundle, C5Q c5q) {
        this.A03 = A06();
        this.A03.A9q(intent, bundle, c5q);
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        this.A01 = intent;
        this.A02 = bundle;
        this.A00 = c5q;
        this.A0A.A3q(this, A0B);
        A08(intent, bundle, c5q);
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ACz(boolean z2) {
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ADN(boolean z2) {
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public String getCurrentClientToken() {
        return this.A05.A1U();
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void onDestroy() {
    }

    public void setListener(MR mr) {
    }
}
