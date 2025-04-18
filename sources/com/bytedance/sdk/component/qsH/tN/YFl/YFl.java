package com.bytedance.sdk.component.qsH.tN.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.component.qsH.tN.Sg;

/* loaded from: classes.dex */
public class YFl {
    private long AlY;
    private int Sg = 0;
    private String YFl;
    private long tN;

    /* renamed from: vc, reason: collision with root package name */
    private long f10435vc;
    private long wN;

    public long AlY() {
        return this.AlY;
    }

    public int Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public long tN() {
        return this.tN;
    }

    public String toString() {
        return this.YFl + " times=" + this.Sg + ",waitMaxTime=" + this.wN + ",runMaxTime=" + this.f10435vc + ",runTotalTime=" + this.AlY + ",waitTotalTime=" + this.tN;
    }

    public long vc() {
        return this.f10435vc;
    }

    public long wN() {
        return this.wN;
    }

    public void YFl(Sg sg2) {
        synchronized (this) {
            if (TextUtils.isEmpty(this.YFl)) {
                this.YFl = sg2.Sg();
            }
            this.tN += sg2.vc();
            this.AlY += sg2.DSW();
            this.wN = Math.max(this.wN, sg2.vc());
            this.f10435vc = Math.max(this.f10435vc, sg2.DSW());
            this.Sg++;
        }
        sg2.vc();
        sg2.DSW();
        toString();
    }
}
