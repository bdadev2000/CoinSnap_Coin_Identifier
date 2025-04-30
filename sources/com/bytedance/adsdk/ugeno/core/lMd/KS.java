package com.bytedance.adsdk.ugeno.core.lMd;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.tG;

/* loaded from: classes.dex */
public class KS {
    private boolean COT;
    private Bj KS;
    private Context jU;
    private float lMd;
    private float zp;

    public KS(Context context, Bj bj) {
        this.jU = context;
        this.KS = bj;
    }

    public boolean zp(tG tGVar, com.bytedance.adsdk.ugeno.component.lMd lmd, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.COT = false;
                    }
                } else {
                    float x9 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    if (Math.abs(x9 - this.zp) >= 15.0f || Math.abs(y4 - this.lMd) >= 15.0f) {
                        this.COT = true;
                    }
                }
            } else {
                if (this.COT) {
                    this.COT = false;
                    return false;
                }
                float x10 = motionEvent.getX();
                float y6 = motionEvent.getY();
                if (Math.abs(x10 - this.zp) < 15.0f && Math.abs(y6 - this.lMd) < 15.0f) {
                    if (tGVar != null) {
                        tGVar.zp(this.KS, lmd, lmd);
                        return true;
                    }
                } else {
                    this.COT = false;
                }
            }
        } else {
            this.zp = motionEvent.getX();
            this.lMd = motionEvent.getY();
        }
        return true;
    }
}
