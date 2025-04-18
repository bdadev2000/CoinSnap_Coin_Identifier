package gi;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import wh.a0;

/* loaded from: classes5.dex */
public final class g extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f18496d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f18497c;

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, e.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (e.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f18496d = z10;
    }

    public g() {
        Provider newProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(newProvider, "newProvider()");
        this.f18497c = newProvider;
    }

    @Override // gi.l
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = a0.h(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sslSocket, str, protocols);
    }

    @Override // gi.l
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        super.f(sslSocket);
        return null;
    }

    @Override // gi.l
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f18497c);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // gi.l
    public final SSLSocketFactory l(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext k10 = k();
        k10.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = k10.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // gi.l
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, f.a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", arrays).toString());
    }
}
