package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class H4 extends IOException {
    public final int A00;
    public final C0625Gy A01;

    public H4(IOException iOException, C0625Gy c0625Gy, int i10) {
        super(iOException);
        this.A01 = c0625Gy;
        this.A00 = i10;
    }

    public H4(String str, C0625Gy c0625Gy, int i10) {
        super(str);
        this.A01 = c0625Gy;
        this.A00 = i10;
    }

    public H4(String str, IOException iOException, C0625Gy c0625Gy, int i10) {
        super(str, iOException);
        this.A01 = c0625Gy;
        this.A00 = i10;
    }
}
