package com.bytedance.adsdk.ugeno.core.Sg;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.nc;

/* loaded from: classes.dex */
public class Sg {
    private Context AlY;
    private float Sg;
    private float YFl;
    private nc tN;
    private boolean wN;

    public Sg(Context context, nc ncVar) {
        this.AlY = context;
        this.tN = ncVar;
    }

    public boolean YFl(YoT yoT, com.bytedance.adsdk.ugeno.Sg.Sg sg2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.wN = false;
                    }
                } else {
                    float x10 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    if (Math.abs(x10 - this.YFl) >= 15.0f || Math.abs(y4 - this.Sg) >= 15.0f) {
                        this.wN = true;
                    }
                }
            } else {
                if (this.wN) {
                    this.wN = false;
                    return false;
                }
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x11 - this.YFl) < 15.0f && Math.abs(y10 - this.Sg) < 15.0f) {
                    if (yoT != null) {
                        yoT.YFl(this.tN, sg2, sg2);
                        return true;
                    }
                } else {
                    this.wN = false;
                }
            }
        } else {
            this.YFl = motionEvent.getX();
            this.Sg = motionEvent.getY();
        }
        return true;
    }
}
