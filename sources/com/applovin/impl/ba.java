package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ba {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final Map f3860b = new HashMap();

    public ba(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.a = kVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static /* synthetic */ void a(ba baVar) {
        baVar.d();
    }

    public /* synthetic */ void d() {
        try {
            this.a.b(qj.f7244z, c().toString());
        } catch (Throwable th2) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("GlobalStatsManager", "Unable to save stats", th2);
            }
        }
    }

    private void f() {
        this.a.l0().a(new nt(this, 7), sm.b.OTHER);
    }

    public void b() {
        synchronized (this.f3860b) {
            Iterator it = aa.a().iterator();
            while (it.hasNext()) {
                this.f3860b.remove(((aa) it.next()).b());
            }
            f();
        }
    }

    public JSONObject c() {
        JSONObject jSONObject;
        synchronized (this.f3860b) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f3860b.entrySet()) {
                JsonUtils.putLong(jSONObject, (String) entry.getKey(), ((Long) entry.getValue()).longValue());
            }
        }
        return jSONObject;
    }

    public void e() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.a.a(qj.f7244z, JsonUtils.EMPTY_JSON));
            synchronized (this.f3860b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f3860b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("GlobalStatsManager", "Unable to load stats", th2);
            }
        }
    }

    public void a() {
        synchronized (this.f3860b) {
            this.f3860b.clear();
        }
        f();
    }

    public void a(aa aaVar) {
        synchronized (this.f3860b) {
            this.f3860b.remove(aaVar.b());
        }
        f();
    }

    public long b(aa aaVar) {
        long longValue;
        synchronized (this.f3860b) {
            Long l10 = (Long) this.f3860b.get(aaVar.b());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue();
        }
        return longValue;
    }

    public long c(aa aaVar) {
        return a(aaVar, 1L);
    }

    public long a(aa aaVar, long j3) {
        long longValue;
        synchronized (this.f3860b) {
            Long l10 = (Long) this.f3860b.get(aaVar.b());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue() + j3;
            this.f3860b.put(aaVar.b(), Long.valueOf(longValue));
        }
        f();
        return longValue;
    }

    public void b(aa aaVar, long j3) {
        synchronized (this.f3860b) {
            this.f3860b.put(aaVar.b(), Long.valueOf(j3));
        }
        f();
    }
}
