package wh;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class z0 {
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f27244b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f27245c;

    public z0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.a = address;
        this.f27244b = proxy;
        this.f27245c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (Intrinsics.areEqual(z0Var.a, this.a) && Intrinsics.areEqual(z0Var.f27244b, this.f27244b) && Intrinsics.areEqual(z0Var.f27245c, this.f27245c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27245c.hashCode() + ((this.f27244b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f27245c + AbstractJsonLexerKt.END_OBJ;
    }
}
