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

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f10050a;
    protected final Context b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f10051c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10052d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f10053e = new Object();

    public pj(com.applovin.impl.sdk.k kVar) {
        this.f10050a = kVar;
        Context k6 = com.applovin.impl.sdk.k.k();
        this.b = k6;
        this.f10051c = k6.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(oj.class.getName());
            Class.forName(qe.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public void a() {
        synchronized (this.f10053e) {
            this.f10052d.clear();
        }
        this.f10050a.a(this.f10051c);
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
        String b = b();
        synchronized (this.f10053e) {
            try {
                for (oj ojVar : oj.c()) {
                    try {
                        Object a6 = this.f10050a.a(b + ojVar.b(), null, ojVar.a().getClass(), this.f10051c);
                        if (a6 != null) {
                            this.f10052d.put(ojVar.b(), a6);
                        }
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.t.c("SettingsManager", "Unable to load \"" + ojVar.b() + "\"", th);
                        this.f10050a.B().a("SettingsManager", "initSettings", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        String b = b();
        synchronized (this.f10053e) {
            try {
                SharedPreferences.Editor edit = this.f10051c.edit();
                for (oj ojVar : oj.c()) {
                    Object obj = this.f10052d.get(ojVar.b());
                    if (obj != null) {
                        this.f10050a.a(b + ojVar.b(), obj, edit);
                    }
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        return this.f10050a.g0().isVerboseLoggingEnabled() || ((Boolean) a(oj.l)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + zp.e(this.f10050a.d0()) + ".";
    }

    public Object a(oj ojVar) {
        if (ojVar != null) {
            synchronized (this.f10053e) {
                try {
                    Object obj = this.f10052d.get(ojVar.b());
                    if (obj == null) {
                        return ojVar.a();
                    }
                    return ojVar.a(obj);
                } catch (Throwable th) {
                    throw th;
                }
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
        synchronized (this.f10053e) {
            try {
                boolean booleanValue = JsonUtils.getBoolean(jSONObject, oj.f9617K.b(), Boolean.FALSE).booleanValue();
                HashMap hashMap = booleanValue ? new HashMap() : null;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            oj a6 = a(next, (oj) null);
                            if (a6 != null) {
                                Object a9 = booleanValue ? a(a6) : null;
                                Object a10 = a(next, jSONObject, a6.a());
                                this.f10052d.put(a6.b(), a10);
                                if (a6 == oj.f9583E5) {
                                    this.f10052d.put(oj.F5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (booleanValue && !a10.equals(a9)) {
                                    hashMap.put(a6, a9);
                                }
                            }
                        } catch (JSONException e4) {
                            com.applovin.impl.sdk.t.c("SettingsManager", "Unable to parse JSON settingsValues array", e4);
                            this.f10050a.B().a("SettingsManager", "loadSettingsException", e4);
                        } catch (Throwable th) {
                            com.applovin.impl.sdk.t.c("SettingsManager", "Unable to convert setting object ", th);
                            this.f10050a.B().a("SettingsManager", "loadSettingsThrowable", th);
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
                    this.f10050a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f10050a.L().a("SettingsManager", lcVar.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public oj a(String str, oj ojVar) {
        synchronized (this.f10053e) {
            try {
                for (oj ojVar2 : oj.c()) {
                    if (ojVar2.b().equals(str)) {
                        return ojVar2;
                    }
                }
                return ojVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(oj ojVar, Object obj) {
        if (ojVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f10053e) {
                this.f10052d.put(ojVar.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }
}
