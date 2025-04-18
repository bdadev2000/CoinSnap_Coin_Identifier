package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.ve;
import com.applovin.sdk.AppLovinSdkUtils;
import h.o0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class q {

    /* renamed from: j */
    private static final a f7977j = new a();
    private final k a;

    /* renamed from: c */
    private long f7979c;

    /* renamed from: f */
    private long f7982f;

    /* renamed from: g */
    private Object f7983g;

    /* renamed from: b */
    private final AtomicBoolean f7978b = new AtomicBoolean();

    /* renamed from: d */
    private final Object f7980d = new Object();

    /* renamed from: e */
    private final AtomicBoolean f7981e = new AtomicBoolean();

    /* renamed from: h */
    private final Map f7984h = new HashMap();

    /* renamed from: i */
    private final Object f7985i = new Object();

    /* loaded from: classes.dex */
    public static class a {
        private long a = -1;

        /* renamed from: b */
        private int f7986b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long b3 = b();
            return a() + ((((int) (b3 ^ (b3 >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f7986b;
            aVar.f7986b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f7986b;
        }
    }

    public q(k kVar) {
        this.a = kVar;
    }

    public boolean c() {
        return this.f7978b.get();
    }

    public boolean d() {
        return this.f7981e.get();
    }

    public void a(boolean z10) {
        synchronized (this.f7980d) {
            this.f7981e.set(z10);
            if (z10) {
                this.f7982f = System.currentTimeMillis();
                this.a.L();
                if (t.a()) {
                    this.a.L().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f7982f);
                }
                Long l10 = (Long) this.a.a(oj.f6629c2);
                if (l10.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new o0(21, this, l10), l10.longValue());
                }
            } else {
                this.f7982f = 0L;
                this.a.L();
                if (t.a()) {
                    this.a.L().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.f7979c;
    }

    public void c(String str) {
        synchronized (this.f7985i) {
            a aVar = (a) this.f7984h.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f7984h.put(str, aVar);
            }
            aVar.a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public void b(Object obj) {
        if (!ve.b(obj) && this.f7978b.compareAndSet(true, false)) {
            this.f7983g = null;
            this.a.L();
            if (t.a()) {
                this.a.L().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f7985i) {
            aVar = (a) this.f7984h.get(str);
            if (aVar == null) {
                aVar = f7977j;
            }
        }
        return aVar;
    }

    public /* synthetic */ void a(Long l10) {
        if (d() && System.currentTimeMillis() - this.f7982f >= l10.longValue()) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f7981e.set(false);
        }
    }

    public Object a() {
        return this.f7983g;
    }

    public void a(Object obj) {
        if (!ve.b(obj) && this.f7978b.compareAndSet(false, true)) {
            this.f7983g = obj;
            this.f7979c = System.currentTimeMillis();
            this.a.L();
            if (t.a()) {
                this.a.L().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f7979c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l10 = (Long) this.a.a(oj.f6637d2);
            if (l10.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new y(3, this, l10, obj), l10.longValue());
            }
        }
    }

    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f7978b.get() && System.currentTimeMillis() - this.f7979c >= l10.longValue()) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f7985i) {
            this.f7984h.remove(str);
        }
    }
}
