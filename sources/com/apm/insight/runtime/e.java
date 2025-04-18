package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private static HashMap<String, e> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f3321b = null;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f3322c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3323d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f3324e;

    public e(JSONObject jSONObject, String str) {
        this.f3324e = str;
        a(jSONObject);
        a.put(this.f3324e, this);
        com.apm.insight.l.p.a((Object) ("after update aid " + str));
    }

    @Nullable
    public static JSONObject c(String str) {
        e eVar = a.get(str);
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static e d(String str) {
        return a.get(str);
    }

    public static long e(String str) {
        e eVar = a.get(str);
        if (eVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.l.k.b(eVar.a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean f(String str) {
        e eVar = a.get(str);
        return eVar != null && eVar.b();
    }

    public static boolean g(String str) {
        e eVar = a.get(str);
        return eVar != null && eVar.c();
    }

    public static boolean h(String str) {
        e eVar = a.get(str);
        return eVar != null && eVar.d();
    }

    @Nullable
    public JSONObject a() {
        return this.f3321b;
    }

    public boolean b() {
        JSONObject jSONObject = this.f3321b;
        return jSONObject != null && 1 == com.apm.insight.l.k.a(jSONObject, 0, "crash_module", "switcher");
    }

    public static void a(String str, JSONObject jSONObject) {
        e eVar = a.get(str);
        if (eVar != null) {
            eVar.a(jSONObject);
        } else {
            new e(jSONObject, str);
        }
    }

    public static boolean b(String str) {
        return a.get(str) != null;
    }

    public boolean c() {
        JSONObject jSONObject = this.f3321b;
        return jSONObject != null && 1 == com.apm.insight.l.k.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean d() {
        JSONObject jSONObject = this.f3321b;
        return jSONObject != null && 1 == com.apm.insight.l.k.a(jSONObject, 0, "crash_module", "switcher");
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f3321b = jSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f3323d = optJSONObject.optInt("switcher") == 1 && optJSONObject.optInt("err_sampling_rate") == 1;
    }

    public boolean a(String str) {
        if (this.f3321b == null) {
            return false;
        }
        return this.f3323d;
    }
}
