package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1733az implements InterfaceC08181h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1739b5 A01;
    public final /* synthetic */ C1737b3 A02;
    public final /* synthetic */ InterfaceC08181h A03;
    public final /* synthetic */ C08191i A04;
    public final /* synthetic */ C1636Yn A05;
    public final /* synthetic */ EnumSet A06;

    public C1733az(C08191i c08191i, C1636Yn c1636Yn, AbstractC1739b5 abstractC1739b5, C1737b3 c1737b3, int i9, InterfaceC08181h interfaceC08181h, EnumSet enumSet) {
        this.A04 = c08191i;
        this.A05 = c1636Yn;
        this.A01 = abstractC1739b5;
        this.A02 = c1737b3;
        this.A00 = i9;
        this.A03 = interfaceC08181h;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0s()) {
            return;
        }
        C08191i c08191i = this.A04;
        C1636Yn c1636Yn = this.A05;
        EnumSet enumSet = this.A06;
        C1737b3 c1737b3 = this.A02;
        c08191i.A0A(c1636Yn, enumSet, c1737b3, c1737b3.A0v(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08181h
    public final void AAe(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAe(adError);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08181h
    public final void AAf() {
        this.A05.A00().AFq(this.A01.A12(), this.A02.A0w());
        if (this.A00 == 0) {
            this.A03.AAf();
        }
        A00();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08181h
    public final void AES() {
        if (this.A00 == 0) {
            this.A03.AES();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08181h
    public final void AGm() {
        if (this.A00 == 0) {
            this.A03.AGm();
        }
    }
}
