package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PW implements View.OnTouchListener {
    public final /* synthetic */ C0928Sx A00;

    public PW(C0928Sx c0928Sx) {
        this.A00 = c0928Sx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                f10 = this.A00.A00;
                if (f10 >= browserFinalY) {
                    return true;
                }
                this.A00.A0k(false);
                return true;
            default:
                return true;
        }
    }
}
