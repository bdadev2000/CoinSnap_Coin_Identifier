package com.bytedance.sdk.component.adexpress.dynamic.interact.zp;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.YW;

/* loaded from: classes.dex */
public class KS implements View.OnTouchListener {
    private boolean COT;
    private YW HWF;
    private float KS;
    private int QR;
    private boolean YW;
    private float jU;
    private boolean ku;
    private float lMd;
    private float zp;

    public KS(YW yw) {
        this(yw, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        YW yw;
        YW yw2;
        YW yw3;
        if (this.YW) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.jU = motionEvent.getX();
                    this.KS = motionEvent.getY();
                    if (Math.abs(this.jU - this.zp) > 10.0f) {
                        this.COT = true;
                    }
                    if (Math.abs(this.jU - this.zp) > 8.0f || Math.abs(this.KS - this.lMd) > 8.0f) {
                        this.ku = false;
                    }
                    int lMd = com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), Math.abs(this.jU - this.zp));
                    if (this.jU > this.zp && lMd > this.QR && (yw3 = this.HWF) != null) {
                        yw3.zp();
                        this.YW = true;
                    }
                }
            } else {
                if (!this.COT && !this.ku) {
                    return false;
                }
                float x9 = motionEvent.getX();
                float y4 = motionEvent.getY();
                int lMd2 = com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), Math.abs(this.jU - this.zp));
                if (this.jU > this.zp && lMd2 > this.QR && (yw2 = this.HWF) != null) {
                    yw2.zp();
                    this.YW = true;
                }
                float abs = Math.abs(x9 - this.zp);
                float abs2 = Math.abs(y4 - this.lMd);
                if ((abs < 8.0f || abs2 < 8.0f) && (yw = this.HWF) != null) {
                    yw.lMd();
                    this.YW = true;
                }
            }
        } else {
            this.zp = motionEvent.getX();
            this.lMd = motionEvent.getY();
        }
        return true;
    }

    public KS(YW yw, int i9) {
        this.QR = 5;
        this.ku = true;
        this.HWF = yw;
        if (i9 > 0) {
            this.QR = i9;
        }
    }
}
