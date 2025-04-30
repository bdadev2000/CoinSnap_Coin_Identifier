package com.bytedance.sdk.openadsdk.component.jU;

import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.model.ot;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.dT.lMd;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.utils.cW;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    public static void lMd(woN won) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", woN.COT(won) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e4) {
            tG.zp("TTAppOpenAdReport", "reportCacheLoss json error", e4);
        }
        KS.lMd(won, "cache_loss", jSONObject);
    }

    public static void zp(final int i9, final int i10) {
        com.bytedance.sdk.openadsdk.dT.KS.zp("openad_load_ad_timeout", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.component.jU.zp.1
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i9);
                jSONObject.put("user_timeout_time", i10);
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("openad_load_ad_timeout").lMd(jSONObject.toString());
            }
        });
    }

    public static void zp(woN won, int i9, int i10, float f9) {
        JSONObject jSONObject = new JSONObject();
        try {
            zp(jSONObject, won);
            jSONObject.put("openad_creative_type", woN.COT(won) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("skip_time", i9);
            jSONObject.put("skip_show_time", i10);
            jSONObject.put("total_time", f9);
        } catch (JSONException e4) {
            tG.zp("TTAppOpenAdReport", "reportSkip json error", e4);
        }
        KS.zp(won, "skip", i9, jSONObject);
    }

    public static void lMd(woN won, long j7, boolean z8) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", won.eWG().COT());
            jSONObject.put("video_duration", won.eWG().HWF());
            jSONObject.put("order", z8 ? 1 : 2);
        } catch (JSONException unused) {
        }
        KS.zp(won, "download_video_duration", j7, jSONObject);
    }

    public static void zp(woN won, long j7, float f9, boolean z8) {
        JSONObject jSONObject = new JSONObject();
        try {
            zp(jSONObject, won);
            jSONObject.put("openad_creative_type", woN.COT(won) ? "video_normal_ad" : "image_normal_ad");
            if (z8) {
                double d2 = f9;
                jSONObject.put("video_duration", d2);
                jSONObject.put("video_percent", (int) (((j7 * 1.0d) / 10.0d) / d2));
            } else {
                jSONObject.put("image_duration", f9);
            }
        } catch (JSONException e4) {
            tG.zp("TTAppOpenAdReport", "reportDestroy json error", e4);
        }
        KS.lMd(won, "destroy", jSONObject);
    }

    public static void zp(woN won) {
        KS.lMd(won, "cache_expire", (JSONObject) null);
    }

    public static void zp(woN won, long j7, boolean z8) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z8 ? 1 : 2);
        } catch (JSONException unused) {
        }
        KS.zp(won, "download_image_duration", j7, jSONObject);
    }

    public static void zp(woN won, int i9, ot otVar) {
        JSONObject jSONObject = new JSONObject();
        long j7 = 0;
        try {
            jSONObject.put("openad_creative_type", woN.COT(won) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i9);
            if (otVar != null) {
                otVar.lMd(cW.zp());
                zp(jSONObject, won);
                jSONObject.put("client_start_time", otVar.lMd());
                jSONObject.put("sever_time", otVar.jU());
                jSONObject.put("network_time", otVar.KS());
                jSONObject.put("client_end_time", otVar.COT());
                jSONObject.put("download_resource_duration", otVar.QR());
                jSONObject.put("resource_source", otVar.ku());
                jSONObject.put("is_bidding", otVar.zp ? 1 : 0);
                if (otVar.zp) {
                    jSONObject.put("load_wait_time", otVar.lMd);
                }
                j7 = otVar.HWF();
            }
        } catch (JSONException e4) {
            tG.zp("TTAppOpenAdReport", "reportLoadNetDuration json error", e4);
        }
        KS.zp(won, "load_net_duration", j7, jSONObject);
    }

    public static void zp(woN won, long j7) {
        JSONObject jSONObject = new JSONObject();
        try {
            zp(jSONObject, won);
            jSONObject.put("openad_creative_type", woN.COT(won) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            tG.zp("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        KS.zp(won, "load_cache_duration", j7, jSONObject);
    }

    private static void zp(JSONObject jSONObject, woN won) {
        int i9;
        if (won != null) {
            try {
                if (won.hG()) {
                    i9 = 1;
                    jSONObject.put("is_icon_only", i9);
                }
            } catch (JSONException e4) {
                tG.zp("TTAppOpenAdReport", e4.getMessage());
                return;
            }
        }
        i9 = 0;
        jSONObject.put("is_icon_only", i9);
    }
}
