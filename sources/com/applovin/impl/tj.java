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

/* loaded from: classes2.dex */
public class tj {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f27166a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f27167b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f27168c;
    private final Map d = new HashMap();
    private final Object e = new Object();

    public tj(com.applovin.impl.sdk.j jVar) {
        this.f27166a = jVar;
        Context l2 = com.applovin.impl.sdk.j.l();
        this.f27167b = l2;
        this.f27168c = l2.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(sj.class.getName());
            Class.forName(ve.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public void a() {
        synchronized (this.e) {
            this.d.clear();
        }
        this.f27166a.a(this.f27168c);
    }

    public List b(sj sjVar) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(sjVar).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(sj sjVar) {
        return CollectionUtils.explode((String) a(sjVar));
    }

    public void d() {
        String b2 = b();
        synchronized (this.e) {
            try {
                for (sj sjVar : sj.c()) {
                    try {
                        Object a2 = this.f27166a.a(b2 + sjVar.b(), null, sjVar.a().getClass(), this.f27168c);
                        if (a2 != null) {
                            this.d.put(sjVar.b(), a2);
                        }
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.n.c("SettingsManager", "Unable to load \"" + sjVar.b() + "\"", th);
                        this.f27166a.E().a("SettingsManager", "initSettings", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        String b2 = b();
        synchronized (this.e) {
            try {
                SharedPreferences.Editor edit = this.f27168c.edit();
                for (sj sjVar : sj.c()) {
                    Object obj = this.d.get(sjVar.b());
                    if (obj != null) {
                        this.f27166a.a(b2 + sjVar.b(), obj, edit);
                    }
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        return this.f27166a.g0().isVerboseLoggingEnabled() || ((Boolean) a(sj.f26932l)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + yp.d(this.f27166a.b0()) + ".";
    }

    public Object a(sj sjVar) {
        if (sjVar != null) {
            synchronized (this.e) {
                try {
                    Object obj = this.d.get(sjVar.b());
                    if (obj == null) {
                        return sjVar.a();
                    }
                    return sjVar.a(obj);
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
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
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
        synchronized (this.e) {
            try {
                boolean booleanValue = JsonUtils.getBoolean(jSONObject, sj.B.b(), Boolean.FALSE).booleanValue();
                HashMap hashMap = booleanValue ? new HashMap() : null;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            sj a2 = a(next, (sj) null);
                            if (a2 != null) {
                                Object a3 = booleanValue ? a(a2) : null;
                                Object a4 = a(next, jSONObject, a2.a());
                                this.d.put(a2.b(), a4);
                                if (a2 == sj.J5) {
                                    this.d.put(sj.K5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (booleanValue && !a4.equals(a3)) {
                                    hashMap.put(a2, a3);
                                }
                            }
                        } catch (JSONException e) {
                            com.applovin.impl.sdk.n.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                            this.f27166a.E().a("SettingsManager", "loadSettingsException", e);
                        } catch (Throwable th) {
                            com.applovin.impl.sdk.n.c("SettingsManager", "Unable to convert setting object ", th);
                            this.f27166a.E().a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    }
                }
                if (booleanValue && hashMap.size() > 0) {
                    qc qcVar = new qc();
                    qcVar.a("========== UPDATED SETTINGS ==========");
                    for (sj sjVar : hashMap.keySet()) {
                        qcVar.a(sjVar.b(), a(sjVar) + " (" + hashMap.get(sjVar) + ")");
                    }
                    qcVar.a("========== END ==========");
                    this.f27166a.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f27166a.J().a("SettingsManager", qcVar.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public sj a(String str, sj sjVar) {
        synchronized (this.e) {
            try {
                for (sj sjVar2 : sj.c()) {
                    if (sjVar2.b().equals(str)) {
                        return sjVar2;
                    }
                }
                return sjVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(sj sjVar, Object obj) {
        if (sjVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.e) {
                this.d.put(sjVar.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }
}
