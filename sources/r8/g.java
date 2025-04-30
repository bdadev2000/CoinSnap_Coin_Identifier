package r8;

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
import org.conscrypt.Conscrypt;
import q4.C2643b;

/* loaded from: classes3.dex */
public final class g extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22937d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f22938c;

    static {
        boolean z8 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, e.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (e.a()) {
                    z8 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f22937d = z8;
    }

    public g() {
        Provider newProvider = Conscrypt.newProvider();
        G7.j.d(newProvider, "newProvider()");
        this.f22938c = newProvider;
    }

    @Override // r8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C2643b.d(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sSLSocket, str, list);
    }

    @Override // r8.m
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // r8.m
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f22938c);
        G7.j.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // r8.m
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k6 = k();
        k6.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k6.getSocketFactory();
        G7.j.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // r8.m
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        G7.j.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    Conscrypt.setHostnameVerifier(x509TrustManager, f.f22936a);
                    return x509TrustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        G7.j.d(arrays, "toString(this)");
        throw new IllegalStateException(G7.j.j(arrays, "Unexpected default trust managers: ").toString());
    }
}
