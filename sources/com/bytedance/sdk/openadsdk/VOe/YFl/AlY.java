package com.bytedance.sdk.openadsdk.VOe.YFl;

import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY {
    public static void YFl(final Wwa wwa, final YFl yFl, final wN.YFl yFl2) {
        wwa.qf();
        mn.tN(new com.bytedance.sdk.component.qsH.qsH("mrc_report") { // from class: com.bytedance.sdk.openadsdk.VOe.YFl.AlY.1
            @Override // java.lang.Runnable
            public void run() {
                if (wwa.JwO()) {
                    if (wwa.Pj()) {
                        com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(wwa.RX(), new tN.Sg("show_urls", wwa));
                    } else {
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa);
                    }
                }
                String YFl = Sco.YFl(wwa);
                JSONObject jSONObject = new JSONObject();
                YFl yFl3 = yFl;
                if (yFl3 != null) {
                    try {
                        jSONObject.put("root_view", YFl.YFl(yFl3));
                        wN.YFl yFl4 = yFl2;
                        if (yFl4 != null) {
                            int i10 = yFl4.YFl;
                            if (i10 != -1) {
                                jSONObject.put("dynamic_show_type", i10);
                            }
                            int i11 = yFl2.Sg;
                            if (i11 != -1) {
                                jSONObject.put("ad_show_order", i11 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, YFl, "mrc_show", jSONObject);
            }
        });
    }
}
