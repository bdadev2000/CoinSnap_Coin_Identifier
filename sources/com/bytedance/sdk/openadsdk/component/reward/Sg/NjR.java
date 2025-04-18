package com.bytedance.sdk.openadsdk.component.reward.Sg;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes.dex */
public class NjR extends Sg {
    public NjR(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void DSW() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void aIu() {
        super.aIu();
        if (Ne.Wwa(this.YFl.Sg)) {
            this.f10577nc.removeMessages(600);
            this.YFl.UZM.tN("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void lG() {
        if (Ne.qsH(this.Sg) && this.YFl.mn.mB() && !this.YFl.mn.BPI()) {
            Wwa();
        }
        if (Ne.DSW(this.YFl.Sg)) {
            if (DeviceUtils.DSW() == 0) {
                this.YFl.iY = true;
            }
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            if (yFl.iY) {
                yFl.Sco.Sg(true);
                this.YFl.pq.YFl(true);
            }
        }
        this.YFl.Bn.YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void qO() {
        if (this.YFl.UZM.qsH(com.bytedance.sdk.openadsdk.component.reward.YFl.qsH.tN) && Ne.Wwa(this.YFl.Sg)) {
            this.YFl.UZM.tN("return_foreground");
            com.bytedance.sdk.openadsdk.core.widget.Sg sg2 = this.GA;
            if ((sg2 == null || !sg2.isShowing()) && this.YFl.UZM.Sg() >= 0.0f) {
                this.YFl.UZM.wN(0);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean vc() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean wN() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void wXo() {
        super.wXo();
        if (Ne.Wwa(this.YFl.Sg)) {
            this.f10577nc.removeMessages(600);
            this.YFl.UZM.tN("go_background");
        }
    }

    public static boolean YFl(Wwa wwa) {
        return Ne.DSW(wwa) || Ne.Wwa(wwa);
    }
}
