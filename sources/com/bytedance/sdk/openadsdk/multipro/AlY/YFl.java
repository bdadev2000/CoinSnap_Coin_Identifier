package com.bytedance.sdk.openadsdk.multipro.AlY;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.vc.YFl.vc;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import vd.e;

/* loaded from: classes.dex */
public class YFl {
    public static HashSet<String> YFl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.AlY.YFl.1
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

    private static String AlY() {
        return e.h(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.AlY.Sg, "/t_sp/");
    }

    private static vc Sg() {
        try {
            if (YFl()) {
                return com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(lG.YFl());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean YFl() {
        if (lG.YFl() != null) {
            return true;
        }
        YoT.Sg("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static Context tN() {
        return lG.YFl();
    }

    private static String Sg(String str) {
        return TextUtils.isEmpty(str) ? "" : "?sp_file_name=".concat(String.valueOf(str));
    }

    public static synchronized void YFl(String str, String str2, Boolean bool) {
        synchronized (YFl.class) {
            if (YFl()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        Sg.YFl(tN(), str, str2, bool);
                        return;
                    }
                    vc Sg = Sg();
                    if (Sg != null) {
                        Uri parse = Uri.parse(AlY() + "boolean/" + str2 + Sg(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool);
                        Sg.YFl(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String Sg(String str, String str2, String str3) {
        if (!YFl()) {
            return str3;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl(tN(), str, str2, str3);
        }
        vc Sg = Sg();
        if (Sg != null) {
            String YFl2 = Sg.YFl(Uri.parse(AlY() + "string/" + str2 + Sg(str)));
            if (YFl2 != null && !YFl2.equals(AbstractJsonLexerKt.NULL)) {
                return YFl2;
            }
        }
        return str3;
    }

    public static void Sg(String str, String str2) {
        if (YFl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                    Sg.Sg(tN(), str, str2);
                    return;
                }
                vc Sg = Sg();
                if (Sg != null) {
                    Sg.YFl(Uri.parse(AlY() + "long/" + str2 + Sg(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void YFl(String str, String str2, String str3) {
        synchronized (YFl.class) {
            if (YFl()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        Sg.YFl(tN(), str, str2, str3);
                        return;
                    }
                    vc Sg = Sg();
                    if (Sg != null) {
                        Uri parse = Uri.parse(AlY() + "string/" + str2 + Sg(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str3);
                        Sg.YFl(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void YFl(String str, String str2, Integer num) {
        synchronized (YFl.class) {
            if (YFl()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        Sg.YFl(tN(), str, str2, num);
                        return;
                    }
                    vc Sg = Sg();
                    if (Sg != null) {
                        Uri parse = Uri.parse(AlY() + "int/" + str2 + Sg(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, num);
                        Sg.YFl(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void YFl(String str, String str2, Long l10) {
        synchronized (YFl.class) {
            if (YFl()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        Sg.YFl(tN(), str, str2, l10);
                        return;
                    }
                    vc Sg = Sg();
                    if (Sg != null) {
                        Uri parse = Uri.parse(AlY() + "long/" + str2 + Sg(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, l10);
                        Sg.YFl(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void YFl(String str, String str2, Float f10) {
        synchronized (YFl.class) {
            if (YFl()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        Sg.YFl(tN(), str, str2, f10);
                        return;
                    }
                    vc Sg = Sg();
                    if (Sg != null) {
                        Uri parse = Uri.parse(AlY() + "float/" + str2 + Sg(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, f10);
                        Sg.YFl(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String YFl(Context context, String str, String str2, String str3) {
        String YFl2 = YFl(str, str2);
        if (NjR.DSW(YFl2)) {
            return com.bytedance.sdk.component.Sg.YFl(context, YFl2).YFl(str2, str3);
        }
        SharedPreferences YFl3 = Sg.YFl(context, YFl2);
        return YFl3 == null ? str3 : YFl3.getString(str2, str3);
    }

    public static String YFl(String str, String str2) {
        return YFl.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int YFl(String str, String str2, int i10) {
        if (!YFl()) {
            return i10;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl(tN(), str, str2, i10);
        }
        vc Sg = Sg();
        if (Sg != null) {
            String YFl2 = Sg.YFl(Uri.parse(AlY() + "int/" + str2 + Sg(str)));
            if (YFl2 != null && !YFl2.equals(AbstractJsonLexerKt.NULL)) {
                return Integer.parseInt(YFl2);
            }
        }
        return i10;
    }

    public static int YFl(Context context, String str, String str2, int i10) {
        String YFl2 = YFl(str, str2);
        if (NjR.DSW(YFl2)) {
            return com.bytedance.sdk.component.Sg.YFl(context, YFl2).YFl(str2, i10);
        }
        SharedPreferences YFl3 = Sg.YFl(context, YFl2);
        return YFl3 == null ? i10 : YFl3.getInt(str2, i10);
    }

    public static float YFl(Context context, String str, String str2, float f10) {
        String YFl2 = YFl(str, str2);
        if (NjR.DSW(YFl2)) {
            return com.bytedance.sdk.component.Sg.YFl(context, YFl2).YFl(str2, f10);
        }
        SharedPreferences YFl3 = Sg.YFl(context, YFl2);
        return YFl3 == null ? f10 : YFl3.getFloat(str2, f10);
    }

    public static boolean YFl(String str, String str2, boolean z10) {
        if (!YFl()) {
            return z10;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl(tN(), str, str2, z10);
        }
        vc Sg = Sg();
        if (Sg != null) {
            String YFl2 = Sg.YFl(Uri.parse(AlY() + "boolean/" + str2 + Sg(str)));
            if (YFl2 != null && !YFl2.equals(AbstractJsonLexerKt.NULL)) {
                return Boolean.parseBoolean(YFl2);
            }
        }
        return z10;
    }

    public static boolean YFl(Context context, String str, String str2, boolean z10) {
        String YFl2 = YFl(str, str2);
        if (NjR.DSW(YFl2)) {
            return com.bytedance.sdk.component.Sg.YFl(context, YFl2).YFl(str2, z10);
        }
        SharedPreferences YFl3 = Sg.YFl(context, YFl2);
        return YFl3 == null ? z10 : YFl3.getBoolean(str2, z10);
    }

    public static long YFl(String str, String str2, long j3) {
        if (!YFl()) {
            return j3;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl(tN(), str, str2, j3);
        }
        vc Sg = Sg();
        if (Sg != null) {
            String YFl2 = Sg.YFl(Uri.parse(AlY() + "long/" + str2 + Sg(str)));
            if (YFl2 != null && !YFl2.equals(AbstractJsonLexerKt.NULL)) {
                return Long.parseLong(YFl2);
            }
        }
        return j3;
    }

    public static long YFl(Context context, String str, String str2, long j3) {
        String YFl2 = YFl(str, str2);
        if (NjR.DSW(YFl2)) {
            return com.bytedance.sdk.component.Sg.YFl(context, YFl2).YFl(str2, j3);
        }
        SharedPreferences YFl3 = Sg.YFl(context, YFl2);
        return YFl3 == null ? j3 : YFl3.getLong(str2, j3);
    }

    public static void YFl(String str) {
        if (YFl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                    Sg.Sg(tN(), str);
                    return;
                }
                vc Sg = Sg();
                if (Sg != null) {
                    Sg.YFl(Uri.parse(AlY() + "clean" + Sg(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
