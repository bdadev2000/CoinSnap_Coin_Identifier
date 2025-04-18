package com.bytedance.sdk.openadsdk.AlY.YFl;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.vungle.ads.internal.signals.j;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc {
    public static AtomicInteger YFl = new AtomicInteger(0);
    public static AtomicInteger Sg = new AtomicInteger(0);
    public static AtomicInteger tN = new AtomicInteger(0);
    public static AtomicInteger AlY = new AtomicInteger(0);
    public static AtomicInteger wN = new AtomicInteger(0);

    /* renamed from: vc, reason: collision with root package name */
    public static AtomicInteger f10497vc = new AtomicInteger(0);
    public static AtomicInteger DSW = new AtomicInteger(0);
    public static AtomicInteger qsH = new AtomicInteger(0);
    public static AtomicInteger NjR = new AtomicInteger(0);

    public static JSONObject AlY() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", YFl.get());
            jSONObject.put("load_success", Sg.get());
            jSONObject.put("load_fail", tN.get());
            jSONObject.put("load_fail_in_background", NjR.get());
            jSONObject.put("load_success_and_parse_success", AlY.get());
            jSONObject.put("load_success_and_parse_fail", wN.get());
            jSONObject.put("load_success_and_no_ad", f10497vc.get());
            jSONObject.put("load_fail_by_no_net", DSW.get());
            jSONObject.put("load_fail_by_io", qsH.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void Sg() {
        try {
            com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void YFl() {
        try {
            long YFl2 = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (YFl2 > 0 && System.currentTimeMillis() - YFl2 >= j.TWENTY_FOUR_HOURS_MILLIS) {
                Sg();
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (YFl2 <= 0 || YFl2 > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int optInt = jSONObject.optInt("load_get_ad_version", 0);
            if (optInt >= 5702 && (optInt < 5800 || optInt >= 5802)) {
                YFl.addAndGet(jSONObject.optInt("load_times"));
                Sg.addAndGet(jSONObject.optInt("load_success"));
                tN.addAndGet(jSONObject.optInt("load_fail"));
                AlY.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                wN.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                f10497vc.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                DSW.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                qsH.addAndGet(jSONObject.optInt("load_fail_by_io"));
                NjR.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void tN() {
        try {
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_get_ad", "get_ad_event_key", AlY().toString());
        } catch (Throwable unused) {
        }
    }

    public static void wN() {
        try {
            if (!DeviceUtils.Sg()) {
                NjR.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void YFl(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
            com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
