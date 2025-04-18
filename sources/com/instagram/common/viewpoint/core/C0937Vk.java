package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0937Vk implements InterfaceC0676Lj {
    public int A00;
    public final InterfaceC0676Lj A01;

    public C0937Vk(InterfaceC0676Lj interfaceC0676Lj, int i2) {
        this.A01 = interfaceC0676Lj;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void AEb(String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void flush() {
        this.A01.flush();
    }
}
