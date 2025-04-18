package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1167az implements InterfaceC02521h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1173b5 A01;
    public final /* synthetic */ C1171b3 A02;
    public final /* synthetic */ InterfaceC02521h A03;
    public final /* synthetic */ C02531i A04;
    public final /* synthetic */ C1070Yn A05;
    public final /* synthetic */ EnumSet A06;

    public C1167az(C02531i c02531i, C1070Yn c1070Yn, AbstractC1173b5 abstractC1173b5, C1171b3 c1171b3, int i10, InterfaceC02521h interfaceC02521h, EnumSet enumSet) {
        this.A04 = c02531i;
        this.A05 = c1070Yn;
        this.A01 = abstractC1173b5;
        this.A02 = c1171b3;
        this.A00 = i10;
        this.A03 = interfaceC02521h;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0s()) {
            return;
        }
        C02531i c02531i = this.A04;
        C1070Yn c1070Yn = this.A05;
        EnumSet enumSet = this.A06;
        C1171b3 c1171b3 = this.A02;
        c02531i.A0A(c1070Yn, enumSet, c1171b3, c1171b3.A0v(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02521h
    public final void AAe(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAe(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02521h
    public final void AAf() {
        this.A05.A00().AFq(this.A01.A12(), this.A02.A0w());
        if (this.A00 == 0) {
            this.A03.AAf();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02521h
    public final void AES() {
        if (this.A00 == 0) {
            this.A03.AES();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02521h
    public final void AGm() {
        if (this.A00 == 0) {
            this.A03.AGm();
        }
    }
}
