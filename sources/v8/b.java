package v8;

import G7.j;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23645a;

    public b(X509Certificate... x509CertificateArr) {
        j.e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i9 = 0;
        while (i9 < length) {
            X509Certificate x509Certificate = x509CertificateArr[i9];
            i9++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            j.d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f23645a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof b) || !j.a(((b) obj).f23645a, this.f23645a))) {
            return false;
        }
        return true;
    }

    @Override // v8.d
    public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        j.e(x509Certificate, "cert");
        Set set = (Set) this.f23645a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final int hashCode() {
        return this.f23645a.hashCode();
    }
}
