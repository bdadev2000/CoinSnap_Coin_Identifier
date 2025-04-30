package com.bytedance.sdk.component.adexpress.dynamic.interact.zp;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.YW;

/* loaded from: classes.dex */
public class jU implements View.OnTouchListener {
    private boolean Bj;
    private boolean COT = true;
    private float HWF;
    private float KS;
    private float QR;
    private YW YW;
    private int dT;
    private float jU;
    private boolean ku;
    private float lMd;
    private float zp;

    public jU(YW yw, int i9, boolean z8) {
        this.YW = yw;
        this.dT = i9;
        this.Bj = z8;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        YW yw;
        YW yw2;
        YW yw3;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y4 = motionEvent.getY();
                    this.QR = y4;
                    if (Math.abs(y4 - this.HWF) > 10.0f) {
                        this.ku = true;
                    }
                    this.jU = motionEvent.getX();
                    this.KS = motionEvent.getY();
                    if (Math.abs(this.jU - this.zp) > 8.0f || Math.abs(this.KS - this.lMd) > 8.0f) {
                        this.COT = false;
                    }
                }
            } else {
                if (!this.ku && !this.COT) {
                    return false;
                }
                if (!this.Bj && (yw3 = this.YW) != null) {
                    yw3.zp();
                } else {
                    int lMd = com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), Math.abs(this.QR - this.HWF));
                    if (this.QR - this.HWF < 0.0f && lMd > this.dT && (yw2 = this.YW) != null) {
                        yw2.zp();
                    } else if (this.COT && (yw = this.YW) != null) {
                        yw.zp();
                    }
                }
            }
        } else {
            this.zp = motionEvent.getX();
            this.lMd = motionEvent.getY();
            this.HWF = motionEvent.getY();
            this.COT = true;
        }
        return true;
    }
}
