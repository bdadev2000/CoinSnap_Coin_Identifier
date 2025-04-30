package com.bytedance.adsdk.ugeno.core.lMd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.ku;
import com.bytedance.adsdk.ugeno.core.tG;
import com.bytedance.adsdk.ugeno.lMd.YW;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd implements YW.zp {
    private com.bytedance.adsdk.ugeno.component.lMd COT;
    private Handler HWF = new YW(Looper.getMainLooper(), this);
    private Context KS;
    private Bj jU;
    private tG lMd;
    private int zp;

    public lMd(Context context, Bj bj, com.bytedance.adsdk.ugeno.component.lMd lmd) {
        this.KS = context;
        this.jU = bj;
        this.COT = lmd;
    }

    public void zp(tG tGVar) {
        this.lMd = tGVar;
    }

    public void zp() {
        Bj bj = this.jU;
        if (bj == null) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(com.bytedance.adsdk.ugeno.zp.KS.zp(bj.KS().optString("delay"), this.COT.dT()));
            this.zp = parseInt;
            this.HWF.sendEmptyMessageDelayed(1001, parseInt);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lMd.YW.zp
    public void zp(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject KS = this.jU.KS();
        if (TextUtils.equals(KS.optString("type"), "onAnimation")) {
            String optString = KS.optString("nodeId");
            com.bytedance.adsdk.ugeno.component.lMd lmd = this.COT;
            com.bytedance.adsdk.ugeno.component.lMd lMd = lmd.lMd(lmd).lMd(optString);
            new ku(lMd.YW(), com.bytedance.adsdk.ugeno.core.zp.zp(KS.optJSONObject("animatorSet"), lMd)).zp();
        } else {
            tG tGVar = this.lMd;
            if (tGVar != null) {
                Bj bj = this.jU;
                com.bytedance.adsdk.ugeno.component.lMd lmd2 = this.COT;
                tGVar.zp(bj, lmd2, lmd2);
            }
        }
        this.HWF.removeMessages(1001);
    }
}
