package hi;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;
import wh.c0;

/* loaded from: classes5.dex */
public final class a implements m {
    public static final c0 a = new c0(17, 0);

    @Override // hi.m
    public final boolean a(SSLSocket sslSocket) {
        boolean isSupportedSocket;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // hi.m
    public final boolean b() {
        return a.m();
    }

    @Override // hi.m
    public final String c(SSLSocket sslSocket) {
        String applicationProtocol;
        boolean areEqual;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
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
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            gi.l lVar = gi.l.a;
            Object[] array = a0.h(protocols).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sslSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
