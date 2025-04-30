package com.bytedance.sdk.openadsdk.multipro.jU;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.HWF;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.ku;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashSet;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp {
    public static HashSet<String> zp = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.jU.zp.1
        {
            add("did");
            add(MBridgeConstans.APP_ID);
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add("gaid");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static Context KS() {
        return KVG.zp();
    }

    private static String jU() {
        return AbstractC2914a.h(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.jU.lMd, "/t_sp/");
    }

    private static HWF lMd() {
        try {
            if (zp()) {
                return com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(KVG.zp());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zp() {
        if (KVG.zp() != null) {
            return true;
        }
        tG.lMd("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static String lMd(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static synchronized void zp(String str, String str2, Boolean bool) {
        synchronized (zp.class) {
            if (zp()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        lMd.zp(KS(), str, str2, bool);
                        return;
                    }
                    HWF lMd = lMd();
                    if (lMd != null) {
                        Uri parse = Uri.parse(jU() + "boolean/" + str2 + lMd(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool);
                        lMd.zp(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String lMd(String str, String str2, String str3) {
        if (!zp()) {
            return str3;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp(KS(), str, str2, str3);
        }
        HWF lMd = lMd();
        if (lMd != null) {
            String zp2 = lMd.zp(Uri.parse(jU() + "string/" + str2 + lMd(str)));
            if (zp2 != null && !zp2.equals("null")) {
                return zp2;
            }
        }
        return str3;
    }

    public static void lMd(String str, String str2) {
        if (zp()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                    lMd.lMd(KS(), str, str2);
                    return;
                }
                HWF lMd = lMd();
                if (lMd != null) {
                    lMd.zp(Uri.parse(jU() + "long/" + str2 + lMd(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void zp(String str, String str2, String str3) {
        synchronized (zp.class) {
            if (zp()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        lMd.zp(KS(), str, str2, str3);
                        return;
                    }
                    HWF lMd = lMd();
                    if (lMd != null) {
                        Uri parse = Uri.parse(jU() + "string/" + str2 + lMd(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str3);
                        lMd.zp(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void zp(String str, String str2, Integer num) {
        synchronized (zp.class) {
            if (zp()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        lMd.zp(KS(), str, str2, num);
                        return;
                    }
                    HWF lMd = lMd();
                    if (lMd != null) {
                        Uri parse = Uri.parse(jU() + "int/" + str2 + lMd(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, num);
                        lMd.zp(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void zp(String str, String str2, Long l) {
        synchronized (zp.class) {
            if (zp()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        lMd.zp(KS(), str, str2, l);
                        return;
                    }
                    HWF lMd = lMd();
                    if (lMd != null) {
                        Uri parse = Uri.parse(jU() + "long/" + str2 + lMd(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, l);
                        lMd.zp(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void zp(String str, String str2, Float f9) {
        synchronized (zp.class) {
            if (zp()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        lMd.zp(KS(), str, str2, f9);
                        return;
                    }
                    HWF lMd = lMd();
                    if (lMd != null) {
                        Uri parse = Uri.parse(jU() + "float/" + str2 + lMd(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, f9);
                        lMd.zp(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String zp(Context context, String str, String str2, String str3) {
        String zp2 = zp(str, str2);
        if (ku.COT(zp2)) {
            return com.bytedance.sdk.component.lMd.zp(context, zp2).zp(str2, str3);
        }
        SharedPreferences zp3 = lMd.zp(context, zp2);
        return zp3 == null ? str3 : zp3.getString(str2, str3);
    }

    public static String zp(String str, String str2) {
        return zp.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int zp(String str, String str2, int i9) {
        if (!zp()) {
            return i9;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp(KS(), str, str2, i9);
        }
        HWF lMd = lMd();
        if (lMd != null) {
            String zp2 = lMd.zp(Uri.parse(jU() + "int/" + str2 + lMd(str)));
            if (zp2 != null && !zp2.equals("null")) {
                return Integer.parseInt(zp2);
            }
        }
        return i9;
    }

    public static int zp(Context context, String str, String str2, int i9) {
        String zp2 = zp(str, str2);
        if (ku.COT(zp2)) {
            return com.bytedance.sdk.component.lMd.zp(context, zp2).zp(str2, i9);
        }
        SharedPreferences zp3 = lMd.zp(context, zp2);
        return zp3 == null ? i9 : zp3.getInt(str2, i9);
    }

    public static float zp(Context context, String str, String str2, float f9) {
        String zp2 = zp(str, str2);
        if (ku.COT(zp2)) {
            return com.bytedance.sdk.component.lMd.zp(context, zp2).zp(str2, f9);
        }
        SharedPreferences zp3 = lMd.zp(context, zp2);
        return zp3 == null ? f9 : zp3.getFloat(str2, f9);
    }

    public static boolean zp(String str, String str2, boolean z8) {
        if (!zp()) {
            return z8;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp(KS(), str, str2, z8);
        }
        HWF lMd = lMd();
        if (lMd != null) {
            String zp2 = lMd.zp(Uri.parse(jU() + "boolean/" + str2 + lMd(str)));
            if (zp2 != null && !zp2.equals("null")) {
                return Boolean.parseBoolean(zp2);
            }
        }
        return z8;
    }

    public static boolean zp(Context context, String str, String str2, boolean z8) {
        String zp2 = zp(str, str2);
        if (ku.COT(zp2)) {
            return com.bytedance.sdk.component.lMd.zp(context, zp2).zp(str2, z8);
        }
        SharedPreferences zp3 = lMd.zp(context, zp2);
        return zp3 == null ? z8 : zp3.getBoolean(str2, z8);
    }

    public static long zp(String str, String str2, long j7) {
        if (!zp()) {
            return j7;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp(KS(), str, str2, j7);
        }
        HWF lMd = lMd();
        if (lMd != null) {
            String zp2 = lMd.zp(Uri.parse(jU() + "long/" + str2 + lMd(str)));
            if (zp2 != null && !zp2.equals("null")) {
                return Long.parseLong(zp2);
            }
        }
        return j7;
    }

    public static long zp(Context context, String str, String str2, long j7) {
        String zp2 = zp(str, str2);
        if (ku.COT(zp2)) {
            return com.bytedance.sdk.component.lMd.zp(context, zp2).zp(str2, j7);
        }
        SharedPreferences zp3 = lMd.zp(context, zp2);
        return zp3 == null ? j7 : zp3.getLong(str2, j7);
    }

    public static void zp(String str) {
        if (zp()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                    lMd.lMd(KS(), str);
                    return;
                }
                HWF lMd = lMd();
                if (lMd != null) {
                    lMd.zp(Uri.parse(jU() + "clean" + lMd(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
