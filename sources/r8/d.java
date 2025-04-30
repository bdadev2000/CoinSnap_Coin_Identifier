package r8;

import M0.C0219j;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes3.dex */
public final class d extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22934d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f22935c = new BouncyCastleJsseProvider();

    static {
        boolean z8 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, C0219j.class.getClassLoader());
            z8 = true;
        } catch (ClassNotFoundException unused) {
        }
        f22934d = z8;
    }

    @Override // r8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        super.d(sSLSocket, str, list);
    }

    @Override // r8.m
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // r8.m
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f22935c);
        G7.j.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // r8.m
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        G7.j.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        G7.j.d(arrays, "toString(this)");
        throw new IllegalStateException(G7.j.j(arrays, "Unexpected default trust managers: ").toString());
    }
}
