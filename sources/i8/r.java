package i8;

import h0.C2315e;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import t7.AbstractC2712a;
import t7.C2724m;
import u7.AbstractC2818i;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final O f20872a;
    public final C2377n b;

    /* renamed from: c, reason: collision with root package name */
    public final List f20873c;

    /* renamed from: d, reason: collision with root package name */
    public final C2724m f20874d;

    public r(O o3, C2377n c2377n, List list, F7.a aVar) {
        this.f20872a = o3;
        this.b = c2377n;
        this.f20873c = list;
        this.f20874d = AbstractC2712a.d(new C2315e(aVar, 1));
    }

    public final List a() {
        return (List) this.f20874d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.f20872a == this.f20872a && G7.j.a(rVar.b, this.b) && G7.j.a(rVar.a(), a()) && G7.j.a(rVar.f20873c, this.f20873c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20873c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.f20872a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a6 = a();
        ArrayList arrayList = new ArrayList(AbstractC2818i.E(a6, 10));
        for (Certificate certificate : a6) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                G7.j.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f20872a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f20873c;
        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                G7.j.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
