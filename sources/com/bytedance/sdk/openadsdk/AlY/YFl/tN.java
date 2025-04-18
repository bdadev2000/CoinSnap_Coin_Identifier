package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.YI;
import com.bytedance.sdk.openadsdk.utils.bZ;
import com.bytedance.sdk.openadsdk.utils.wXo;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private final boolean AlY;
    private int Sg;
    private long YFl;
    private final Context tN;
    private final String wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private static final tN YFl = new tN();
    }

    private int AlY() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String YFl(int i10) {
        return i10 != 120 ? i10 != 160 ? i10 != 240 ? i10 != 320 ? i10 != 480 ? i10 != 640 ? "mdpi" : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi" : "ldpi";
    }

    private boolean tN() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JProtect
    private String vc() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (bZ.wN()) {
                sb2.append("MIUI-");
            } else if (bZ.Sg()) {
                sb2.append("FLYME-");
            } else {
                String pDU = bZ.pDU();
                if (bZ.YFl(pDU)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(pDU)) {
                    sb2.append(pDU);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    private String wN() {
        if (DeviceUtils.tN(this.tN)) {
            return "tv";
        }
        if (DeviceUtils.Sg(this.tN)) {
            return "android_pad";
        }
        return "android";
    }

    public List<com.bytedance.sdk.openadsdk.AlY.YFl> Sg(List<com.bytedance.sdk.openadsdk.AlY.YFl> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.AlY.YFl yFl : list) {
            try {
                JSONObject tN = yFl.tN();
                tN.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.AlY.YFl(yFl.YFl, tN));
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("AdLogParamsGenerate", e2.getMessage());
            }
        }
        return arrayList;
    }

    private tN() {
        this.AlY = tN();
        this.tN = lG.YFl().getApplicationContext();
        this.wN = wN();
    }

    public static tN YFl() {
        return YFl.YFl;
    }

    public String YFl(List<com.bytedance.sdk.openadsdk.AlY.YFl> list) {
        return Sco.wN((list.size() <= 0 || list.get(0) == null || list.get(0).tN() == null) ? "" : list.get(0).tN().optString("app_log_url"));
    }

    private void YFl(com.bytedance.sdk.openadsdk.AlY.YFl yFl, boolean z10) {
        String optString;
        if (yFl == null) {
            return;
        }
        try {
            if (z10) {
                optString = yFl.tN().optJSONObject("params").optString("log_extra", "");
            } else {
                optString = yFl.tN().optString("log_extra", "");
            }
            long YFl2 = Wwa.YFl(optString);
            int AlY = Wwa.AlY(optString);
            if (YFl2 == 0) {
                YFl2 = this.YFl;
            }
            this.YFl = YFl2;
            if (AlY == 0) {
                AlY = this.Sg;
            }
            this.Sg = AlY;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdLogParamsGenerate", "getInfoFromLogExtra exception", e2.getMessage());
        }
    }

    @SuppressLint({"HardwareIds"})
    @JProtect
    public JSONObject Sg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ua", Sco.tN());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", Sco.DSW());
            jSONObject.put("sim_op", YFl(this.tN));
            jSONObject.put("root", this.AlY ? 1 : 0);
            jSONObject.put("timezone", AlY());
            jSONObject.put("access", wXo.YFl(this.tN));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.wN);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", GS.AlY(this.tN) + "x" + GS.tN(this.tN));
            jSONObject.put("display_density", YFl(GS.DSW(this.tN)));
            jSONObject.put("density_dpi", GS.DSW(this.tN));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", com.bytedance.sdk.openadsdk.core.YoT.YFl(this.tN));
            jSONObject.put("rom", vc());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.Sg);
            jSONObject.put("uid", this.YFl);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg());
            jSONObject.put("locale_language", DeviceUtils.AlY());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.wN() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", DeviceUtils.Sg() ? 0 : 1);
            com.bytedance.sdk.openadsdk.core.settings.vc AlY = lG.AlY();
            jSONObject.put("force_language", qO.YFl(this.tN, "tt_choose_language"));
            if (AlY.dXO("mnc")) {
                jSONObject.put("mnc", YI.tN());
            }
            if (AlY.dXO("mcc")) {
                jSONObject.put("mcc", YI.Sg());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public JSONObject YFl(List<com.bytedance.sdk.openadsdk.AlY.YFl> list, long j3, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            YFl(list.get(0), z10);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.AlY.YFl> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().YFl(z10));
            }
            if (z10) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j3);
            jSONObject2.put("local_time", j3 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.AlY.YFl> YFl(List<com.bytedance.sdk.openadsdk.AlY.YFl> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.AlY.YFl yFl : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject tN = yFl.tN();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, tN.optString("label"));
                long optLong = tN.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(optLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.AlY.vc.tN.format(new Date(optLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = tN.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, tN.opt(next));
                    }
                }
                if (z10) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.AlY.vc(yFl.YFl, jSONObject));
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("AdLogParamsGenerate", e2.getMessage());
            }
        }
        return arrayList;
    }

    private String YFl(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }
}
