package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class da {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f23442a;

    /* renamed from: b */
    private final Map f23443b = new HashMap();

    public da(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f23442a = jVar;
    }

    public /* synthetic */ void d() {
        try {
            this.f23442a.b(uj.f27349z, c().toString());
        } catch (Throwable th) {
            this.f23442a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23442a.J().a("GlobalStatsManager", "Unable to save stats", th);
            }
        }
    }

    private void f() {
        this.f23442a.j0().a(new mt(this, 7), tm.b.OTHER);
    }

    public void b() {
        synchronized (this.f23443b) {
            try {
                Iterator it = ca.a().iterator();
                while (it.hasNext()) {
                    this.f23443b.remove(((ca) it.next()).b());
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject c() {
        JSONObject jSONObject;
        synchronized (this.f23443b) {
            try {
                jSONObject = new JSONObject();
                for (Map.Entry entry : this.f23443b.entrySet()) {
                    JsonUtils.putLong(jSONObject, (String) entry.getKey(), ((Long) entry.getValue()).longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public void e() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f23442a.a(uj.f27349z, JsonUtils.EMPTY_JSON));
            synchronized (this.f23443b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f23443b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f23442a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23442a.J().a("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }

    public void a() {
        synchronized (this.f23443b) {
            this.f23443b.clear();
        }
        f();
    }

    public void a(ca caVar) {
        synchronized (this.f23443b) {
            this.f23443b.remove(caVar.b());
        }
        f();
    }

    public long b(ca caVar) {
        long longValue;
        synchronized (this.f23443b) {
            try {
                Long l2 = (Long) this.f23443b.get(caVar.b());
                if (l2 == null) {
                    l2 = 0L;
                }
                longValue = l2.longValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return longValue;
    }

    public long c(ca caVar) {
        return a(caVar, 1L);
    }

    public long a(ca caVar, long j2) {
        long longValue;
        synchronized (this.f23443b) {
            try {
                Long l2 = (Long) this.f23443b.get(caVar.b());
                if (l2 == null) {
                    l2 = 0L;
                }
                longValue = l2.longValue() + j2;
                this.f23443b.put(caVar.b(), Long.valueOf(longValue));
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return longValue;
    }

    public void b(ca caVar, long j2) {
        synchronized (this.f23443b) {
            this.f23443b.put(caVar.b(), Long.valueOf(j2));
        }
        f();
    }
}
