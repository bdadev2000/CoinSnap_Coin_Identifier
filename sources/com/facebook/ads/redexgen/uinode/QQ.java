package com.facebook.ads.redexgen.uinode;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public abstract class QQ extends RelativeLayout implements QN {
    public SA A00;

    public QQ(C1070Yn c1070Yn) {
        super(c1070Yn);
    }

    public QQ(C1070Yn c1070Yn, AttributeSet attributeSet, int i10) {
        super(c1070Yn, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void A9R(SA sa2) {
        this.A00 = sa2;
        A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void AGl(SA sa2) {
        A08();
        this.A00 = null;
    }

    public SA getVideoView() {
        return this.A00;
    }
}
