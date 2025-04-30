package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1418Pz implements View.OnTouchListener {
    public final /* synthetic */ Q0 A00;

    public ViewOnTouchListenerC1418Pz(Q0 q02) {
        this.A00 = q02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        J2 j22;
        AbstractC1739b5 abstractC1739b5;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            Q0.A00(this.A00);
            j22 = this.A00.A06;
            abstractC1739b5 = this.A00.A03;
            j22.A9u(abstractC1739b5.A12(), new C1349Ni().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
