package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QD implements View.OnTouchListener {
    public final /* synthetic */ SA A00;

    public QD(SA sa2) {
        this.A00 = sa2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C04318r c04318r;
        c04318r = this.A00.A0B;
        c04318r.A02(new MY(view, motionEvent));
        return false;
    }
}
