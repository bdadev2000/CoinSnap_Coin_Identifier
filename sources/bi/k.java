package bi;

import androidx.lifecycle.r0;
import ei.a0;
import ei.b0;
import ei.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ki.d0;
import ki.e0;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import wh.l0;
import wh.m0;
import wh.p;
import wh.r;
import wh.y;
import wh.z0;
import y7.u;

/* loaded from: classes5.dex */
public final class k extends ei.j {

    /* renamed from: b, reason: collision with root package name */
    public final z0 f2485b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f2486c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f2487d;

    /* renamed from: e, reason: collision with root package name */
    public y f2488e;

    /* renamed from: f, reason: collision with root package name */
    public m0 f2489f;

    /* renamed from: g, reason: collision with root package name */
    public t f2490g;

    /* renamed from: h, reason: collision with root package name */
    public e0 f2491h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f2492i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2493j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2494k;

    /* renamed from: l, reason: collision with root package name */
    public int f2495l;

    /* renamed from: m, reason: collision with root package name */
    public int f2496m;

    /* renamed from: n, reason: collision with root package name */
    public int f2497n;

    /* renamed from: o, reason: collision with root package name */
    public int f2498o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2499p;

    /* renamed from: q, reason: collision with root package name */
    public long f2500q;

    public k(l connectionPool, z0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f2485b = route;
        this.f2498o = 1;
        this.f2499p = new ArrayList();
        this.f2500q = Long.MAX_VALUE;
    }

    public static void d(l0 client, z0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f27244b.type() != Proxy.Type.DIRECT) {
            wh.a aVar = failedRoute.a;
            aVar.f27006h.connectFailed(aVar.f27007i.h(), failedRoute.f27244b.address(), failure);
        }
        u uVar = client.B;
        synchronized (uVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((Set) uVar.f28007b).add(failedRoute);
        }
    }

    @Override // ei.j
    public final synchronized void a(t connection, ei.e0 settings) {
        int i10;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        if ((settings.a & 16) != 0) {
            i10 = settings.f17415b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f2498o = i10;
    }

    @Override // ei.j
    public final void b(a0 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(ei.b.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, i call, y5.f eventListener) {
        boolean z11;
        z0 z0Var;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f2489f == null) {
            List list = this.f2485b.a.f27009k;
            b bVar = new b(list);
            wh.a aVar = this.f2485b.a;
            if (aVar.f27001c == null) {
                if (list.contains(r.f27184f)) {
                    String str = this.f2485b.a.f27007i.f27035d;
                    gi.l lVar = gi.l.a;
                    if (!gi.l.a.h(str)) {
                        throw new m(new UnknownServiceException(com.applovin.impl.mediation.ads.e.f("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (aVar.f27008j.contains(m0.H2_PRIOR_KNOWLEDGE)) {
                throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            m mVar = null;
            do {
                try {
                    z0 z0Var2 = this.f2485b;
                    if (z0Var2.a.f27001c != null && z0Var2.f27244b.type() == Proxy.Type.HTTP) {
                        f(i10, i11, i12, call, eventListener);
                        if (this.f2486c == null) {
                            z0Var = this.f2485b;
                            if (!(z0Var.a.f27001c == null && z0Var.f27244b.type() == Proxy.Type.HTTP) && this.f2486c == null) {
                                throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f2500q = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            e(i10, i11, call, eventListener);
                        } catch (IOException e2) {
                            e = e2;
                            Socket socket = this.f2487d;
                            if (socket != null) {
                                xh.b.d(socket);
                            }
                            Socket socket2 = this.f2486c;
                            if (socket2 != null) {
                                xh.b.d(socket2);
                            }
                            this.f2487d = null;
                            this.f2486c = null;
                            this.f2491h = null;
                            this.f2492i = null;
                            this.f2488e = null;
                            this.f2489f = null;
                            this.f2490g = null;
                            this.f2498o = 1;
                            z0 z0Var3 = this.f2485b;
                            InetSocketAddress inetSocketAddress = z0Var3.f27245c;
                            Proxy proxy = z0Var3.f27244b;
                            eventListener.getClass();
                            Intrinsics.checkNotNullParameter(call, "call");
                            Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
                            Intrinsics.checkNotNullParameter(proxy, "proxy");
                            Intrinsics.checkNotNullParameter(e, "ioe");
                            if (mVar == null) {
                                mVar = new m(e);
                            } else {
                                Intrinsics.checkNotNullParameter(e, "e");
                                ExceptionsKt.addSuppressed(mVar.f2505b, e);
                                mVar.f2506c = e;
                            }
                            if (z10) {
                                Intrinsics.checkNotNullParameter(e, "e");
                                z11 = true;
                                bVar.f2442d = true;
                                if (!bVar.f2441c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
                                    z11 = false;
                                }
                            } else {
                                throw mVar;
                            }
                        }
                    }
                    g(bVar, call, eventListener);
                    z0 z0Var4 = this.f2485b;
                    InetSocketAddress inetSocketAddress2 = z0Var4.f27245c;
                    Proxy proxy2 = z0Var4.f27244b;
                    eventListener.getClass();
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(inetSocketAddress2, "inetSocketAddress");
                    Intrinsics.checkNotNullParameter(proxy2, "proxy");
                    z0Var = this.f2485b;
                    if (!(z0Var.a.f27001c == null && z0Var.f27244b.type() == Proxy.Type.HTTP)) {
                    }
                    this.f2500q = System.nanoTime();
                    return;
                } catch (IOException e10) {
                    e = e10;
                }
            } while (z11);
            throw mVar;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void e(int i10, int i11, i call, y5.f fVar) {
        int i12;
        Socket createSocket;
        z0 z0Var = this.f2485b;
        Proxy proxy = z0Var.f27244b;
        wh.a aVar = z0Var.a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i12 = -1;
        } else {
            i12 = j.a[type.ordinal()];
        }
        if (i12 != 1 && i12 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = aVar.f27000b.createSocket();
            Intrinsics.checkNotNull(createSocket);
        }
        this.f2486c = createSocket;
        InetSocketAddress inetSocketAddress = this.f2485b.f27245c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        createSocket.setSoTimeout(i11);
        try {
            gi.l lVar = gi.l.a;
            gi.l.a.e(createSocket, this.f2485b.f27245c, i10);
            try {
                this.f2491h = a6.k.f(a6.k.O(createSocket));
                this.f2492i = a6.k.e(a6.k.I(createSocket));
            } catch (NullPointerException e2) {
                if (!Intrinsics.areEqual(e2.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f2485b.f27245c));
            connectException.initCause(e10);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0180, code lost:
    
        if (r7 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0183, code lost:
    
        r3 = r19.f2486c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0185, code lost:
    
        if (r3 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0188, code lost:
    
        xh.b.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x018b, code lost:
    
        r19.f2486c = null;
        r19.f2492i = null;
        r19.f2491h = null;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r23, "call");
        r10 = r4.f27245c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "inetSocketAddress");
        r10 = r4.f27244b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "proxy");
        r1 = r21;
        r2 = r23;
        r10 = r11;
        r8 = true;
        r9 = r6;
        r11 = r7;
        r6 = null;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ba, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r20, int r21, int r22, bi.i r23, y5.f r24) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.k.f(int, int, int, bi.i, y5.f):void");
    }

    public final void g(b bVar, i call, y5.f fVar) {
        String trimMargin$default;
        wh.a aVar = this.f2485b.a;
        SSLSocketFactory sSLSocketFactory = aVar.f27001c;
        m0 m0Var = m0.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.f27008j;
            m0 m0Var2 = m0.H2_PRIOR_KNOWLEDGE;
            if (list.contains(m0Var2)) {
                this.f2487d = this.f2486c;
                this.f2489f = m0Var2;
                l();
                return;
            } else {
                this.f2487d = this.f2486c;
                this.f2489f = m0Var;
                return;
            }
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        wh.a aVar2 = this.f2485b.a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f27001c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory2);
            Socket socket = this.f2486c;
            wh.d0 d0Var = aVar2.f27007i;
            int i10 = 1;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, d0Var.f27035d, d0Var.f27036e, true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    r a = bVar.a(sSLSocket2);
                    if (a.f27185b) {
                        gi.l lVar = gi.l.a;
                        gi.l.a.d(sSLSocket2, aVar2.f27007i.f27035d, aVar2.f27008j);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession sslSocketSession = sSLSocket2.getSession();
                    Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                    y q10 = wh.a0.q(sslSocketSession);
                    HostnameVerifier hostnameVerifier = aVar2.f27002d;
                    Intrinsics.checkNotNull(hostnameVerifier);
                    if (!hostnameVerifier.verify(aVar2.f27007i.f27035d, sslSocketSession)) {
                        List a10 = q10.a();
                        if (!a10.isEmpty()) {
                            X509Certificate certificate = (X509Certificate) a10.get(0);
                            StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                            sb2.append(aVar2.f27007i.f27035d);
                            sb2.append(" not verified:\n              |    certificate: ");
                            wh.n nVar = wh.n.f27144c;
                            sb2.append(wh.a0.F(certificate));
                            sb2.append("\n              |    DN: ");
                            sb2.append((Object) certificate.getSubjectDN().getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            Intrinsics.checkNotNullParameter(certificate, "certificate");
                            sb2.append(CollectionsKt.plus((Collection) ji.c.a(certificate, 7), (Iterable) ji.c.a(certificate, 2)));
                            sb2.append("\n              ");
                            trimMargin$default = StringsKt__IndentKt.trimMargin$default(sb2.toString(), null, 1, null);
                            throw new SSLPeerUnverifiedException(trimMargin$default);
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.f27007i.f27035d + " not verified (no certificates)");
                    }
                    wh.n nVar2 = aVar2.f27003e;
                    Intrinsics.checkNotNull(nVar2);
                    this.f2488e = new y(q10.a, q10.f27240b, q10.f27241c, new wh.m(nVar2, q10, aVar2, i10));
                    nVar2.a(aVar2.f27007i.f27035d, new r0(this, 4));
                    if (a.f27185b) {
                        gi.l lVar2 = gi.l.a;
                        str = gi.l.a.f(sSLSocket2);
                    }
                    this.f2487d = sSLSocket2;
                    this.f2491h = a6.k.f(a6.k.O(sSLSocket2));
                    this.f2492i = a6.k.e(a6.k.I(sSLSocket2));
                    if (str != null) {
                        m0Var = wh.a0.s(str);
                    }
                    this.f2489f = m0Var;
                    gi.l lVar3 = gi.l.a;
                    gi.l.a.a(sSLSocket2);
                    Intrinsics.checkNotNullParameter(call, "call");
                    if (this.f2489f == m0.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        gi.l lVar4 = gi.l.a;
                        gi.l.a.a(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        xh.b.d(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(wh.a r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.k.h(wh.a, java.util.List):boolean");
    }

    public final boolean i(boolean z10) {
        long j3;
        byte[] bArr = xh.b.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f2486c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f2487d;
        Intrinsics.checkNotNull(socket2);
        e0 source = this.f2491h;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        t tVar = this.f2490g;
        if (tVar != null) {
            synchronized (tVar) {
                if (tVar.f17462i) {
                    return false;
                }
                if (tVar.f17471r < tVar.f17470q) {
                    if (nanoTime >= tVar.f17472s) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j3 = nanoTime - this.f2500q;
        }
        if (j3 < 10000000000L || !z10) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z11 = !source.exhausted();
                socket2.setSoTimeout(soTimeout);
                return z11;
            } catch (Throwable th2) {
                socket2.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final ci.d j(l0 client, ci.f chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f2487d;
        Intrinsics.checkNotNull(socket);
        e0 e0Var = this.f2491h;
        Intrinsics.checkNotNull(e0Var);
        d0 d0Var = this.f2492i;
        Intrinsics.checkNotNull(d0Var);
        t tVar = this.f2490g;
        if (tVar != null) {
            return new ei.u(client, this, chain, tVar);
        }
        int i10 = chain.f2807g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e0Var.timeout().g(i10, timeUnit);
        d0Var.timeout().g(chain.f2808h, timeUnit);
        return new di.h(client, this, e0Var, d0Var);
    }

    public final synchronized void k() {
        this.f2493j = true;
    }

    public final void l() {
        String stringPlus;
        int i10;
        int i11;
        Socket socket = this.f2487d;
        Intrinsics.checkNotNull(socket);
        e0 source = this.f2491h;
        Intrinsics.checkNotNull(source);
        d0 sink = this.f2492i;
        Intrinsics.checkNotNull(sink);
        int i12 = 0;
        socket.setSoTimeout(0);
        ai.f taskRunner = ai.f.f500i;
        ei.h hVar = new ei.h(taskRunner);
        String peerName = this.f2485b.a.f27007i.f27035d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        hVar.f17422c = socket;
        if (hVar.a) {
            stringPlus = xh.b.f27682g + ' ' + peerName;
        } else {
            stringPlus = Intrinsics.stringPlus("MockWebServer ", peerName);
        }
        Intrinsics.checkNotNullParameter(stringPlus, "<set-?>");
        hVar.f17423d = stringPlus;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        hVar.f17424e = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        hVar.f17425f = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        hVar.f17426g = this;
        hVar.f17428i = 0;
        t tVar = new t(hVar);
        this.f2490g = tVar;
        ei.e0 e0Var = t.D;
        if ((e0Var.a & 16) != 0) {
            i10 = e0Var.f17415b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f2498o = i10;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        b0 b0Var = tVar.A;
        synchronized (b0Var) {
            if (!b0Var.f17388g) {
                if (b0Var.f17385c) {
                    Logger logger = b0.f17383i;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(xh.b.h(Intrinsics.stringPlus(">> CONNECTION ", ei.g.a.e()), new Object[0]));
                    }
                    b0Var.f17384b.E(ei.g.a);
                    b0Var.f17384b.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        b0 b0Var2 = tVar.A;
        ei.e0 settings = tVar.f17473t;
        synchronized (b0Var2) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (!b0Var2.f17388g) {
                b0Var2.j(0, Integer.bitCount(settings.a) * 6, 4, 0);
                int i13 = 0;
                while (i13 < 10) {
                    int i14 = i13 + 1;
                    boolean z10 = true;
                    if (((1 << i13) & settings.a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        if (i13 != 4) {
                            if (i13 != 7) {
                                i11 = i13;
                            } else {
                                i11 = 4;
                            }
                        } else {
                            i11 = 3;
                        }
                        b0Var2.f17384b.writeShort(i11);
                        b0Var2.f17384b.writeInt(settings.f17415b[i13]);
                    }
                    i13 = i14;
                }
                b0Var2.f17384b.flush();
            } else {
                throw new IOException("closed");
            }
        }
        if (tVar.f17473t.a() != 65535) {
            tVar.A.r(0, r1 - 65535);
        }
        taskRunner.f().c(new ai.b(tVar.f17459f, i12, tVar.B), 0L);
    }

    public final String toString() {
        p pVar;
        StringBuilder sb2 = new StringBuilder("Connection{");
        z0 z0Var = this.f2485b;
        sb2.append(z0Var.a.f27007i.f27035d);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(z0Var.a.f27007i.f27036e);
        sb2.append(", proxy=");
        sb2.append(z0Var.f27244b);
        sb2.append(" hostAddress=");
        sb2.append(z0Var.f27245c);
        sb2.append(" cipherSuite=");
        y yVar = this.f2488e;
        Object obj = "none";
        if (yVar != null && (pVar = yVar.f27240b) != null) {
            obj = pVar;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f2489f);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
