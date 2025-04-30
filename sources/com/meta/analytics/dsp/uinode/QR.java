package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class QR implements QK {
    public final View A00;
    public final C1636Yn A01;

    public QR(C1636Yn c1636Yn, View view) {
        this.A01 = c1636Yn;
        this.A00 = view;
    }

    @Override // com.meta.analytics.dsp.uinode.QK
    public final double A8K() {
        RF result = RE.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
