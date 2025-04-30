package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1482Sl extends KT {
    public final /* synthetic */ C9Y A00;

    public C1482Sl(C9Y c9y) {
        this.A00 = c9y;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        OL ol;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        OL ol2;
        ol = this.A00.A00;
        if (ol != null) {
            ol2 = this.A00.A00;
            ol2.A0y();
        }
        MB mb = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        mb.setToolbarActionMode(closeButtonStyle);
        this.A00.A07.A04();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
