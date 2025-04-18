package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y0 implements InterfaceC0487Ax {
    public final C1051Xu A00;
    public final C1050Xt A01;
    public final InterfaceC0465Ab[] A02;

    public Y0(InterfaceC0465Ab... interfaceC0465AbArr) {
        InterfaceC0465Ab[] interfaceC0465AbArr2 = (InterfaceC0465Ab[]) Arrays.copyOf(interfaceC0465AbArr, interfaceC0465AbArr.length + 2);
        this.A02 = interfaceC0465AbArr2;
        C1051Xu c1051Xu = new C1051Xu();
        this.A00 = c1051Xu;
        C1050Xt c1050Xt = new C1050Xt();
        this.A01 = c1050Xt;
        interfaceC0465AbArr2[interfaceC0465AbArr.length] = c1051Xu;
        interfaceC0465AbArr2[interfaceC0465AbArr.length + 1] = c1050Xt;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0487Ax
    public final C04619x A3b(C04619x c04619x) {
        this.A00.A0B(c04619x.A02);
        return new C04619x(this.A01.A01(c04619x.A01), this.A01.A00(c04619x.A00), c04619x.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0487Ax
    public final InterfaceC0465Ab[] A64() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0487Ax
    public final long A7O(long j3) {
        return this.A01.A02(j3);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0487Ax
    public final long A80() {
        return this.A00.A0A();
    }
}
