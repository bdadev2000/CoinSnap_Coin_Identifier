package wh;

import com.adjust.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class a {
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f27000b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f27001c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f27002d;

    /* renamed from: e, reason: collision with root package name */
    public final n f27003e;

    /* renamed from: f, reason: collision with root package name */
    public final b f27004f;

    /* renamed from: g, reason: collision with root package name */
    public final Proxy f27005g;

    /* renamed from: h, reason: collision with root package name */
    public final ProxySelector f27006h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f27007i;

    /* renamed from: j, reason: collision with root package name */
    public final List f27008j;

    /* renamed from: k, reason: collision with root package name */
    public final List f27009k;

    public a(String host, int i10, u dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, n nVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.a = dns;
        this.f27000b = socketFactory;
        this.f27001c = sSLSocketFactory;
        this.f27002d = hostnameVerifier;
        this.f27003e = nVar;
        this.f27004f = proxyAuthenticator;
        this.f27005g = null;
        this.f27006h = proxySelector;
        b0 b0Var = new b0();
        String scheme = sSLSocketFactory != null ? Constants.SCHEME : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        equals = StringsKt__StringsJVMKt.equals(scheme, "http", true);
        if (equals) {
            b0Var.a = "http";
        } else {
            equals2 = StringsKt__StringsJVMKt.equals(scheme, Constants.SCHEME, true);
            if (equals2) {
                b0Var.a = Constants.SCHEME;
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", scheme));
            }
        }
        Intrinsics.checkNotNullParameter(host, "host");
        char[] cArr = d0.f27032k;
        boolean z10 = false;
        String Q = a6.k.Q(c0.n(host, 0, 0, false, 7));
        if (Q != null) {
            b0Var.f27022d = Q;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (z10) {
                b0Var.f27023e = i10;
                this.f27007i = b0Var.a();
                this.f27008j = xh.b.x(protocols);
                this.f27009k = xh.b.x(connectionSpecs);
                return;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i10)).toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", host));
    }

    public final boolean a(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        if (Intrinsics.areEqual(this.a, that.a) && Intrinsics.areEqual(this.f27004f, that.f27004f) && Intrinsics.areEqual(this.f27008j, that.f27008j) && Intrinsics.areEqual(this.f27009k, that.f27009k) && Intrinsics.areEqual(this.f27006h, that.f27006h) && Intrinsics.areEqual(this.f27005g, that.f27005g) && Intrinsics.areEqual(this.f27001c, that.f27001c) && Intrinsics.areEqual(this.f27002d, that.f27002d) && Intrinsics.areEqual(this.f27003e, that.f27003e) && this.f27007i.f27036e == that.f27007i.f27036e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(this.f27007i, aVar.f27007i) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f27003e) + ((Objects.hashCode(this.f27002d) + ((Objects.hashCode(this.f27001c) + ((Objects.hashCode(this.f27005g) + ((this.f27006h.hashCode() + vd.e.d(this.f27009k, vd.e.d(this.f27008j, (this.f27004f.hashCode() + ((this.a.hashCode() + ((this.f27007i.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String stringPlus;
        StringBuilder sb2 = new StringBuilder("Address{");
        d0 d0Var = this.f27007i;
        sb2.append(d0Var.f27035d);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(d0Var.f27036e);
        sb2.append(", ");
        Proxy proxy = this.f27005g;
        if (proxy != null) {
            stringPlus = Intrinsics.stringPlus("proxy=", proxy);
        } else {
            stringPlus = Intrinsics.stringPlus("proxySelector=", this.f27006h);
        }
        return com.applovin.impl.mediation.ads.e.g(sb2, stringPlus, AbstractJsonLexerKt.END_OBJ);
    }
}
