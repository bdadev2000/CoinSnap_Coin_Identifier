package com.bytedance.sdk.openadsdk.rV.zp;

import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU {
    public static void zp(final woN won, final zp zpVar, final int i9) {
        won.hRp();
        QUv.KS(new com.bytedance.sdk.component.ku.ku("mrc_report") { // from class: com.bytedance.sdk.openadsdk.rV.zp.jU.1
            @Override // java.lang.Runnable
            public void run() {
                if (won.tyQ()) {
                    if (won.slc()) {
                        com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(won.DY(), new KS.lMd("show_urls", won));
                    } else {
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(won);
                    }
                }
                String zp = YhE.zp(won);
                JSONObject jSONObject = new JSONObject();
                zp zpVar2 = zpVar;
                if (zpVar2 != null) {
                    try {
                        jSONObject.put("root_view", zp.zp(zpVar2));
                        int i10 = i9;
                        if (i10 != -1) {
                            jSONObject.put("dynamic_show_type", i10);
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, zp, "mrc_show", jSONObject);
            }
        });
    }
}
