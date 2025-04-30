package com.bytedance.sdk.component.adexpress.dynamic.interact.zp;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.YW;

/* loaded from: classes.dex */
public class COT implements View.OnTouchListener {
    private int COT;
    private boolean KS;
    private YW jU;
    private float lMd;
    private float zp;

    public COT(YW yw, int i9) {
        this.jU = yw;
        this.COT = i9;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        YW yw;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y4 = motionEvent.getY();
                    this.lMd = y4;
                    if (Math.abs(y4 - this.zp) > 10.0f) {
                        this.KS = true;
                    }
                }
            } else {
                if (!this.KS) {
                    return false;
                }
                int lMd = com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), Math.abs(this.lMd - this.zp));
                if (this.lMd - this.zp < 0.0f && lMd > this.COT && (yw = this.jU) != null) {
                    yw.zp();
                }
            }
        } else {
            this.zp = motionEvent.getY();
        }
        return true;
    }
}
