package com.bytedance.adsdk.ugeno.core.lMd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.tG;
import com.bytedance.adsdk.ugeno.lMd.YW;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT implements YW.zp {
    private Bj COT;
    private com.bytedance.adsdk.ugeno.component.lMd HWF;
    private tG KS;
    private Handler QR = new YW(Looper.getMainLooper(), this);
    private Context jU;
    private int lMd;
    private boolean zp;

    public COT(Context context, Bj bj, com.bytedance.adsdk.ugeno.component.lMd lmd) {
        this.jU = context;
        this.COT = bj;
        this.HWF = lmd;
    }

    public void zp(tG tGVar) {
        this.KS = tGVar;
    }

    public void zp() {
        Bj bj = this.COT;
        if (bj == null) {
            return;
        }
        JSONObject KS = bj.KS();
        try {
            this.lMd = Integer.parseInt(com.bytedance.adsdk.ugeno.zp.KS.zp(KS.optString("interval", "8000"), this.HWF.dT()));
            this.zp = KS.optBoolean("repeat");
            this.QR.sendEmptyMessageDelayed(1001, this.lMd);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lMd.YW.zp
    public void zp(Message message) {
        if (message.what != 1001) {
            return;
        }
        tG tGVar = this.KS;
        if (tGVar != null) {
            Bj bj = this.COT;
            com.bytedance.adsdk.ugeno.component.lMd lmd = this.HWF;
            tGVar.zp(bj, lmd, lmd);
        }
        if (this.zp) {
            this.QR.sendEmptyMessageDelayed(1001, this.lMd);
        } else {
            this.QR.removeMessages(1001);
        }
    }
}
