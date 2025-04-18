package wh;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class u0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f27213b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f27214c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27215d;

    /* renamed from: f, reason: collision with root package name */
    public final int f27216f;

    /* renamed from: g, reason: collision with root package name */
    public final y f27217g;

    /* renamed from: h, reason: collision with root package name */
    public final z f27218h;

    /* renamed from: i, reason: collision with root package name */
    public final y0 f27219i;

    /* renamed from: j, reason: collision with root package name */
    public final u0 f27220j;

    /* renamed from: k, reason: collision with root package name */
    public final u0 f27221k;

    /* renamed from: l, reason: collision with root package name */
    public final u0 f27222l;

    /* renamed from: m, reason: collision with root package name */
    public final long f27223m;

    /* renamed from: n, reason: collision with root package name */
    public final long f27224n;

    /* renamed from: o, reason: collision with root package name */
    public final a4.f f27225o;

    /* renamed from: p, reason: collision with root package name */
    public i f27226p;

    public u0(o0 request, m0 protocol, String message, int i10, y yVar, z headers, y0 y0Var, u0 u0Var, u0 u0Var2, u0 u0Var3, long j3, long j10, a4.f fVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f27213b = request;
        this.f27214c = protocol;
        this.f27215d = message;
        this.f27216f = i10;
        this.f27217g = yVar;
        this.f27218h = headers;
        this.f27219i = y0Var;
        this.f27220j = u0Var;
        this.f27221k = u0Var2;
        this.f27222l = u0Var3;
        this.f27223m = j3;
        this.f27224n = j10;
        this.f27225o = fVar;
    }

    public static String g(u0 u0Var, String name) {
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String a = u0Var.f27218h.a(name);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y0 y0Var = this.f27219i;
        if (y0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        y0Var.close();
    }

    public final i d() {
        i iVar = this.f27226p;
        if (iVar == null) {
            int i10 = i.f27066n;
            i o10 = qc.s0.o(this.f27218h);
            this.f27226p = o10;
            return o10;
        }
        return iVar;
    }

    public final boolean j() {
        int i10 = this.f27216f;
        return 200 <= i10 && i10 < 300;
    }

    public final String toString() {
        return "Response{protocol=" + this.f27214c + ", code=" + this.f27216f + ", message=" + this.f27215d + ", url=" + this.f27213b.a + AbstractJsonLexerKt.END_OBJ;
    }
}
