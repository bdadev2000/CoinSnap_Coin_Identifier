package ci;

import bi.i;
import bi.k;
import bi.l;
import bi.m;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import wh.b0;
import wh.d0;
import wh.e0;
import wh.f0;
import wh.l0;
import wh.n;
import wh.n0;
import wh.o0;
import wh.s0;
import wh.t0;
import wh.u0;
import wh.y0;
import wh.z0;

/* loaded from: classes5.dex */
public final class g implements f0 {
    public final l0 a;

    public g(l0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.a = client;
    }

    public static int c(u0 u0Var, int i10) {
        String g10 = u0.g(u0Var, "Retry-After");
        if (g10 == null) {
            return i10;
        }
        if (new Regex("\\d+").matches(g10)) {
            Integer valueOf = Integer.valueOf(g10);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final o0 a(u0 u0Var, a4.f fVar) {
        z0 z0Var;
        String link;
        b0 b0Var;
        d0 url;
        k kVar;
        s0 s0Var = null;
        if (fVar == null || (kVar = (k) fVar.f114f) == null) {
            z0Var = null;
        } else {
            z0Var = kVar.f2485b;
        }
        int i10 = u0Var.f27216f;
        o0 o0Var = u0Var.f27213b;
        String method = o0Var.f27151b;
        boolean z10 = false;
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
                                if (!this.a.f27114h) {
                                    return null;
                                }
                                s0 s0Var2 = o0Var.f27153d;
                                if (s0Var2 != null && s0Var2.isOneShot()) {
                                    return null;
                                }
                                u0 u0Var2 = u0Var.f27222l;
                                if ((u0Var2 != null && u0Var2.f27216f == 408) || c(u0Var, 0) > 0) {
                                    return null;
                                }
                                return u0Var.f27213b;
                            }
                        } else {
                            Intrinsics.checkNotNull(z0Var);
                            if (z0Var.f27244b.type() == Proxy.Type.HTTP) {
                                return this.a.f27122p.f(z0Var, u0Var);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        u0 u0Var3 = u0Var.f27222l;
                        if ((u0Var3 != null && u0Var3.f27216f == 503) || c(u0Var, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return u0Var.f27213b;
                    }
                } else {
                    s0 s0Var3 = o0Var.f27153d;
                    if ((s0Var3 != null && s0Var3.isOneShot()) || fVar == null || !(!Intrinsics.areEqual(((bi.e) fVar.f112d).f2454b.f27007i.f27035d, ((k) fVar.f114f).f2485b.a.f27007i.f27035d))) {
                        return null;
                    }
                    k kVar2 = (k) fVar.f114f;
                    synchronized (kVar2) {
                        kVar2.f2494k = true;
                    }
                    return u0Var.f27213b;
                }
            } else {
                return this.a.f27115i.f(z0Var, u0Var);
            }
        }
        l0 l0Var = this.a;
        if (!l0Var.f27116j || (link = u0.g(u0Var, "Location")) == null) {
            return null;
        }
        o0 o0Var2 = u0Var.f27213b;
        d0 d0Var = o0Var2.a;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            b0Var = new b0();
            b0Var.c(d0Var, link);
        } catch (IllegalArgumentException unused) {
            b0Var = null;
        }
        if (b0Var == null) {
            url = null;
        } else {
            url = b0Var.a();
        }
        if (url == null) {
            return null;
        }
        if (!Intrinsics.areEqual(url.a, o0Var2.a.a) && !l0Var.f27117k) {
            return null;
        }
        n0 n0Var = new n0(o0Var2);
        if (v8.u0.X(method)) {
            Intrinsics.checkNotNullParameter(method, "method");
            boolean areEqual = Intrinsics.areEqual(method, "PROPFIND");
            int i11 = u0Var.f27216f;
            if (areEqual || i11 == 308 || i11 == 307) {
                z10 = true;
            }
            Intrinsics.checkNotNullParameter(method, "method");
            if ((!Intrinsics.areEqual(method, "PROPFIND")) && i11 != 308 && i11 != 307) {
                n0Var.e("GET", null);
            } else {
                if (z10) {
                    s0Var = o0Var2.f27153d;
                }
                n0Var.e(method, s0Var);
            }
            if (!z10) {
                n0Var.g("Transfer-Encoding");
                n0Var.g("Content-Length");
                n0Var.g("Content-Type");
            }
        }
        if (!xh.b.a(o0Var2.a, url)) {
            n0Var.g("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        n0Var.a = url;
        return n0Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.io.IOException r3, bi.i r4, wh.o0 r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.g.b(java.io.IOException, bi.i, wh.o0, boolean):boolean");
    }

    @Override // wh.f0
    public final u0 intercept(e0 chain) {
        boolean z10;
        List list;
        int i10;
        boolean z11;
        a4.f fVar;
        boolean z12;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        n nVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        f fVar2 = (f) chain;
        o0 o0Var = fVar2.f2805e;
        i iVar = fVar2.a;
        boolean z13 = true;
        List emptyList = CollectionsKt.emptyList();
        int i11 = 0;
        u0 u0Var = null;
        o0 request = o0Var;
        boolean z14 = true;
        while (true) {
            iVar.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            if (iVar.f2478n == null) {
                z10 = z13;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (iVar) {
                    if (iVar.f2480p ^ z13) {
                        if (iVar.f2479o ^ z13) {
                            Unit unit = Unit.INSTANCE;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                }
                if (z14) {
                    l lVar = iVar.f2470f;
                    d0 d0Var = request.a;
                    boolean z15 = d0Var.f27041j;
                    l0 l0Var = iVar.f2467b;
                    if (z15) {
                        SSLSocketFactory sSLSocketFactory2 = l0Var.f27124r;
                        if (sSLSocketFactory2 != null) {
                            HostnameVerifier hostnameVerifier2 = l0Var.f27127v;
                            nVar = l0Var.f27128w;
                            sSLSocketFactory = sSLSocketFactory2;
                            hostnameVerifier = hostnameVerifier2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        nVar = null;
                    }
                    list = emptyList;
                    i10 = i11;
                    iVar.f2475k = new bi.e(lVar, new wh.a(d0Var.f27035d, d0Var.f27036e, l0Var.f27120n, l0Var.f27123q, sSLSocketFactory, hostnameVerifier, nVar, l0Var.f27122p, l0Var.u, l0Var.f27126t, l0Var.f27121o), iVar, iVar.f2471g);
                } else {
                    list = emptyList;
                    i10 = i11;
                }
                try {
                    if (!iVar.f2482r) {
                        try {
                            u0 b3 = fVar2.b(request);
                            if (u0Var != null) {
                                t0 t0Var = new t0(b3);
                                t0 t0Var2 = new t0(u0Var);
                                t0Var2.f27205g = null;
                                u0 a = t0Var2.a();
                                if (a.f27219i == null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    t0Var.f27208j = a;
                                    b3 = t0Var.a();
                                } else {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                            }
                            u0Var = b3;
                            fVar = iVar.f2478n;
                            request = a(u0Var, fVar);
                        } catch (m e2) {
                            List list2 = list;
                            if (b(e2.f2506c, iVar, request, false)) {
                                emptyList = CollectionsKt.plus((Collection<? extends IOException>) list2, e2.f2505b);
                                iVar.f(true);
                                z13 = true;
                                z14 = false;
                                i11 = i10;
                            } else {
                                IOException iOException = e2.f2505b;
                                xh.b.A(iOException, list2);
                                throw iOException;
                            }
                        } catch (IOException e10) {
                            if (!(e10 instanceof ei.a)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (b(e10, iVar, request, z11)) {
                                emptyList = CollectionsKt.plus((Collection<? extends IOException>) list, e10);
                                iVar.f(true);
                                z13 = true;
                                i11 = i10;
                                z14 = false;
                            } else {
                                xh.b.A(e10, list);
                                throw e10;
                            }
                        }
                        if (request == null) {
                            if (fVar != null && fVar.f111c) {
                                if (!iVar.f2477m) {
                                    iVar.f2477m = true;
                                    iVar.f2472h.i();
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            iVar.f(false);
                            return u0Var;
                        }
                        s0 s0Var = request.f27153d;
                        if (s0Var != null && s0Var.isOneShot()) {
                            iVar.f(false);
                            return u0Var;
                        }
                        y0 y0Var = u0Var.f27219i;
                        if (y0Var != null) {
                            xh.b.c(y0Var);
                        }
                        i11 = i10 + 1;
                        if (i11 <= 20) {
                            iVar.f(true);
                            emptyList = list;
                            z14 = true;
                            z13 = true;
                        } else {
                            throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i11)));
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (Throwable th2) {
                    iVar.f(true);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }
}
