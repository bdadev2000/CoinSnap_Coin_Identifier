package hi;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import wh.a0;

/* loaded from: classes5.dex */
public final class h implements m {
    public static final a0 a = new a0(19, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final g f19127b = new g(0);

    @Override // hi.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // hi.m
    public final boolean b() {
        return gi.d.f18493d.z();
    }

    @Override // hi.m
    public final String c(SSLSocket sslSocket) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            areEqual = true;
        } else {
            areEqual = Intrinsics.areEqual(applicationProtocol, "");
        }
        if (areEqual) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // hi.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            gi.l lVar = gi.l.a;
            Object[] array = a0.h(protocols).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
