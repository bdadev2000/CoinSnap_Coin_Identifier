package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y0 implements InterfaceC1053Ax {
    public final C1617Xu A00;
    public final C1616Xt A01;
    public final InterfaceC1031Ab[] A02;

    public Y0(InterfaceC1031Ab... interfaceC1031AbArr) {
        InterfaceC1031Ab[] interfaceC1031AbArr2 = (InterfaceC1031Ab[]) Arrays.copyOf(interfaceC1031AbArr, interfaceC1031AbArr.length + 2);
        this.A02 = interfaceC1031AbArr2;
        C1617Xu c1617Xu = new C1617Xu();
        this.A00 = c1617Xu;
        C1616Xt c1616Xt = new C1616Xt();
        this.A01 = c1616Xt;
        interfaceC1031AbArr2[interfaceC1031AbArr.length] = c1617Xu;
        interfaceC1031AbArr2[interfaceC1031AbArr.length + 1] = c1616Xt;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1053Ax
    public final C10279x A3b(C10279x c10279x) {
        this.A00.A0B(c10279x.A02);
        return new C10279x(this.A01.A01(c10279x.A01), this.A01.A00(c10279x.A00), c10279x.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1053Ax
    public final InterfaceC1031Ab[] A64() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1053Ax
    public final long A7O(long j7) {
        return this.A01.A02(j7);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1053Ax
    public final long A80() {
        return this.A00.A0A();
    }
}
