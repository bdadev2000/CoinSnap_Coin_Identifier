package com.bytedance.sdk.openadsdk.core.ugen.lMd;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.dT;
import com.bytedance.adsdk.ugeno.core.rV;
import com.bytedance.adsdk.ugeno.core.tG;
import com.bytedance.sdk.openadsdk.core.ugen.jU.KS;
import com.bytedance.sdk.openadsdk.utils.QUv;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp implements rV, tG {
    private InterfaceC0116zp KS;
    private rV jU;
    private com.bytedance.adsdk.ugeno.component.lMd<View> lMd;
    private final Context zp;

    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0116zp {
        void zp(Bj bj);
    }

    public zp(Context context) {
        this.zp = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(JSONObject jSONObject, JSONObject jSONObject2, KS ks) {
        try {
            dT dTVar = new dT(this.zp);
            com.bytedance.adsdk.ugeno.component.lMd<View> zp = dTVar.zp(jSONObject);
            this.lMd = zp;
            if (zp == null) {
                if (ks != null) {
                    ks.zp(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View YW = zp.YW();
            if (YW != null) {
                YW.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.zp.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            dTVar.zp((tG) this);
            dTVar.zp((rV) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.Bj.zp());
                } catch (JSONException unused) {
                }
            }
            dTVar.lMd(jSONObject2);
            if (ks != null) {
                ks.zp(this.lMd);
            }
        } catch (Exception e4) {
            if (ks != null) {
                ks.zp(3000, "ugen render fail exception is" + e4.getMessage());
            }
        }
    }

    public void zp(final JSONObject jSONObject, final JSONObject jSONObject2, final KS ks) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lMd(jSONObject, jSONObject2, ks);
        } else {
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    zp.this.lMd(jSONObject, jSONObject2, ks);
                }
            });
        }
    }

    public void zp(InterfaceC0116zp interfaceC0116zp) {
        this.KS = interfaceC0116zp;
    }

    public void zp(rV rVVar) {
        this.jU = rVVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.tG
    public void zp(Bj bj, tG.lMd lmd, tG.zp zpVar) {
        InterfaceC0116zp interfaceC0116zp;
        if (bj == null) {
            return;
        }
        if ((bj.lMd() == 1 || bj.lMd() == 4) && (interfaceC0116zp = this.KS) != null) {
            interfaceC0116zp.zp(bj);
        }
        if (lmd == null || bj.jU() == null) {
            return;
        }
        lmd.zp(bj.jU());
    }

    @Override // com.bytedance.adsdk.ugeno.core.rV
    public void zp(com.bytedance.adsdk.ugeno.component.lMd lmd, MotionEvent motionEvent) {
        rV rVVar = this.jU;
        if (rVVar != null) {
            rVVar.zp(lmd, motionEvent);
        }
    }
}
