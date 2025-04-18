package wh;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes5.dex */
public final class n0 {
    public d0 a;

    /* renamed from: b, reason: collision with root package name */
    public String f27146b;

    /* renamed from: c, reason: collision with root package name */
    public a4.s f27147c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f27148d;

    /* renamed from: e, reason: collision with root package name */
    public Map f27149e;

    public n0() {
        this.f27149e = new LinkedHashMap();
        this.f27146b = "GET";
        this.f27147c = new a4.s();
    }

    public final void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27147c.a(name, value);
    }

    public final o0 b() {
        Map unmodifiableMap;
        d0 d0Var = this.a;
        if (d0Var != null) {
            String str = this.f27146b;
            z d10 = this.f27147c.d();
            s0 s0Var = this.f27148d;
            Map map = this.f27149e;
            byte[] bArr = xh.b.a;
            Intrinsics.checkNotNullParameter(map, "<this>");
            if (map.isEmpty()) {
                unmodifiableMap = MapsKt.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new o0(d0Var, str, d10, s0Var, unmodifiableMap);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public final void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        a4.s sVar = this.f27147c;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        qc.s0.e(name);
        qc.s0.f(value, name);
        sVar.f(name);
        sVar.c(name, value);
    }

    public final void d(z headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        a4.s c10 = headers.c();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        this.f27147c = c10;
    }

    public final void e(String method, s0 s0Var) {
        boolean z10;
        Intrinsics.checkNotNullParameter(method, "method");
        boolean z11 = false;
        if (method.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (s0Var == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")) {
                    z11 = true;
                }
                if (!(!z11)) {
                    throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("method ", method, " must have a request body.").toString());
                }
            } else if (!v8.u0.X(method)) {
                throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("method ", method, " must not have a request body.").toString());
            }
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            this.f27146b = method;
            this.f27148d = s0Var;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public final void f(s0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        e("POST", body);
    }

    public final void g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f27147c.f(name);
    }

    public final void h(Class type, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (obj == null) {
            this.f27149e.remove(type);
            return;
        }
        if (this.f27149e.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
            this.f27149e = linkedHashMap;
        }
        Map map = this.f27149e;
        Object cast = type.cast(obj);
        Intrinsics.checkNotNull(cast);
        map.put(type, cast);
    }

    public final void i(String url) {
        boolean startsWith;
        boolean startsWith2;
        Intrinsics.checkNotNullParameter(url, "url");
        startsWith = StringsKt__StringsJVMKt.startsWith(url, "ws:", true);
        if (startsWith) {
            String substring = url.substring(3);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            url = Intrinsics.stringPlus("http:", substring);
        } else {
            startsWith2 = StringsKt__StringsJVMKt.startsWith(url, "wss:", true);
            if (startsWith2) {
                String substring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.stringPlus("https:", substring2);
            }
        }
        char[] cArr = d0.f27032k;
        d0 url2 = c0.i(url);
        Intrinsics.checkNotNullParameter(url2, "url");
        this.a = url2;
    }

    public n0(o0 request) {
        Map mutableMap;
        Intrinsics.checkNotNullParameter(request, "request");
        this.f27149e = new LinkedHashMap();
        this.a = request.a;
        this.f27146b = request.f27151b;
        this.f27148d = request.f27153d;
        Map map = request.f27154e;
        if (map.isEmpty()) {
            mutableMap = new LinkedHashMap();
        } else {
            mutableMap = MapsKt.toMutableMap(map);
        }
        this.f27149e = mutableMap;
        this.f27147c = request.f27152c.c();
    }
}
