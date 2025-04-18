package wh;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f27144c = new n(CollectionsKt.toSet(new a4.s(2).a), null);
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.internal.i f27145b;

    public n(Set pins, com.facebook.internal.i iVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.a = pins;
        this.f27145b = iVar;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.a;
        List emptyList = CollectionsKt.emptyList();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            if (emptyList.isEmpty()) {
                return;
            }
            List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator it2 = emptyList.iterator();
                if (it2.hasNext()) {
                    a4.j.t(it2.next());
                    throw null;
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb2.append("\n    ");
                sb2.append(a0.F(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(hostname);
            sb2.append(":");
            Iterator it3 = emptyList.iterator();
            while (it3.hasNext()) {
                a4.j.t(it3.next());
                sb2.append("\n    null");
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
        a4.j.t(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (Intrinsics.areEqual(nVar.a, this.a) && Intrinsics.areEqual(nVar.f27145b, this.f27145b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.a.hashCode() + 1517) * 41;
        com.facebook.internal.i iVar = this.f27145b;
        if (iVar != null) {
            i10 = iVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
