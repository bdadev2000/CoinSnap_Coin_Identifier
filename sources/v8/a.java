package v8;

import G7.j;
import e1.f;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final d f23644a;

    public a(d dVar) {
        j.e(dVar, "trustRootIndex");
        this.f23644a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    @Override // e1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c(java.util.List r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "chain"
            G7.j.e(r8, r0)
            java.lang.String r0 = "hostname"
            G7.j.e(r9, r0)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            java.util.Collection r8 = (java.util.Collection) r8
            r9.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r0 = r9.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            G7.j.d(r0, r1)
            r8.add(r0)
            r0 = 0
            r1 = r0
        L24:
            r2 = 9
            if (r0 >= r2) goto Lac
            int r0 = r0 + 1
            r2 = 1
            java.lang.Object r3 = com.mbridge.msdk.foundation.entity.o.g(r8, r2)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            v8.d r4 = r7.f23644a
            java.security.cert.X509Certificate r4 = r4.findByIssuerAndSignature(r3)
            if (r4 == 0) goto L61
            int r1 = r8.size()
            if (r1 > r2) goto L45
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L48
        L45:
            r8.add(r4)
        L48:
            java.security.Principal r1 = r4.getIssuerDN()
            java.security.Principal r3 = r4.getSubjectDN()
            boolean r1 = G7.j.a(r1, r3)
            if (r1 != 0) goto L57
            goto L5f
        L57:
            java.security.PublicKey r1 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L5f
            r4.verify(r1)     // Catch: java.security.GeneralSecurityException -> L5f
            return r8
        L5f:
            r1 = r2
            goto L24
        L61:
            java.util.Iterator r2 = r9.iterator()
            java.lang.String r4 = "queue.iterator()"
            G7.j.d(r2, r4)
        L6a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9d
            java.lang.Object r4 = r2.next()
            if (r4 == 0) goto L95
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            java.security.Principal r5 = r3.getIssuerDN()
            java.security.Principal r6 = r4.getSubjectDN()
            boolean r5 = G7.j.a(r5, r6)
            if (r5 != 0) goto L87
            goto L6a
        L87:
            java.security.PublicKey r5 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L6a
            r3.verify(r5)     // Catch: java.security.GeneralSecurityException -> L6a
            r2.remove()
            r8.add(r4)
            goto L24
        L95:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r8.<init>(r9)
            throw r8
        L9d:
            if (r1 == 0) goto La0
            return r8
        La0:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r9 = "Failed to find a trusted cert that signed "
            java.lang.String r9 = G7.j.j(r3, r9)
            r8.<init>(r9)
            throw r8
        Lac:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = "Certificate chain too long: "
            java.lang.String r8 = G7.j.j(r8, r0)
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.a.c(java.util.List, java.lang.String):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && j.a(((a) obj).f23644a, this.f23644a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23644a.hashCode();
    }
}
