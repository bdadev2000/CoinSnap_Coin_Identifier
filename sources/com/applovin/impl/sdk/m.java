package com.applovin.impl.sdk;

import com.applovin.impl.af;
import com.applovin.impl.sj;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: j */
    private static final a f26706j = new a();

    /* renamed from: a */
    private final j f26707a;

    /* renamed from: c */
    private long f26709c;

    /* renamed from: f */
    private long f26710f;

    /* renamed from: g */
    private Object f26711g;

    /* renamed from: b */
    private final AtomicBoolean f26708b = new AtomicBoolean();
    private final Object d = new Object();
    private final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: h */
    private final Map f26712h = new HashMap();

    /* renamed from: i */
    private final Object f26713i = new Object();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private long f26714a = -1;

        /* renamed from: b */
        private int f26715b;

        public int a() {
            return this.f26715b;
        }

        public long b() {
            return this.f26714a;
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
            long b2 = b();
            return a() + ((((int) (b2 ^ (b2 >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public static /* synthetic */ int a(a aVar) {
            int i2 = aVar.f26715b;
            aVar.f26715b = i2 + 1;
            return i2;
        }
    }

    public m(j jVar) {
        this.f26707a = jVar;
    }

    public boolean c() {
        return this.f26708b.get();
    }

    public boolean d() {
        return this.e.get();
    }

    public Object a() {
        return this.f26711g;
    }

    public long b() {
        return this.f26709c;
    }

    public void c(String str) {
        synchronized (this.f26713i) {
            try {
                a aVar = (a) this.f26712h.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f26712h.put(str, aVar);
                }
                aVar.f26714a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(boolean z2) {
        synchronized (this.d) {
            try {
                this.e.set(z2);
                if (z2) {
                    this.f26710f = System.currentTimeMillis();
                    this.f26707a.J();
                    if (n.a()) {
                        this.f26707a.J().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f26710f);
                    }
                    Long l2 = (Long) this.f26707a.a(sj.e2);
                    if (l2.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new androidx.core.content.res.a(17, this, l2), l2.longValue());
                    }
                } else {
                    this.f26710f = 0L;
                    this.f26707a.J();
                    if (n.a()) {
                        this.f26707a.J().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        if (!af.a(obj) && this.f26708b.compareAndSet(true, false)) {
            this.f26711g = null;
            this.f26707a.J();
            if (n.a()) {
                this.f26707a.J().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f26713i) {
            aVar = (a) this.f26712h.get(str);
            if (aVar == null) {
                aVar = f26706j;
            }
        }
        return aVar;
    }

    public /* synthetic */ void a(Long l2) {
        if (d() && System.currentTimeMillis() - this.f26710f >= l2.longValue()) {
            this.f26707a.J();
            if (n.a()) {
                this.f26707a.J().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.e.set(false);
        }
    }

    public void a(Object obj) {
        if (!af.a(obj) && this.f26708b.compareAndSet(false, true)) {
            this.f26711g = obj;
            this.f26709c = System.currentTimeMillis();
            this.f26707a.J();
            if (n.a()) {
                this.f26707a.J().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f26709c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l2 = (Long) this.f26707a.a(sj.f2);
            if (l2.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new r(this, 3, l2, obj), l2.longValue());
            }
        }
    }

    public /* synthetic */ void a(Long l2, Object obj) {
        if (this.f26708b.get() && System.currentTimeMillis() - this.f26709c >= l2.longValue()) {
            this.f26707a.J();
            if (n.a()) {
                this.f26707a.J().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f26713i) {
            this.f26712h.remove(str);
        }
    }
}
