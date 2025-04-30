package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, e> f6029a = new HashMap<>();
    private JSONObject b = null;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f6030c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6031d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f6032e;

    public e(JSONObject jSONObject, String str) {
        this.f6032e = str;
        a(jSONObject);
        f6029a.put(this.f6032e, this);
        com.apm.insight.l.q.a((Object) ("after update aid " + str));
    }

    @Nullable
    public static JSONObject c(String str) {
        e eVar = f6029a.get(str);
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static e d(String str) {
        return f6029a.get(str);
    }

    public static long e(String str) {
        e eVar = f6029a.get(str);
        if (eVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.l.l.b(eVar.a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean f(String str) {
        e eVar = f6029a.get(str);
        return eVar != null && eVar.b();
    }

    public static boolean g(String str) {
        e eVar = f6029a.get(str);
        return eVar != null && eVar.c();
    }

    public static boolean h(String str) {
        e eVar = f6029a.get(str);
        return eVar != null && eVar.d();
    }

    @Nullable
    public JSONObject a() {
        return this.b;
    }

    public boolean b() {
        JSONObject jSONObject = this.b;
        return jSONObject != null && 1 == com.apm.insight.l.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public static void a(String str, JSONObject jSONObject) {
        e eVar = f6029a.get(str);
        if (eVar != null) {
            eVar.a(jSONObject);
        } else {
            new e(jSONObject, str);
        }
    }

    public static boolean b(String str) {
        return f6029a.get(str) != null;
    }

    public boolean c() {
        JSONObject jSONObject = this.b;
        return jSONObject != null && 1 == com.apm.insight.l.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean d() {
        JSONObject jSONObject = this.b;
        return jSONObject != null && 1 == com.apm.insight.l.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.b = jSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f6031d = optJSONObject.optInt("switcher") == 1 && optJSONObject.optInt("err_sampling_rate") == 1;
    }

    public boolean a(String str) {
        if (this.b == null) {
            return false;
        }
        return this.f6031d;
    }
}
