package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pj {
    protected final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f6985b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f6986c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f6987d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f6988e = new Object();

    public pj(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        Context k10 = com.applovin.impl.sdk.k.k();
        this.f6985b = k10;
        this.f6986c = k10.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(oj.class.getName());
            Class.forName(qe.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public void a() {
        synchronized (this.f6988e) {
            this.f6987d.clear();
        }
        this.a.a(this.f6986c);
    }

    public List b(oj ojVar) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(ojVar).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(oj ojVar) {
        return CollectionUtils.explode((String) a(ojVar));
    }

    public void d() {
        String b3 = b();
        synchronized (this.f6988e) {
            for (oj ojVar : oj.c()) {
                try {
                    Object a = this.a.a(b3 + ojVar.b(), null, ojVar.a().getClass(), this.f6986c);
                    if (a != null) {
                        this.f6987d.put(ojVar.b(), a);
                    }
                } catch (Throwable th2) {
                    com.applovin.impl.sdk.t.c("SettingsManager", "Unable to load \"" + ojVar.b() + "\"", th2);
                    this.a.B().a("SettingsManager", "initSettings", th2);
                }
            }
        }
    }

    public void e() {
        String b3 = b();
        synchronized (this.f6988e) {
            SharedPreferences.Editor edit = this.f6986c.edit();
            for (oj ojVar : oj.c()) {
                Object obj = this.f6987d.get(ojVar.b());
                if (obj != null) {
                    this.a.a(b3 + ojVar.b(), obj, edit);
                }
            }
            edit.apply();
        }
    }

    public boolean c() {
        return this.a.g0().isVerboseLoggingEnabled() || ((Boolean) a(oj.f6695l)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + zp.e(this.a.d0()) + ".";
    }

    public Object a(oj ojVar) {
        if (ojVar != null) {
            synchronized (this.f6988e) {
                Object obj = this.f6987d.get(ojVar.b());
                if (obj == null) {
                    return ojVar.a();
                }
                return ojVar.a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f6988e) {
            boolean booleanValue = JsonUtils.getBoolean(jSONObject, oj.K.b(), Boolean.FALSE).booleanValue();
            HashMap hashMap = booleanValue ? new HashMap() : null;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        try {
                            oj a = a(next, (oj) null);
                            if (a != null) {
                                Object a10 = booleanValue ? a(a) : null;
                                Object a11 = a(next, jSONObject, a.a());
                                this.f6987d.put(a.b(), a11);
                                if (a == oj.E5) {
                                    this.f6987d.put(oj.F5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (booleanValue && !a11.equals(a10)) {
                                    hashMap.put(a, a10);
                                }
                            }
                        } catch (JSONException e2) {
                            com.applovin.impl.sdk.t.c("SettingsManager", "Unable to parse JSON settingsValues array", e2);
                            this.a.B().a("SettingsManager", "loadSettingsException", e2);
                        }
                    } catch (Throwable th2) {
                        com.applovin.impl.sdk.t.c("SettingsManager", "Unable to convert setting object ", th2);
                        this.a.B().a("SettingsManager", "loadSettingsThrowable", th2);
                    }
                }
            }
            if (booleanValue && hashMap.size() > 0) {
                lc lcVar = new lc();
                lcVar.a("========== UPDATED SETTINGS ==========");
                for (oj ojVar : hashMap.keySet()) {
                    lcVar.a(ojVar.b(), a(ojVar) + " (" + hashMap.get(ojVar) + ")");
                }
                lcVar.a("========== END ==========");
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("SettingsManager", lcVar.toString());
                }
            }
        }
    }

    public oj a(String str, oj ojVar) {
        synchronized (this.f6988e) {
            for (oj ojVar2 : oj.c()) {
                if (ojVar2.b().equals(str)) {
                    return ojVar2;
                }
            }
            return ojVar;
        }
    }

    public void a(oj ojVar, Object obj) {
        if (ojVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f6988e) {
                this.f6987d.put(ojVar.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }
}
