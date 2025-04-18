package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class nc implements com.bytedance.sdk.openadsdk.YoT.DSW {
    protected volatile boolean DSW;
    protected boolean EH;
    protected boolean GA;

    @NonNull
    protected final com.bytedance.sdk.openadsdk.core.model.Wwa NjR;
    protected AtomicBoolean Wwa = new AtomicBoolean(false);
    protected boolean YoT;
    protected final YFl eT;
    protected com.bytedance.sdk.openadsdk.qO.YFl.YFl lG;

    /* renamed from: nc, reason: collision with root package name */
    protected final String f10594nc;
    protected boolean pDU;
    protected final Activity qsH;
    protected FrameLayout rkt;

    public nc(YFl yFl) {
        this.eT = yFl;
        this.qsH = yFl.UI;
        this.f10594nc = yFl.wN;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl.Sg;
        this.NjR = wwa;
        this.GA = Ne.wN(wwa);
    }

    private void DSW() {
        com.bytedance.sdk.openadsdk.utils.eT eTVar;
        int IXB = this.NjR.IXB();
        boolean z10 = true;
        if (IXB == -1) {
            if (Ne.NjR(this.NjR)) {
                com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.lG;
                if (yFl != null && yFl.wN()) {
                    this.eT.qO.set(true);
                    this.eT.Vmj.EH();
                } else {
                    this.eT.Vmj.bZ();
                    z10 = false;
                }
            } else {
                this.eT.qO.set(true);
                this.eT.Vmj.EH();
            }
        } else {
            if (IXB >= 0) {
                this.eT.Sco.AlY(false);
                if (Ne.NjR(this.NjR)) {
                    com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl2 = this.lG;
                    if (yFl2 != null && yFl2.wN()) {
                        this.eT.zG.sendEmptyMessageDelayed(600, IXB);
                    } else {
                        this.eT.zG.sendEmptyMessageDelayed(1, IXB);
                    }
                } else {
                    this.eT.zG.sendEmptyMessageDelayed(600, IXB);
                }
            }
            z10 = false;
        }
        if (z10 && (eTVar = this.eT.Bn) != null) {
            eTVar.YFl(IXB);
        }
    }

    public void AlY() {
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl;
        if (this.GA && !this.Wwa.get() && (yFl = this.lG) != null) {
            yFl.Sg();
        }
    }

    public boolean NjR() {
        return false;
    }

    public void Sg(int i10) {
    }

    public void YFl(long j3) {
    }

    public void eT() {
        if (this.Wwa.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.lG;
            if (yFl != null) {
                yFl.YFl(true);
            }
            this.eT.mn.vc(true);
            YFl yFl2 = this.eT;
            yFl2.GS.YFl(true, yFl2.Vmj);
            if (this.eT.GS.DSW()) {
                this.eT.Bn.YFl(r0.qsH);
                return;
            }
            YFl yFl3 = this.eT;
            yFl3.mn.YFl(yFl3.iY, true);
            this.eT.mn.tN(true);
            this.eT.mn.Sg(true);
            this.eT.zG.removeMessages(600);
            return;
        }
        this.eT.mn.NjR();
    }

    public boolean nc() {
        return this.DSW;
    }

    public void qsH() {
    }

    public void tN() {
        if (!this.GA) {
            return;
        }
        this.DSW = true;
        this.lG.YFl();
        DSW();
        if (Ne.nc(this.NjR)) {
            this.eT.mn.vc();
        }
    }

    public void vc() {
        if (!this.GA || this.EH) {
            return;
        }
        this.EH = true;
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.lG;
        if (yFl != null) {
            yFl.AlY();
        }
        FrameLayout frameLayout = this.rkt;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        DeviceUtils.AudioInfoReceiver.Sg(this);
    }

    public void wN() {
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl;
        if (this.GA && !this.Wwa.get() && (yFl = this.lG) != null) {
            yFl.tN();
        }
    }

    public com.bytedance.sdk.openadsdk.YoT.wN Sg() {
        return new com.bytedance.sdk.openadsdk.YoT.wN() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.nc.1
            @Override // com.bytedance.sdk.openadsdk.YoT.wN
            public void YFl() {
                nc.this.eT.ZU.YFl(false);
            }
        };
    }

    public void YFl() {
        if (this.GA && !this.YoT) {
            this.YoT = true;
            DeviceUtils.AudioInfoReceiver.YFl(this);
        }
    }

    public void Sg(boolean z10) {
        if (this.GA && this.lG != null && this.DSW) {
            this.lG.YFl(z10);
        }
    }

    public void YFl(boolean z10) {
        if (this.GA) {
            YFl yFl = this.eT;
            if (yFl.ko) {
                FrameLayout frameLayout = (FrameLayout) yFl.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.ynx);
                this.rkt = frameLayout;
                if (frameLayout != null) {
                    YFl yFl2 = this.eT;
                    com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl3 = new com.bytedance.sdk.openadsdk.qO.YFl.YFl(yFl2.BPI, this.NjR, yFl2.Cqy, z10, frameLayout);
                    this.lG = yFl3;
                    yFl3.YFl(true, Sg());
                }
            }
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.wN wNVar) {
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl;
        if (this.GA && (yFl = this.lG) != null) {
            yFl.YFl(wNVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YoT.DSW
    public void YFl(int i10) {
        if (this.eT.pq.Sg()) {
            YFl yFl = this.eT;
            boolean z10 = yFl.iY;
            yFl.pq.YFl();
            if (i10 == 0) {
                this.eT.Sco.Sg(true);
                Sg(true);
                return;
            } else {
                this.eT.Sco.Sg(false);
                Sg(false);
                return;
            }
        }
        this.eT.pq.YFl(-1);
        YFl yFl2 = this.eT;
        boolean z11 = yFl2.iY;
        yFl2.pq.YFl();
        YFl yFl3 = this.eT;
        if (yFl3.Bh) {
            if (i10 == 0) {
                yFl3.iY = true;
                yFl3.Sco.Sg(true);
                Sg(true);
            } else {
                yFl3.iY = false;
                yFl3.Sco.Sg(false);
                Sg(false);
            }
        }
    }
}
