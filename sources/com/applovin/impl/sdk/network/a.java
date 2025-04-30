package com.applovin.impl.sdk.network;

import Q7.n0;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f11045a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private Map f11046c;

    /* renamed from: d, reason: collision with root package name */
    private Map f11047d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f11048e;

    /* renamed from: f, reason: collision with root package name */
    private String f11049f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f11050g;

    /* renamed from: h, reason: collision with root package name */
    private final int f11051h;

    /* renamed from: i, reason: collision with root package name */
    private int f11052i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11053j;

    /* renamed from: k, reason: collision with root package name */
    private final int f11054k;
    private final boolean l;
    private final boolean m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f11055n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f11056o;

    /* renamed from: p, reason: collision with root package name */
    private final qi.a f11057p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f11058q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f11059r;

    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0036a {

        /* renamed from: a, reason: collision with root package name */
        String f11060a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        String f11061c;

        /* renamed from: e, reason: collision with root package name */
        Map f11063e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f11064f;

        /* renamed from: g, reason: collision with root package name */
        Object f11065g;

        /* renamed from: i, reason: collision with root package name */
        int f11067i;

        /* renamed from: j, reason: collision with root package name */
        int f11068j;

        /* renamed from: k, reason: collision with root package name */
        boolean f11069k;
        boolean m;

        /* renamed from: n, reason: collision with root package name */
        boolean f11070n;

        /* renamed from: o, reason: collision with root package name */
        boolean f11071o;

        /* renamed from: p, reason: collision with root package name */
        boolean f11072p;

        /* renamed from: q, reason: collision with root package name */
        qi.a f11073q;

        /* renamed from: h, reason: collision with root package name */
        int f11066h = 1;
        boolean l = true;

        /* renamed from: d, reason: collision with root package name */
        Map f11062d = new HashMap();

        public C0036a(k kVar) {
            this.f11067i = ((Integer) kVar.a(oj.f9730b3)).intValue();
            this.f11068j = ((Integer) kVar.a(oj.f9724a3)).intValue();
            this.m = ((Boolean) kVar.a(oj.f9891y3)).booleanValue();
            this.f11070n = ((Boolean) kVar.a(oj.f9790j5)).booleanValue();
            this.f11073q = qi.a.a(((Integer) kVar.a(oj.f9798k5)).intValue());
            this.f11072p = ((Boolean) kVar.a(oj.f9603H5)).booleanValue();
        }

        public C0036a a(qi.a aVar) {
            this.f11073q = aVar;
            return this;
        }

        public C0036a b(String str) {
            this.b = str;
            return this;
        }

        public C0036a c(String str) {
            this.f11060a = str;
            return this;
        }

        public C0036a d(boolean z8) {
            this.l = z8;
            return this;
        }

        public C0036a e(boolean z8) {
            this.m = z8;
            return this;
        }

        public C0036a f(boolean z8) {
            this.f11071o = z8;
            return this;
        }

        public C0036a a(Map map) {
            this.f11063e = map;
            return this;
        }

        public C0036a b(Map map) {
            this.f11062d = map;
            return this;
        }

        public C0036a c(int i9) {
            this.f11067i = i9;
            return this;
        }

        public C0036a a(JSONObject jSONObject) {
            this.f11064f = jSONObject;
            return this;
        }

        public C0036a b(int i9) {
            this.f11068j = i9;
            return this;
        }

        public C0036a c(boolean z8) {
            this.f11069k = z8;
            return this;
        }

        public C0036a a(String str) {
            this.f11061c = str;
            return this;
        }

        public C0036a b(boolean z8) {
            this.f11072p = z8;
            return this;
        }

        public C0036a a(Object obj) {
            this.f11065g = obj;
            return this;
        }

        public C0036a a(int i9) {
            this.f11066h = i9;
            return this;
        }

        public C0036a a(boolean z8) {
            this.f11070n = z8;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0036a c0036a) {
        this.f11045a = c0036a.b;
        this.b = c0036a.f11060a;
        this.f11046c = c0036a.f11062d;
        this.f11047d = c0036a.f11063e;
        this.f11048e = c0036a.f11064f;
        this.f11049f = c0036a.f11061c;
        this.f11050g = c0036a.f11065g;
        int i9 = c0036a.f11066h;
        this.f11051h = i9;
        this.f11052i = i9;
        this.f11053j = c0036a.f11067i;
        this.f11054k = c0036a.f11068j;
        this.l = c0036a.f11069k;
        this.m = c0036a.l;
        this.f11055n = c0036a.m;
        this.f11056o = c0036a.f11070n;
        this.f11057p = c0036a.f11073q;
        this.f11058q = c0036a.f11071o;
        this.f11059r = c0036a.f11072p;
    }

    public void a(String str) {
        this.f11045a = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public int c() {
        return this.f11051h - this.f11052i;
    }

    public Object d() {
        return this.f11050g;
    }

    public qi.a e() {
        return this.f11057p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f11045a;
        if (str == null ? aVar.f11045a != null : !str.equals(aVar.f11045a)) {
            return false;
        }
        Map map = this.f11046c;
        if (map == null ? aVar.f11046c != null : !map.equals(aVar.f11046c)) {
            return false;
        }
        Map map2 = this.f11047d;
        if (map2 == null ? aVar.f11047d != null : !map2.equals(aVar.f11047d)) {
            return false;
        }
        String str2 = this.f11049f;
        if (str2 == null ? aVar.f11049f != null : !str2.equals(aVar.f11049f)) {
            return false;
        }
        String str3 = this.b;
        if (str3 == null ? aVar.b != null : !str3.equals(aVar.b)) {
            return false;
        }
        JSONObject jSONObject = this.f11048e;
        if (jSONObject == null ? aVar.f11048e != null : !jSONObject.equals(aVar.f11048e)) {
            return false;
        }
        Object obj2 = this.f11050g;
        if (obj2 == null ? aVar.f11050g != null : !obj2.equals(aVar.f11050g)) {
            return false;
        }
        if (this.f11051h == aVar.f11051h && this.f11052i == aVar.f11052i && this.f11053j == aVar.f11053j && this.f11054k == aVar.f11054k && this.l == aVar.l && this.m == aVar.m && this.f11055n == aVar.f11055n && this.f11056o == aVar.f11056o && this.f11057p == aVar.f11057p && this.f11058q == aVar.f11058q && this.f11059r == aVar.f11059r) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.f11045a;
    }

    public Map g() {
        return this.f11047d;
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        int i9;
        int i10;
        int i11;
        int hashCode = super.hashCode() * 31;
        String str = this.f11045a;
        int i12 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (hashCode + i9) * 31;
        String str2 = this.f11049f;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str3 = this.b;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Object obj = this.f11050g;
        if (obj != null) {
            i12 = obj.hashCode();
        }
        int b = ((((this.f11057p.b() + ((((((((((((((((((i15 + i12) * 31) + this.f11051h) * 31) + this.f11052i) * 31) + this.f11053j) * 31) + this.f11054k) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.f11055n ? 1 : 0)) * 31) + (this.f11056o ? 1 : 0)) * 31)) * 31) + (this.f11058q ? 1 : 0)) * 31) + (this.f11059r ? 1 : 0);
        Map map = this.f11046c;
        if (map != null) {
            b = (b * 31) + map.hashCode();
        }
        Map map2 = this.f11047d;
        if (map2 != null) {
            b = (b * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f11048e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (b * 31) + new String(charArray).hashCode();
        }
        return b;
    }

    public Map i() {
        return this.f11046c;
    }

    public int j() {
        return this.f11052i;
    }

    public int k() {
        return this.f11054k;
    }

    public int l() {
        return this.f11053j;
    }

    public boolean m() {
        return this.f11056o;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.f11059r;
    }

    public boolean p() {
        return this.m;
    }

    public boolean q() {
        return this.f11055n;
    }

    public boolean r() {
        return this.f11058q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest {endpoint=");
        sb.append(this.f11045a);
        sb.append(", backupEndpoint=");
        sb.append(this.f11049f);
        sb.append(", httpMethod=");
        sb.append(this.b);
        sb.append(", httpHeaders=");
        sb.append(this.f11047d);
        sb.append(", body=");
        sb.append(this.f11048e);
        sb.append(", emptyResponse=");
        sb.append(this.f11050g);
        sb.append(", initialRetryAttempts=");
        sb.append(this.f11051h);
        sb.append(", retryAttemptsLeft=");
        sb.append(this.f11052i);
        sb.append(", timeoutMillis=");
        sb.append(this.f11053j);
        sb.append(", retryDelayMillis=");
        sb.append(this.f11054k);
        sb.append(", exponentialRetries=");
        sb.append(this.l);
        sb.append(", retryOnAllErrors=");
        sb.append(this.m);
        sb.append(", retryOnNoConnection=");
        sb.append(this.f11055n);
        sb.append(", encodingEnabled=");
        sb.append(this.f11056o);
        sb.append(", encodingType=");
        sb.append(this.f11057p);
        sb.append(", trackConnectionSpeed=");
        sb.append(this.f11058q);
        sb.append(", gzipBodyEncoding=");
        return n0.n(sb, this.f11059r, '}');
    }

    public String a() {
        return this.f11049f;
    }

    public JSONObject b() {
        return this.f11048e;
    }

    public void a(int i9) {
        this.f11052i = i9;
    }

    public static C0036a a(k kVar) {
        return new C0036a(kVar);
    }
}
