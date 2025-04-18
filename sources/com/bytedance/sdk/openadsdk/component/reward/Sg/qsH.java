package com.bytedance.sdk.openadsdk.component.reward.Sg;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class qsH extends Sg {
    private com.bytedance.sdk.openadsdk.component.reward.view.YFl EH;

    public qsH(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl);
    }

    private boolean hQ() {
        return Wwa.wN(this.Sg);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public Sg.YFl AlY() {
        return new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.Sg.qsH.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg.YFl
            public void YFl(boolean z10) {
                if (qsH.this.EH != null) {
                    qsH.this.EH.setIsMute(z10);
                }
            }
        };
    }

    public FrameLayout Cfr() {
        com.bytedance.sdk.openadsdk.component.reward.view.YFl yFl = this.EH;
        if (yFl != null) {
            return yFl.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void DSW() {
        boolean z10;
        this.f10578vc.tN(8);
        this.f10578vc.Sg(8);
        if (this.Sg.Ne() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.qsH.YFl(false);
            this.qsH.tN(false);
            this.qsH.AlY(false);
            this.f10578vc.wN(8);
            return;
        }
        this.qsH.YFl(this.Sg.Gnp());
        this.qsH.tN(hQ());
        this.qsH.AlY(hQ());
        if (hQ()) {
            this.f10578vc.wN(8);
        } else {
            this.qsH.vc();
            this.f10578vc.wN(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean vc() {
        return hQ();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean wN() {
        return hQ();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.view.YFl yFl = new com.bytedance.sdk.openadsdk.component.reward.view.YFl(this.YFl.UI, this.eT);
        this.EH = yFl;
        yFl.setDownloadListener(this.YoT);
        com.bytedance.sdk.openadsdk.component.reward.view.YFl yFl2 = this.EH;
        Wwa wwa = this.Sg;
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
        yFl2.YFl(wwa, yFl3.VB, yFl3.Cqy, this.tN, this.AlY);
        frameLayout.addView(this.EH.getInteractionStyleRootView());
    }

    public static boolean YFl(Wwa wwa) {
        return (wwa.TMt() || wwa.qjy() == 100.0f) ? false : true;
    }
}
