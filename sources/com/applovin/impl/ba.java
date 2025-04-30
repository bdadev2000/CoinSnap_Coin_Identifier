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

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f6842a;
    private final Map b = new HashMap();

    public ba(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.f6842a = kVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public /* synthetic */ void d() {
        try {
            this.f6842a.b(qj.f10388z, c().toString());
        } catch (Throwable th) {
            this.f6842a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6842a.L().a("GlobalStatsManager", "Unable to save stats", th);
            }
        }
    }

    private void f() {
        this.f6842a.l0().a(new F0(this, 7), sm.b.OTHER);
    }

    public void b() {
        synchronized (this.b) {
            try {
                Iterator it = aa.a().iterator();
                while (it.hasNext()) {
                    this.b.remove(((aa) it.next()).b());
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject c() {
        JSONObject jSONObject;
        synchronized (this.b) {
            try {
                jSONObject = new JSONObject();
                for (Map.Entry entry : this.b.entrySet()) {
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
            JSONObject jSONObject = new JSONObject((String) this.f6842a.a(qj.f10388z, JsonUtils.EMPTY_JSON));
            synchronized (this.b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f6842a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6842a.L().a("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }

    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
        f();
    }

    public void a(aa aaVar) {
        synchronized (this.b) {
            this.b.remove(aaVar.b());
        }
        f();
    }

    public long b(aa aaVar) {
        long longValue;
        synchronized (this.b) {
            try {
                Long l = (Long) this.b.get(aaVar.b());
                if (l == null) {
                    l = 0L;
                }
                longValue = l.longValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return longValue;
    }

    public long c(aa aaVar) {
        return a(aaVar, 1L);
    }

    public long a(aa aaVar, long j7) {
        long longValue;
        synchronized (this.b) {
            try {
                Long l = (Long) this.b.get(aaVar.b());
                if (l == null) {
                    l = 0L;
                }
                longValue = l.longValue() + j7;
                this.b.put(aaVar.b(), Long.valueOf(longValue));
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return longValue;
    }

    public void b(aa aaVar, long j7) {
        synchronized (this.b) {
            this.b.put(aaVar.b(), Long.valueOf(j7));
        }
        f();
    }
}
