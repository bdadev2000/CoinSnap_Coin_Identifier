package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class uj {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8402b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f8403c = new Object();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* loaded from: classes.dex */
    public static class c {
        private final vj a;

        /* renamed from: b, reason: collision with root package name */
        private final long f8407b;

        /* renamed from: c, reason: collision with root package name */
        private final long f8408c;

        private c(vj vjVar, long j3) {
            this.a = vjVar;
            this.f8407b = j3;
            this.f8408c = SystemClock.elapsedRealtime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f8408c > this.f8407b;
        }

        public vj c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            vj c10 = c();
            vj c11 = cVar.c();
            return c10 != null ? c10.equals(c11) : c11 == null;
        }

        public int hashCode() {
            long b3 = b();
            long a = a();
            vj c10 = c();
            return ((((((int) (b3 ^ (b3 >>> 32))) + 59) * 59) + ((int) ((a >>> 32) ^ a))) * 59) + (c10 == null ? 43 : c10.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb2.append(c());
            sb2.append(", expirationTimeMillis=");
            sb2.append(b());
            sb2.append(", cacheTimestampMillis=");
            return a4.j.j(sb2, a(), ")");
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public long b() {
            return this.f8407b;
        }

        public long a() {
            return this.f8408c;
        }

        public /* synthetic */ c(vj vjVar, long j3, a aVar) {
            this(vjVar, j3);
        }
    }

    public uj(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    private String a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String c10 = wjVar.c();
        int i10 = a.a[wjVar.s().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? c10 : kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(c10, "_", str);
        }
        StringBuilder n10 = eb.j.n(c10, "_");
        n10.append(maxAdFormat.getLabel());
        return n10.toString();
    }

    public vj b(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String a10 = a(wjVar, str, maxAdFormat);
        synchronized (this.f8403c) {
            c cVar = (c) this.f8402b.get(a10);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.f8402b.remove(a10);
                return null;
            }
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("SignalCacheManager", "Returning cached signal for: " + wjVar);
            }
            return cVar.a;
        }
    }

    public void a(vj vjVar, wj wjVar, String str, MaxAdFormat maxAdFormat) {
        if (vjVar == null) {
            return;
        }
        long t5 = wjVar.t();
        if (t5 <= 0) {
            return;
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("SignalCacheManager", "Caching signal for: " + wjVar);
        }
        String a10 = a(wjVar, str, maxAdFormat);
        c cVar = new c(vjVar, t5, null);
        synchronized (this.f8403c) {
            this.f8402b.put(a10, cVar);
        }
    }
}
