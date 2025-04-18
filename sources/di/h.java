package di;

import bi.k;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import ki.i0;
import ki.j;
import ki.k0;
import ki.m0;
import ki.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import wh.a0;
import wh.d0;
import wh.l0;
import wh.o0;
import wh.s0;
import wh.t0;
import wh.u0;
import wh.z;

/* loaded from: classes5.dex */
public final class h implements ci.d {
    public final l0 a;

    /* renamed from: b, reason: collision with root package name */
    public final k f17060b;

    /* renamed from: c, reason: collision with root package name */
    public final ki.k f17061c;

    /* renamed from: d, reason: collision with root package name */
    public final j f17062d;

    /* renamed from: e, reason: collision with root package name */
    public int f17063e;

    /* renamed from: f, reason: collision with root package name */
    public final a f17064f;

    /* renamed from: g, reason: collision with root package name */
    public z f17065g;

    public h(l0 l0Var, k connection, ki.k source, j sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.a = l0Var;
        this.f17060b = connection;
        this.f17061c = source;
        this.f17062d = sink;
        this.f17064f = new a(source);
    }

    public static final void f(h hVar, r rVar) {
        hVar.getClass();
        m0 m0Var = rVar.f21014e;
        ki.l0 delegate = m0.f21003d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        rVar.f21014e = delegate;
        m0Var.a();
        m0Var.b();
    }

    @Override // ci.d
    public final k0 a(u0 response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!ci.e.a(response)) {
            return g(0L);
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", u0.g(response, "Transfer-Encoding"), true);
        boolean z10 = true;
        if (equals) {
            d0 d0Var = response.f27213b.a;
            int i10 = this.f17063e;
            if (i10 != 4) {
                z10 = false;
            }
            if (z10) {
                this.f17063e = 5;
                return new d(this, d0Var);
            }
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i10)).toString());
        }
        long j3 = xh.b.j(response);
        if (j3 != -1) {
            return g(j3);
        }
        int i11 = this.f17063e;
        if (i11 != 4) {
            z10 = false;
        }
        if (z10) {
            this.f17063e = 5;
            this.f17060b.k();
            return new g(this);
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i11)).toString());
    }

    @Override // ci.d
    public final long b(u0 response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!ci.e.a(response)) {
            return 0L;
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", u0.g(response, "Transfer-Encoding"), true);
        if (equals) {
            return -1L;
        }
        return xh.b.j(response);
    }

    @Override // ci.d
    public final void c(o0 request) {
        boolean z10;
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f17060b.f2485b.f27244b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f27151b);
        sb2.append(' ');
        d0 d0Var = request.a;
        if (!d0Var.f27041j && proxyType == Proxy.Type.HTTP) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append(d0Var);
        } else {
            sb2.append(va.b.s(d0Var));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        h(request.f27152c, sb3);
    }

    @Override // ci.d
    public final void cancel() {
        Socket socket = this.f17060b.f2486c;
        if (socket != null) {
            xh.b.d(socket);
        }
    }

    @Override // ci.d
    public final k d() {
        return this.f17060b;
    }

    @Override // ci.d
    public final i0 e(o0 request, long j3) {
        boolean equals;
        Intrinsics.checkNotNullParameter(request, "request");
        s0 s0Var = request.f27153d;
        if (s0Var != null && s0Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", request.a("Transfer-Encoding"), true);
        boolean z10 = true;
        if (equals) {
            int i10 = this.f17063e;
            if (i10 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f17063e = 2;
                return new c(this);
            }
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i10)).toString());
        }
        if (j3 != -1) {
            int i11 = this.f17063e;
            if (i11 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f17063e = 2;
                return new f(this);
            }
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i11)).toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // ci.d
    public final void finishRequest() {
        this.f17062d.flush();
    }

    @Override // ci.d
    public final void flushRequest() {
        this.f17062d.flush();
    }

    public final e g(long j3) {
        boolean z10;
        int i10 = this.f17063e;
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f17063e = 5;
            return new e(this, j3);
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i10)).toString());
    }

    public final void h(z headers, String requestLine) {
        boolean z10;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i10 = this.f17063e;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j jVar = this.f17062d;
            jVar.writeUtf8(requestLine).writeUtf8("\r\n");
            int length = headers.f27243b.length / 2;
            for (int i11 = 0; i11 < length; i11++) {
                jVar.writeUtf8(headers.b(i11)).writeUtf8(": ").writeUtf8(headers.d(i11)).writeUtf8("\r\n");
            }
            jVar.writeUtf8("\r\n");
            this.f17063e = 1;
            return;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i10)).toString());
    }

    @Override // ci.d
    public final t0 readResponseHeaders(boolean z10) {
        a aVar = this.f17064f;
        int i10 = this.f17063e;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (z11) {
            try {
                String readUtf8LineStrict = aVar.a.readUtf8LineStrict(aVar.f17042b);
                aVar.f17042b -= readUtf8LineStrict.length();
                ci.h D = a0.D(readUtf8LineStrict);
                int i11 = D.f2810b;
                t0 t0Var = new t0();
                wh.m0 protocol = D.a;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                t0Var.f27200b = protocol;
                t0Var.f27201c = i11;
                String message = D.f2811c;
                Intrinsics.checkNotNullParameter(message, "message");
                t0Var.f27202d = message;
                t0Var.c(aVar.a());
                if (z10 && i11 == 100) {
                    return null;
                }
                if (i11 == 100) {
                    this.f17063e = 3;
                    return t0Var;
                }
                this.f17063e = 4;
                return t0Var;
            } catch (EOFException e2) {
                throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", this.f17060b.f2485b.a.f27007i.g()), e2);
            }
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i10)).toString());
    }
}
