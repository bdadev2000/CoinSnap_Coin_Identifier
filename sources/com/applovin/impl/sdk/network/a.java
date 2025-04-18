package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.j;
import com.applovin.impl.sj;
import com.applovin.impl.vi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f26756a;

    /* renamed from: b, reason: collision with root package name */
    private String f26757b;

    /* renamed from: c, reason: collision with root package name */
    private Map f26758c;
    private Map d;
    private final JSONObject e;

    /* renamed from: f, reason: collision with root package name */
    private String f26759f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f26760g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26761h;

    /* renamed from: i, reason: collision with root package name */
    private int f26762i;

    /* renamed from: j, reason: collision with root package name */
    private final int f26763j;

    /* renamed from: k, reason: collision with root package name */
    private final int f26764k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f26765l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f26766m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f26767n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f26768o;

    /* renamed from: p, reason: collision with root package name */
    private final vi.a f26769p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f26770q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f26771r;

    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0099a {

        /* renamed from: a, reason: collision with root package name */
        String f26772a;

        /* renamed from: b, reason: collision with root package name */
        String f26773b;

        /* renamed from: c, reason: collision with root package name */
        String f26774c;
        Map e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f26775f;

        /* renamed from: g, reason: collision with root package name */
        Object f26776g;

        /* renamed from: i, reason: collision with root package name */
        int f26778i;

        /* renamed from: j, reason: collision with root package name */
        int f26779j;

        /* renamed from: k, reason: collision with root package name */
        boolean f26780k;

        /* renamed from: m, reason: collision with root package name */
        boolean f26782m;

        /* renamed from: n, reason: collision with root package name */
        boolean f26783n;

        /* renamed from: o, reason: collision with root package name */
        boolean f26784o;

        /* renamed from: p, reason: collision with root package name */
        boolean f26785p;

        /* renamed from: q, reason: collision with root package name */
        vi.a f26786q;

        /* renamed from: h, reason: collision with root package name */
        int f26777h = 1;

        /* renamed from: l, reason: collision with root package name */
        boolean f26781l = true;
        Map d = new HashMap();

        public C0099a(j jVar) {
            this.f26778i = ((Integer) jVar.a(sj.k3)).intValue();
            this.f26779j = ((Integer) jVar.a(sj.j3)).intValue();
            this.f26782m = ((Boolean) jVar.a(sj.H3)).booleanValue();
            this.f26783n = ((Boolean) jVar.a(sj.o5)).booleanValue();
            this.f26786q = vi.a.a(((Integer) jVar.a(sj.p5)).intValue());
            this.f26785p = ((Boolean) jVar.a(sj.M5)).booleanValue();
        }

        public C0099a a(int i2) {
            this.f26777h = i2;
            return this;
        }

        public C0099a b(int i2) {
            this.f26779j = i2;
            return this;
        }

        public C0099a c(int i2) {
            this.f26778i = i2;
            return this;
        }

        public C0099a d(boolean z2) {
            this.f26781l = z2;
            return this;
        }

        public C0099a e(boolean z2) {
            this.f26782m = z2;
            return this;
        }

        public C0099a f(boolean z2) {
            this.f26784o = z2;
            return this;
        }

        public C0099a a(vi.a aVar) {
            this.f26786q = aVar;
            return this;
        }

        public C0099a b(String str) {
            this.f26773b = str;
            return this;
        }

        public C0099a c(String str) {
            this.f26772a = str;
            return this;
        }

        public C0099a a(Object obj) {
            this.f26776g = obj;
            return this;
        }

        public C0099a b(Map map) {
            this.d = map;
            return this;
        }

        public C0099a c(boolean z2) {
            this.f26780k = z2;
            return this;
        }

        public C0099a a(String str) {
            this.f26774c = str;
            return this;
        }

        public C0099a b(boolean z2) {
            this.f26785p = z2;
            return this;
        }

        public C0099a a(Map map) {
            this.e = map;
            return this;
        }

        public C0099a a(JSONObject jSONObject) {
            this.f26775f = jSONObject;
            return this;
        }

        public C0099a a(boolean z2) {
            this.f26783n = z2;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0099a c0099a) {
        this.f26756a = c0099a.f26773b;
        this.f26757b = c0099a.f26772a;
        this.f26758c = c0099a.d;
        this.d = c0099a.e;
        this.e = c0099a.f26775f;
        this.f26759f = c0099a.f26774c;
        this.f26760g = c0099a.f26776g;
        int i2 = c0099a.f26777h;
        this.f26761h = i2;
        this.f26762i = i2;
        this.f26763j = c0099a.f26778i;
        this.f26764k = c0099a.f26779j;
        this.f26765l = c0099a.f26780k;
        this.f26766m = c0099a.f26781l;
        this.f26767n = c0099a.f26782m;
        this.f26768o = c0099a.f26783n;
        this.f26769p = c0099a.f26786q;
        this.f26770q = c0099a.f26784o;
        this.f26771r = c0099a.f26785p;
    }

    public String a() {
        return this.f26759f;
    }

    public JSONObject b() {
        return this.e;
    }

    public int c() {
        return this.f26761h - this.f26762i;
    }

    public Object d() {
        return this.f26760g;
    }

    public vi.a e() {
        return this.f26769p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f26756a;
        if (str == null ? aVar.f26756a != null : !str.equals(aVar.f26756a)) {
            return false;
        }
        Map map = this.f26758c;
        if (map == null ? aVar.f26758c != null : !map.equals(aVar.f26758c)) {
            return false;
        }
        Map map2 = this.d;
        if (map2 == null ? aVar.d != null : !map2.equals(aVar.d)) {
            return false;
        }
        String str2 = this.f26759f;
        if (str2 == null ? aVar.f26759f != null : !str2.equals(aVar.f26759f)) {
            return false;
        }
        String str3 = this.f26757b;
        if (str3 == null ? aVar.f26757b != null : !str3.equals(aVar.f26757b)) {
            return false;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null ? aVar.e != null : !jSONObject.equals(aVar.e)) {
            return false;
        }
        Object obj2 = this.f26760g;
        if (obj2 == null ? aVar.f26760g == null : obj2.equals(aVar.f26760g)) {
            return this.f26761h == aVar.f26761h && this.f26762i == aVar.f26762i && this.f26763j == aVar.f26763j && this.f26764k == aVar.f26764k && this.f26765l == aVar.f26765l && this.f26766m == aVar.f26766m && this.f26767n == aVar.f26767n && this.f26768o == aVar.f26768o && this.f26769p == aVar.f26769p && this.f26770q == aVar.f26770q && this.f26771r == aVar.f26771r;
        }
        return false;
    }

    public String f() {
        return this.f26756a;
    }

    public Map g() {
        return this.d;
    }

    public String h() {
        return this.f26757b;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f26756a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26759f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26757b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f26760g;
        int b2 = ((((this.f26769p.b() + ((((((((((((((((((hashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f26761h) * 31) + this.f26762i) * 31) + this.f26763j) * 31) + this.f26764k) * 31) + (this.f26765l ? 1 : 0)) * 31) + (this.f26766m ? 1 : 0)) * 31) + (this.f26767n ? 1 : 0)) * 31) + (this.f26768o ? 1 : 0)) * 31)) * 31) + (this.f26770q ? 1 : 0)) * 31) + (this.f26771r ? 1 : 0);
        Map map = this.f26758c;
        if (map != null) {
            b2 = (b2 * 31) + map.hashCode();
        }
        Map map2 = this.d;
        if (map2 != null) {
            b2 = (b2 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            return b2;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (b2 * 31) + new String(charArray).hashCode();
    }

    public Map i() {
        return this.f26758c;
    }

    public int j() {
        return this.f26762i;
    }

    public int k() {
        return this.f26764k;
    }

    public int l() {
        return this.f26763j;
    }

    public boolean m() {
        return this.f26768o;
    }

    public boolean n() {
        return this.f26765l;
    }

    public boolean o() {
        return this.f26771r;
    }

    public boolean p() {
        return this.f26766m;
    }

    public boolean q() {
        return this.f26767n;
    }

    public boolean r() {
        return this.f26770q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest {endpoint=");
        sb.append(this.f26756a);
        sb.append(", backupEndpoint=");
        sb.append(this.f26759f);
        sb.append(", httpMethod=");
        sb.append(this.f26757b);
        sb.append(", httpHeaders=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", emptyResponse=");
        sb.append(this.f26760g);
        sb.append(", initialRetryAttempts=");
        sb.append(this.f26761h);
        sb.append(", retryAttemptsLeft=");
        sb.append(this.f26762i);
        sb.append(", timeoutMillis=");
        sb.append(this.f26763j);
        sb.append(", retryDelayMillis=");
        sb.append(this.f26764k);
        sb.append(", exponentialRetries=");
        sb.append(this.f26765l);
        sb.append(", retryOnAllErrors=");
        sb.append(this.f26766m);
        sb.append(", retryOnNoConnection=");
        sb.append(this.f26767n);
        sb.append(", encodingEnabled=");
        sb.append(this.f26768o);
        sb.append(", encodingType=");
        sb.append(this.f26769p);
        sb.append(", trackConnectionSpeed=");
        sb.append(this.f26770q);
        sb.append(", gzipBodyEncoding=");
        return android.support.v4.media.d.s(sb, this.f26771r, '}');
    }

    public void a(int i2) {
        this.f26762i = i2;
    }

    public void b(String str) {
        this.f26757b = str;
    }

    public void a(String str) {
        this.f26756a = str;
    }

    public static C0099a a(j jVar) {
        return new C0099a(jVar);
    }
}
