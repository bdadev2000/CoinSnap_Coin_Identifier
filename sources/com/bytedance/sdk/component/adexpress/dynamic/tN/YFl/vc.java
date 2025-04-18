package com.bytedance.sdk.component.adexpress.dynamic.tN.YFl;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class vc implements View.OnTouchListener {
    private static int tN = 10;
    private boolean AlY;
    private float Sg;
    private float YFl;
    private com.bytedance.sdk.component.adexpress.dynamic.tN.qsH wN;

    public vc(com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh) {
        this.wN = qsh;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.AlY = false;
                    }
                } else {
                    float x10 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    if (Math.abs(x10 - this.YFl) >= tN || Math.abs(y4 - this.Sg) >= tN) {
                        this.AlY = true;
                    }
                }
            } else {
                if (this.AlY) {
                    this.AlY = false;
                    return false;
                }
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x11 - this.YFl) < tN && Math.abs(y10 - this.Sg) < tN) {
                    com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh = this.wN;
                    if (qsh != null) {
                        qsh.YFl();
                    }
                } else {
                    this.AlY = false;
                }
            }
        } else {
            this.YFl = motionEvent.getX();
            this.Sg = motionEvent.getY();
        }
        return true;
    }
}
