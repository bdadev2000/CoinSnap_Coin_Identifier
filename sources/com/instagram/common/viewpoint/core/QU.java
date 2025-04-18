package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QU implements View.OnTouchListener {
    public final /* synthetic */ QV A00;

    public QU(QV qv) {
        this.A00 = qv;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        J7 j7;
        AbstractC1187cD abstractC1187cD;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            QV.A00(this.A00);
            j7 = this.A00.A06;
            abstractC1187cD = this.A00.A03;
            j7.AAK(abstractC1187cD.A1U(), new O8().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
