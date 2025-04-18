package com.bytedance.adsdk.ugeno.core.Sg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.DSW.NjR;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.nc;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN implements NjR.YFl {
    private Context AlY;
    private Handler DSW = new NjR(Looper.getMainLooper(), this);
    private int Sg;
    private boolean YFl;
    private YoT tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.Sg.Sg f10271vc;
    private nc wN;

    public wN(Context context, nc ncVar, com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        this.AlY = context;
        this.wN = ncVar;
        this.f10271vc = sg2;
    }

    public void YFl(YoT yoT) {
        this.tN = yoT;
    }

    public void YFl() {
        nc ncVar = this.wN;
        if (ncVar == null) {
            return;
        }
        JSONObject tN = ncVar.tN();
        try {
            this.Sg = Integer.parseInt(com.bytedance.adsdk.ugeno.tN.Sg.YFl(tN.optString("interval", "8000"), this.f10271vc.nc()));
            this.YFl = tN.optBoolean("repeat");
            this.DSW.sendEmptyMessageDelayed(1001, this.Sg);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.DSW.NjR.YFl
    public void YFl(Message message) {
        if (message.what != 1001) {
            return;
        }
        YoT yoT = this.tN;
        if (yoT != null) {
            nc ncVar = this.wN;
            com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.f10271vc;
            yoT.YFl(ncVar, sg2, sg2);
        }
        if (this.YFl) {
            this.DSW.sendEmptyMessageDelayed(1001, this.Sg);
        } else {
            this.DSW.removeMessages(1001);
        }
    }
}
