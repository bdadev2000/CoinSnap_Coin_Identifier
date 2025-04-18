package com.bytedance.sdk.openadsdk.multipro.AlY;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.Sg;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.NjR;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Sg {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> YFl;

    private static void Sg(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = YFl;
        if (softReference == null || softReference.get() == null || (map = YFl.get().get(YFl(str))) == null) {
            return;
        }
        map.clear();
    }

    @Nullable
    public static SharedPreferences YFl(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(YFl(str), 0);
        } catch (Throwable th2) {
            YoT.YFl("SPMultiHelperImpl", "getSharedPreferences error ", th2.getMessage());
            return null;
        }
    }

    public static Map<String, ?> tN(Context context, String str) {
        SharedPreferences YFl2 = YFl(context, str);
        if (YFl2 == null) {
            return null;
        }
        return YFl2.getAll();
    }

    private static String YFl(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object Sg(Context context, String str, String str2, String str3) {
        String YFl2 = YFl(str);
        if (!YFl(context, YFl2, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return YFl.YFl(context, YFl2, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(YFl.YFl(context, YFl2, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(YFl.YFl(context, YFl2, str2, 0));
        }
        if (str3.equalsIgnoreCase(Constants.LONG)) {
            return Long.valueOf(YFl.YFl(context, YFl2, str2, 0L));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(YFl.YFl(context, YFl2, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return YFl.YFl(context, YFl2, str2, (String) null);
        }
        return null;
    }

    private static Object YFl(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = YFl;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(YFl(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void YFl(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = YFl;
        if (softReference == null || softReference.get() == null) {
            YFl = new SoftReference<>(new ConcurrentHashMap());
        }
        String YFl2 = YFl(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = YFl.get();
        if (concurrentHashMap.get(YFl2) == null) {
            concurrentHashMap.put(YFl2, new HashMap());
        }
        concurrentHashMap.get(YFl2).put(str2, obj);
    }

    public static synchronized <T> void YFl(Context context, String str, String str2, T t5) {
        synchronized (Sg.class) {
            String YFl2 = YFl.YFl(str, str2);
            if (NjR.DSW(YFl2)) {
                com.bytedance.sdk.component.Sg YFl3 = com.bytedance.sdk.component.Sg.YFl(context, YFl2);
                if (t5.equals(YFl(YFl2, str2))) {
                    return;
                }
                Sg.tN Sg = YFl3.Sg();
                YFl(Sg, str2, (Object) t5);
                Sg.apply();
                YFl(YFl2, str2, t5);
                return;
            }
            SharedPreferences YFl4 = YFl(context, YFl2);
            if (YFl4 == null) {
                return;
            }
            if (t5.equals(YFl(YFl2, str2))) {
                return;
            }
            SharedPreferences.Editor edit = YFl4.edit();
            YFl(edit, str2, t5);
            edit.apply();
            YFl(YFl2, str2, t5);
        }
    }

    public static void Sg(Context context, String str, String str2) {
        try {
            String YFl2 = YFl.YFl(str, str2);
            if (NjR.DSW(YFl2)) {
                com.bytedance.sdk.component.Sg.YFl(context, YFl2).Sg().remove(str2).apply();
                return;
            }
            SharedPreferences YFl3 = YFl(context, YFl2);
            if (YFl3 == null) {
                return;
            }
            SharedPreferences.Editor edit = YFl3.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = YFl;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = YFl.get().get(YFl(YFl2));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void Sg(Context context, String str) {
        if (NjR.DSW(str)) {
            com.bytedance.sdk.component.Sg.YFl(context, str).Sg().clear().apply();
            Sg(str);
            return;
        }
        SharedPreferences YFl2 = YFl(context, str);
        if (YFl2 == null) {
            return;
        }
        SharedPreferences.Editor edit = YFl2.edit();
        edit.clear();
        edit.apply();
        Sg(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void YFl(SharedPreferences.Editor editor, String str, T t5) {
        if (t5 instanceof Integer) {
            editor.putInt(str, ((Integer) t5).intValue());
        }
        if (t5 instanceof Long) {
            editor.putLong(str, ((Long) t5).longValue());
        }
        if (t5 instanceof Float) {
            editor.putFloat(str, ((Float) t5).floatValue());
        }
        if (t5 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t5).booleanValue());
        }
        if (t5 instanceof String) {
            editor.putString(str, (String) t5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void YFl(Sg.tN tNVar, String str, T t5) {
        if (t5 instanceof Integer) {
            tNVar.putInt(str, ((Integer) t5).intValue());
        }
        if (t5 instanceof Long) {
            tNVar.putLong(str, ((Long) t5).longValue());
        }
        if (t5 instanceof Float) {
            tNVar.putFloat(str, ((Float) t5).floatValue());
        }
        if (t5 instanceof Boolean) {
            tNVar.putBoolean(str, ((Boolean) t5).booleanValue());
        }
        if (t5 instanceof String) {
            tNVar.putString(str, (String) t5);
        }
    }

    public static String YFl(Context context, String str, String str2, String str3) {
        Object YFl2 = YFl(str, str2);
        if (YFl2 != null) {
            return String.valueOf(YFl2);
        }
        Object Sg = Sg(context, str, str2, str3);
        YFl(str, str2, Sg);
        return String.valueOf(Sg);
    }

    public static boolean YFl(Context context, String str, String str2) {
        String YFl2 = YFl.YFl(str, str2);
        if (NjR.DSW(YFl2)) {
            return com.bytedance.sdk.component.Sg.YFl(context, YFl2).YFl(str2);
        }
        SharedPreferences YFl3 = YFl(context, YFl2);
        return YFl3 != null && YFl3.contains(str2);
    }
}
