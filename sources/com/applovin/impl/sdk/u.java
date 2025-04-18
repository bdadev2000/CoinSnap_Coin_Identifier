package com.applovin.impl.sdk;

import com.applovin.impl.be;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class u {
    private final t a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7992b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f7993c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7994b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7995c;

        /* renamed from: d, reason: collision with root package name */
        private String f7996d;

        /* renamed from: e, reason: collision with root package name */
        private String f7997e;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.f7994b = str2;
            this.f7995c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String c() {
            return this.f7995c;
        }

        public String d() {
            return this.f7996d;
        }

        public String e() {
            return this.f7997e;
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
            String b3 = b();
            String b10 = aVar.b();
            if (b3 != null ? !b3.equals(b10) : b10 != null) {
                return false;
            }
            String a = a();
            String a10 = aVar.a();
            if (a != null ? !a.equals(a10) : a10 != null) {
                return false;
            }
            String c10 = c();
            String c11 = aVar.c();
            if (c10 != null ? !c10.equals(c11) : c11 != null) {
                return false;
            }
            String d10 = d();
            String d11 = aVar.d();
            if (d10 != null ? !d10.equals(d11) : d11 != null) {
                return false;
            }
            String e2 = e();
            String e10 = aVar.e();
            return e2 != null ? e2.equals(e10) : e10 == null;
        }

        public int hashCode() {
            String b3 = b();
            int hashCode = b3 == null ? 43 : b3.hashCode();
            String a = a();
            int hashCode2 = ((hashCode + 59) * 59) + (a == null ? 43 : a.hashCode());
            String c10 = c();
            int hashCode3 = (hashCode2 * 59) + (c10 == null ? 43 : c10.hashCode());
            String d10 = d();
            int hashCode4 = (hashCode3 * 59) + (d10 == null ? 43 : d10.hashCode());
            String e2 = e();
            return (hashCode4 * 59) + (e2 != null ? e2.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ", secondWinnerAdapterName=" + d() + ", secondWinnerNetworkName=" + e() + ")";
        }

        public String b() {
            return this.a;
        }

        public String a() {
            return this.f7994b;
        }
    }

    public u(k kVar) {
        this.a = kVar.L();
    }

    public void a(be beVar) {
        synchronized (this.f7993c) {
            String adUnitId = beVar.getAdUnitId();
            a aVar = (a) this.f7992b.get(adUnitId);
            if (aVar == null) {
                if (t.a()) {
                    this.a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (beVar.A().equals(aVar.b())) {
                if (t.a()) {
                    this.a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.f7992b.remove(adUnitId);
            } else if (t.a()) {
                this.a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + beVar + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    public void b(be beVar) {
        a(beVar, null);
    }

    public void a(be beVar, be beVar2) {
        synchronized (this.f7993c) {
            if (t.a()) {
                this.a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + beVar);
            }
            a aVar = new a(beVar.A(), beVar.c(), beVar.getNetworkName());
            if (beVar2 != null) {
                aVar.f7996d = beVar2.c();
                aVar.f7997e = beVar2.getNetworkName();
            }
            this.f7992b.put(beVar.getAdUnitId(), aVar);
        }
    }

    public a a(String str) {
        a aVar;
        synchronized (this.f7993c) {
            aVar = (a) this.f7992b.get(str);
        }
        return aVar;
    }
}
