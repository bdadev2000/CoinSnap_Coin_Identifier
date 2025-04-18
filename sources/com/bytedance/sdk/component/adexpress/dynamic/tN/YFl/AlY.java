package com.bytedance.sdk.component.adexpress.dynamic.tN.YFl;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class AlY implements View.OnTouchListener {
    private float AlY;
    private float DSW;
    private com.bytedance.sdk.component.adexpress.dynamic.tN.qsH NjR;
    private float Sg;
    private float YFl;
    private boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    private int f10392nc;
    private boolean qsH;
    private float tN;

    /* renamed from: vc, reason: collision with root package name */
    private float f10393vc;
    private boolean wN = true;

    public AlY(com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh, int i10, boolean z10) {
        this.NjR = qsh;
        this.f10392nc = i10;
        this.eT = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh;
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh2;
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh3;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y4 = motionEvent.getY();
                    this.DSW = y4;
                    if (Math.abs(y4 - this.f10393vc) > 10.0f) {
                        this.qsH = true;
                    }
                    this.AlY = motionEvent.getX();
                    this.tN = motionEvent.getY();
                    if (Math.abs(this.AlY - this.YFl) > 8.0f || Math.abs(this.tN - this.Sg) > 8.0f) {
                        this.wN = false;
                    }
                }
            } else {
                if (!this.qsH && !this.wN) {
                    return false;
                }
                if (!this.eT && (qsh3 = this.NjR) != null) {
                    qsh3.YFl();
                } else {
                    int Sg = com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), Math.abs(this.DSW - this.f10393vc));
                    if (this.DSW - this.f10393vc < 0.0f && Sg > this.f10392nc && (qsh2 = this.NjR) != null) {
                        qsh2.YFl();
                    } else if (this.wN && (qsh = this.NjR) != null) {
                        qsh.YFl();
                    }
                }
            }
        } else {
            this.YFl = motionEvent.getX();
            this.Sg = motionEvent.getY();
            this.f10393vc = motionEvent.getY();
            this.wN = true;
        }
        return true;
    }
}
