package com.bytedance.sdk.component.adexpress.dynamic.tN.YFl;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class wN implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.tN.qsH AlY;
    private float Sg;
    private float YFl;
    private boolean tN;
    private int wN;

    public wN(com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh, int i10) {
        this.AlY = qsh;
        this.wN = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y4 = motionEvent.getY();
                    this.Sg = y4;
                    if (Math.abs(y4 - this.YFl) > 10.0f) {
                        this.tN = true;
                    }
                }
            } else {
                if (!this.tN) {
                    return false;
                }
                int Sg = com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), Math.abs(this.Sg - this.YFl));
                if (this.Sg - this.YFl < 0.0f && Sg > this.wN && (qsh = this.AlY) != null) {
                    qsh.YFl();
                    this.YFl = 0.0f;
                    this.Sg = 0.0f;
                    this.tN = false;
                }
            }
        } else {
            this.YFl = motionEvent.getY();
        }
        return true;
    }
}
