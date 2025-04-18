package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.content.Context;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT implements com.bytedance.sdk.component.vc.YFl.wN {
    private final String YFl = "[6304]";

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public Executor AlY() {
        return mn.tN();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public boolean DSW() {
        return false;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public long EH() {
        long YFl = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("log_queue_timeout", 40000);
        if (YFl < 30000 || YFl > 120000) {
            return 40000L;
        }
        return YFl;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public void GA() {
        YFl.YFl(YFl.f10494vc);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public String NjR() {
        return Sco.tN();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public boolean Sg() {
        return false;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public com.bytedance.sdk.component.vc.YFl.AlY.YFl YFl(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public com.bytedance.sdk.component.vc.YFl.DSW YoT() {
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public com.bytedance.sdk.component.vc.YFl.vc eT() {
        com.bytedance.sdk.component.vc.YFl.vc YFl;
        synchronized (this) {
            YFl = com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(lG.YFl());
        }
        return YFl;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public com.bytedance.sdk.component.vc.YFl.wN.tN nc() {
        return new DSW();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public boolean pDU() {
        return BinderPoolService.YFl;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public boolean qsH() {
        return true;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public boolean tN() {
        return true;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public int vc() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public Executor wN() {
        return mn.DSW();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public String Sg(String str) {
        return com.bytedance.sdk.component.AlY.YFl.YFl(str, com.bytedance.sdk.openadsdk.core.YFl.YFl());
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public boolean YFl() {
        return false;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public int tN(String str) {
        return rkt.JwO().Gnp().YFl(str);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public boolean YFl(Context context) {
        return EH.YFl(context);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public String YFl(String str) {
        return com.bytedance.sdk.component.AlY.YFl.Sg(str, com.bytedance.sdk.openadsdk.core.YFl.YFl());
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public void YFl(boolean z10, int i10, long j3, com.bytedance.sdk.component.vc.YFl.vc.AlY alY) {
        Runnable YFl;
        if (alY == null) {
            return;
        }
        YFl.YFl(YFl.tN, z10, i10, j3);
        if (z10) {
            com.bytedance.sdk.openadsdk.pDU.tN.YFl("track_link_result", false, (com.bytedance.sdk.openadsdk.pDU.Sg) new GA(true, alY));
            return;
        }
        pDU Gnp = rkt.JwO().Gnp();
        if (Gnp != null && alY.AlY() < Gnp.YFl(alY.vc())) {
            if (!Gnp.YFl() || (YFl = alY.YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl(lG.YFl()), null)) == null) {
                return;
            }
            mn.YFl().schedule(YFl, Gnp.Sg(alY.vc()), TimeUnit.SECONDS);
            return;
        }
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("track_link_result", false, (com.bytedance.sdk.openadsdk.pDU.Sg) new GA(false, alY));
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN
    public void YFl(boolean z10) {
        YFl.YFl(YFl.f10494vc, z10);
    }
}
