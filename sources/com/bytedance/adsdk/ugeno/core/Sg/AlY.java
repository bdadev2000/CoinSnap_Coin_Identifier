package com.bytedance.adsdk.ugeno.core.Sg;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.nc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class AlY {
    private nc AlY;
    private Context DSW;
    private boolean qsH;

    /* renamed from: vc, reason: collision with root package name */
    private String f10269vc;
    private nc wN;
    private float YFl = Float.MIN_VALUE;
    private float Sg = Float.MIN_VALUE;
    private int tN = 0;

    public AlY(Context context, nc ncVar, boolean z10) {
        this.DSW = context;
        this.AlY = ncVar;
        this.qsH = z10;
        Sg();
    }

    private void Sg() {
        nc ncVar = this.AlY;
        if (ncVar == null) {
            return;
        }
        this.tN = ncVar.tN().optInt("slideThreshold");
        this.f10269vc = this.AlY.tN().optString("slideDirection");
    }

    public void YFl() {
        this.YFl = Float.MIN_VALUE;
        this.Sg = Float.MIN_VALUE;
    }

    public boolean YFl(YoT yoT, com.bytedance.adsdk.ugeno.Sg.Sg sg2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    if (this.YFl == Float.MIN_VALUE || this.Sg == Float.MIN_VALUE) {
                        return false;
                    }
                }
            }
            float x10 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (this.qsH && Math.abs(x10 - this.YFl) <= 10.0f && Math.abs(y4 - this.Sg) <= 10.0f && yoT != null) {
                YFl();
                yoT.YFl(this.wN, sg2, sg2);
                return true;
            }
            if (this.tN == 0 && yoT != null) {
                YFl();
                yoT.YFl(this.AlY, sg2, sg2);
                return true;
            }
            int Sg = qsH.Sg(this.DSW, x10 - this.YFl);
            int Sg2 = qsH.Sg(this.DSW, y4 - this.Sg);
            if (TextUtils.equals(this.f10269vc, "up")) {
                Sg = -Sg2;
            } else if (TextUtils.equals(this.f10269vc, "down")) {
                Sg = Sg2;
            } else if (TextUtils.equals(this.f10269vc, TtmlNode.LEFT)) {
                Sg = -Sg;
            } else if (!TextUtils.equals(this.f10269vc, TtmlNode.RIGHT)) {
                Sg = (int) Math.abs(Math.sqrt(Math.pow(Sg2, 2.0d) + Math.pow(Sg, 2.0d)));
            }
            if (Sg < this.tN) {
                YFl();
                return false;
            }
            if (yoT != null) {
                YFl();
                yoT.YFl(this.AlY, sg2, sg2);
                return true;
            }
            YFl();
        } else {
            this.YFl = motionEvent.getX();
            this.Sg = motionEvent.getY();
        }
        return true;
    }

    public AlY(Context context, nc ncVar, nc ncVar2, boolean z10) {
        this.DSW = context;
        this.AlY = ncVar;
        this.wN = ncVar2;
        this.qsH = z10;
        Sg();
    }
}
