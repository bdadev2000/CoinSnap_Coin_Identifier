package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class JN implements View.OnTouchListener {
    public final /* synthetic */ WJ A00;
    public final /* synthetic */ boolean A01;

    public JN(WJ wj, boolean z2) {
        this.A00 = wj;
        this.A01 = z2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        return true;
    }
}
