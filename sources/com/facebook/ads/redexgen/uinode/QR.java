package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class QR implements QK {
    public final View A00;
    public final C1070Yn A01;

    public QR(C1070Yn c1070Yn, View view) {
        this.A01 = c1070Yn;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.uinode.QK
    public final double A8K() {
        RF result = RE.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
