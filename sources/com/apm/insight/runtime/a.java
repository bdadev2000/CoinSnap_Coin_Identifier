package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static ConcurrentLinkedQueue<Object> a = new ConcurrentLinkedQueue<>();

    public static int a(int i10, String... strArr) {
        return com.apm.insight.l.k.a(a(), i10, strArr);
    }

    public static boolean b() {
        return o.e();
    }

    @Nullable
    public static JSONArray c() {
        return com.apm.insight.l.k.a(a(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    public static boolean d() {
        return a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    public static boolean e() {
        return a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1;
    }

    public static boolean f() {
        return a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    public static boolean g() {
        return a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    public static boolean h() {
        return a("custom_event_settings", "npth_simple_setting", "force_apm_crash") == 1;
    }

    public static boolean i() {
        return a("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1;
    }

    public static boolean j() {
        return a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }

    public static int a(String... strArr) {
        return com.apm.insight.l.k.a(a(), -1, strArr);
    }

    public static boolean b(String str) {
        if (!e.b(str)) {
            com.apm.insight.k.a.b();
        }
        return e.h(str);
    }

    public static boolean c(String str) {
        if (!e.b(str)) {
            com.apm.insight.k.a.b();
        }
        return e.g(str);
    }

    @Nullable
    public static String a(@Nullable JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return optJSONObject.optString("npth");
    }

    @Nullable
    public static JSONObject a() {
        return e.c(com.apm.insight.i.a().e());
    }

    @Nullable
    public static JSONObject a(JSONArray jSONArray, String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10).optJSONObject(str);
                if (optJSONObject != null) {
                    return optJSONObject;
                }
            }
        }
        return null;
    }

    public static void a(JSONArray jSONArray, boolean z10) {
        if (jSONArray == null) {
            return;
        }
        com.apm.insight.l.p.a("apmconfig", "fromnet " + z10 + " : " + jSONArray);
        if (z10) {
            com.apm.insight.k.k.f();
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                String next = optJSONObject.keys().next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                com.apm.insight.l.p.a((Object) ("update config " + next + " : " + optJSONObject2));
                e.a(next, optJSONObject2);
                if (z10) {
                    com.apm.insight.k.k.a(next);
                }
            } catch (Throwable unused) {
            }
        }
        n.a(a(jSONArray, String.valueOf(com.apm.insight.i.a().e())));
        if (z10) {
            com.apm.insight.k.k.a(false, jSONArray);
        }
    }

    public static boolean a(Object obj) {
        String b3 = com.apm.insight.entity.b.b(obj);
        if (b3 != null) {
            return e.b(b3);
        }
        return false;
    }

    public static boolean a(Object obj, String str) {
        e d10;
        String b3 = com.apm.insight.entity.b.b(obj);
        if (b3 == null || (d10 = e.d(b3)) == null) {
            return false;
        }
        return d10.a(str);
    }

    public static boolean a(String str) {
        if (!e.b(str)) {
            com.apm.insight.k.a.b();
        }
        return e.f(str);
    }
}
