package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.zp.dQp;
import com.bytedance.sdk.openadsdk.component.reward.zp.tG;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class lMd {
    private boolean KS;
    private dQp jU;
    private RFEndCardBackUpLayout lMd;
    private final com.bytedance.sdk.openadsdk.component.reward.zp.zp zp;

    public lMd(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.zp = zpVar;
    }

    public boolean COT() {
        dQp dqp = this.jU;
        if (dqp != null) {
            return dqp.KS();
        }
        return false;
    }

    public void KS() {
        dQp dqp = this.jU;
        if (dqp != null) {
            dqp.zp();
        }
    }

    public void jU() {
        dQp dqp = this.jU;
        if (dqp != null) {
            dqp.lMd();
        }
    }

    public void lMd() {
        WNy.zp((View) this.lMd, 0);
    }

    public void zp() {
        if (this.KS) {
            return;
        }
        this.KS = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.zp.MBR.findViewById(vDp.iOI);
        this.lMd = rFEndCardBackUpLayout;
        rFEndCardBackUpLayout.zp(this.zp);
        if (this.zp.zp.Fm()) {
            this.jU = new dQp(this.zp);
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.core.lMd.COT cot) {
        WNy.zp(this.lMd, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lMd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        dQp dqp = this.jU;
        if (dqp != null) {
            dqp.zp(cot);
        }
    }

    public boolean zp(tG tGVar) {
        dQp dqp = this.jU;
        if (dqp == null || !dqp.zp(tGVar)) {
            return false;
        }
        WNy.zp((View) this.lMd, 0);
        return true;
    }
}
