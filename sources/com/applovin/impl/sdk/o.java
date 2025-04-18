package com.applovin.impl.sdk;

import com.applovin.impl.ge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final n f26829a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f26830b = new HashMap(5);

    /* renamed from: c, reason: collision with root package name */
    private final Object f26831c = new Object();
    private final Map d = Collections.synchronizedMap(new HashMap(5));
    private final Map e = Collections.synchronizedMap(new HashMap(5));

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f26832a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26833b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26834c;
        private String d;
        private String e;

        public a(String str, String str2, String str3) {
            this.f26832a = str;
            this.f26833b = str2;
            this.f26834c = str3;
        }

        public String a() {
            return this.f26833b;
        }

        public String b() {
            return this.f26832a;
        }

        public String c() {
            return this.f26834c;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String b2 = b();
            String b3 = aVar.b();
            if (b2 != null ? !b2.equals(b3) : b3 != null) {
                return false;
            }
            String a2 = a();
            String a3 = aVar.a();
            if (a2 != null ? !a2.equals(a3) : a3 != null) {
                return false;
            }
            String c2 = c();
            String c3 = aVar.c();
            if (c2 != null ? !c2.equals(c3) : c3 != null) {
                return false;
            }
            String d = d();
            String d2 = aVar.d();
            if (d != null ? !d.equals(d2) : d2 != null) {
                return false;
            }
            String e = e();
            String e2 = aVar.e();
            return e != null ? e.equals(e2) : e2 == null;
        }

        public int hashCode() {
            String b2 = b();
            int hashCode = b2 == null ? 43 : b2.hashCode();
            String a2 = a();
            int hashCode2 = ((hashCode + 59) * 59) + (a2 == null ? 43 : a2.hashCode());
            String c2 = c();
            int hashCode3 = (hashCode2 * 59) + (c2 == null ? 43 : c2.hashCode());
            String d = d();
            int hashCode4 = (hashCode3 * 59) + (d == null ? 43 : d.hashCode());
            String e = e();
            return (hashCode4 * 59) + (e != null ? e.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ", secondWinnerAdapterName=" + d() + ", secondWinnerNetworkName=" + e() + ")";
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }
    }

    public o(j jVar) {
        this.f26829a = jVar.J();
    }

    public void a(ge geVar) {
        synchronized (this.f26831c) {
            try {
                String adUnitId = geVar.getAdUnitId();
                a aVar = (a) this.f26830b.get(adUnitId);
                if (aVar == null) {
                    if (n.a()) {
                        this.f26829a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (geVar.B().equals(aVar.b())) {
                    if (n.a()) {
                        this.f26829a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f26830b.remove(adUnitId);
                } else if (n.a()) {
                    this.f26829a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + geVar + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(ge geVar) {
        this.d.put(geVar.getAdUnitId(), geVar.S());
    }

    public void c(ge geVar) {
        a(geVar, null);
    }

    public String b(String str) {
        return (String) this.d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f26831c) {
            aVar = (a) this.f26830b.get(str);
        }
        return aVar;
    }

    public void a(ge geVar, ge geVar2) {
        synchronized (this.f26831c) {
            try {
                if (n.a()) {
                    this.f26829a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + geVar);
                }
                a aVar = new a(geVar.B(), geVar.c(), geVar.getNetworkName());
                if (geVar2 != null) {
                    aVar.d = geVar2.c();
                    aVar.e = geVar2.getNetworkName();
                }
                this.f26830b.put(geVar.getAdUnitId(), aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.put(geVar.getAdUnitId(), geVar.S());
    }

    public String a(String str) {
        return (String) this.e.get(str);
    }
}
