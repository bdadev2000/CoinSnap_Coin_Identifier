package wh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 {
    public o0 a;

    /* renamed from: b, reason: collision with root package name */
    public m0 f27200b;

    /* renamed from: c, reason: collision with root package name */
    public int f27201c;

    /* renamed from: d, reason: collision with root package name */
    public String f27202d;

    /* renamed from: e, reason: collision with root package name */
    public y f27203e;

    /* renamed from: f, reason: collision with root package name */
    public a4.s f27204f;

    /* renamed from: g, reason: collision with root package name */
    public y0 f27205g;

    /* renamed from: h, reason: collision with root package name */
    public u0 f27206h;

    /* renamed from: i, reason: collision with root package name */
    public u0 f27207i;

    /* renamed from: j, reason: collision with root package name */
    public u0 f27208j;

    /* renamed from: k, reason: collision with root package name */
    public long f27209k;

    /* renamed from: l, reason: collision with root package name */
    public long f27210l;

    /* renamed from: m, reason: collision with root package name */
    public a4.f f27211m;

    public t0() {
        this.f27201c = -1;
        this.f27204f = new a4.s();
    }

    public static void b(String str, u0 u0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (u0Var != null) {
            boolean z13 = true;
            if (u0Var.f27219i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (u0Var.f27220j == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (u0Var.f27221k == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (u0Var.f27222l != null) {
                            z13 = false;
                        }
                        if (z13) {
                            return;
                        } else {
                            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
                        }
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
        }
    }

    public final u0 a() {
        boolean z10;
        int i10 = this.f27201c;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            o0 o0Var = this.a;
            if (o0Var != null) {
                m0 m0Var = this.f27200b;
                if (m0Var != null) {
                    String str = this.f27202d;
                    if (str != null) {
                        return new u0(o0Var, m0Var, str, i10, this.f27203e, this.f27204f.d(), this.f27205g, this.f27206h, this.f27207i, this.f27208j, this.f27209k, this.f27210l, this.f27211m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(Intrinsics.stringPlus("code < 0: ", Integer.valueOf(i10)).toString());
    }

    public final void c(z headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        a4.s c10 = headers.c();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        this.f27204f = c10;
    }

    public t0(u0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f27201c = -1;
        this.a = response.f27213b;
        this.f27200b = response.f27214c;
        this.f27201c = response.f27216f;
        this.f27202d = response.f27215d;
        this.f27203e = response.f27217g;
        this.f27204f = response.f27218h.c();
        this.f27205g = response.f27219i;
        this.f27206h = response.f27220j;
        this.f27207i = response.f27221k;
        this.f27208j = response.f27222l;
        this.f27209k = response.f27223m;
        this.f27210l = response.f27224n;
        this.f27211m = response.f27225o;
    }
}
