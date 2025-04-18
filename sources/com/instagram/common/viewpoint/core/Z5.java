package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Z5 implements B2 {
    public final C1026Yz A00 = new C1026Yz();
    public final C1025Yy A01 = new C1025Yy();
    public final InterfaceC0414Ag[] A02;

    public Z5(InterfaceC0414Ag... interfaceC0414AgArr) {
        this.A02 = (InterfaceC0414Ag[]) Arrays.copyOf(interfaceC0414AgArr, interfaceC0414AgArr.length + 2);
        this.A02[interfaceC0414AgArr.length] = this.A00;
        this.A02[interfaceC0414AgArr.length + 1] = this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.B2
    public final A2 A3x(A2 a2) {
        this.A00.A0B(a2.A02);
        return new A2(this.A01.A01(a2.A01), this.A01.A00(a2.A00), a2.A02);
    }

    @Override // com.instagram.common.viewpoint.core.B2
    public final InterfaceC0414Ag[] A6S() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.B2
    public final long A7m(long j2) {
        return this.A01.A02(j2);
    }

    @Override // com.instagram.common.viewpoint.core.B2
    public final long A8O() {
        return this.A00.A0A();
    }
}
