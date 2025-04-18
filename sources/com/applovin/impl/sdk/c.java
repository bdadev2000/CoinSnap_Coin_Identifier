package com.applovin.impl.sdk;

import com.applovin.impl.h0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final j f26583a;

    /* renamed from: b, reason: collision with root package name */
    private final n f26584b;
    private final Map d = new HashMap();
    private final Map e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f26585c = new Object();

    public c(j jVar) {
        this.f26583a = jVar;
        this.f26584b = jVar.J();
        for (h0 h0Var : h0.a()) {
            this.d.put(h0Var, new p());
            this.e.put(h0Var, new p());
        }
    }

    private p b(h0 h0Var) {
        p pVar;
        synchronized (this.f26585c) {
            try {
                pVar = (p) this.e.get(h0Var);
                if (pVar == null) {
                    pVar = new p();
                    this.e.put(h0Var, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    private p c(h0 h0Var) {
        synchronized (this.f26585c) {
            try {
                p b2 = b(h0Var);
                if (b2.b() > 0) {
                    return b2;
                }
                return d(h0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private p d(h0 h0Var) {
        p pVar;
        synchronized (this.f26585c) {
            try {
                pVar = (p) this.d.get(h0Var);
                if (pVar == null) {
                    pVar = new p();
                    this.d.put(h0Var, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public AppLovinAdImpl a(h0 h0Var) {
        AppLovinAdImpl a2;
        synchronized (this.f26585c) {
            a2 = c(h0Var).a();
        }
        return a2;
    }

    public AppLovinAdImpl e(h0 h0Var) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f26585c) {
            try {
                p d = d(h0Var);
                if (d.b() > 0) {
                    b(h0Var).a(d.a());
                    cVar = new com.applovin.impl.sdk.ad.c(h0Var, this.f26583a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            if (n.a()) {
                this.f26584b.a("AdPreloadManager", "Retrieved ad of zone " + h0Var + "...");
            }
        } else if (n.a()) {
            this.f26584b.a("AdPreloadManager", "Unable to retrieve ad of zone " + h0Var + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(h0 h0Var) {
        AppLovinAdImpl d;
        synchronized (this.f26585c) {
            d = c(h0Var).d();
        }
        return d;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f26585c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (n.a()) {
                    this.f26584b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f26585c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }
}
