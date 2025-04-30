package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.openadsdk.utils.QUv;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bj implements com.bytedance.adsdk.ugeno.core.KVG, com.bytedance.sdk.component.adexpress.lMd.YW {
    private long COT;
    private final com.bytedance.sdk.openadsdk.core.model.woN KS;
    private final String jU;
    private final String lMd;
    private final com.bytedance.sdk.openadsdk.lMd.KS.COT zp;

    public Bj(com.bytedance.sdk.openadsdk.lMd.KS.COT cot, String str, com.bytedance.sdk.openadsdk.core.model.woN won, String str2) {
        this.zp = cot;
        this.lMd = str;
        this.jU = str2;
        this.KS = won;
    }

    public void Bj() {
        this.zp.Bj();
        this.zp.vDp();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void COT() {
        this.zp.lMd();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void HWF(int i9) {
        final String str;
        System.currentTimeMillis();
        if (i9 == 3) {
            this.zp.QR("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.zp.QR("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.zp.zp(true);
        QUv.lMd(new com.bytedance.sdk.component.ku.ku("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Bj.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(Bj.this.KS, Bj.this.lMd, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void KS(int i9) {
        if (i9 == 3) {
            this.zp.jU("dynamic_sub_analysis2_end");
        } else {
            this.zp.jU("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void QR() {
        this.zp.zp(true);
        this.zp.tG();
        QUv.lMd(new com.bytedance.sdk.component.ku.ku("native_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Bj.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(Bj.this.KS, Bj.this.lMd, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void YW() {
        this.zp.dQp();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void dT() {
        this.zp.lMd();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void jU() {
        this.zp.zp();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void ku() {
        this.zp.rV();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void COT(int i9) {
        if (i9 == 3) {
            this.zp.jU("dynamic_sub_render2_end");
        } else {
            this.zp.jU("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void jU(int i9) {
        if (i9 == 3) {
            this.zp.jU("dynamic_sub_render2_start");
        } else {
            this.zp.jU("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void lMd(int i9) {
        if (i9 == 3) {
            this.zp.jU("dynamic_sub_analysis2_start");
        } else {
            this.zp.jU("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void zp(boolean z8) {
        this.zp.zp(z8 ? 1 : 0);
    }

    @Override // com.bytedance.adsdk.ugeno.core.KVG
    public void KS() {
        this.zp.COT("ugen_sub_render_start");
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void zp(int i9, String str) {
        this.zp.zp(i9, null);
        YW.zp("Web", i9, str, this.lMd, this.jU, this.KS);
    }

    @Override // com.bytedance.adsdk.ugeno.core.KVG
    public void lMd() {
        this.zp.COT("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void zp(int i9) {
        this.COT = System.currentTimeMillis();
        if (i9 == 3) {
            this.zp.KS("dynamic_render2_start");
        } else {
            this.zp.KS("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void HWF() {
        this.zp.KS();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.YW
    public void zp(int i9, int i10, String str, boolean z8) {
        if (!z8) {
            this.zp.zp(true);
        }
        if (i9 == 3) {
            this.zp.lMd(i10, "dynamic_render2_error");
        } else {
            this.zp.lMd(i10, "dynamic_render_error");
        }
        YW.zp("NDR", i10, str, this.lMd, this.jU, this.KS);
    }

    @Override // com.bytedance.adsdk.ugeno.core.KVG
    public void zp() {
        this.zp.COT("ugen_render_start");
        this.zp.COT("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.KVG
    public void zp(com.bytedance.adsdk.ugeno.core.dQp dqp) {
        if (dqp.zp() == 0) {
            this.zp.COT("ugen_sub_render_end");
            this.zp.HWF("ugen_render_success");
        } else {
            this.zp.KS(dqp.zp(), "ugen_render_error");
            YW.zp("UGen", dqp.zp(), dqp.lMd(), this.lMd, this.jU, this.KS);
        }
        this.zp.zp(true);
    }
}
