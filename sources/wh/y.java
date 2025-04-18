package wh;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class y {
    public final a1 a;

    /* renamed from: b, reason: collision with root package name */
    public final p f27240b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27241c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f27242d;

    public y(a1 tlsVersion, p cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.a = tlsVersion;
        this.f27240b = cipherSuite;
        this.f27241c = localCertificates;
        this.f27242d = LazyKt.lazy(new c1.d(peerCertificatesFn, 7));
    }

    public final List a() {
        return (List) this.f27242d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (yVar.a == this.a && Intrinsics.areEqual(yVar.f27240b, this.f27240b) && Intrinsics.areEqual(yVar.a(), a()) && Intrinsics.areEqual(yVar.f27241c, this.f27241c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27241c.hashCode() + ((a().hashCode() + ((this.f27240b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        String type;
        String type2;
        List<Certificate> a = a();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(a, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Certificate certificate : a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f27240b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f27241c;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
