package gi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements ji.d {
    public final X509TrustManager a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f18488b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.a = trustManager;
        this.f18488b = findByIssuerAndSignatureMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.f18488b, bVar.f18488b);
    }

    @Override // ji.d
    public final X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object invoke = this.f18488b.invoke(this.a, cert);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.f18488b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.f18488b + ')';
    }
}
