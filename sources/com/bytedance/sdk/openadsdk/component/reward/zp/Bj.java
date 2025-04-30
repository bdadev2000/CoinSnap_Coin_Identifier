package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class Bj {
    private com.bytedance.adsdk.ugeno.component.lMd Bj;
    private volatile long COT;
    private volatile long HWF;
    private FrameLayout KS;
    private volatile long QR;
    private String ku;
    private final zp lMd;
    private boolean tG;
    final woN zp;
    private final AtomicBoolean jU = new AtomicBoolean(false);
    private final AtomicBoolean YW = new AtomicBoolean(false);
    private long dT = 0;
    private String vDp = null;

    public Bj(zp zpVar) {
        this.lMd = zpVar;
        this.zp = zpVar.zp;
        this.ku = zpVar.QR;
    }

    public void HWF() {
        ku();
        QR();
        com.bytedance.adsdk.ugeno.component.lMd lmd = this.Bj;
        if (lmd != null) {
            this.KS.addView(lmd.YW(), new FrameLayout.LayoutParams(this.Bj.dQp(), this.Bj.KVG()));
        }
    }

    public void QR() {
        if (this.QR > 0 && this.HWF > 0 && !this.YW.getAndSet(true)) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.HWF - this.QR, this.zp, this.ku, this.vDp);
        }
    }

    public void YW() {
        com.bytedance.sdk.openadsdk.lMd.KS.zp(SystemClock.elapsedRealtime() - this.QR, this.zp, this.ku);
    }

    public boolean dT() {
        return this.jU.get();
    }

    public void ku() {
        com.bytedance.sdk.openadsdk.lMd.KS.jU(this.zp, this.ku);
    }

    public void COT() {
        this.QR = SystemClock.elapsedRealtime();
    }

    public void KS() {
        com.bytedance.sdk.openadsdk.core.ugen.lMd.lMd lmd = new com.bytedance.sdk.openadsdk.core.ugen.lMd.lMd(this.lMd.oB, this.zp.Eg(), this.zp, this.ku, new com.bytedance.sdk.openadsdk.core.ugen.jU.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.Bj.1
            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.zp
            public void lMd() {
                Bj.this.jU();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.lMd
            public void zp() {
                Bj.this.dT = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.lMd
            public void zp(int i9, String str, String str2) {
                Bj.this.vDp = str2;
                Bj.this.jU.set(false);
                Bj bj = Bj.this;
                com.bytedance.sdk.openadsdk.lMd.KS.zp(bj.zp, bj.ku, "fail", SystemClock.elapsedRealtime() - Bj.this.dT, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i9, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.lMd
            public void zp(String str) {
                Bj.this.vDp = str;
                Bj bj = Bj.this;
                com.bytedance.sdk.openadsdk.lMd.KS.zp(bj.zp, bj.ku, "success", SystemClock.elapsedRealtime() - Bj.this.dT, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.zp
            public void zp(int i9, String str) {
                Bj.this.jU.set(false);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Bj bj = Bj.this;
                com.bytedance.sdk.openadsdk.lMd.KS.zp(bj.zp, bj.ku, elapsedRealtime - Bj.this.COT, i9, str, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.zp
            public void zp(com.bytedance.adsdk.ugeno.component.lMd<View> lmd2) {
                Bj.this.Bj = lmd2;
                Bj.this.jU.set(true);
                Bj.this.HWF = SystemClock.elapsedRealtime();
                Bj.this.QR();
                Bj bj = Bj.this;
                com.bytedance.sdk.openadsdk.lMd.KS.zp(bj.zp, bj.ku, Bj.this.HWF - Bj.this.COT);
            }
        });
        lmd.zp();
        lmd.zp(this.lMd.rCC.dT());
    }

    public void jU() {
        this.COT = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.lMd.KS.zp(this.zp, this.ku);
    }

    public void lMd() {
        this.KS = (FrameLayout) this.lMd.oB.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.dQp);
    }

    public void zp() {
        if (this.tG) {
            return;
        }
        this.tG = true;
        lMd();
    }

    public void zp(int i9) {
        WNy.zp((View) this.KS, i9);
    }
}
