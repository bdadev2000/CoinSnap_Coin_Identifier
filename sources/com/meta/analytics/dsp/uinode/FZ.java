package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class FZ extends AbstractC1724aq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FY A01;
    public final /* synthetic */ C1737b3 A02;
    public final /* synthetic */ FS A03;
    public final /* synthetic */ C1636Yn A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZ(FY fy, boolean z8, C1636Yn c1636Yn, FS fs, C1737b3 c1737b3, int i9) {
        super(z8);
        this.A01 = fy;
        this.A04 = c1636Yn;
        this.A03 = fs;
        this.A02 = c1737b3;
        this.A00 = i9;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1724aq
    public final void A00() {
        AnonymousClass18 anonymousClass18;
        anonymousClass18 = this.A01.A01;
        anonymousClass18.AD1(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1724aq
    public final void A01(boolean z8) {
        AtomicBoolean atomicBoolean;
        AnonymousClass18 anonymousClass18;
        FY.A0D = null;
        if (z8) {
            this.A04.A00().AFq(this.A03.A12(), this.A02.A0w());
        }
        if (this.A00 == 0) {
            atomicBoolean = this.A01.A0C;
            atomicBoolean.set(true);
            anonymousClass18 = this.A01.A01;
            anonymousClass18.ACy(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
