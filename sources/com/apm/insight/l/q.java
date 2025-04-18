package com.apm.insight.l;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q {
    private static int a;

    public static int a(Object obj, int i10) {
        if (obj == null) {
            return i10;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt(String.valueOf(obj));
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 8;
        }
        if (i10 == 2) {
            return 16;
        }
        if (i10 == 3) {
            return 32;
        }
        if (i10 != 4) {
            return i10 != 5 ? 0 : 128;
        }
        return 64;
    }

    public static Float a(Map<? super String, Float> map) {
        float f10 = 0.0f;
        for (Float f11 : map.values()) {
            if (f11 != null) {
                f10 = f11.floatValue() + f10;
            }
        }
        return Float.valueOf(f10);
    }

    public static Long a(Map<? super String, Long> map, String str, Long l10) {
        if (str == null || map == null) {
            return -1L;
        }
        Long l11 = map.get(str);
        if (l11 != null) {
            l10 = Long.valueOf(l10.longValue() + l11.longValue());
        }
        map.put(str, l10);
        return l10;
    }

    public static void a(JSONObject jSONObject) {
    }

    public static boolean a(int i10) {
        return false;
    }
}
