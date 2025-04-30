package com.bytedance.sdk.component.adexpress.dynamic.interact.zp;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.interact.YW;

/* loaded from: classes.dex */
public class lMd implements View.OnTouchListener {
    private InteractViewContainer COT;
    private YW HWF;
    private long KS;
    private boolean jU;
    private float lMd;
    private float zp;

    public lMd(InteractViewContainer interactViewContainer, YW yw) {
        this.COT = interactViewContainer;
        this.HWF = yw;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x9 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    if (Math.abs(x9 - this.zp) >= com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), 10.0f) || Math.abs(y4 - this.lMd) >= com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), 10.0f)) {
                        this.jU = true;
                        this.COT.HWF();
                    }
                }
            } else {
                if (this.jU) {
                    return false;
                }
                if (System.currentTimeMillis() - this.KS >= 1500) {
                    YW yw = this.HWF;
                    if (yw != null) {
                        yw.zp();
                    }
                }
                this.COT.HWF();
            }
        } else {
            this.KS = System.currentTimeMillis();
            this.zp = motionEvent.getX();
            this.lMd = motionEvent.getY();
            this.COT.COT();
        }
        return true;
    }
}
