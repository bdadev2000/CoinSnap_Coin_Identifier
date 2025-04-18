package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DJ {
    public final int A00;
    public final long A01;

    public DJ(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public static DJ A00(InterfaceC0456By interfaceC0456By, I4 i4) throws IOException, InterruptedException {
        interfaceC0456By.AEO(i4.A00, 0, 8);
        i4.A0Y(0);
        int A08 = i4.A08();
        long size = i4.A0K();
        return new DJ(A08, size);
    }
}
