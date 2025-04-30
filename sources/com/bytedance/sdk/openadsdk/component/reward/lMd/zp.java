package com.bytedance.sdk.openadsdk.component.reward.lMd;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.component.reward.zp.dT;
import com.bytedance.sdk.openadsdk.component.reward.zp.rV;
import com.bytedance.sdk.openadsdk.component.reward.zp.tG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes.dex */
public class zp {
    protected final tG COT;
    protected final com.bytedance.sdk.openadsdk.component.reward.view.COT HWF;
    protected int KS;
    protected final rV QR;
    protected com.bytedance.sdk.openadsdk.core.video.KS.lMd YW;
    protected RCv dT;
    protected int jU;
    protected final dT ku;
    protected woN lMd;
    protected com.bytedance.sdk.openadsdk.component.reward.zp.zp zp;

    public zp(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.zp = zpVar;
        this.lMd = zpVar.zp;
        this.KS = zpVar.vDp;
        this.jU = zpVar.tG;
        this.COT = zpVar.UPs;
        this.HWF = zpVar.rCC;
        this.QR = zpVar.si;
        this.ku = zpVar.Rh;
    }

    public void KS() {
        if (cz.lMd(this.zp.zp) && DeviceUtils.QR() == 0) {
            this.zp.jU = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        zpVar.Rh.lMd(zpVar.jU);
    }

    public boolean lMd() {
        if (dQp.lMd(this.zp.zp) && this.zp.cW.get()) {
            FrameLayout HWF = this.zp.rCC.HWF();
            HWF.setVisibility(4);
            HWF.setVisibility(0);
            return false;
        }
        if (this.zp.FP.get() || this.zp.ot.get() || cz.Bj(this.zp.zp)) {
            return false;
        }
        return true;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd, RCv rCv) {
        this.YW = lmd;
        this.dT = rCv;
    }

    public boolean zp() {
        return this.zp.zp.Fm() || this.zp.zp.mW() == 15 || this.zp.zp.mW() == 5 || this.zp.zp.mW() == 50;
    }

    public void zp(boolean z8) {
        if (this.zp.FP.get()) {
            return;
        }
        woN won = this.lMd;
        if (won != null && won.slc()) {
            this.ku.KS(false);
            this.ku.zp(true);
            this.zp.rCC.KS(8);
            this.zp.rCC.jU(8);
            return;
        }
        if (!z8) {
            this.ku.KS(false);
            this.ku.zp(false);
            this.ku.jU(false);
            this.zp.rCC.HWF(8);
        } else {
            this.ku.zp(this.zp.zp.bQm());
            if (cz.Bj(this.zp.zp) || zp()) {
                this.ku.KS(true);
            }
            if (!zp() && (!(this instanceof QR) || !this.zp.oB.KVG())) {
                this.ku.HWF();
                this.zp.rCC.HWF(0);
            } else {
                this.ku.jU(true);
            }
        }
        if (!z8) {
            this.zp.rCC.KS(4);
            this.zp.rCC.jU(8);
        } else if (this.zp.Bj == FullRewardExpressView.zp && zp()) {
            this.zp.rCC.KS(0);
            this.zp.rCC.jU(0);
        } else {
            this.zp.rCC.KS(8);
            this.zp.rCC.jU(8);
        }
    }
}
