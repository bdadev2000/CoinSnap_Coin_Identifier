package i8;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes3.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final C2364a f20791a;
    public final Proxy b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f20792c;

    public N(C2364a c2364a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        G7.j.e(c2364a, "address");
        G7.j.e(inetSocketAddress, "socketAddress");
        this.f20791a = c2364a;
        this.b = proxy;
        this.f20792c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n2 = (N) obj;
            if (G7.j.a(n2.f20791a, this.f20791a) && G7.j.a(n2.b, this.b) && G7.j.a(n2.f20792c, this.f20792c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20792c.hashCode() + ((this.b.hashCode() + ((this.f20791a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f20792c + '}';
    }
}
