package com.bytedance.sdk.openadsdk.component.reward.Sg;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa;
import com.bytedance.sdk.openadsdk.component.reward.YFl.lG;
import com.bytedance.sdk.openadsdk.component.reward.YFl.pDU;
import com.bytedance.sdk.openadsdk.component.reward.view.nc;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes.dex */
public class YFl {
    protected int AlY;
    protected final Wwa DSW;
    protected com.bytedance.sdk.openadsdk.core.GA.AlY.Sg NjR;
    protected com.bytedance.sdk.openadsdk.core.model.Wwa Sg;
    protected com.bytedance.sdk.openadsdk.component.reward.YFl.YFl YFl;

    /* renamed from: nc, reason: collision with root package name */
    protected bZ f10577nc;
    protected final pDU qsH;
    protected int tN;

    /* renamed from: vc, reason: collision with root package name */
    protected final nc f10578vc;
    protected final lG wN;

    public YFl(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.YFl = yFl;
        this.Sg = yFl.Sg;
        this.tN = yFl.Jc;
        this.AlY = yFl.RX;
        this.wN = yFl.VOe;
        this.f10578vc = yFl.lu;
        this.DSW = yFl.mn;
        this.qsH = yFl.Sco;
    }

    public boolean Sg() {
        if (rkt.Sg(this.YFl.Sg) && this.YFl.qO.get()) {
            FrameLayout vc2 = this.YFl.lu.vc();
            vc2.setVisibility(4);
            vc2.setVisibility(0);
            return false;
        }
        if (this.YFl.f10590nc.get() || this.YFl.eT.get() || Ne.Wwa(this.YFl.Sg)) {
            return false;
        }
        return true;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2, bZ bZVar) {
        this.NjR = sg2;
        this.f10577nc = bZVar;
    }

    public void tN() {
        if (Ne.Sg(this.YFl.Sg) && DeviceUtils.DSW() == 0) {
            this.YFl.iY = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        yFl.Sco.Sg(yFl.iY);
    }

    public boolean YFl() {
        return this.YFl.Sg.yn() || this.YFl.Sg.ZLB() == 15 || this.YFl.Sg.ZLB() == 5 || this.YFl.Sg.ZLB() == 50;
    }

    public void YFl(boolean z10) {
        if (this.YFl.f10590nc.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.Sg;
        if (wwa != null && wwa.Pj()) {
            this.qsH.tN(false);
            this.qsH.YFl(true);
            this.YFl.lu.Sg(8);
            this.YFl.lu.tN(8);
            return;
        }
        if (!z10) {
            this.qsH.tN(false);
            this.qsH.YFl(false);
            this.qsH.AlY(false);
            this.YFl.lu.wN(8);
        } else {
            this.qsH.YFl(this.YFl.Sg.Gnp());
            if (Ne.Wwa(this.YFl.Sg) || YFl()) {
                this.qsH.tN(true);
            }
            if (!YFl() && (!(this instanceof DSW) || !this.YFl.Sg.YFl())) {
                this.qsH.vc();
                this.YFl.lu.wN(0);
            } else {
                this.qsH.AlY(true);
            }
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            if (yFl.VB != com.bytedance.sdk.openadsdk.component.reward.view.Sg.YFl) {
                yFl.lu.Sg(8);
                this.YFl.lu.tN(8);
                return;
            } else {
                yFl.lu.Sg(0);
                this.YFl.lu.tN(0);
                return;
            }
        }
        this.YFl.lu.Sg(4);
        this.YFl.lu.tN(8);
    }
}
