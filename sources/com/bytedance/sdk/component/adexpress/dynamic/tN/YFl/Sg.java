package com.bytedance.sdk.component.adexpress.dynamic.tN.YFl;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.tN.NjR;

/* loaded from: classes.dex */
public class Sg implements View.OnTouchListener {
    private boolean AlY;
    private float Sg;
    private float YFl;
    private long tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.tN.qsH f10396vc;
    private NjR wN;

    public Sg(NjR njR, com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh) {
        this.wN = njR;
        this.f10396vc = qsh;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x10 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    if (Math.abs(x10 - this.YFl) >= com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), 10.0f) || Math.abs(y4 - this.Sg) >= com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), 10.0f)) {
                        this.AlY = true;
                        this.wN.vc();
                    }
                }
            } else {
                if (this.AlY) {
                    return false;
                }
                if (System.currentTimeMillis() - this.tN >= 1500) {
                    com.bytedance.sdk.component.adexpress.dynamic.tN.qsH qsh = this.f10396vc;
                    if (qsh != null) {
                        qsh.YFl();
                    }
                }
                this.wN.vc();
            }
        } else {
            this.tN = System.currentTimeMillis();
            this.YFl = motionEvent.getX();
            this.Sg = motionEvent.getY();
            this.wN.wN();
        }
        return true;
    }
}
