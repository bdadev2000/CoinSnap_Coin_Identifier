package com.bytedance.sdk.component.adexpress.dynamic.interact.zp;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.YW;

/* loaded from: classes.dex */
public class ku implements View.OnTouchListener {
    private float COT;
    private float HWF;
    private final int KS = 10;
    private float QR;
    private float jU;
    private final boolean lMd;
    private final YW zp;

    public ku(YW yw, boolean z8) {
        this.zp = yw;
        this.lMd = z8;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        YW yw;
        YW yw2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.HWF = motionEvent.getX();
                this.QR = motionEvent.getY();
                new StringBuilder(", mEndY: ").append(this.QR);
                if (!this.lMd && (yw2 = this.zp) != null) {
                    yw2.zp();
                } else {
                    float f9 = this.HWF - this.jU;
                    float f10 = this.QR - this.COT;
                    if (com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), Math.abs((float) Math.sqrt((f10 * f10) + (f9 * f9)))) > 10.0f && (yw = this.zp) != null) {
                        yw.zp();
                    }
                }
            }
        } else {
            this.jU = motionEvent.getX();
            this.COT = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.COT);
        }
        return true;
    }
}
