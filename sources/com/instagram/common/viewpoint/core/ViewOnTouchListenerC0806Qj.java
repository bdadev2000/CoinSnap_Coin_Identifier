package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0806Qj implements View.OnTouchListener {
    public final /* synthetic */ T7 A00;

    public ViewOnTouchListenerC0806Qj(T7 t7) {
        this.A00 = t7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C03798w c03798w;
        c03798w = this.A00.A0B;
        c03798w.A02(new C0821Qy(view, motionEvent));
        return false;
    }
}
