package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0940Vn implements InterfaceC0676Lj {
    public int A00;
    public final InterfaceC0676Lj A01;
    public final InterfaceC0676Lj A02;

    public C0940Vn(InterfaceC0676Lj interfaceC0676Lj, int i2, InterfaceC0676Lj interfaceC0676Lj2) {
        this.A01 = interfaceC0676Lj;
        this.A00 = i2;
        this.A02 = interfaceC0676Lj2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void AEb(String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AEb(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void flush() {
        this.A02.flush();
    }
}
