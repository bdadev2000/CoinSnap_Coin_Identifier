package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class uj {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11616a;
    private final Map b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f11617c = new Object();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11618a;

        static {
            int[] iArr = new int[b.values().length];
            f11618a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11618a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11618a[b.ALL.ordinal()] = 3;
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

        /* renamed from: a, reason: collision with root package name */
        private final vj f11622a;
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        private final long f11623c;

        private c(vj vjVar, long j7) {
            this.f11622a = vjVar;
            this.b = j7;
            this.f11623c = SystemClock.elapsedRealtime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            if (SystemClock.elapsedRealtime() - this.f11623c > this.b) {
                return true;
            }
            return false;
        }

        public vj c() {
            return this.f11622a;
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
            vj c9 = c();
            vj c10 = cVar.c();
            if (c9 != null ? c9.equals(c10) : c10 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            long b = b();
            long a6 = a();
            vj c9 = c();
            int i9 = (((((int) (b ^ (b >>> 32))) + 59) * 59) + ((int) ((a6 >>> 32) ^ a6))) * 59;
            if (c9 == null) {
                hashCode = 43;
            } else {
                hashCode = c9.hashCode();
            }
            return i9 + hashCode;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb.append(c());
            sb.append(", expirationTimeMillis=");
            sb.append(b());
            sb.append(", cacheTimestampMillis=");
            return Q7.n0.k(sb, a(), ")");
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public long b() {
            return this.b;
        }

        public long a() {
            return this.f11623c;
        }

        public /* synthetic */ c(vj vjVar, long j7, a aVar) {
            this(vjVar, j7);
        }
    }

    public uj(com.applovin.impl.sdk.k kVar) {
        this.f11616a = kVar;
    }

    private String a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String c9 = wjVar.c();
        int i9 = a.f11618a[wjVar.s().ordinal()];
        if (i9 != 1) {
            return i9 != 2 ? c9 : com.mbridge.msdk.foundation.entity.o.k(c9, "_", str);
        }
        StringBuilder c10 = AbstractC2965e.c(c9, "_");
        c10.append(maxAdFormat.getLabel());
        return c10.toString();
    }

    public vj b(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String a6 = a(wjVar, str, maxAdFormat);
        synchronized (this.f11617c) {
            try {
                c cVar = (c) this.b.get(a6);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.b.remove(a6);
                    return null;
                }
                this.f11616a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11616a.L().a("SignalCacheManager", "Returning cached signal for: " + wjVar);
                }
                return cVar.f11622a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(vj vjVar, wj wjVar, String str, MaxAdFormat maxAdFormat) {
        if (vjVar == null) {
            return;
        }
        long t9 = wjVar.t();
        if (t9 <= 0) {
            return;
        }
        this.f11616a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f11616a.L().a("SignalCacheManager", "Caching signal for: " + wjVar);
        }
        String a6 = a(wjVar, str, maxAdFormat);
        c cVar = new c(vjVar, t9, null);
        synchronized (this.f11617c) {
            this.b.put(a6, cVar);
        }
    }
}
