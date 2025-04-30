package s8;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import q4.C2643b;

/* loaded from: classes3.dex */
public final class a implements m {
    @Override // s8.m
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // s8.m
    public final boolean b() {
        r8.m mVar = r8.m.f22950a;
        if (C2643b.f() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // s8.m
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean equals;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            equals = true;
        } else {
            equals = applicationProtocol.equals("");
        }
        if (equals) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // s8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            r8.m mVar = r8.m.f22950a;
            Object[] array = C2643b.d(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }
}
