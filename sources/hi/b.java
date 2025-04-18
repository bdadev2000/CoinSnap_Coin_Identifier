package hi;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends com.facebook.internal.i {

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManager f19117e;

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f19118f;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f19117e = trustManager;
        this.f19118f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f19117e == this.f19117e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f19117e);
    }

    @Override // com.facebook.internal.i
    public final List k(List chain, String hostname) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f19118f.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
                Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
