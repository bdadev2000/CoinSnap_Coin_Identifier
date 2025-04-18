package com.bytedance.sdk.component.adexpress.dynamic.tN.YFl;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class qsH implements View.OnTouchListener {
    private float AlY;
    private float DSW;
    private final boolean Sg;
    private final com.bytedance.sdk.component.adexpress.dynamic.tN.qsH YFl;
    private final int tN = 10;

    /* renamed from: vc, reason: collision with root package name */
    private float f10399vc;
    private float wN;

    public qsH(com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh, boolean z10) {
        this.YFl = qsh;
        this.Sg = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh;
        com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f10399vc = motionEvent.getX();
                this.DSW = motionEvent.getY();
                new StringBuilder(", mEndY: ").append(this.DSW);
                if (!this.Sg && (qsh2 = this.YFl) != null) {
                    qsh2.YFl();
                } else {
                    float f10 = this.f10399vc - this.AlY;
                    float f11 = this.DSW - this.wN;
                    if (com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), Math.abs((float) Math.sqrt((f11 * f11) + (f10 * f10)))) > 10.0f && (qsh = this.YFl) != null) {
                        qsh.YFl();
                    }
                }
            }
        } else {
            this.AlY = motionEvent.getX();
            this.wN = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.wN);
        }
        return true;
    }
}
