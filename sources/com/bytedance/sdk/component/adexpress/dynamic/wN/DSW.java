package com.bytedance.sdk.component.adexpress.dynamic.wN;

import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW implements qsH {
    private com.bytedance.sdk.component.adexpress.dynamic.vc.Sg YFl;

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(GA ga2) {
        try {
            JSONObject tN = ga2.tN();
            JSONObject jSONObject = new JSONObject(tN.optString("template_Plugin"));
            JSONObject optJSONObject = tN.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YFl = new vc(jSONObject, optJSONObject, tN.optJSONObject("AdSize"), new JSONObject(tN.optString("diff_template_Plugin"))).YFl(ga2.Sg(), ga2.nc(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), ga2);
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("dynamic_creative"));
                YFl.YFl(jSONObject2.optString(TtmlNode.ATTR_TTS_COLOR));
                YFl.YFl(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.YFl.YFl(YFl);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wN.qsH
    public void YFl(com.bytedance.sdk.component.adexpress.dynamic.vc.Sg sg2) {
        this.YFl = sg2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wN.qsH
    public void YFl(final GA ga2) {
        if (ga2.YoT() == 1) {
            Sg(ga2);
        } else {
            com.bytedance.sdk.component.adexpress.AlY.AlY.YFl(new com.bytedance.sdk.component.qsH.qsH("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.wN.DSW.1
                @Override // java.lang.Runnable
                public void run() {
                    DSW.this.Sg(ga2);
                }
            }, 5);
        }
    }
}
