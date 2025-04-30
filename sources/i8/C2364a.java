package i8;

import a.AbstractC0325a;
import com.adjust.sdk.Constants;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import x0.AbstractC2914a;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2364a {

    /* renamed from: a, reason: collision with root package name */
    public final C2365b f20799a;
    public final SocketFactory b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f20800c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f20801d;

    /* renamed from: e, reason: collision with root package name */
    public final C2375l f20802e;

    /* renamed from: f, reason: collision with root package name */
    public final C2365b f20803f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f20804g;

    /* renamed from: h, reason: collision with root package name */
    public final u f20805h;

    /* renamed from: i, reason: collision with root package name */
    public final List f20806i;

    /* renamed from: j, reason: collision with root package name */
    public final List f20807j;

    public C2364a(String str, int i9, C2365b c2365b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, v8.c cVar, C2375l c2375l, C2365b c2365b2, List list, List list2, ProxySelector proxySelector) {
        String str2;
        G7.j.e(str, "uriHost");
        G7.j.e(c2365b, "dns");
        G7.j.e(socketFactory, "socketFactory");
        G7.j.e(c2365b2, "proxyAuthenticator");
        G7.j.e(list, "protocols");
        G7.j.e(list2, "connectionSpecs");
        G7.j.e(proxySelector, "proxySelector");
        this.f20799a = c2365b;
        this.b = socketFactory;
        this.f20800c = sSLSocketFactory;
        this.f20801d = cVar;
        this.f20802e = c2375l;
        this.f20803f = c2365b2;
        this.f20804g = proxySelector;
        t tVar = new t();
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = Constants.SCHEME;
        }
        if (str2.equalsIgnoreCase("http")) {
            tVar.f20878e = "http";
        } else if (str2.equalsIgnoreCase(Constants.SCHEME)) {
            tVar.f20878e = Constants.SCHEME;
        } else {
            throw new IllegalArgumentException(G7.j.j(str2, "unexpected scheme: "));
        }
        String s5 = AbstractC0325a.s(C2365b.f(0, 0, str, 7, false));
        if (s5 != null) {
            tVar.f20881h = s5;
            if (1 <= i9 && i9 < 65536) {
                tVar.f20876c = i9;
                this.f20805h = tVar.a();
                this.f20806i = j8.b.w(list);
                this.f20807j = j8.b.w(list2);
                return;
            }
            throw new IllegalArgumentException(G7.j.j(Integer.valueOf(i9), "unexpected port: ").toString());
        }
        throw new IllegalArgumentException(G7.j.j(str, "unexpected host: "));
    }

    public final boolean a(C2364a c2364a) {
        G7.j.e(c2364a, "that");
        if (G7.j.a(this.f20799a, c2364a.f20799a) && G7.j.a(this.f20803f, c2364a.f20803f) && G7.j.a(this.f20806i, c2364a.f20806i) && G7.j.a(this.f20807j, c2364a.f20807j) && G7.j.a(this.f20804g, c2364a.f20804g) && G7.j.a(null, null) && G7.j.a(this.f20800c, c2364a.f20800c) && G7.j.a(this.f20801d, c2364a.f20801d) && G7.j.a(this.f20802e, c2364a.f20802e) && this.f20805h.f20887e == c2364a.f20805h.f20887e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2364a) {
            C2364a c2364a = (C2364a) obj;
            if (G7.j.a(this.f20805h, c2364a.f20805h) && a(c2364a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f20802e) + ((Objects.hashCode(this.f20801d) + ((Objects.hashCode(this.f20800c) + ((this.f20804g.hashCode() + ((this.f20807j.hashCode() + ((this.f20806i.hashCode() + ((this.f20803f.hashCode() + ((this.f20799a.hashCode() + AbstractC2914a.b(527, 31, this.f20805h.f20891i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        u uVar = this.f20805h;
        sb.append(uVar.f20886d);
        sb.append(':');
        sb.append(uVar.f20887e);
        sb.append(", ");
        sb.append(G7.j.j(this.f20804g, "proxySelector="));
        sb.append('}');
        return sb.toString();
    }
}
