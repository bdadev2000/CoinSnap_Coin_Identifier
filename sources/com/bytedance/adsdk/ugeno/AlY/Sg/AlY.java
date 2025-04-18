package com.bytedance.adsdk.ugeno.AlY.Sg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.DSW.NjR;
import java.util.Map;

/* loaded from: classes.dex */
public class AlY extends YFl implements NjR.YFl {
    private int NjR;
    private Handler eT;

    /* renamed from: nc, reason: collision with root package name */
    private int f10230nc;

    public AlY(Context context) {
        super(context);
        this.f10230nc = 5000;
        this.eT = new NjR(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.AlY.Sg.YFl
    public boolean YFl(Object... objArr) {
        Map<String, String> map = this.wN;
        if (map != null) {
            this.NjR = com.bytedance.adsdk.ugeno.DSW.tN.YFl(map.get("loop"), 0);
            this.f10230nc = com.bytedance.adsdk.ugeno.DSW.tN.YFl(this.wN.get("duration"), 5000);
        }
        this.eT.sendEmptyMessageDelayed(1001, this.f10230nc);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.DSW.NjR.YFl
    public void YFl(Message message) {
        if (message.what != 1001) {
            return;
        }
        this.YFl.YFl(this.Sg, this.f10232vc, this.tN.Sg());
        if (this.NjR <= 0) {
            this.eT.sendEmptyMessageDelayed(1001, this.f10230nc);
        } else {
            this.eT.removeMessages(1001);
        }
    }
}
