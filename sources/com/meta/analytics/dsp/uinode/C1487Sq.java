package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1487Sq implements InterfaceC1396Pd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1485So A01;

    public C1487Sq(C1485So c1485So, int i9) {
        this.A01 = c1485So;
        this.A00 = i9;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1396Pd
    public final void AAu() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1396Pd
    public final void ABH(int i9) {
        C1485So.A02(this.A01, i9);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1396Pd
    public final void ABY(float f9) {
        boolean z8;
        z8 = this.A01.A08;
        if (!z8) {
            this.A01.A0G(f9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1396Pd
    public final void AD7(boolean z8) {
        this.A01.A0Q(z8);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1396Pd
    public final void ADX(String str) {
        C1636Yn c1636Yn;
        MC mc;
        InterfaceC1324Mj interfaceC1324Mj;
        c1636Yn = this.A01.A0D;
        c1636Yn.A0E().A2z(str);
        mc = this.A01.A0H;
        interfaceC1324Mj = this.A01.A0J;
        mc.A43(interfaceC1324Mj.A6y());
        this.A01.A0H(3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1396Pd
    public final void AGq() {
        FullScreenAdToolbar fullScreenAdToolbar;
        FullScreenAdToolbar fullScreenAdToolbar2;
        this.A01.A09 = false;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgressImmediate(0.0f);
        fullScreenAdToolbar2 = this.A01.A0I;
        fullScreenAdToolbar2.setToolbarActionMode(2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1396Pd
    public final void AGr(float f9) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgress(100.0f * f9);
    }
}
