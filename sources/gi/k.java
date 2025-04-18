package gi;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import wh.a0;
import wh.c0;

/* loaded from: classes5.dex */
public final class k extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f18507d = new c0(16, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18508e;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f18509c = new OpenJSSE();

    static {
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, c0.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f18508e = z10;
    }

    @Override // gi.l
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = a0.h(protocols).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            return;
        }
        super.d(sslSocket, str, protocols);
    }

    @Override // gi.l
    public final String f(SSLSocket sslSocket) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
            if (applicationProtocol == null) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(applicationProtocol, "");
            }
            if (!areEqual) {
                return applicationProtocol;
            }
        } else {
            super.f(sslSocket);
        }
        return null;
    }

    @Override // gi.l
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f18509c);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // gi.l
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f18509c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", arrays).toString());
    }
}
