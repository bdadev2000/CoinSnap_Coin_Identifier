package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class xj {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f27921a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f27922b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f27923c = new Object();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27924a;

        static {
            int[] iArr = new int[b.values().length];
            f27924a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27924a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27924a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final yj f27928a;

        /* renamed from: b, reason: collision with root package name */
        private final long f27929b;

        /* renamed from: c, reason: collision with root package name */
        private final long f27930c;

        private c(yj yjVar, long j2) {
            this.f27928a = yjVar;
            this.f27929b = j2;
            this.f27930c = SystemClock.elapsedRealtime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f27930c > this.f27929b;
        }

        public long a() {
            return this.f27930c;
        }

        public long b() {
            return this.f27929b;
        }

        public yj c() {
            return this.f27928a;
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
            yj c2 = c();
            yj c3 = cVar.c();
            return c2 != null ? c2.equals(c3) : c3 == null;
        }

        public int hashCode() {
            long b2 = b();
            long a2 = a();
            yj c2 = c();
            return ((((((int) (b2 ^ (b2 >>> 32))) + 59) * 59) + ((int) ((a2 >>> 32) ^ a2))) * 59) + (c2 == null ? 43 : c2.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb.append(c());
            sb.append(", expirationTimeMillis=");
            sb.append(b());
            sb.append(", cacheTimestampMillis=");
            return android.support.v4.media.d.p(sb, a(), ")");
        }

        public /* synthetic */ c(yj yjVar, long j2, a aVar) {
            this(yjVar, j2);
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }
    }

    public xj(com.applovin.impl.sdk.j jVar) {
        this.f27921a = jVar;
    }

    private String a(zj zjVar, String str, MaxAdFormat maxAdFormat) {
        String c2 = zjVar.c();
        int i2 = a.f27924a[zjVar.t().ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? c2 : androidx.compose.foundation.text.input.a.k(c2, "_", str);
        }
        StringBuilder B = androidx.compose.foundation.text.input.a.B(c2, "_");
        B.append(maxAdFormat.getLabel());
        return B.toString();
    }

    public yj b(zj zjVar, String str, MaxAdFormat maxAdFormat) {
        String a2 = a(zjVar, str, maxAdFormat);
        synchronized (this.f27923c) {
            try {
                c cVar = (c) this.f27922b.get(a2);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f27922b.remove(a2);
                    return null;
                }
                this.f27921a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27921a.J().a("SignalCacheManager", "Returning cached signal for: " + zjVar);
                }
                return cVar.f27928a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(yj yjVar, zj zjVar, String str, MaxAdFormat maxAdFormat) {
        if (yjVar == null) {
            return;
        }
        long u2 = zjVar.u();
        if (u2 <= 0) {
            return;
        }
        this.f27921a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27921a.J().a("SignalCacheManager", "Caching signal for: " + zjVar);
        }
        String a2 = a(zjVar, str, maxAdFormat);
        c cVar = new c(yjVar, u2, null);
        synchronized (this.f27923c) {
            this.f27922b.put(a2, cVar);
        }
    }
}
