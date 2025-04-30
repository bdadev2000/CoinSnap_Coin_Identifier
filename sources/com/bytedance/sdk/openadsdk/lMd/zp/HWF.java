package com.bytedance.sdk.openadsdk.lMd.zp;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.vungle.ads.internal.signals.j;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF {
    public static AtomicInteger zp = new AtomicInteger(0);
    public static AtomicInteger lMd = new AtomicInteger(0);
    public static AtomicInteger KS = new AtomicInteger(0);
    public static AtomicInteger jU = new AtomicInteger(0);
    public static AtomicInteger COT = new AtomicInteger(0);
    public static AtomicInteger HWF = new AtomicInteger(0);
    public static AtomicInteger QR = new AtomicInteger(0);
    public static AtomicInteger ku = new AtomicInteger(0);
    public static AtomicInteger YW = new AtomicInteger(0);

    public static void COT() {
        try {
            if (!DeviceUtils.lMd()) {
                YW.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void KS() {
        try {
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_get_ad", "get_ad_event_key", jU().toString());
        } catch (Throwable unused) {
        }
    }

    public static JSONObject jU() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", zp.get());
            jSONObject.put("load_success", lMd.get());
            jSONObject.put("load_fail", KS.get());
            jSONObject.put("load_fail_in_background", YW.get());
            jSONObject.put("load_success_and_parse_success", jU.get());
            jSONObject.put("load_success_and_parse_fail", COT.get());
            jSONObject.put("load_success_and_no_ad", HWF.get());
            jSONObject.put("load_fail_by_no_net", QR.get());
            jSONObject.put("load_fail_by_io", ku.get());
            jSONObject.put("load_get_ad_version", 6003);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void lMd() {
        try {
            com.bytedance.sdk.openadsdk.dT.KS.zp().zp("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void zp() {
        try {
            long zp2 = com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (zp2 > 0 && System.currentTimeMillis() - zp2 >= j.TWENTY_FOUR_HOURS_MILLIS) {
                lMd();
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (zp2 <= 0 || zp2 > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int optInt = jSONObject.optInt("load_get_ad_version", 0);
            if (optInt >= 5702 && (optInt < 5800 || optInt >= 5802)) {
                zp.addAndGet(jSONObject.optInt("load_times"));
                lMd.addAndGet(jSONObject.optInt("load_success"));
                KS.addAndGet(jSONObject.optInt("load_fail"));
                jU.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                COT.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                HWF.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                QR.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                ku.addAndGet(jSONObject.optInt("load_fail_by_io"));
                YW.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void zp(int i9, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
            com.bytedance.sdk.openadsdk.dT.KS.zp().zp("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
