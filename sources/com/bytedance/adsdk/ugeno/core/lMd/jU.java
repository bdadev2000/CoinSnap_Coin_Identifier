package com.bytedance.adsdk.ugeno.core.lMd;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.tG;
import com.bytedance.adsdk.ugeno.lMd.ku;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class jU {
    private Bj COT;
    private String HWF;
    private int KS = 0;
    private Context QR;
    private boolean YW;
    private Bj jU;
    private boolean ku;
    private float lMd;
    private float zp;

    public jU(Context context, Bj bj, boolean z8) {
        this.QR = context;
        this.jU = bj;
        this.YW = z8;
        zp();
    }

    private void zp() {
        Bj bj = this.jU;
        if (bj == null) {
            return;
        }
        this.KS = bj.KS().optInt("slideThreshold");
        this.HWF = this.jU.KS().optString("slideDirection", "up");
    }

    public boolean zp(tG tGVar, com.bytedance.adsdk.ugeno.component.lMd lmd, MotionEvent motionEvent) {
        if (this.ku) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zp = motionEvent.getX();
            this.lMd = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x9 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (this.YW && Math.abs(x9 - this.zp) <= 10.0f && Math.abs(y4 - this.lMd) <= 10.0f && tGVar != null) {
                tGVar.zp(this.COT, lmd, lmd);
                return true;
            }
            if (this.KS == 0 && tGVar != null) {
                tGVar.zp(this.jU, lmd, lmd);
                this.ku = true;
                return true;
            }
            int lMd = ku.lMd(this.QR, x9 - this.zp);
            int lMd2 = ku.lMd(this.QR, y4 - this.lMd);
            if (TextUtils.equals(this.HWF, "up")) {
                lMd = -lMd2;
            } else if (TextUtils.equals(this.HWF, "down")) {
                lMd = lMd2;
            } else if (TextUtils.equals(this.HWF, TtmlNode.LEFT)) {
                lMd = -lMd;
            } else if (!TextUtils.equals(this.HWF, TtmlNode.RIGHT)) {
                lMd = 0;
            }
            if (lMd < this.KS) {
                return false;
            }
            if (tGVar != null) {
                tGVar.zp(this.jU, lmd, lmd);
                this.ku = true;
                return true;
            }
        }
        return true;
    }

    public jU(Context context, Bj bj, Bj bj2, boolean z8) {
        this.QR = context;
        this.jU = bj;
        this.COT = bj2;
        this.YW = z8;
        zp();
    }
}
