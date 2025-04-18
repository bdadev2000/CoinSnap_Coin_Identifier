package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0889To implements Q4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0887Tm A01;

    public C0889To(C0887Tm c0887Tm, int i2) {
        this.A01 = c0887Tm;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.Q4
    public final void ABK() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.Q4
    public final void ABi(int i2) {
        C0887Tm.A02(this.A01, i2);
    }

    @Override // com.instagram.common.viewpoint.core.Q4
    public final void ABz(float f2) {
        boolean z2;
        z2 = this.A01.A08;
        if (!z2) {
            this.A01.A0G(f2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.Q4
    public final void ADa(boolean z2) {
        this.A01.A0Q(z2);
    }

    @Override // com.instagram.common.viewpoint.core.Q4
    public final void AE0(String str) {
        C1045Zs c1045Zs;
        MR mr;
        N9 n9;
        c1045Zs = this.A01.A0D;
        c1045Zs.A0E().A3L(str);
        mr = this.A01.A0H;
        n9 = this.A01.A0J;
        mr.A4P(n9.A7M());
        this.A01.A0H(3);
    }

    @Override // com.instagram.common.viewpoint.core.Q4
    public final void AHI() {
        FullScreenAdToolbar fullScreenAdToolbar;
        FullScreenAdToolbar fullScreenAdToolbar2;
        this.A01.A09 = false;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgressImmediate(0.0f);
        fullScreenAdToolbar2 = this.A01.A0I;
        fullScreenAdToolbar2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.Q4
    public final void AHJ(float f2) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgress(100.0f * f2);
    }
}
