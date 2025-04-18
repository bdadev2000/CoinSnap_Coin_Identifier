package com.bytedance.sdk.openadsdk.component.reward.Sg;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Sg.pDU;
import com.bytedance.sdk.openadsdk.component.reward.YFl.wN;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.qO;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN extends Sg implements com.bytedance.sdk.openadsdk.YoT.vc {
    private final qO EH;
    private boolean rkt;

    public wN(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl);
        this.EH = (qO) yFl.Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void DSW() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.YFl
    public boolean Sg() {
        return this.rkt;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YI() {
        hQ jsObject;
        if (this.YFl.UI.isFinishing()) {
            return;
        }
        if (!this.YFl.YI.qsH() && !this.rkt) {
            com.bytedance.sdk.openadsdk.component.reward.view.Sg YFl = this.YFl.YI.YFl();
            if (YFl != null && (jsObject = YFl.getJsObject()) != null) {
                jsObject.YFl(this);
                return;
            }
            return;
        }
        super.YI();
        if (this.YFl.YI.qsH()) {
            Ga();
            this.YFl.GS.Sg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean dXO() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean vc() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean wN() {
        return true;
    }

    public static void YFl(Wwa wwa, boolean z10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_backup", Boolean.valueOf(z10));
        com.bytedance.sdk.openadsdk.AlY.tN.YFl("choose_ad_start_show", wwa, str, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_id", wwa.ivp());
            jSONObject.put("is_backup", z10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl("choose_ad_start_show", jSONObject);
    }

    public void Sg(boolean z10) {
        if (this.rkt) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("has_focus", Boolean.valueOf(z10));
        com.bytedance.sdk.openadsdk.AlY.tN.YFl("choose_ad_focus_changed", this.EH, this.YFl.wN, hashMap);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(com.bytedance.sdk.openadsdk.component.reward.view.DSW dsw) {
        if (tN.YFl(this.EH)) {
            tN.YFl(this.EH, dsw, this.YFl);
        } else {
            super.YFl(dsw);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YoT.vc
    public void YFl(int i10, long j3) {
        this.rkt = true;
        int i11 = i10 - 1;
        this.EH.ko(i11);
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.EH, this.YFl.wN, i10, j3);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl(this.EH.rQ(), i11, this.YFl.AlY);
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Sg.wN.1
            @Override // java.lang.Runnable
            public void run() {
                wN.this.YI();
                wN wNVar = wN.this;
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = wNVar.YFl;
                if (yFl.ko) {
                    wNVar.Ga();
                    wN.this.YFl.GS.Sg();
                } else {
                    wN.YFl vc2 = yFl.GS.vc();
                    if (vc2 != null) {
                        vc2.rkt();
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.YoT.vc
    public void YFl(pDU pdu) {
        this.YFl.YI.YFl().Sg(pdu);
    }
}
