package com.bytedance.sdk.openadsdk.component.AlY;

import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.bZ;
import com.bytedance.sdk.openadsdk.pDU.Sg;
import com.bytedance.sdk.openadsdk.pDU.YFl.AlY;
import com.bytedance.sdk.openadsdk.utils.zB;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    public static void Sg(Wwa wwa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", Wwa.wN(wwa) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e2) {
            YoT.YFl("TTAppOpenAdReport", "reportCacheLoss json error", e2);
        }
        tN.AlY(wwa, "cache_loss", jSONObject);
    }

    public static void YFl(final int i10, final int i11) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("openad_load_ad_timeout", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.component.AlY.YFl.1
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i10);
                jSONObject.put("user_timeout_time", i11);
                return AlY.Sg().YFl("openad_load_ad_timeout").Sg(jSONObject.toString());
            }
        });
    }

    public static void YFl(Wwa wwa, int i10, int i11, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            YFl(jSONObject, wwa);
            jSONObject.put("openad_creative_type", Wwa.wN(wwa) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("skip_time", i10);
            jSONObject.put("skip_show_time", i11);
            jSONObject.put("total_time", f10);
        } catch (JSONException e2) {
            YoT.YFl("TTAppOpenAdReport", "reportSkip json error", e2);
        }
        tN.YFl(wwa, "skip", i10, jSONObject);
    }

    public static void Sg(Wwa wwa, long j3, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", wwa.BPI().f23458c);
            jSONObject.put("video_duration", wwa.BPI().f23459d);
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        tN.YFl(wwa, "download_video_duration", j3, jSONObject);
    }

    public static void YFl(Wwa wwa, long j3, float f10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            YFl(jSONObject, wwa);
            jSONObject.put("openad_creative_type", Wwa.wN(wwa) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j3 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e2) {
            YoT.YFl("TTAppOpenAdReport", "reportDestroy json error", e2);
        }
        tN.AlY(wwa, "destroy", jSONObject);
    }

    public static void YFl(Wwa wwa) {
        tN.AlY(wwa, "cache_expire", (JSONObject) null);
    }

    public static void YFl(Wwa wwa, long j3, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        tN.YFl(wwa, "download_image_duration", j3, jSONObject);
    }

    public static void YFl(Wwa wwa, int i10, bZ bZVar) {
        JSONObject jSONObject = new JSONObject();
        long j3 = 0;
        try {
            jSONObject.put("openad_creative_type", Wwa.wN(wwa) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (bZVar != null) {
                bZVar.Sg(zB.YFl());
                YFl(jSONObject, wwa);
                jSONObject.put("client_start_time", bZVar.Sg());
                jSONObject.put("sever_time", bZVar.AlY());
                jSONObject.put("network_time", bZVar.tN());
                jSONObject.put("client_end_time", bZVar.wN());
                jSONObject.put("download_resource_duration", bZVar.DSW());
                jSONObject.put("resource_source", bZVar.qsH());
                jSONObject.put("is_bidding", bZVar.YFl ? 1 : 0);
                if (bZVar.YFl) {
                    jSONObject.put("load_wait_time", bZVar.Sg);
                }
                j3 = bZVar.vc();
            }
        } catch (JSONException e2) {
            YoT.YFl("TTAppOpenAdReport", "reportLoadNetDuration json error", e2);
        }
        tN.YFl(wwa, "load_net_duration", j3, jSONObject);
    }

    public static void YFl(Wwa wwa, long j3) {
        JSONObject jSONObject = new JSONObject();
        try {
            YFl(jSONObject, wwa);
            jSONObject.put("openad_creative_type", Wwa.wN(wwa) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            YoT.YFl("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        tN.YFl(wwa, "load_cache_duration", j3, jSONObject);
    }

    private static void YFl(JSONObject jSONObject, Wwa wwa) {
        int i10;
        if (wwa != null) {
            try {
                if (wwa.Zu()) {
                    i10 = 1;
                    jSONObject.put("is_icon_only", i10);
                }
            } catch (JSONException e2) {
                YoT.YFl("TTAppOpenAdReport", e2.getMessage());
                return;
            }
        }
        i10 = 0;
        jSONObject.put("is_icon_only", i10);
    }
}
