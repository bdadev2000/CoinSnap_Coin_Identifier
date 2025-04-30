package com.bytedance.sdk.component.adexpress.dynamic.jU;

import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QR implements ku {
    private com.bytedance.sdk.component.adexpress.dynamic.COT.lMd zp;

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(tG tGVar) {
        try {
            JSONObject KS = tGVar.KS();
            JSONObject jSONObject = new JSONObject(KS.optString("template_Plugin"));
            JSONObject optJSONObject = KS.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.KS.ku zp = new HWF(jSONObject, optJSONObject, KS.optJSONObject("AdSize"), new JSONObject(KS.optString("diff_template_Plugin"))).zp(tGVar.lMd(), tGVar.dT(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), tGVar);
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("dynamic_creative"));
                zp.zp(jSONObject2.optString(TtmlNode.ATTR_TTS_COLOR));
                zp.zp(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.zp.zp(zp);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU.ku
    public void zp(com.bytedance.sdk.component.adexpress.dynamic.COT.lMd lmd) {
        this.zp = lmd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU.ku
    public void zp(final tG tGVar) {
        if (tGVar.vDp() == 1) {
            lMd(tGVar);
        } else {
            com.bytedance.sdk.component.adexpress.jU.KS.zp(new com.bytedance.sdk.component.ku.ku("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.jU.QR.1
                @Override // java.lang.Runnable
                public void run() {
                    QR.this.lMd(tGVar);
                }
            }, 5);
        }
    }
}
