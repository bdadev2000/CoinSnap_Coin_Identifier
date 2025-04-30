package com.bytedance.sdk.openadsdk.component.reward.lMd;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes.dex */
public class YW extends lMd {
    public YW(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        super(zpVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean COT() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void FP() {
        super.FP();
        if (cz.Bj(this.zp.zp)) {
            this.dT.removeMessages(600);
            this.zp.ffE.zp("go_background");
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
    public void cz() {
        if (this.zp.ffE.dT() && cz.Bj(this.zp.zp)) {
            this.zp.ffE.zp("return_foreground");
            com.bytedance.sdk.openadsdk.core.widget.zp zpVar = this.tG;
            if ((zpVar == null || !zpVar.isShowing()) && this.zp.ffE.vDp() >= 0) {
                this.zp.ffE.zp(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void ot() {
        super.ot();
        if (cz.Bj(this.zp.zp)) {
            this.dT.removeMessages(600);
            this.zp.ffE.zp("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void vwr() {
        if (cz.KS(this.lMd) && this.zp.si.ffE() && !this.zp.si.oKZ()) {
            pvr();
        }
        if (cz.lMd(this.zp.zp)) {
            if (DeviceUtils.QR() == 0) {
                this.zp.jU = true;
            }
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
            if (zpVar.jU) {
                zpVar.Rh.lMd(true);
                this.zp.aax.zp(true);
            }
        }
        this.zp.fs.zp();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(FrameLayout frameLayout) {
    }

    public static boolean zp(woN won) {
        return cz.lMd(won) || cz.Bj(won);
    }
}
