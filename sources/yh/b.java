package yh;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wh.d0;
import wh.u;
import x5.c;

/* loaded from: classes5.dex */
public final class b implements wh.b {

    /* renamed from: b, reason: collision with root package name */
    public final u f28296b;

    public b() {
        c defaultDns = u.f27212k8;
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f28296b = defaultDns;
    }

    public static InetAddress a(Proxy proxy, d0 d0Var, u uVar) {
        int i10;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = a.a[type.ordinal()];
        }
        if (i10 == 1) {
            return (InetAddress) CollectionsKt.first(((c) uVar).c(d0Var.f27035d));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            Intrinsics.checkNotNullExpressionValue(address2, "address() as InetSocketAddress).address");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    @Override // wh.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wh.o0 f(wh.z0 r23, wh.u0 r24) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.b.f(wh.z0, wh.u0):wh.o0");
    }
}
