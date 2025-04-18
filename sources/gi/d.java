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
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import wh.a0;

/* loaded from: classes5.dex */
public final class d extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f18493d = new a0(15, 0 == true ? 1 : 0);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18494e;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f18495c = new BouncyCastleJsseProvider();

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, a0.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f18494e = z10;
    }

    @Override // gi.l
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (sslSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = a0.h(protocols).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sslSocket, str, protocols);
    }

    @Override // gi.l
    public final String f(SSLSocket sslSocket) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (sslSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
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
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f18495c);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // gi.l
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
