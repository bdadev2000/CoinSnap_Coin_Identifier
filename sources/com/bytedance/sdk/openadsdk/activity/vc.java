package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.Sg;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public abstract class vc {
    public int NjR;
    private final Sg YFl;
    protected com.bytedance.sdk.openadsdk.YoT.wN YoT = new com.bytedance.sdk.openadsdk.YoT.wN() { // from class: com.bytedance.sdk.openadsdk.activity.vc.1
        @Override // com.bytedance.sdk.openadsdk.YoT.wN
        public void YFl() {
            vc.this.pDU();
        }
    };
    protected IListenerManager eT;

    /* renamed from: nc, reason: collision with root package name */
    public boolean f10551nc;
    protected final Wwa qsH;

    public vc(Sg sg2, Wwa wwa, int i10) {
        this.YFl = sg2;
        this.qsH = wwa;
        this.NjR = i10;
    }

    public void AlY(Activity activity) {
    }

    public void EH() {
    }

    public void Ga() {
        if (this.YFl.EH()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdShow");
        } else {
            this.YFl.YoT();
        }
        this.YFl.rkt();
    }

    public void Sg(Activity activity) {
    }

    public void UZM() {
        if (this.qsH != null) {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("videoForceBreak", this.qsH);
        }
        this.YFl.YFl(this);
    }

    public Sg VOe() {
        return this.YFl;
    }

    public abstract View YFl();

    public void YFl(Activity activity) {
    }

    public void YI() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdClose");
        } else {
            this.YFl.eT();
        }
    }

    public abstract String aIu();

    public abstract boolean a_();

    public Activity bZ() {
        return this.YFl.tN();
    }

    public abstract String b_();

    public final void dXO() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdVideoBarClick");
        } else {
            this.YFl.nc();
        }
    }

    public void lG() {
    }

    public void pDU() {
    }

    public abstract boolean qO();

    public void tN(Activity activity) {
    }

    public void wN(Activity activity) {
    }

    private void Sg(final String str) {
        mn.tN(new qsH("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.vc.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    vc.this.tN(1).executeFullVideoCallback(vc.this.aIu(), str);
                } catch (Throwable th2) {
                    YoT.YFl("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void YFl(Activity activity, Bundle bundle) {
    }

    public final IListenerManager tN(int i10) {
        if (this.eT == null) {
            this.eT = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().YFl(i10));
        }
        return this.eT;
    }

    public void YFl(Activity activity, Sg.wN wNVar) {
    }

    public void YFl(vc vcVar, vc vcVar2, Sg.wN wNVar) {
    }

    public void YFl(boolean z10, boolean z11, boolean z12, int i10) {
        this.YFl.YFl(this, z10, z11, z12, i10);
    }

    public void YFl(String str) {
        if (a_()) {
            YFl(str, false, 0, "", 0, "");
        } else {
            Sg(str);
        }
    }

    private void YFl(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        mn.tN(new qsH("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.vc.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    vc.this.tN(0).executeRewardVideoCallback(vc.this.aIu(), str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    YoT.YFl("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public final void YFl(boolean z10, int i10, String str, int i11, String str2) {
        if (this.YFl.GA()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onRewardVerify", z10, i10, str, i11, str2);
        } else {
            this.YFl.YFl(this, z10, i10, str, i11, str2);
        }
        this.YFl.pDU();
    }
}
