package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class H4 extends IOException {
    public final int A00;
    public final C1191Gy A01;

    public H4(IOException iOException, C1191Gy c1191Gy, int i9) {
        super(iOException);
        this.A01 = c1191Gy;
        this.A00 = i9;
    }

    public H4(String str, C1191Gy c1191Gy, int i9) {
        super(str);
        this.A01 = c1191Gy;
        this.A00 = i9;
    }

    public H4(String str, IOException iOException, C1191Gy c1191Gy, int i9) {
        super(str, iOException);
        this.A01 = c1191Gy;
        this.A00 = i9;
    }
}
