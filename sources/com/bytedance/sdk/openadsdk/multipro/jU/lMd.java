package com.bytedance.sdk.openadsdk.multipro.jU;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.lMd;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.ku;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class lMd {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> zp;

    public static Map<String, ?> KS(Context context, String str) {
        SharedPreferences zp2 = zp(context, str);
        if (zp2 == null) {
            return null;
        }
        return zp2.getAll();
    }

    private static void lMd(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = zp;
        if (softReference == null || softReference.get() == null || (map = zp.get().get(zp(str))) == null) {
            return;
        }
        map.clear();
    }

    @Nullable
    public static SharedPreferences zp(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(zp(str), 0);
        } catch (Throwable th) {
            tG.zp("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    private static String zp(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object lMd(Context context, String str, String str2, String str3) {
        String zp2 = zp(str);
        if (!zp(context, zp2, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return zp.zp(context, zp2, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(zp.zp(context, zp2, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(zp.zp(context, zp2, str2, 0));
        }
        if (str3.equalsIgnoreCase(Constants.LONG)) {
            return Long.valueOf(zp.zp(context, zp2, str2, 0L));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(zp.zp(context, zp2, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return zp.zp(context, zp2, str2, (String) null);
        }
        return null;
    }

    private static Object zp(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = zp;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(zp(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void zp(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = zp;
        if (softReference == null || softReference.get() == null) {
            zp = new SoftReference<>(new ConcurrentHashMap());
        }
        String zp2 = zp(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = zp.get();
        if (concurrentHashMap.get(zp2) == null) {
            concurrentHashMap.put(zp2, new HashMap());
        }
        concurrentHashMap.get(zp2).put(str2, obj);
    }

    public static synchronized <T> void zp(Context context, String str, String str2, T t9) {
        synchronized (lMd.class) {
            String zp2 = zp.zp(str, str2);
            if (ku.COT(zp2)) {
                com.bytedance.sdk.component.lMd zp3 = com.bytedance.sdk.component.lMd.zp(context, zp2);
                if (t9.equals(zp(zp2, str2))) {
                    return;
                }
                lMd.KS lMd = zp3.lMd();
                zp(lMd, str2, (Object) t9);
                lMd.apply();
                zp(zp2, str2, t9);
                return;
            }
            SharedPreferences zp4 = zp(context, zp2);
            if (zp4 == null) {
                return;
            }
            if (t9.equals(zp(zp2, str2))) {
                return;
            }
            SharedPreferences.Editor edit = zp4.edit();
            zp(edit, str2, t9);
            edit.apply();
            zp(zp2, str2, t9);
        }
    }

    public static void lMd(Context context, String str, String str2) {
        try {
            String zp2 = zp.zp(str, str2);
            if (ku.COT(zp2)) {
                com.bytedance.sdk.component.lMd.zp(context, zp2).lMd().remove(str2).apply();
                return;
            }
            SharedPreferences zp3 = zp(context, zp2);
            if (zp3 == null) {
                return;
            }
            SharedPreferences.Editor edit = zp3.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = zp;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = zp.get().get(zp(zp2));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void lMd(Context context, String str) {
        if (ku.COT(str)) {
            com.bytedance.sdk.component.lMd.zp(context, str).lMd().clear().apply();
            lMd(str);
            return;
        }
        SharedPreferences zp2 = zp(context, str);
        if (zp2 == null) {
            return;
        }
        SharedPreferences.Editor edit = zp2.edit();
        edit.clear();
        edit.apply();
        lMd(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void zp(SharedPreferences.Editor editor, String str, T t9) {
        if (t9 instanceof Integer) {
            editor.putInt(str, ((Integer) t9).intValue());
        }
        if (t9 instanceof Long) {
            editor.putLong(str, ((Long) t9).longValue());
        }
        if (t9 instanceof Float) {
            editor.putFloat(str, ((Float) t9).floatValue());
        }
        if (t9 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t9).booleanValue());
        }
        if (t9 instanceof String) {
            editor.putString(str, (String) t9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void zp(lMd.KS ks, String str, T t9) {
        if (t9 instanceof Integer) {
            ks.putInt(str, ((Integer) t9).intValue());
        }
        if (t9 instanceof Long) {
            ks.putLong(str, ((Long) t9).longValue());
        }
        if (t9 instanceof Float) {
            ks.putFloat(str, ((Float) t9).floatValue());
        }
        if (t9 instanceof Boolean) {
            ks.putBoolean(str, ((Boolean) t9).booleanValue());
        }
        if (t9 instanceof String) {
            ks.putString(str, (String) t9);
        }
    }

    public static String zp(Context context, String str, String str2, String str3) {
        Object zp2 = zp(str, str2);
        if (zp2 != null) {
            return String.valueOf(zp2);
        }
        Object lMd = lMd(context, str, str2, str3);
        zp(str, str2, lMd);
        return String.valueOf(lMd);
    }

    public static boolean zp(Context context, String str, String str2) {
        String zp2 = zp.zp(str, str2);
        if (ku.COT(zp2)) {
            return com.bytedance.sdk.component.lMd.zp(context, zp2).zp(str2);
        }
        SharedPreferences zp3 = zp(context, zp2);
        return zp3 != null && zp3.contains(str2);
    }
}
