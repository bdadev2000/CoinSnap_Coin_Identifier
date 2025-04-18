package com.bytedance.adsdk.ugeno.core.YFl;

import android.util.Log;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import com.bytedance.adsdk.ugeno.Sg.Sg;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.nc;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements YoT {
    private JSONObject AlY;
    private String Sg;
    private YoT YFl;
    private boolean tN = true;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10273vc = false;
    private volatile C0068YFl wN;

    /* renamed from: com.bytedance.adsdk.ugeno.core.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0068YFl implements ICustomRouter {
        private YoT.Sg AlY;
        YoT.YFl YFl;
        private nc tN;

        public C0068YFl() {
        }

        public void YFl(nc ncVar) {
            this.tN = ncVar;
        }

        public void YFl(YoT.Sg sg2) {
            this.AlY = sg2;
        }

        public void YFl(YoT.YFl yFl) {
            this.YFl = yFl;
        }
    }

    public YFl(YoT yoT) {
        this.YFl = yoT;
    }

    private void tN(nc ncVar, YoT.Sg sg2, YoT.YFl yFl) {
        if (this.wN == null) {
            this.wN = Sg();
        }
        this.wN.YFl(ncVar);
        this.wN.YFl(sg2);
        this.wN.YFl(yFl);
        JSONObject tN = ncVar.tN();
        if (tN == null) {
            return;
        }
        new EventChainAction.Builder(tN.optString("type")).setChainData(this.AlY).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.YFl.YFl.1
        }).build().run();
    }

    public void Sg(boolean z10) {
        this.f10273vc = z10;
    }

    public void YFl(JSONObject jSONObject) {
        this.AlY = jSONObject;
    }

    private void Sg(nc ncVar, YoT.Sg sg2, YoT.YFl yFl) {
        YoT yoT = this.YFl;
        if (yoT == null) {
            return;
        }
        yoT.YFl(ncVar, sg2, yFl);
    }

    public void YFl(String str) {
        this.Sg = str;
    }

    public void YFl(boolean z10) {
        this.tN = z10;
    }

    private C0068YFl Sg() {
        if (this.wN != null) {
            return this.wN;
        }
        synchronized (C0068YFl.class) {
            if (this.wN != null) {
                return this.wN;
            }
            this.wN = new C0068YFl();
            return this.wN;
        }
    }

    public boolean YFl() {
        String str;
        return this.tN && (str = this.Sg) != null && "3".compareTo(str) <= 0 && this.AlY != null;
    }

    @Override // com.bytedance.adsdk.ugeno.core.YoT
    public void YFl(nc ncVar, YoT.Sg sg2, YoT.YFl yFl) {
        if (YFl()) {
            tN(ncVar, sg2, yFl);
        } else {
            Sg(ncVar, sg2, yFl);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.YoT
    public void YFl(Sg sg2, String str, Sg.YFl yFl) {
        YoT yoT = this.YFl;
        if (yoT == null) {
            return;
        }
        yoT.YFl(sg2, str, yFl);
        Log.d("UGenEvent", "onUGenEvent: ");
    }
}
