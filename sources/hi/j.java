package hi;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import wh.a0;

/* loaded from: classes5.dex */
public final class j implements m {
    public static final a0 a = new a0(20, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final g f19130b = new g(1);

    @Override // hi.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // hi.m
    public final boolean b() {
        boolean z10 = gi.g.f18496d;
        return gi.g.f18496d;
    }

    @Override // hi.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // hi.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            gi.l lVar = gi.l.a;
            Object[] array = a0.h(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
