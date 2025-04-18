package wh;

import java.net.ProxySelector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import s7.h1;

/* loaded from: classes5.dex */
public final class l0 implements Cloneable, j {
    public static final List C = xh.b.k(m0.HTTP_2, m0.HTTP_1_1);
    public static final List D = xh.b.k(r.f27183e, r.f27184f);
    public final int A;
    public final y7.u B;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f27109b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.q f27110c;

    /* renamed from: d, reason: collision with root package name */
    public final List f27111d;

    /* renamed from: f, reason: collision with root package name */
    public final List f27112f;

    /* renamed from: g, reason: collision with root package name */
    public final gb.d f27113g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27114h;

    /* renamed from: i, reason: collision with root package name */
    public final b f27115i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27116j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27117k;

    /* renamed from: l, reason: collision with root package name */
    public final t f27118l;

    /* renamed from: m, reason: collision with root package name */
    public final h f27119m;

    /* renamed from: n, reason: collision with root package name */
    public final u f27120n;

    /* renamed from: o, reason: collision with root package name */
    public final ProxySelector f27121o;

    /* renamed from: p, reason: collision with root package name */
    public final b f27122p;

    /* renamed from: q, reason: collision with root package name */
    public final SocketFactory f27123q;

    /* renamed from: r, reason: collision with root package name */
    public final SSLSocketFactory f27124r;

    /* renamed from: s, reason: collision with root package name */
    public final X509TrustManager f27125s;

    /* renamed from: t, reason: collision with root package name */
    public final List f27126t;
    public final List u;

    /* renamed from: v, reason: collision with root package name */
    public final HostnameVerifier f27127v;

    /* renamed from: w, reason: collision with root package name */
    public final n f27128w;

    /* renamed from: x, reason: collision with root package name */
    public final com.facebook.internal.i f27129x;

    /* renamed from: y, reason: collision with root package name */
    public final int f27130y;

    /* renamed from: z, reason: collision with root package name */
    public final int f27131z;

    public l0(k0 builder) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f27109b = builder.a;
        this.f27110c = builder.f27088b;
        this.f27111d = xh.b.x(builder.f27089c);
        this.f27112f = xh.b.x(builder.f27090d);
        this.f27113g = builder.f27091e;
        this.f27114h = builder.f27092f;
        this.f27115i = builder.f27093g;
        this.f27116j = builder.f27094h;
        this.f27117k = builder.f27095i;
        this.f27118l = builder.f27096j;
        this.f27119m = builder.f27097k;
        this.f27120n = builder.f27098l;
        ProxySelector proxySelector = builder.f27099m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f27121o = proxySelector == null ? ii.a.a : proxySelector;
        this.f27122p = builder.f27100n;
        this.f27123q = builder.f27101o;
        List list = builder.f27102p;
        this.f27126t = list;
        this.u = builder.f27103q;
        this.f27127v = builder.f27104r;
        this.f27130y = builder.f27106t;
        this.f27131z = builder.u;
        this.A = builder.f27107v;
        y7.u uVar = builder.f27108w;
        this.B = uVar == null ? new y7.u(14) : uVar;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((r) it.next()).a) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            this.f27124r = null;
            this.f27129x = null;
            this.f27125s = null;
            this.f27128w = n.f27144c;
        } else {
            gi.l lVar = gi.l.a;
            X509TrustManager trustManager = gi.l.a.m();
            this.f27125s = trustManager;
            gi.l lVar2 = gi.l.a;
            Intrinsics.checkNotNull(trustManager);
            this.f27124r = lVar2.l(trustManager);
            Intrinsics.checkNotNull(trustManager);
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            com.facebook.internal.i certificateChainCleaner = gi.l.a.b(trustManager);
            this.f27129x = certificateChainCleaner;
            n nVar = builder.f27105s;
            Intrinsics.checkNotNull(certificateChainCleaner);
            nVar.getClass();
            Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
            this.f27128w = Intrinsics.areEqual(nVar.f27145b, certificateChainCleaner) ? nVar : new n(nVar.a, certificateChainCleaner);
        }
        List list3 = this.f27111d;
        if (!list3.contains(null)) {
            List list4 = this.f27112f;
            if (!list4.contains(null)) {
                List list5 = this.f27126t;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        if (((r) it2.next()).a) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                X509TrustManager x509TrustManager = this.f27125s;
                com.facebook.internal.i iVar = this.f27129x;
                SSLSocketFactory sSLSocketFactory = this.f27124r;
                if (z11) {
                    if (sSLSocketFactory == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (iVar == null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            if (x509TrustManager == null) {
                                if (!Intrinsics.areEqual(this.f27128w, n.f27144c)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (sSLSocketFactory != null) {
                    if (iVar != null) {
                        if (x509TrustManager != null) {
                            return;
                        } else {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                        }
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                }
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Null network interceptor: ", list4).toString());
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Null interceptor: ", list3).toString());
    }

    public final bi.i a(o0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new bi.i(this, request, false);
    }

    public final Object clone() {
        return super.clone();
    }
}
