package com.bytedance.sdk.component.adexpress.dynamic.tN.YFl;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class tN implements View.OnTouchListener {
    private float AlY;
    private int DSW;
    private boolean NjR;
    private float Sg;
    private float YFl;
    private boolean qsH;
    private float tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.tN.qsH f10400vc;
    private boolean wN;

    public tN(com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh) {
        this(qsh, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh;
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh2;
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh3;
        if (this.NjR) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.AlY = motionEvent.getX();
                    this.tN = motionEvent.getY();
                    if (Math.abs(this.AlY - this.YFl) > 10.0f) {
                        this.wN = true;
                    }
                    if (Math.abs(this.AlY - this.YFl) > 8.0f || Math.abs(this.tN - this.Sg) > 8.0f) {
                        this.qsH = false;
                    }
                    int Sg = com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), Math.abs(this.AlY - this.YFl));
                    if (this.AlY > this.YFl && Sg > this.DSW && (qsh3 = this.f10400vc) != null) {
                        qsh3.YFl();
                        this.NjR = true;
                    }
                }
            } else {
                if (!this.wN && !this.qsH) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y4 = motionEvent.getY();
                int Sg2 = com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), Math.abs(this.AlY - this.YFl));
                if (this.AlY > this.YFl && Sg2 > this.DSW && (qsh2 = this.f10400vc) != null) {
                    qsh2.YFl();
                    this.NjR = true;
                }
                float abs = Math.abs(x10 - this.YFl);
                float abs2 = Math.abs(y4 - this.Sg);
                if ((abs < 8.0f || abs2 < 8.0f) && (qsh = this.f10400vc) != null) {
                    qsh.Sg();
                    this.NjR = true;
                }
            }
        } else {
            this.YFl = motionEvent.getX();
            this.Sg = motionEvent.getY();
        }
        return true;
    }

    public tN(com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh, int i10) {
        this.DSW = 5;
        this.qsH = true;
        this.f10400vc = qsh;
        if (i10 > 0) {
            this.DSW = i10;
        }
    }
}
