package ji;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {
    public final LinkedHashMap a;

    public b(X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i10 = 0;
        while (i10 < length) {
            X509Certificate x509Certificate = caCerts[i10];
            i10++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && Intrinsics.areEqual(((b) obj).a, this.a));
    }

    @Override // ji.d
    public final X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        boolean z10;
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set set = (Set) this.a.get(cert.getIssuerX500Principal());
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
                cert.verify(((X509Certificate) next).getPublicKey());
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
