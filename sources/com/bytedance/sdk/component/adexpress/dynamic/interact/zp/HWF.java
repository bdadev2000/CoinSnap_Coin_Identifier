package com.bytedance.sdk.component.adexpress.dynamic.interact.zp;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.YW;

/* loaded from: classes.dex */
public class HWF implements View.OnTouchListener {
    private static int KS = 10;
    private YW COT;
    private boolean jU;
    private float lMd;
    private float zp;

    public HWF(YW yw) {
        this.COT = yw;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.jU = false;
                    }
                } else {
                    float x9 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    if (Math.abs(x9 - this.zp) >= KS || Math.abs(y4 - this.lMd) >= KS) {
                        this.jU = true;
                    }
                }
            } else {
                if (this.jU) {
                    this.jU = false;
                    return false;
                }
                float x10 = motionEvent.getX();
                float y6 = motionEvent.getY();
                if (Math.abs(x10 - this.zp) < KS && Math.abs(y6 - this.lMd) < KS) {
                    YW yw = this.COT;
                    if (yw != null) {
                        yw.zp();
                    }
                } else {
                    this.jU = false;
                }
            }
        } else {
            this.zp = motionEvent.getX();
            this.lMd = motionEvent.getY();
        }
        return true;
    }
}
