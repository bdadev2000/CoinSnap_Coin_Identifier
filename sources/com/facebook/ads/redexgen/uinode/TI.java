package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TI extends FrameLayout implements MD {
    public String A00;
    public final MC A01;
    public final PB A02;

    public TI(C1070Yn c1070Yn, MC mc2, PB pb2, String str) {
        super(c1070Yn);
        this.A02 = pb2;
        this.A01 = mc2;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        PB.A0B().incrementAndGet();
        this.A02.A0V();
        AbstractC0737Lo.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().ABd();
        }
        PB.A0B().decrementAndGet();
    }

    public void setListener(MC mc2) {
    }
}
