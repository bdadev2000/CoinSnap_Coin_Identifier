package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class JI implements View.OnTouchListener {
    public final /* synthetic */ VE A00;
    public final /* synthetic */ boolean A01;

    public JI(VE ve2, boolean z10) {
        this.A00 = ve2;
        this.A01 = z10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        return true;
    }
}
