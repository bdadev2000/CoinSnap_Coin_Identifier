package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TI extends FrameLayout implements MD {
    public String A00;
    public final MC A01;
    public final PB A02;

    public TI(C1636Yn c1636Yn, MC mc, PB pb, String str) {
        super(c1636Yn);
        this.A02 = pb;
        this.A01 = mc;
        this.A00 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        PB.A0B().incrementAndGet();
        this.A02.A0V();
        AbstractC1303Lo.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACW(boolean z8) {
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACu(boolean z8) {
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final boolean onActivityResult(int i9, int i10, Intent intent) {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().ABd();
        }
        PB.A0B().decrementAndGet();
    }

    public void setListener(MC mc) {
    }
}
