package ei;

import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import ki.i0;
import ki.k0;
import kotlin.jvm.internal.Intrinsics;
import wh.l0;
import wh.m0;
import wh.o0;
import wh.t0;
import wh.u0;

/* loaded from: classes5.dex */
public final class u implements ci.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f17479g = xh.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final List f17480h = xh.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final bi.k a;

    /* renamed from: b, reason: collision with root package name */
    public final ci.f f17481b;

    /* renamed from: c, reason: collision with root package name */
    public final t f17482c;

    /* renamed from: d, reason: collision with root package name */
    public volatile a0 f17483d;

    /* renamed from: e, reason: collision with root package name */
    public final m0 f17484e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f17485f;

    public u(l0 client, bi.k connection, ci.f chain, t http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.a = connection;
        this.f17481b = chain;
        this.f17482c = http2Connection;
        m0 m0Var = m0.H2_PRIOR_KNOWLEDGE;
        this.f17484e = client.u.contains(m0Var) ? m0Var : m0.HTTP_2;
    }

    @Override // ci.d
    public final k0 a(u0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        a0 a0Var = this.f17483d;
        Intrinsics.checkNotNull(a0Var);
        return a0Var.f17369i;
    }

    @Override // ci.d
    public final long b(u0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!ci.e.a(response)) {
            return 0L;
        }
        return xh.b.j(response);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[Catch: all -> 0x01a4, TryCatch #0 {, blocks: (B:30:0x00be, B:32:0x00c5, B:33:0x00ca, B:35:0x00ce, B:37:0x00e1, B:39:0x00e9, B:43:0x00f5, B:45:0x00fb, B:46:0x0104, B:87:0x019e, B:88:0x01a3), top: B:29:0x00be, outer: #2 }] */
    @Override // ci.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(wh.o0 r19) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.u.c(wh.o0):void");
    }

    @Override // ci.d
    public final void cancel() {
        this.f17485f = true;
        a0 a0Var = this.f17483d;
        if (a0Var != null) {
            a0Var.e(b.CANCEL);
        }
    }

    @Override // ci.d
    public final bi.k d() {
        return this.a;
    }

    @Override // ci.d
    public final i0 e(o0 request, long j3) {
        Intrinsics.checkNotNullParameter(request, "request");
        a0 a0Var = this.f17483d;
        Intrinsics.checkNotNull(a0Var);
        return a0Var.f();
    }

    @Override // ci.d
    public final void finishRequest() {
        a0 a0Var = this.f17483d;
        Intrinsics.checkNotNull(a0Var);
        a0Var.f().close();
    }

    @Override // ci.d
    public final void flushRequest() {
        this.f17482c.flush();
    }

    @Override // ci.d
    public final t0 readResponseHeaders(boolean z10) {
        wh.z headerBlock;
        a0 a0Var = this.f17483d;
        Intrinsics.checkNotNull(a0Var);
        synchronized (a0Var) {
            a0Var.f17371k.h();
            while (a0Var.f17367g.isEmpty() && a0Var.f17373m == null) {
                try {
                    a0Var.j();
                } catch (Throwable th2) {
                    a0Var.f17371k.l();
                    throw th2;
                }
            }
            a0Var.f17371k.l();
            if (!a0Var.f17367g.isEmpty()) {
                Object removeFirst = a0Var.f17367g.removeFirst();
                Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
                headerBlock = (wh.z) removeFirst;
            } else {
                IOException iOException = a0Var.f17374n;
                if (iOException == null) {
                    b bVar = a0Var.f17373m;
                    Intrinsics.checkNotNull(bVar);
                    throw new f0(bVar);
                }
                throw iOException;
            }
        }
        m0 protocol = this.f17484e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        a4.s sVar = new a4.s();
        int length = headerBlock.f27243b.length / 2;
        int i10 = 0;
        ci.h hVar = null;
        while (i10 < length) {
            int i11 = i10 + 1;
            String b3 = headerBlock.b(i10);
            String d10 = headerBlock.d(i10);
            if (Intrinsics.areEqual(b3, Header.RESPONSE_STATUS_UTF8)) {
                hVar = wh.a0.D(Intrinsics.stringPlus("HTTP/1.1 ", d10));
            } else if (!f17480h.contains(b3)) {
                sVar.c(b3, d10);
            }
            i10 = i11;
        }
        if (hVar != null) {
            t0 t0Var = new t0();
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            t0Var.f27200b = protocol;
            t0Var.f27201c = hVar.f2810b;
            String message = hVar.f2811c;
            Intrinsics.checkNotNullParameter(message, "message");
            t0Var.f27202d = message;
            t0Var.c(sVar.d());
            if (z10 && t0Var.f27201c == 100) {
                return null;
            }
            return t0Var;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }
}
