package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.ve;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class q {

    /* renamed from: j */
    private static final a f11140j = new a();

    /* renamed from: a */
    private final k f11141a;

    /* renamed from: c */
    private long f11142c;

    /* renamed from: f */
    private long f11145f;

    /* renamed from: g */
    private Object f11146g;
    private final AtomicBoolean b = new AtomicBoolean();

    /* renamed from: d */
    private final Object f11143d = new Object();

    /* renamed from: e */
    private final AtomicBoolean f11144e = new AtomicBoolean();

    /* renamed from: h */
    private final Map f11147h = new HashMap();

    /* renamed from: i */
    private final Object f11148i = new Object();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private long f11149a = -1;
        private int b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f11149a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long b = b();
            return a() + ((((int) (b ^ (b >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i9 = aVar.b;
            aVar.b = i9 + 1;
            return i9;
        }

        public int a() {
            return this.b;
        }
    }

    public q(k kVar) {
        this.f11141a = kVar;
    }

    public boolean c() {
        return this.b.get();
    }

    public boolean d() {
        return this.f11144e.get();
    }

    public void a(boolean z8) {
        synchronized (this.f11143d) {
            try {
                this.f11144e.set(z8);
                if (z8) {
                    this.f11145f = System.currentTimeMillis();
                    this.f11141a.L();
                    if (t.a()) {
                        this.f11141a.L().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f11145f);
                    }
                    Long l = (Long) this.f11141a.a(oj.f9737c2);
                    if (l.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new A4.d(20, this, l), l.longValue());
                    }
                } else {
                    this.f11145f = 0L;
                    this.f11141a.L();
                    if (t.a()) {
                        this.f11141a.L().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        return this.f11142c;
    }

    public void c(String str) {
        synchronized (this.f11148i) {
            try {
                a aVar = (a) this.f11147h.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f11147h.put(str, aVar);
                }
                aVar.f11149a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        if (!ve.b(obj) && this.b.compareAndSet(true, false)) {
            this.f11146g = null;
            this.f11141a.L();
            if (t.a()) {
                this.f11141a.L().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f11148i) {
            aVar = (a) this.f11147h.get(str);
            if (aVar == null) {
                aVar = f11140j;
            }
        }
        return aVar;
    }

    public /* synthetic */ void a(Long l) {
        if (d() && System.currentTimeMillis() - this.f11145f >= l.longValue()) {
            this.f11141a.L();
            if (t.a()) {
                this.f11141a.L().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f11144e.set(false);
        }
    }

    public Object a() {
        return this.f11146g;
    }

    public void a(Object obj) {
        if (!ve.b(obj) && this.b.compareAndSet(false, true)) {
            this.f11146g = obj;
            this.f11142c = System.currentTimeMillis();
            this.f11141a.L();
            if (t.a()) {
                this.f11141a.L().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f11142c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l = (Long) this.f11141a.a(oj.d2);
            if (l.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new y(this, l, obj, 3), l.longValue());
            }
        }
    }

    public /* synthetic */ void a(Long l, Object obj) {
        if (this.b.get() && System.currentTimeMillis() - this.f11142c >= l.longValue()) {
            this.f11141a.L();
            if (t.a()) {
                this.f11141a.L().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f11148i) {
            this.f11147h.remove(str);
        }
    }
}
