package com.applovin.impl.sdk;

import com.applovin.impl.C0703h0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0751c {

    /* renamed from: a, reason: collision with root package name */
    private final k f10774a;
    private final t b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10776d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f10777e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f10775c = new Object();

    public C0751c(k kVar) {
        this.f10774a = kVar;
        this.b = kVar.L();
        for (C0703h0 c0703h0 : C0703h0.a()) {
            this.f10776d.put(c0703h0, new v());
            this.f10777e.put(c0703h0, new v());
        }
    }

    private v b(C0703h0 c0703h0) {
        v vVar;
        synchronized (this.f10775c) {
            try {
                vVar = (v) this.f10777e.get(c0703h0);
                if (vVar == null) {
                    vVar = new v();
                    this.f10777e.put(c0703h0, vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    private v c(C0703h0 c0703h0) {
        synchronized (this.f10775c) {
            try {
                v b = b(c0703h0);
                if (b.b() > 0) {
                    return b;
                }
                return d(c0703h0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private v d(C0703h0 c0703h0) {
        v vVar;
        synchronized (this.f10775c) {
            try {
                vVar = (v) this.f10776d.get(c0703h0);
                if (vVar == null) {
                    vVar = new v();
                    this.f10776d.put(c0703h0, vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public AppLovinAdImpl a(C0703h0 c0703h0) {
        AppLovinAdImpl a6;
        synchronized (this.f10775c) {
            a6 = c(c0703h0).a();
        }
        return a6;
    }

    public AppLovinAdImpl e(C0703h0 c0703h0) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f10775c) {
            try {
                v d2 = d(c0703h0);
                if (d2.b() > 0) {
                    b(c0703h0).a(d2.a());
                    cVar = new com.applovin.impl.sdk.ad.c(c0703h0, this.f10774a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            if (t.a()) {
                this.b.a("AdPreloadManager", "Retrieved ad of zone " + c0703h0 + "...");
            }
        } else if (t.a()) {
            this.b.a("AdPreloadManager", "Unable to retrieve ad of zone " + c0703h0 + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(C0703h0 c0703h0) {
        AppLovinAdImpl d2;
        synchronized (this.f10775c) {
            d2 = c(c0703h0).d();
        }
        return d2;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10775c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (t.a()) {
                    this.b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10775c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }
}
