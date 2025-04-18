package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final t f7632b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f7634d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f7635e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f7633c = new Object();

    public c(k kVar) {
        this.a = kVar;
        this.f7632b = kVar.L();
        for (com.applovin.impl.h0 h0Var : com.applovin.impl.h0.a()) {
            this.f7634d.put(h0Var, new v());
            this.f7635e.put(h0Var, new v());
        }
    }

    private v b(com.applovin.impl.h0 h0Var) {
        v vVar;
        synchronized (this.f7633c) {
            vVar = (v) this.f7635e.get(h0Var);
            if (vVar == null) {
                vVar = new v();
                this.f7635e.put(h0Var, vVar);
            }
        }
        return vVar;
    }

    private v c(com.applovin.impl.h0 h0Var) {
        synchronized (this.f7633c) {
            v b3 = b(h0Var);
            if (b3.b() > 0) {
                return b3;
            }
            return d(h0Var);
        }
    }

    private v d(com.applovin.impl.h0 h0Var) {
        v vVar;
        synchronized (this.f7633c) {
            vVar = (v) this.f7634d.get(h0Var);
            if (vVar == null) {
                vVar = new v();
                this.f7634d.put(h0Var, vVar);
            }
        }
        return vVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.h0 h0Var) {
        AppLovinAdImpl a;
        synchronized (this.f7633c) {
            a = c(h0Var).a();
        }
        return a;
    }

    public AppLovinAdImpl e(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f7633c) {
            v d10 = d(h0Var);
            if (d10.b() > 0) {
                b(h0Var).a(d10.a());
                cVar = new com.applovin.impl.sdk.ad.c(h0Var, this.a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (t.a()) {
                this.f7632b.a("AdPreloadManager", "Retrieved ad of zone " + h0Var + "...");
            }
        } else if (t.a()) {
            this.f7632b.a("AdPreloadManager", "Unable to retrieve ad of zone " + h0Var + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.h0 h0Var) {
        AppLovinAdImpl d10;
        synchronized (this.f7633c) {
            d10 = c(h0Var).d();
        }
        return d10;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f7633c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (t.a()) {
                this.f7632b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f7633c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }
}
