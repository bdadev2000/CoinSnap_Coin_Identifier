package com.bytedance.sdk.openadsdk.component.reward.lMd;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lMd.rV;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.model.vwr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT extends lMd implements com.bytedance.sdk.openadsdk.YW.HWF {
    private boolean KVG;
    private final vwr dQp;

    public COT(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        super(zpVar);
        this.dQp = (vwr) zpVar.zp;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean COT() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void Gzh() {
        RCv jsObject;
        if (this.zp.oB.isFinishing()) {
            return;
        }
        if (!this.zp.eWG.ku() && !this.KVG) {
            FullRewardExpressView zp = this.zp.eWG.zp();
            if (zp != null && (jsObject = zp.getJsObject()) != null) {
                jsObject.zp(this);
                return;
            }
            return;
        }
        super.Gzh();
        if (this.zp.eWG.ku()) {
            irS();
            this.zp.gH.lMd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean HWF() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void QR() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean QUv() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.zp
    public boolean lMd() {
        return this.KVG;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(FrameLayout frameLayout) {
    }

    public static void zp(woN won, boolean z8, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_backup", Boolean.valueOf(z8));
        com.bytedance.sdk.openadsdk.lMd.KS.zp("choose_ad_start_show", won, str, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_id", won.Gor());
            jSONObject.put("is_backup", z8);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.dT.KS.zp().zp("choose_ad_start_show", jSONObject);
    }

    public void lMd(boolean z8) {
        if (this.KVG) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("has_focus", Boolean.valueOf(z8));
        com.bytedance.sdk.openadsdk.lMd.KS.zp("choose_ad_focus_changed", this.dQp, this.zp.QR, hashMap);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(RewardFullBaseLayout rewardFullBaseLayout) {
        if (KS.zp(this.dQp)) {
            KS.zp(this.dQp, rewardFullBaseLayout);
        } else {
            super.zp(rewardFullBaseLayout);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YW.HWF
    public void zp(int i9, long j7) {
        this.KVG = true;
        int i10 = i9 - 1;
        this.dQp.oKZ(i10);
        com.bytedance.sdk.openadsdk.lMd.KS.zp(this.dQp, this.zp.QR, i9, j7);
        com.bytedance.sdk.openadsdk.component.reward.zp.zp(this.dQp.cIt(), i10);
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.COT.1
            @Override // java.lang.Runnable
            public void run() {
                COT.this.Gzh();
                COT.this.irS();
                COT.this.zp.gH.lMd();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.YW.HWF
    public void zp(rV rVVar) {
        this.zp.eWG.zp().lMd(rVVar);
    }
}
