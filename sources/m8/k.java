package m8;

import M0.C0219j;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.C0475m;
import com.adjust.sdk.Constants;
import com.facebook.internal.C1838g;
import com.mbridge.msdk.foundation.download.Command;
import g4.AbstractC2292b;
import i8.A;
import i8.B;
import i8.C;
import i8.C2364a;
import i8.C2365b;
import i8.C2375l;
import i8.C2377n;
import i8.C2378o;
import i8.H;
import i8.I;
import i8.InterfaceC2373j;
import i8.N;
import i8.r;
import i8.u;
import i8.z;
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
import java.util.LinkedHashSet;
import java.util.List;
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
import p8.D;
import p8.EnumC2574b;
import p8.s;
import t7.AbstractC2712a;
import w4.v0;
import w8.t;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class k extends p8.i {
    public final N b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f21799c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f21800d;

    /* renamed from: e, reason: collision with root package name */
    public r f21801e;

    /* renamed from: f, reason: collision with root package name */
    public A f21802f;

    /* renamed from: g, reason: collision with root package name */
    public s f21803g;

    /* renamed from: h, reason: collision with root package name */
    public t f21804h;

    /* renamed from: i, reason: collision with root package name */
    public w8.s f21805i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21806j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21807k;
    public int l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f21808n;

    /* renamed from: o, reason: collision with root package name */
    public int f21809o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f21810p;

    /* renamed from: q, reason: collision with root package name */
    public long f21811q;

    public k(l lVar, N n2) {
        G7.j.e(lVar, "connectionPool");
        G7.j.e(n2, "route");
        this.b = n2;
        this.f21809o = 1;
        this.f21810p = new ArrayList();
        this.f21811q = Long.MAX_VALUE;
    }

    public static void d(z zVar, N n2, IOException iOException) {
        G7.j.e(zVar, "client");
        G7.j.e(n2, "failedRoute");
        G7.j.e(iOException, "failure");
        if (n2.b.type() != Proxy.Type.DIRECT) {
            C2364a c2364a = n2.f20791a;
            c2364a.f20804g.connectFailed(c2364a.f20805h.g(), n2.b.address(), iOException);
        }
        C1838g c1838g = zVar.f20919B;
        synchronized (c1838g) {
            ((LinkedHashSet) c1838g.b).add(n2);
        }
    }

    @Override // p8.i
    public final synchronized void a(s sVar, D d2) {
        int i9;
        G7.j.e(sVar, "connection");
        G7.j.e(d2, "settings");
        if ((d2.f22382a & 16) != 0) {
            i9 = d2.b[4];
        } else {
            i9 = Integer.MAX_VALUE;
        }
        this.f21809o = i9;
    }

    @Override // p8.i
    public final void b(p8.z zVar) {
        G7.j.e(zVar, "stream");
        zVar.c(EnumC2574b.REFUSED_STREAM, null);
    }

    public final void c(int i9, int i10, int i11, boolean z8, InterfaceC2373j interfaceC2373j, C2365b c2365b) {
        N n2;
        G7.j.e(interfaceC2373j, NotificationCompat.CATEGORY_CALL);
        G7.j.e(c2365b, "eventListener");
        if (this.f21802f == null) {
            List list = this.b.f20791a.f20807j;
            b bVar = new b(list);
            C2364a c2364a = this.b.f20791a;
            if (c2364a.f20800c == null) {
                if (list.contains(C2378o.f20857f)) {
                    String str = this.b.f20791a.f20805h.f20886d;
                    r8.m mVar = r8.m.f22950a;
                    if (!r8.m.f22950a.h(str)) {
                        throw new m(new UnknownServiceException(AbstractC2914a.e("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (c2364a.f20806i.contains(A.H2_PRIOR_KNOWLEDGE)) {
                throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            m mVar2 = null;
            do {
                try {
                    N n9 = this.b;
                    if (n9.f20791a.f20800c != null && n9.b.type() == Proxy.Type.HTTP) {
                        f(i9, i10, i11, interfaceC2373j, c2365b);
                        if (this.f21799c == null) {
                            n2 = this.b;
                            if (n2.f20791a.f20800c == null && n2.b.type() == Proxy.Type.HTTP && this.f21799c == null) {
                                throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f21811q = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            e(i9, i10, interfaceC2373j, c2365b);
                        } catch (IOException e4) {
                            e = e4;
                            Socket socket = this.f21800d;
                            if (socket != null) {
                                j8.b.d(socket);
                            }
                            Socket socket2 = this.f21799c;
                            if (socket2 != null) {
                                j8.b.d(socket2);
                            }
                            this.f21800d = null;
                            this.f21799c = null;
                            this.f21804h = null;
                            this.f21805i = null;
                            this.f21801e = null;
                            this.f21802f = null;
                            this.f21803g = null;
                            this.f21809o = 1;
                            N n10 = this.b;
                            InetSocketAddress inetSocketAddress = n10.f20792c;
                            Proxy proxy = n10.b;
                            G7.j.e(inetSocketAddress, "inetSocketAddress");
                            G7.j.e(proxy, "proxy");
                            if (mVar2 == null) {
                                mVar2 = new m(e);
                            } else {
                                AbstractC2712a.a(mVar2.b, e);
                                mVar2.f21816c = e;
                            }
                            if (z8) {
                                bVar.f21759d = true;
                                if (bVar.f21758c) {
                                    if (!(e instanceof ProtocolException)) {
                                        if (!(e instanceof InterruptedIOException)) {
                                            if (!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) {
                                                if (e instanceof SSLPeerUnverifiedException) {
                                                    throw mVar2;
                                                }
                                            } else {
                                                throw mVar2;
                                            }
                                        } else {
                                            throw mVar2;
                                        }
                                    } else {
                                        throw mVar2;
                                    }
                                } else {
                                    throw mVar2;
                                }
                            } else {
                                throw mVar2;
                            }
                        }
                    }
                    g(bVar, interfaceC2373j, c2365b);
                    G7.j.e(this.b.f20792c, "inetSocketAddress");
                    n2 = this.b;
                    if (n2.f20791a.f20800c == null) {
                    }
                    this.f21811q = System.nanoTime();
                    return;
                } catch (IOException e9) {
                    e = e9;
                }
            } while (e instanceof SSLException);
            throw mVar2;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void e(int i9, int i10, InterfaceC2373j interfaceC2373j, C2365b c2365b) {
        int i11;
        Socket createSocket;
        N n2 = this.b;
        Proxy proxy = n2.b;
        C2364a c2364a = n2.f20791a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = j.f21798a[type.ordinal()];
        }
        if (i11 != 1 && i11 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = c2364a.b.createSocket();
            G7.j.b(createSocket);
        }
        this.f21799c = createSocket;
        InetSocketAddress inetSocketAddress = this.b.f20792c;
        c2365b.getClass();
        G7.j.e(interfaceC2373j, NotificationCompat.CATEGORY_CALL);
        G7.j.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i10);
        try {
            r8.m mVar = r8.m.f22950a;
            r8.m.f22950a.e(createSocket, this.b.f20792c, i9);
            try {
                this.f21804h = r8.k.f(r8.k.z(createSocket));
                this.f21805i = r8.k.e(r8.k.w(createSocket));
            } catch (NullPointerException e4) {
                if (!G7.j.a(e4.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException(G7.j.j(this.b.f20792c, "Failed to connect to "));
            connectException.initCause(e9);
            throw connectException;
        }
    }

    public final void f(int i9, int i10, int i11, InterfaceC2373j interfaceC2373j, C2365b c2365b) {
        B b = new B();
        N n2 = this.b;
        u uVar = n2.f20791a.f20805h;
        G7.j.e(uVar, "url");
        b.f20750a = uVar;
        b.d("CONNECT", null);
        C2364a c2364a = n2.f20791a;
        b.c("Host", j8.b.v(c2364a.f20805h, true));
        b.c("Proxy-Connection", "Keep-Alive");
        b.c(Command.HTTP_HEADER_USER_AGENT, "okhttp/4.10.0");
        C b8 = b.b();
        J1.k kVar = new J1.k(3);
        C0219j.h("Proxy-Authenticate");
        C0219j.j("OkHttp-Preemptive", "Proxy-Authenticate");
        kVar.h("Proxy-Authenticate");
        kVar.c("Proxy-Authenticate", "OkHttp-Preemptive");
        kVar.e();
        c2364a.f20803f.getClass();
        e(i9, i10, interfaceC2373j, c2365b);
        String str = "CONNECT " + j8.b.v(b8.f20754a, true) + " HTTP/1.1";
        t tVar = this.f21804h;
        G7.j.b(tVar);
        w8.s sVar = this.f21805i;
        G7.j.b(sVar);
        P4.a aVar = new P4.a(null, this, tVar, sVar);
        w8.A timeout = tVar.b.timeout();
        long j7 = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j7, timeUnit);
        sVar.b.timeout().g(i11, timeUnit);
        aVar.h(b8.f20755c, str);
        aVar.finishRequest();
        H readResponseHeaders = aVar.readResponseHeaders(false);
        G7.j.b(readResponseHeaders);
        readResponseHeaders.f20764a = b8;
        I a6 = readResponseHeaders.a();
        long j9 = j8.b.j(a6);
        if (j9 != -1) {
            o8.d g9 = aVar.g(j9);
            j8.b.t(g9, Integer.MAX_VALUE, timeUnit);
            g9.close();
        }
        int i12 = a6.f20776f;
        if (i12 != 200) {
            if (i12 == 407) {
                c2364a.f20803f.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(G7.j.j(Integer.valueOf(i12), "Unexpected response code for CONNECT: "));
        }
        if (tVar.f24039c.exhausted() && sVar.f24037c.exhausted()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, InterfaceC2373j interfaceC2373j, C2365b c2365b) {
        C2364a c2364a = this.b.f20791a;
        SSLSocketFactory sSLSocketFactory = c2364a.f20800c;
        A a6 = A.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c2364a.f20806i;
            A a9 = A.H2_PRIOR_KNOWLEDGE;
            if (list.contains(a9)) {
                this.f21800d = this.f21799c;
                this.f21802f = a9;
                l();
                return;
            } else {
                this.f21800d = this.f21799c;
                this.f21802f = a6;
                return;
            }
        }
        c2365b.getClass();
        G7.j.e(interfaceC2373j, NotificationCompat.CATEGORY_CALL);
        C2364a c2364a2 = this.b.f20791a;
        SSLSocketFactory sSLSocketFactory2 = c2364a2.f20800c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            G7.j.b(sSLSocketFactory2);
            Socket socket = this.f21799c;
            u uVar = c2364a2.f20805h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, uVar.f20886d, uVar.f20887e, true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    C2378o a10 = bVar.a(sSLSocket2);
                    if (a10.b) {
                        r8.m mVar = r8.m.f22950a;
                        r8.m.f22950a.d(sSLSocket2, c2364a2.f20805h.f20886d, c2364a2.f20806i);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    G7.j.d(session, "sslSocketSession");
                    r c9 = AbstractC2292b.c(session);
                    HostnameVerifier hostnameVerifier = c2364a2.f20801d;
                    G7.j.b(hostnameVerifier);
                    if (!hostnameVerifier.verify(c2364a2.f20805h.f20886d, session)) {
                        List a11 = c9.a();
                        if (!a11.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) a11.get(0);
                            StringBuilder sb = new StringBuilder("\n              |Hostname ");
                            sb.append(c2364a2.f20805h.f20886d);
                            sb.append(" not verified:\n              |    certificate: ");
                            C2375l c2375l = C2375l.f20837c;
                            G7.j.e(x509Certificate, "certificate");
                            w8.i iVar = w8.i.f24015f;
                            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                            G7.j.d(encoded, "publicKey.encoded");
                            sb.append(G7.j.j(r6.b.e(encoded).b(Constants.SHA256).a(), "sha256/"));
                            sb.append("\n              |    DN: ");
                            sb.append((Object) x509Certificate.getSubjectDN().getName());
                            sb.append("\n              |    subjectAltNames: ");
                            sb.append(v8.c.a(x509Certificate));
                            sb.append("\n              ");
                            throw new SSLPeerUnverifiedException(O7.h.t(sb.toString()));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c2364a2.f20805h.f20886d + " not verified (no certificates)");
                    }
                    C2375l c2375l2 = c2364a2.f20802e;
                    G7.j.b(c2375l2);
                    this.f21801e = new r(c9.f20872a, c9.b, c9.f20873c, new C0475m(c2375l2, c9, c2364a2, 2));
                    c2375l2.a(c2364a2.f20805h.f20886d, new a8.e(this, 4));
                    if (a10.b) {
                        r8.m mVar2 = r8.m.f22950a;
                        str = r8.m.f22950a.f(sSLSocket2);
                    }
                    this.f21800d = sSLSocket2;
                    this.f21804h = r8.k.f(r8.k.z(sSLSocket2));
                    this.f21805i = r8.k.e(r8.k.w(sSLSocket2));
                    if (str != null) {
                        a6 = v0.m(str);
                    }
                    this.f21802f = a6;
                    r8.m mVar3 = r8.m.f22950a;
                    r8.m.f22950a.a(sSLSocket2);
                    if (this.f21802f == A.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        r8.m mVar4 = r8.m.f22950a;
                        r8.m.f22950a.a(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        j8.b.d(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (v8.c.d(r1, (java.security.cert.X509Certificate) r10.get(0)) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(i8.C2364a r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            r0 = 1
            java.lang.String r1 = "address"
            G7.j.e(r9, r1)
            byte[] r1 = j8.b.f21214a
            java.util.ArrayList r1 = r8.f21810p
            int r1 = r1.size()
            int r2 = r8.f21809o
            r3 = 0
            if (r1 >= r2) goto Ld0
            boolean r1 = r8.f21806j
            if (r1 == 0) goto L19
            goto Ld0
        L19:
            i8.N r1 = r8.b
            i8.a r2 = r1.f20791a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L24
            return r3
        L24:
            i8.u r2 = r9.f20805h
            java.lang.String r4 = r2.f20886d
            i8.a r5 = r1.f20791a
            i8.u r6 = r5.f20805h
            java.lang.String r6 = r6.f20886d
            boolean r4 = G7.j.a(r4, r6)
            if (r4 == 0) goto L35
            return r0
        L35:
            p8.s r4 = r8.f21803g
            if (r4 != 0) goto L3a
            return r3
        L3a:
            if (r10 == 0) goto Ld0
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L44
            goto Ld0
        L44:
            java.util.Iterator r10 = r10.iterator()
        L48:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Ld0
            java.lang.Object r4 = r10.next()
            i8.N r4 = (i8.N) r4
            java.net.Proxy r6 = r4.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L48
            java.net.Proxy r6 = r1.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L48
            java.net.InetSocketAddress r4 = r4.f20792c
            java.net.InetSocketAddress r6 = r1.f20792c
            boolean r4 = G7.j.a(r6, r4)
            if (r4 == 0) goto L48
            v8.c r10 = v8.c.f23646a
            javax.net.ssl.HostnameVerifier r1 = r9.f20801d
            if (r1 == r10) goto L77
            return r3
        L77:
            byte[] r10 = j8.b.f21214a
            i8.u r10 = r5.f20805h
            int r1 = r10.f20887e
            int r4 = r2.f20887e
            if (r4 == r1) goto L82
            goto Ld0
        L82:
            java.lang.String r10 = r10.f20886d
            java.lang.String r1 = r2.f20886d
            boolean r10 = G7.j.a(r1, r10)
            if (r10 == 0) goto L8d
            goto Laf
        L8d:
            boolean r10 = r8.f21807k
            if (r10 != 0) goto Ld0
            i8.r r10 = r8.f21801e
            if (r10 == 0) goto Ld0
            java.util.List r10 = r10.a()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto Ld0
            java.lang.Object r10 = r10.get(r3)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = v8.c.d(r1, r10)
            if (r10 == 0) goto Ld0
        Laf:
            i8.l r9 = r9.f20802e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            G7.j.b(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            i8.r r10 = r8.f21801e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            G7.j.b(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            java.lang.String r2 = "hostname"
            G7.j.e(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            java.lang.String r2 = "peerCertificates"
            G7.j.e(r10, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            androidx.fragment.app.m r2 = new androidx.fragment.app.m     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            r2.<init>(r9, r10, r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            r9.a(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld0
            return r0
        Ld0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.k.h(i8.a, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z8) {
        long j7;
        byte[] bArr = j8.b.f21214a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f21799c;
        G7.j.b(socket);
        Socket socket2 = this.f21800d;
        G7.j.b(socket2);
        t tVar = this.f21804h;
        G7.j.b(tVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        s sVar = this.f21803g;
        if (sVar != null) {
            synchronized (sVar) {
                if (sVar.f22453i) {
                    return false;
                }
                if (sVar.f22460r < sVar.f22459q) {
                    if (nanoTime >= sVar.f22461s) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j7 = nanoTime - this.f21811q;
        }
        if (j7 < 10000000000L || !z8) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z9 = !tVar.exhausted();
                socket2.setSoTimeout(soTimeout);
                return z9;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final n8.d j(z zVar, n8.f fVar) {
        G7.j.e(zVar, "client");
        Socket socket = this.f21800d;
        G7.j.b(socket);
        t tVar = this.f21804h;
        G7.j.b(tVar);
        w8.s sVar = this.f21805i;
        G7.j.b(sVar);
        s sVar2 = this.f21803g;
        if (sVar2 != null) {
            return new p8.t(zVar, this, fVar, sVar2);
        }
        int i9 = fVar.f21868g;
        socket.setSoTimeout(i9);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.b.timeout().g(i9, timeUnit);
        sVar.b.timeout().g(fVar.f21869h, timeUnit);
        return new P4.a(zVar, this, tVar, sVar);
    }

    public final synchronized void k() {
        this.f21806j = true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [P4.a, java.lang.Object] */
    public final void l() {
        int i9;
        int i10;
        Socket socket = this.f21800d;
        G7.j.b(socket);
        t tVar = this.f21804h;
        G7.j.b(tVar);
        w8.s sVar = this.f21805i;
        G7.j.b(sVar);
        socket.setSoTimeout(0);
        l8.c cVar = l8.c.f21647h;
        G7.j.e(cVar, "taskRunner");
        ?? obj = new Object();
        obj.f2416c = cVar;
        obj.f2420g = p8.i.f22416a;
        String str = this.b.f20791a.f20805h.f20886d;
        G7.j.e(str, "peerName");
        obj.f2417d = socket;
        String str2 = j8.b.f21219g + ' ' + str;
        G7.j.e(str2, "<set-?>");
        obj.b = str2;
        obj.f2418e = tVar;
        obj.f2419f = sVar;
        obj.f2420g = this;
        obj.f2415a = 0;
        s sVar2 = new s(obj);
        this.f21803g = sVar2;
        D d2 = s.f22444D;
        if ((d2.f22382a & 16) != 0) {
            i9 = d2.b[4];
        } else {
            i9 = Integer.MAX_VALUE;
        }
        this.f21809o = i9;
        p8.A a6 = sVar2.f22445A;
        synchronized (a6) {
            try {
                if (!a6.f22377g) {
                    if (a6.f22374c) {
                        Logger logger = p8.A.f22373i;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(j8.b.h(G7.j.j(p8.g.f22413a.d(), ">> CONNECTION "), new Object[0]));
                        }
                        a6.b.A(p8.g.f22413a);
                        a6.b.flush();
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p8.A a9 = sVar2.f22445A;
        D d9 = sVar2.f22462t;
        synchronized (a9) {
            try {
                G7.j.e(d9, "settings");
                if (!a9.f22377g) {
                    a9.c(0, Integer.bitCount(d9.f22382a) * 6, 4, 0);
                    int i11 = 0;
                    while (i11 < 10) {
                        int i12 = i11 + 1;
                        if (((1 << i11) & d9.f22382a) != 0) {
                            if (i11 != 4) {
                                if (i11 != 7) {
                                    i10 = i11;
                                } else {
                                    i10 = 4;
                                }
                            } else {
                                i10 = 3;
                            }
                            a9.b.writeShort(i10);
                            a9.b.writeInt(d9.b[i11]);
                        }
                        i11 = i12;
                    }
                    a9.b.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sVar2.f22462t.a() != 65535) {
            sVar2.f22445A.k(0, r1 - 65535);
        }
        cVar.f().c(new k8.g(sVar2.f22450f, sVar2.f22446B, 1), 0L);
    }

    public final String toString() {
        C2377n c2377n;
        StringBuilder sb = new StringBuilder("Connection{");
        N n2 = this.b;
        sb.append(n2.f20791a.f20805h.f20886d);
        sb.append(':');
        sb.append(n2.f20791a.f20805h.f20887e);
        sb.append(", proxy=");
        sb.append(n2.b);
        sb.append(" hostAddress=");
        sb.append(n2.f20792c);
        sb.append(" cipherSuite=");
        r rVar = this.f21801e;
        Object obj = "none";
        if (rVar != null && (c2377n = rVar.b) != null) {
            obj = c2377n;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f21802f);
        sb.append('}');
        return sb.toString();
    }
}
