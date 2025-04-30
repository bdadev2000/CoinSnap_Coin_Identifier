package com.applovin.impl.sdk;

import com.applovin.impl.be;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final t f11156a;
    private final Map b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f11157c = new Object();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f11158a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final String f11159c;

        /* renamed from: d, reason: collision with root package name */
        private String f11160d;

        /* renamed from: e, reason: collision with root package name */
        private String f11161e;

        public a(String str, String str2, String str3) {
            this.f11158a = str;
            this.b = str2;
            this.f11159c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String c() {
            return this.f11159c;
        }

        public String d() {
            return this.f11160d;
        }

        public String e() {
            return this.f11161e;
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
            String b = b();
            String b8 = aVar.b();
            if (b != null ? !b.equals(b8) : b8 != null) {
                return false;
            }
            String a6 = a();
            String a9 = aVar.a();
            if (a6 != null ? !a6.equals(a9) : a9 != null) {
                return false;
            }
            String c9 = c();
            String c10 = aVar.c();
            if (c9 != null ? !c9.equals(c10) : c10 != null) {
                return false;
            }
            String d2 = d();
            String d9 = aVar.d();
            if (d2 != null ? !d2.equals(d9) : d9 != null) {
                return false;
            }
            String e4 = e();
            String e9 = aVar.e();
            if (e4 != null ? e4.equals(e9) : e9 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            String b = b();
            int i9 = 43;
            if (b == null) {
                hashCode = 43;
            } else {
                hashCode = b.hashCode();
            }
            String a6 = a();
            int i10 = (hashCode + 59) * 59;
            if (a6 == null) {
                hashCode2 = 43;
            } else {
                hashCode2 = a6.hashCode();
            }
            int i11 = i10 + hashCode2;
            String c9 = c();
            int i12 = i11 * 59;
            if (c9 == null) {
                hashCode3 = 43;
            } else {
                hashCode3 = c9.hashCode();
            }
            int i13 = i12 + hashCode3;
            String d2 = d();
            int i14 = i13 * 59;
            if (d2 == null) {
                hashCode4 = 43;
            } else {
                hashCode4 = d2.hashCode();
            }
            int i15 = i14 + hashCode4;
            String e4 = e();
            int i16 = i15 * 59;
            if (e4 != null) {
                i9 = e4.hashCode();
            }
            return i16 + i9;
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ", secondWinnerAdapterName=" + d() + ", secondWinnerNetworkName=" + e() + ")";
        }

        public String b() {
            return this.f11158a;
        }

        public String a() {
            return this.b;
        }
    }

    public u(k kVar) {
        this.f11156a = kVar.L();
    }

    public void a(be beVar) {
        synchronized (this.f11157c) {
            try {
                String adUnitId = beVar.getAdUnitId();
                a aVar = (a) this.b.get(adUnitId);
                if (aVar == null) {
                    if (t.a()) {
                        this.f11156a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (beVar.A().equals(aVar.b())) {
                    if (t.a()) {
                        this.f11156a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.b.remove(adUnitId);
                } else if (t.a()) {
                    this.f11156a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + beVar + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(be beVar) {
        a(beVar, null);
    }

    public void a(be beVar, be beVar2) {
        synchronized (this.f11157c) {
            try {
                if (t.a()) {
                    this.f11156a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + beVar);
                }
                a aVar = new a(beVar.A(), beVar.c(), beVar.getNetworkName());
                if (beVar2 != null) {
                    aVar.f11160d = beVar2.c();
                    aVar.f11161e = beVar2.getNetworkName();
                }
                this.b.put(beVar.getAdUnitId(), aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a a(String str) {
        a aVar;
        synchronized (this.f11157c) {
            aVar = (a) this.b.get(str);
        }
        return aVar;
    }
}
