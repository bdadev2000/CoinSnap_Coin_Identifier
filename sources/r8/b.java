package r8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class b implements v8.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f22930a;
    public final Method b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f22930a = x509TrustManager;
        this.b = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (G7.j.a(this.f22930a, bVar.f22930a) && G7.j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    @Override // v8.d
    public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        G7.j.e(x509Certificate, "cert");
        try {
            Object invoke = this.b.invoke(this.f22930a, x509Certificate);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e4) {
            throw new AssertionError("unable to get issues and signature", e4);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22930a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f22930a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
