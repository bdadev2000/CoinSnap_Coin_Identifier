package com.bytedance.sdk.openadsdk.lMd.zp;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bj implements com.bytedance.sdk.component.HWF.zp.COT {
    private final String zp = "[6003]";

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public com.bytedance.sdk.component.HWF.zp.HWF Bj() {
        com.bytedance.sdk.component.HWF.zp.HWF zp;
        synchronized (this) {
            zp = com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(KVG.zp());
        }
        return zp;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public Executor COT() {
        return QUv.QR();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public int HWF() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public boolean KS() {
        return true;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public boolean QR() {
        return false;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public String YW() {
        return YhE.KS();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public com.bytedance.sdk.component.HWF.zp.COT.KS dT() {
        return new QR();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public Executor jU() {
        return QUv.KS();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public boolean ku() {
        return true;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public boolean lMd() {
        return false;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public boolean rV() {
        return BinderPoolService.zp;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public void tG() {
        zp.zp(zp.HWF);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public com.bytedance.sdk.component.HWF.zp.QR vDp() {
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public com.bytedance.sdk.component.HWF.zp.jU.zp zp(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public int KS(String str) {
        return dQp.etV().Fm().zp(str);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public String lMd(String str) {
        return com.bytedance.sdk.component.jU.zp.zp(str, com.bytedance.sdk.openadsdk.core.zp.zp());
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public boolean zp() {
        return false;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public boolean zp(Context context) {
        return com.bytedance.sdk.component.utils.KVG.zp(context);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public String zp(String str) {
        return com.bytedance.sdk.component.jU.zp.lMd(str, com.bytedance.sdk.openadsdk.core.zp.zp());
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public void zp(boolean z8, int i9, long j7, com.bytedance.sdk.component.HWF.zp.HWF.jU jUVar) {
        Runnable zp;
        if (jUVar == null) {
            return;
        }
        zp.zp(zp.KS, z8, i9, j7);
        if (z8) {
            com.bytedance.sdk.openadsdk.dT.KS.zp("track_link_result", false, (com.bytedance.sdk.openadsdk.dT.lMd) new tG(true, jUVar));
            return;
        }
        rV Fm = dQp.etV().Fm();
        if (Fm == null || jUVar.jU() >= Fm.zp(jUVar.HWF())) {
            com.bytedance.sdk.openadsdk.dT.KS.zp("track_link_result", false, (com.bytedance.sdk.openadsdk.dT.lMd) new tG(false, jUVar));
        } else {
            if (!Fm.zp() || (zp = jUVar.zp(com.bytedance.sdk.openadsdk.core.Bj.zp(KVG.zp()), null)) == null) {
                return;
            }
            QUv.zp().schedule(zp, Fm.lMd(jUVar.HWF()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT
    public void zp(boolean z8) {
        zp.zp(zp.HWF, z8);
    }
}
