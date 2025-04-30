package com.bytedance.sdk.openadsdk.lMd.zp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.cz;
import com.bytedance.sdk.openadsdk.utils.ox;
import com.bytedance.sdk.openadsdk.utils.yRU;
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
public class KS {
    private final String COT;
    private final Context KS;
    private final boolean jU;
    private int lMd;
    private long zp;

    /* loaded from: classes.dex */
    public static class zp {
        private static final KS zp = new KS();
    }

    private String COT() {
        if (DeviceUtils.KS(this.KS)) {
            return "tv";
        }
        if (DeviceUtils.lMd(this.KS)) {
            return "android_pad";
        }
        return "android";
    }

    @JProtect
    private String HWF() {
        StringBuilder sb = new StringBuilder();
        try {
            if (yRU.COT()) {
                sb.append("MIUI-");
            } else if (yRU.lMd()) {
                sb.append("FLYME-");
            } else {
                String rV = yRU.rV();
                if (yRU.zp(rV)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(rV)) {
                    sb.append(rV);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    private boolean KS() {
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

    private int jU() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static KS zp() {
        return zp.zp;
    }

    public List<com.bytedance.sdk.openadsdk.lMd.zp> lMd(List<com.bytedance.sdk.openadsdk.lMd.zp> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.lMd.zp zpVar : list) {
            try {
                JSONObject KS = zpVar.KS();
                KS.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.lMd.zp(zpVar.zp, KS));
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("AdLogParamsGenerate", e4.getMessage());
            }
        }
        return arrayList;
    }

    private KS() {
        this.jU = KS();
        this.KS = KVG.zp().getApplicationContext();
        this.COT = COT();
    }

    public String zp(List<com.bytedance.sdk.openadsdk.lMd.zp> list) {
        String str;
        if (list.size() > 0 && list.get(0) != null && list.get(0).KS() != null) {
            str = list.get(0).KS().optString("app_log_url");
        } else {
            str = "";
        }
        return YhE.COT(str);
    }

    private void zp(com.bytedance.sdk.openadsdk.lMd.zp zpVar, boolean z8) {
        if (zpVar == null) {
            return;
        }
        try {
            String optString = z8 ? zpVar.KS().optJSONObject("params").optString("log_extra", "") : zpVar.KS().optString("log_extra", "");
            long zp2 = woN.zp(optString);
            int jU = woN.jU(optString);
            if (zp2 == 0) {
                zp2 = this.zp;
            }
            this.zp = zp2;
            if (jU == 0) {
                jU = this.lMd;
            }
            this.lMd = jU;
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("AdLogParamsGenerate", "getInfoFromLogExtra exception", e4.getMessage());
        }
    }

    @SuppressLint({"HardwareIds"})
    @JProtect
    public JSONObject lMd() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ua", YhE.KS());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", YhE.QR());
            jSONObject.put("sim_op", zp(this.KS));
            jSONObject.put("root", this.jU ? 1 : 0);
            jSONObject.put("timezone", jU());
            jSONObject.put("access", cz.zp(this.KS));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.COT);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", WNy.jU(this.KS) + "x" + WNy.KS(this.KS));
            jSONObject.put("display_density", zp(WNy.QR(this.KS)));
            jSONObject.put("density_dpi", WNy.QR(this.KS));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", com.bytedance.sdk.openadsdk.core.Bj.zp(this.KS));
            jSONObject.put("rom", HWF());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.lMd);
            jSONObject.put("uid", this.zp);
            jSONObject.put("google_aid", com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd());
            jSONObject.put("locale_language", DeviceUtils.jU());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.COT() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.lMd() ? 1 : 0);
            com.bytedance.sdk.openadsdk.core.settings.COT jU = KVG.jU();
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.cz.zp(this.KS, "tt_choose_language"));
            if (jU.irS("mnc")) {
                jSONObject.put("mnc", ox.KS());
            }
            if (jU.irS("mcc")) {
                jSONObject.put("mcc", ox.lMd());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public JSONObject zp(List<com.bytedance.sdk.openadsdk.lMd.zp> list, long j7, JSONObject jSONObject, boolean z8) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            zp(list.get(0), z8);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.lMd.zp> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().zp(z8));
            }
            if (z8) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j7);
            jSONObject2.put("local_time", j7 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.lMd.zp> zp(List<com.bytedance.sdk.openadsdk.lMd.zp> list, boolean z8) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.lMd.zp zpVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject KS = zpVar.KS();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, KS.optString("label"));
                long optLong = KS.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(optLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.lMd.HWF.KS.format(new Date(optLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = KS.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, KS.opt(next));
                    }
                }
                if (z8) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.lMd.HWF(zpVar.zp, jSONObject));
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("AdLogParamsGenerate", e4.getMessage());
            }
        }
        return arrayList;
    }

    private String zp(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String zp(int i9) {
        if (i9 == 120) {
            return "ldpi";
        }
        if (i9 == 160) {
            return "mdpi";
        }
        if (i9 == 240) {
            return "hdpi";
        }
        if (i9 == 320) {
            return "xhdpi";
        }
        if (i9 == 480) {
            return "xxhdpi";
        }
        if (i9 != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }
}
