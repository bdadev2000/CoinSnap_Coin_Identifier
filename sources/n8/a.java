package n8;

import B3.g;
import G7.j;
import J1.B;
import com.mbridge.msdk.foundation.download.Command;
import i8.C;
import i8.C2364a;
import i8.C2365b;
import i8.C2375l;
import i8.G;
import i8.H;
import i8.I;
import i8.K;
import i8.M;
import i8.N;
import i8.s;
import i8.t;
import i8.u;
import i8.v;
import i8.w;
import i8.x;
import i8.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import m8.i;
import m8.k;
import m8.l;
import m8.m;
import p8.C2573a;
import u7.C2824o;
import w8.n;

/* loaded from: classes3.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21859a = 0;
    public final Object b;

    public a(C2365b c2365b) {
        j.e(c2365b, "cookieJar");
        this.b = c2365b;
    }

    public static int c(I i9, int i10) {
        String b = I.b(i9, "Retry-After");
        if (b == null) {
            return i10;
        }
        Pattern compile = Pattern.compile("\\d+");
        j.d(compile, "compile(...)");
        if (compile.matcher(b).matches()) {
            Integer valueOf = Integer.valueOf(b);
            j.d(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public C a(I i9, B b) {
        k kVar;
        N n2;
        String b8;
        t tVar;
        u a6;
        G g9 = null;
        if (b == null || (kVar = (k) b.f1491f) == null) {
            n2 = null;
        } else {
            n2 = kVar.b;
        }
        int i10 = i9.f20776f;
        C c9 = i9.b;
        String str = c9.b;
        boolean z8 = false;
        if (i10 != 307 && i10 != 308) {
            if (i10 != 401) {
                if (i10 != 421) {
                    if (i10 != 503) {
                        if (i10 != 407) {
                            if (i10 != 408) {
                                switch (i10) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!((z) this.b).f20924h) {
                                    return null;
                                }
                                G g10 = c9.f20756d;
                                if (g10 != null && g10.isOneShot()) {
                                    return null;
                                }
                                I i11 = i9.l;
                                if ((i11 != null && i11.f20776f == 408) || c(i9, 0) > 0) {
                                    return null;
                                }
                                return i9.b;
                            }
                        } else {
                            j.b(n2);
                            if (n2.b.type() == Proxy.Type.HTTP) {
                                ((z) this.b).f20930p.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        I i12 = i9.l;
                        if ((i12 != null && i12.f20776f == 503) || c(i9, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return i9.b;
                    }
                } else {
                    G g11 = c9.f20756d;
                    if ((g11 != null && g11.isOneShot()) || b == null || !(!j.a(((m8.e) b.f1489d).b.f20805h.f20886d, ((k) b.f1491f).b.f20791a.f20805h.f20886d))) {
                        return null;
                    }
                    k kVar2 = (k) b.f1491f;
                    synchronized (kVar2) {
                        kVar2.f21807k = true;
                    }
                    return i9.b;
                }
            } else {
                ((z) this.b).f20925i.getClass();
                return null;
            }
        }
        z zVar = (z) this.b;
        if (!zVar.f20926j || (b8 = I.b(i9, "Location")) == null) {
            return null;
        }
        C c10 = i9.b;
        u uVar = c10.f20754a;
        uVar.getClass();
        try {
            tVar = new t();
            tVar.d(uVar, b8);
        } catch (IllegalArgumentException unused) {
            tVar = null;
        }
        if (tVar == null) {
            a6 = null;
        } else {
            a6 = tVar.a();
        }
        if (a6 == null) {
            return null;
        }
        if (!j.a(a6.f20884a, c10.f20754a.f20884a) && !zVar.f20927k) {
            return null;
        }
        i8.B a9 = c10.a();
        if (R2.b.u(str)) {
            boolean equals = str.equals("PROPFIND");
            int i13 = i9.f20776f;
            if (equals || i13 == 308 || i13 == 307) {
                z8 = true;
            }
            if ((!str.equals("PROPFIND")) && i13 != 308 && i13 != 307) {
                a9.d("GET", null);
            } else {
                if (z8) {
                    g9 = c10.f20756d;
                }
                a9.d(str, g9);
            }
            if (!z8) {
                a9.f20751c.h("Transfer-Encoding");
                a9.f20751c.h("Content-Length");
                a9.f20751c.h("Content-Type");
            }
        }
        if (!j8.b.a(c10.f20754a, a6)) {
            a9.f20751c.h("Authorization");
        }
        a9.f20750a = a6;
        return a9.b();
    }

    public boolean b(IOException iOException, i iVar, C c9, boolean z8) {
        t tVar;
        boolean c10;
        k kVar;
        G g9;
        if (!((z) this.b).f20924h) {
            return false;
        }
        if ((z8 && (((g9 = c9.f20756d) != null && g9.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z8))) {
            return false;
        }
        m8.e eVar = iVar.f21790k;
        j.b(eVar);
        int i9 = eVar.f21775g;
        if (i9 == 0 && eVar.f21776h == 0 && eVar.f21777i == 0) {
            c10 = false;
        } else {
            if (eVar.f21778j == null) {
                N n2 = null;
                if (i9 <= 1 && eVar.f21776h <= 1 && eVar.f21777i <= 0 && (kVar = eVar.f21771c.l) != null) {
                    synchronized (kVar) {
                        if (kVar.l == 0) {
                            if (j8.b.a(kVar.b.f20791a.f20805h, eVar.b.f20805h)) {
                                n2 = kVar.b;
                            }
                        }
                    }
                }
                if (n2 != null) {
                    eVar.f21778j = n2;
                } else {
                    g gVar = eVar.f21773e;
                    if ((gVar == null || !gVar.f()) && (tVar = eVar.f21774f) != null) {
                        c10 = tVar.c();
                    }
                }
            }
            c10 = true;
        }
        if (!c10) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i8.w
    public final I intercept(v vVar) {
        M m;
        C2824o c2824o;
        B b;
        boolean z8;
        SSLSocketFactory sSLSocketFactory;
        v8.c cVar;
        C2375l c2375l;
        switch (this.f21859a) {
            case 0:
                f fVar = (f) vVar;
                C c9 = fVar.f21866e;
                i8.B a6 = c9.a();
                long j7 = -1;
                G g9 = c9.f20756d;
                if (g9 != null) {
                    x contentType = g9.contentType();
                    if (contentType != null) {
                        a6.c("Content-Type", contentType.f20895a);
                    }
                    long contentLength = g9.contentLength();
                    if (contentLength != -1) {
                        a6.c("Content-Length", String.valueOf(contentLength));
                        a6.f20751c.h("Transfer-Encoding");
                    } else {
                        a6.c("Transfer-Encoding", "chunked");
                        a6.f20751c.h("Content-Length");
                    }
                }
                s sVar = c9.f20755c;
                String b8 = sVar.b("Host");
                boolean z9 = false;
                u uVar = c9.f20754a;
                if (b8 == null) {
                    a6.c("Host", j8.b.v(uVar, false));
                }
                if (sVar.b("Connection") == null) {
                    a6.c("Connection", "Keep-Alive");
                }
                if (sVar.b("Accept-Encoding") == null && sVar.b(Command.HTTP_HEADER_RANGE) == null) {
                    a6.c("Accept-Encoding", "gzip");
                    z9 = true;
                }
                C2365b c2365b = (C2365b) this.b;
                c2365b.getClass();
                j.e(uVar, "url");
                if (sVar.b(Command.HTTP_HEADER_USER_AGENT) == null) {
                    a6.c(Command.HTTP_HEADER_USER_AGENT, "okhttp/4.10.0");
                }
                I b9 = fVar.b(a6.b());
                s sVar2 = b9.f20778h;
                e.b(c2365b, uVar, sVar2);
                H h6 = b9.h();
                h6.f20764a = c9;
                if (z9 && "gzip".equalsIgnoreCase(I.b(b9, "Content-Encoding")) && e.a(b9) && (m = b9.f20779i) != null) {
                    n nVar = new n(m.source());
                    J1.k d2 = sVar2.d();
                    d2.h("Content-Encoding");
                    d2.h("Content-Length");
                    h6.c(d2.e());
                    h6.f20769g = new K(I.b(b9, "Content-Type"), j7, r8.k.f(nVar), 1);
                }
                return h6.a();
            default:
                f fVar2 = (f) vVar;
                C c10 = fVar2.f21866e;
                i iVar = fVar2.f21863a;
                boolean z10 = true;
                C2824o c2824o2 = C2824o.b;
                I i9 = null;
                int i10 = 0;
                C c11 = c10;
                boolean z11 = true;
                while (true) {
                    iVar.getClass();
                    j.e(c11, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
                    if (iVar.f21791n == null) {
                        synchronized (iVar) {
                            try {
                                if (iVar.f21793p ^ z10) {
                                    if (!(iVar.f21792o ^ z10)) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                } else {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z11) {
                            l lVar = iVar.f21785f;
                            u uVar2 = c11.f20754a;
                            boolean z12 = uVar2.f20892j;
                            z zVar = iVar.b;
                            if (z12) {
                                SSLSocketFactory sSLSocketFactory2 = zVar.f20932r;
                                if (sSLSocketFactory2 != null) {
                                    v8.c cVar2 = zVar.f20936v;
                                    c2375l = zVar.f20937w;
                                    sSLSocketFactory = sSLSocketFactory2;
                                    cVar = cVar2;
                                } else {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                c2375l = null;
                            }
                            c2824o = c2824o2;
                            iVar.f21790k = new m8.e(lVar, new C2364a(uVar2.f20886d, uVar2.f20887e, zVar.f20928n, zVar.f20931q, sSLSocketFactory, cVar, c2375l, zVar.f20930p, zVar.f20935u, zVar.f20934t, zVar.f20929o), iVar);
                        } else {
                            c2824o = c2824o2;
                        }
                        try {
                            if (!iVar.f21795r) {
                                try {
                                    I b10 = fVar2.b(c11);
                                    if (i9 != null) {
                                        H h9 = b10.h();
                                        H h10 = i9.h();
                                        h10.f20769g = null;
                                        I a9 = h10.a();
                                        if (a9.f20779i == null) {
                                            h9.f20772j = a9;
                                            b10 = h9.a();
                                        } else {
                                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                                        }
                                    }
                                    i9 = b10;
                                    b = iVar.f21791n;
                                    c11 = a(i9, b);
                                } catch (IOException e4) {
                                    if (b(e4, iVar, c11, !(e4 instanceof C2573a))) {
                                        C2824o c2824o3 = c2824o;
                                        j.e(c2824o3, "<this>");
                                        ArrayList arrayList = new ArrayList(c2824o3.size() + 1);
                                        arrayList.addAll(c2824o3);
                                        arrayList.add(e4);
                                        iVar.e(true);
                                        c2824o2 = arrayList;
                                        z10 = true;
                                        z11 = false;
                                    } else {
                                        j8.b.z(e4, c2824o);
                                        throw e4;
                                    }
                                } catch (m e9) {
                                    C2824o c2824o4 = c2824o;
                                    if (b(e9.f21816c, iVar, c11, false)) {
                                        C2824o c2824o5 = c2824o4;
                                        IOException iOException = e9.b;
                                        j.e(c2824o5, "<this>");
                                        ArrayList arrayList2 = new ArrayList(c2824o5.size() + 1);
                                        arrayList2.addAll(c2824o5);
                                        arrayList2.add(iOException);
                                        iVar.e(true);
                                        z11 = false;
                                        z10 = true;
                                        c2824o2 = arrayList2;
                                    } else {
                                        IOException iOException2 = e9.b;
                                        j8.b.z(iOException2, c2824o4);
                                        throw iOException2;
                                    }
                                }
                                if (c11 == null) {
                                    if (b != null && b.f1487a) {
                                        if (!iVar.m) {
                                            iVar.m = true;
                                            iVar.f21787h.i();
                                        } else {
                                            throw new IllegalStateException("Check failed.".toString());
                                        }
                                    }
                                    z8 = false;
                                } else {
                                    z8 = false;
                                    G g10 = c11.f20756d;
                                    if (g10 == null || !g10.isOneShot()) {
                                        M m2 = i9.f20779i;
                                        if (m2 != null) {
                                            j8.b.c(m2);
                                        }
                                        i10++;
                                        if (i10 <= 20) {
                                            iVar.e(true);
                                            c2824o2 = c2824o;
                                            z11 = true;
                                            z10 = true;
                                        } else {
                                            throw new ProtocolException(j.j(Integer.valueOf(i10), "Too many follow-up requests: "));
                                        }
                                    }
                                }
                            } else {
                                throw new IOException("Canceled");
                            }
                        } catch (Throwable th2) {
                            iVar.e(true);
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                iVar.e(z8);
                return i9;
        }
    }

    public a(z zVar) {
        j.e(zVar, "client");
        this.b = zVar;
    }
}
