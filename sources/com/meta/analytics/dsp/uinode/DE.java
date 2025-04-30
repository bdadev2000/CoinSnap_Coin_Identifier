package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DE {
    public final int A00;
    public final long A01;

    public DE(int i9, long j7) {
        this.A00 = i9;
        this.A01 = j7;
    }

    public static DE A00(InterfaceC1075Bt interfaceC1075Bt, C1217Hz c1217Hz) throws IOException, InterruptedException {
        interfaceC1075Bt.ADv(c1217Hz.A00, 0, 8);
        c1217Hz.A0Y(0);
        int A08 = c1217Hz.A08();
        long size = c1217Hz.A0K();
        return new DE(A08, size);
    }
}
