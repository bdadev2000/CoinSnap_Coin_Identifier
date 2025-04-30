package s8;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class b extends e1.f {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f22987a;
    public final X509TrustManagerExtensions b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f22987a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    @Override // e1.f
    public final List c(List list, String str) {
        G7.j.e(list, "chain");
        G7.j.e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                G7.j.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e4) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
                sSLPeerUnverifiedException.initCause(e4);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f22987a == this.f22987a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22987a);
    }
}
