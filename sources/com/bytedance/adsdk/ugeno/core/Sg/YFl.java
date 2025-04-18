package com.bytedance.adsdk.ugeno.core.Sg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.DSW.NjR;
import com.bytedance.adsdk.ugeno.core.DSW;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.nc;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements NjR.YFl {
    private nc AlY;
    private YoT Sg;
    private int YFl;
    private Context tN;

    /* renamed from: vc, reason: collision with root package name */
    private Handler f10270vc = new NjR(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.Sg.Sg wN;

    public YFl(Context context, nc ncVar, com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        this.tN = context;
        this.AlY = ncVar;
        this.wN = sg2;
    }

    public void YFl(YoT yoT) {
        this.Sg = yoT;
    }

    public void YFl() {
        nc ncVar = this.AlY;
        if (ncVar == null) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(com.bytedance.adsdk.ugeno.tN.Sg.YFl(ncVar.tN().optString("delay"), this.wN.nc()));
            this.YFl = parseInt;
            this.f10270vc.sendEmptyMessageDelayed(1001, parseInt);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.DSW.NjR.YFl
    public void YFl(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject tN = this.AlY.tN();
        if (TextUtils.equals(tN.optString("type"), "onAnimation")) {
            String optString = tN.optString("nodeId");
            com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.wN;
            com.bytedance.adsdk.ugeno.Sg.Sg Sg = sg2.Sg(sg2).Sg(optString);
            new DSW(Sg.NjR(), com.bytedance.adsdk.ugeno.core.YFl.YFl(tN.optJSONObject("animatorSet"), Sg)).YFl();
        } else {
            YoT yoT = this.Sg;
            if (yoT != null) {
                nc ncVar = this.AlY;
                com.bytedance.adsdk.ugeno.Sg.Sg sg3 = this.wN;
                yoT.YFl(ncVar, sg3, sg3);
            }
        }
        this.f10270vc.removeMessages(1001);
    }
}
