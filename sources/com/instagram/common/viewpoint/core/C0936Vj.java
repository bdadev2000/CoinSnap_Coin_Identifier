package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0936Vj implements InterfaceC0676Lj {
    public final C0675Li A00;
    public final InterfaceC0676Lj A01;

    public C0936Vj(InterfaceC0676Lj interfaceC0676Lj, int i2, int i3) {
        this.A01 = interfaceC0676Lj;
        this.A00 = new C0675Li(i2, i3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void AEb(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = AbstractC0678Ll.A08(this.A00);
            if (A08) {
                this.A01.AEb(this.A00.A02());
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC0678Ll.A08(this.A00);
            if (A08) {
                this.A01.AEb(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
