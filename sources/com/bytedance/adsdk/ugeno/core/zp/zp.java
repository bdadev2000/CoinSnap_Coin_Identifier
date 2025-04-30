package com.bytedance.adsdk.ugeno.core.zp;

import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.tG;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp implements tG {
    private volatile C0068zp COT;
    private JSONObject jU;
    private String lMd;
    private tG zp;
    private boolean KS = true;
    private boolean HWF = false;

    /* renamed from: com.bytedance.adsdk.ugeno.core.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0068zp implements ICustomRouter {
        private Bj KS;
        private tG.lMd jU;
        tG.zp zp;

        public C0068zp() {
        }

        public void zp(Bj bj) {
            this.KS = bj;
        }

        public void zp(tG.lMd lmd) {
            this.jU = lmd;
        }

        public void zp(tG.zp zpVar) {
            this.zp = zpVar;
        }
    }

    public zp(tG tGVar) {
        this.zp = tGVar;
    }

    private void KS(Bj bj, tG.lMd lmd, tG.zp zpVar) {
        if (this.COT == null) {
            this.COT = lMd();
        }
        this.COT.zp(bj);
        this.COT.zp(lmd);
        this.COT.zp(zpVar);
        JSONObject KS = bj.KS();
        if (KS == null) {
            return;
        }
        new EventChainAction.Builder(KS.optString("type")).setChainData(this.jU).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.zp.zp.1
        }).build().run();
    }

    public void lMd(boolean z8) {
        this.HWF = z8;
    }

    public void zp(JSONObject jSONObject) {
        this.jU = jSONObject;
    }

    private void lMd(Bj bj, tG.lMd lmd, tG.zp zpVar) {
        tG tGVar = this.zp;
        if (tGVar == null) {
            return;
        }
        tGVar.zp(bj, lmd, zpVar);
    }

    public void zp(String str) {
        this.lMd = str;
    }

    public void zp(boolean z8) {
        this.KS = z8;
    }

    private C0068zp lMd() {
        if (this.COT != null) {
            return this.COT;
        }
        synchronized (C0068zp.class) {
            try {
                if (this.COT != null) {
                    return this.COT;
                }
                this.COT = new C0068zp();
                return this.COT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean zp() {
        String str;
        return this.KS && (str = this.lMd) != null && "3".compareTo(str) <= 0 && this.jU != null;
    }

    @Override // com.bytedance.adsdk.ugeno.core.tG
    public void zp(Bj bj, tG.lMd lmd, tG.zp zpVar) {
        if (zp()) {
            KS(bj, lmd, zpVar);
        } else {
            lMd(bj, lmd, zpVar);
        }
    }
}
