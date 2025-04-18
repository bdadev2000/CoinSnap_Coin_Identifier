package com.applovin.impl.sdk.network;

import a4.j;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f7873b;

    /* renamed from: c, reason: collision with root package name */
    private Map f7874c;

    /* renamed from: d, reason: collision with root package name */
    private Map f7875d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f7876e;

    /* renamed from: f, reason: collision with root package name */
    private String f7877f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f7878g;

    /* renamed from: h, reason: collision with root package name */
    private final int f7879h;

    /* renamed from: i, reason: collision with root package name */
    private int f7880i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7881j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7882k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f7883l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7884m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f7885n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f7886o;

    /* renamed from: p, reason: collision with root package name */
    private final qi.a f7887p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f7888q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f7889r;

    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0036a {
        String a;

        /* renamed from: b, reason: collision with root package name */
        String f7890b;

        /* renamed from: c, reason: collision with root package name */
        String f7891c;

        /* renamed from: e, reason: collision with root package name */
        Map f7893e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f7894f;

        /* renamed from: g, reason: collision with root package name */
        Object f7895g;

        /* renamed from: i, reason: collision with root package name */
        int f7897i;

        /* renamed from: j, reason: collision with root package name */
        int f7898j;

        /* renamed from: k, reason: collision with root package name */
        boolean f7899k;

        /* renamed from: m, reason: collision with root package name */
        boolean f7901m;

        /* renamed from: n, reason: collision with root package name */
        boolean f7902n;

        /* renamed from: o, reason: collision with root package name */
        boolean f7903o;

        /* renamed from: p, reason: collision with root package name */
        boolean f7904p;

        /* renamed from: q, reason: collision with root package name */
        qi.a f7905q;

        /* renamed from: h, reason: collision with root package name */
        int f7896h = 1;

        /* renamed from: l, reason: collision with root package name */
        boolean f7900l = true;

        /* renamed from: d, reason: collision with root package name */
        Map f7892d = new HashMap();

        public C0036a(k kVar) {
            this.f7897i = ((Integer) kVar.a(oj.b3)).intValue();
            this.f7898j = ((Integer) kVar.a(oj.f6616a3)).intValue();
            this.f7901m = ((Boolean) kVar.a(oj.f6798y3)).booleanValue();
            this.f7902n = ((Boolean) kVar.a(oj.f6685j5)).booleanValue();
            this.f7905q = qi.a.a(((Integer) kVar.a(oj.f6693k5)).intValue());
            this.f7904p = ((Boolean) kVar.a(oj.H5)).booleanValue();
        }

        public C0036a a(qi.a aVar) {
            this.f7905q = aVar;
            return this;
        }

        public C0036a b(String str) {
            this.f7890b = str;
            return this;
        }

        public C0036a c(String str) {
            this.a = str;
            return this;
        }

        public C0036a d(boolean z10) {
            this.f7900l = z10;
            return this;
        }

        public C0036a e(boolean z10) {
            this.f7901m = z10;
            return this;
        }

        public C0036a f(boolean z10) {
            this.f7903o = z10;
            return this;
        }

        public C0036a a(Map map) {
            this.f7893e = map;
            return this;
        }

        public C0036a b(Map map) {
            this.f7892d = map;
            return this;
        }

        public C0036a c(int i10) {
            this.f7897i = i10;
            return this;
        }

        public C0036a a(JSONObject jSONObject) {
            this.f7894f = jSONObject;
            return this;
        }

        public C0036a b(int i10) {
            this.f7898j = i10;
            return this;
        }

        public C0036a c(boolean z10) {
            this.f7899k = z10;
            return this;
        }

        public C0036a a(String str) {
            this.f7891c = str;
            return this;
        }

        public C0036a b(boolean z10) {
            this.f7904p = z10;
            return this;
        }

        public C0036a a(Object obj) {
            this.f7895g = obj;
            return this;
        }

        public C0036a a(int i10) {
            this.f7896h = i10;
            return this;
        }

        public C0036a a(boolean z10) {
            this.f7902n = z10;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0036a c0036a) {
        this.a = c0036a.f7890b;
        this.f7873b = c0036a.a;
        this.f7874c = c0036a.f7892d;
        this.f7875d = c0036a.f7893e;
        this.f7876e = c0036a.f7894f;
        this.f7877f = c0036a.f7891c;
        this.f7878g = c0036a.f7895g;
        int i10 = c0036a.f7896h;
        this.f7879h = i10;
        this.f7880i = i10;
        this.f7881j = c0036a.f7897i;
        this.f7882k = c0036a.f7898j;
        this.f7883l = c0036a.f7899k;
        this.f7884m = c0036a.f7900l;
        this.f7885n = c0036a.f7901m;
        this.f7886o = c0036a.f7902n;
        this.f7887p = c0036a.f7905q;
        this.f7888q = c0036a.f7903o;
        this.f7889r = c0036a.f7904p;
    }

    public void a(String str) {
        this.a = str;
    }

    public void b(String str) {
        this.f7873b = str;
    }

    public int c() {
        return this.f7879h - this.f7880i;
    }

    public Object d() {
        return this.f7878g;
    }

    public qi.a e() {
        return this.f7887p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
            return false;
        }
        Map map = this.f7874c;
        if (map == null ? aVar.f7874c != null : !map.equals(aVar.f7874c)) {
            return false;
        }
        Map map2 = this.f7875d;
        if (map2 == null ? aVar.f7875d != null : !map2.equals(aVar.f7875d)) {
            return false;
        }
        String str2 = this.f7877f;
        if (str2 == null ? aVar.f7877f != null : !str2.equals(aVar.f7877f)) {
            return false;
        }
        String str3 = this.f7873b;
        if (str3 == null ? aVar.f7873b != null : !str3.equals(aVar.f7873b)) {
            return false;
        }
        JSONObject jSONObject = this.f7876e;
        if (jSONObject == null ? aVar.f7876e != null : !jSONObject.equals(aVar.f7876e)) {
            return false;
        }
        Object obj2 = this.f7878g;
        if (obj2 == null ? aVar.f7878g != null : !obj2.equals(aVar.f7878g)) {
            return false;
        }
        if (this.f7879h == aVar.f7879h && this.f7880i == aVar.f7880i && this.f7881j == aVar.f7881j && this.f7882k == aVar.f7882k && this.f7883l == aVar.f7883l && this.f7884m == aVar.f7884m && this.f7885n == aVar.f7885n && this.f7886o == aVar.f7886o && this.f7887p == aVar.f7887p && this.f7888q == aVar.f7888q && this.f7889r == aVar.f7889r) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.a;
    }

    public Map g() {
        return this.f7875d;
    }

    public String h() {
        return this.f7873b;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (hashCode + i10) * 31;
        String str2 = this.f7877f;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f7873b;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        Object obj = this.f7878g;
        if (obj != null) {
            i13 = obj.hashCode();
        }
        int b3 = ((((this.f7887p.b() + ((((((((((((((((((i16 + i13) * 31) + this.f7879h) * 31) + this.f7880i) * 31) + this.f7881j) * 31) + this.f7882k) * 31) + (this.f7883l ? 1 : 0)) * 31) + (this.f7884m ? 1 : 0)) * 31) + (this.f7885n ? 1 : 0)) * 31) + (this.f7886o ? 1 : 0)) * 31)) * 31) + (this.f7888q ? 1 : 0)) * 31) + (this.f7889r ? 1 : 0);
        Map map = this.f7874c;
        if (map != null) {
            b3 = (b3 * 31) + map.hashCode();
        }
        Map map2 = this.f7875d;
        if (map2 != null) {
            b3 = (b3 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f7876e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (b3 * 31) + new String(charArray).hashCode();
        }
        return b3;
    }

    public Map i() {
        return this.f7874c;
    }

    public int j() {
        return this.f7880i;
    }

    public int k() {
        return this.f7882k;
    }

    public int l() {
        return this.f7881j;
    }

    public boolean m() {
        return this.f7886o;
    }

    public boolean n() {
        return this.f7883l;
    }

    public boolean o() {
        return this.f7889r;
    }

    public boolean p() {
        return this.f7884m;
    }

    public boolean q() {
        return this.f7885n;
    }

    public boolean r() {
        return this.f7888q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest {endpoint=");
        sb2.append(this.a);
        sb2.append(", backupEndpoint=");
        sb2.append(this.f7877f);
        sb2.append(", httpMethod=");
        sb2.append(this.f7873b);
        sb2.append(", httpHeaders=");
        sb2.append(this.f7875d);
        sb2.append(", body=");
        sb2.append(this.f7876e);
        sb2.append(", emptyResponse=");
        sb2.append(this.f7878g);
        sb2.append(", initialRetryAttempts=");
        sb2.append(this.f7879h);
        sb2.append(", retryAttemptsLeft=");
        sb2.append(this.f7880i);
        sb2.append(", timeoutMillis=");
        sb2.append(this.f7881j);
        sb2.append(", retryDelayMillis=");
        sb2.append(this.f7882k);
        sb2.append(", exponentialRetries=");
        sb2.append(this.f7883l);
        sb2.append(", retryOnAllErrors=");
        sb2.append(this.f7884m);
        sb2.append(", retryOnNoConnection=");
        sb2.append(this.f7885n);
        sb2.append(", encodingEnabled=");
        sb2.append(this.f7886o);
        sb2.append(", encodingType=");
        sb2.append(this.f7887p);
        sb2.append(", trackConnectionSpeed=");
        sb2.append(this.f7888q);
        sb2.append(", gzipBodyEncoding=");
        return j.l(sb2, this.f7889r, AbstractJsonLexerKt.END_OBJ);
    }

    public String a() {
        return this.f7877f;
    }

    public JSONObject b() {
        return this.f7876e;
    }

    public void a(int i10) {
        this.f7880i = i10;
    }

    public static C0036a a(k kVar) {
        return new C0036a(kVar);
    }
}
