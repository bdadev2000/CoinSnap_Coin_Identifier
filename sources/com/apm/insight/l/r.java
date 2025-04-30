package com.apm.insight.l;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static int f5940a;

    public static int a(Object obj, int i9) {
        if (obj == null) {
            return i9;
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
        return i9;
    }

    public static int b(int i9) {
        if (i9 == 0) {
            return 4;
        }
        if (i9 == 1) {
            return 8;
        }
        if (i9 == 2) {
            return 16;
        }
        if (i9 == 3) {
            return 32;
        }
        if (i9 != 4) {
            return i9 != 5 ? 0 : 128;
        }
        return 64;
    }

    public static Float a(Map<? super String, Float> map) {
        float f9 = 0.0f;
        for (Float f10 : map.values()) {
            if (f10 != null) {
                f9 = f10.floatValue() + f9;
            }
        }
        return Float.valueOf(f9);
    }

    public static Long a(Map<? super String, Long> map, String str, Long l) {
        if (str == null || map == null) {
            return -1L;
        }
        Long l2 = map.get(str);
        if (l2 != null) {
            l = Long.valueOf(l.longValue() + l2.longValue());
        }
        map.put(str, l);
        return l;
    }

    public static void a(JSONObject jSONObject) {
    }

    public static boolean a(int i9) {
        return false;
    }
}
