package ci;

import bi.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wh.e0;
import wh.f0;
import wh.o0;
import wh.u0;

/* loaded from: classes5.dex */
public final class f implements e0 {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2802b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2803c;

    /* renamed from: d, reason: collision with root package name */
    public final a4.f f2804d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f2805e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2806f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2807g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2808h;

    /* renamed from: i, reason: collision with root package name */
    public int f2809i;

    public f(i call, List interceptors, int i10, a4.f fVar, o0 request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = call;
        this.f2802b = interceptors;
        this.f2803c = i10;
        this.f2804d = fVar;
        this.f2805e = request;
        this.f2806f = i11;
        this.f2807g = i12;
        this.f2808h = i13;
    }

    public static f a(f fVar, int i10, a4.f fVar2, o0 o0Var, int i11) {
        int i12;
        int i13;
        int i14;
        if ((i11 & 1) != 0) {
            i10 = fVar.f2803c;
        }
        int i15 = i10;
        if ((i11 & 2) != 0) {
            fVar2 = fVar.f2804d;
        }
        a4.f fVar3 = fVar2;
        if ((i11 & 4) != 0) {
            o0Var = fVar.f2805e;
        }
        o0 request = o0Var;
        if ((i11 & 8) != 0) {
            i12 = fVar.f2806f;
        } else {
            i12 = 0;
        }
        if ((i11 & 16) != 0) {
            i13 = fVar.f2807g;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            i14 = fVar.f2808h;
        } else {
            i14 = 0;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new f(fVar.a, fVar.f2802b, i15, fVar3, request, i12, i13, i14);
    }

    public final u0 b(o0 request) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(request, "request");
        List list = this.f2802b;
        int size = list.size();
        boolean z13 = false;
        int i10 = this.f2803c;
        if (i10 < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2809i++;
            a4.f fVar = this.f2804d;
            if (fVar != null) {
                if (((bi.e) fVar.f112d).b(request.a)) {
                    if (this.f2809i == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
                }
            }
            int i11 = i10 + 1;
            f a = a(this, i11, null, request, 58);
            f0 f0Var = (f0) list.get(i10);
            u0 intercept = f0Var.intercept(a);
            if (intercept != null) {
                if (fVar != null) {
                    if (i11 < list.size() && a.f2809i != 1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new IllegalStateException(("network interceptor " + f0Var + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.f27219i != null) {
                    z13 = true;
                }
                if (z13) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + f0Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + f0Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
