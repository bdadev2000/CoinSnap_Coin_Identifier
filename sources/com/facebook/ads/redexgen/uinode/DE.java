package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DE {
    public final int A00;
    public final long A01;

    public DE(int i10, long j3) {
        this.A00 = i10;
        this.A01 = j3;
    }

    public static DE A00(InterfaceC0509Bt interfaceC0509Bt, C0651Hz c0651Hz) throws IOException, InterruptedException {
        interfaceC0509Bt.ADv(c0651Hz.A00, 0, 8);
        c0651Hz.A0Y(0);
        int A08 = c0651Hz.A08();
        long size = c0651Hz.A0K();
        return new DE(A08, size);
    }
}
