package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PW implements View.OnTouchListener {
    public final /* synthetic */ C1494Sx A00;

    public PW(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f9;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                f9 = this.A00.A00;
                if (f9 >= browserFinalY) {
                    return true;
                }
                this.A00.A0k(false);
                return true;
            default:
                return true;
        }
    }
}
