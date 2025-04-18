package ji;

import com.facebook.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: e, reason: collision with root package name */
    public final d f20026e;

    public a(d trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f20026e = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(((a) obj).f20026e, this.f20026e);
    }

    public final int hashCode() {
        return this.f20026e.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:1: B:8:0x0075->B:23:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[SYNTHETIC] */
    @Override // com.facebook.internal.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List k(java.util.List r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            java.util.Collection r10 = (java.util.Collection) r10
            r11.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r11.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r10.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L25:
            r3 = 9
            if (r1 >= r3) goto Lbc
            int r1 = r1 + 1
            int r3 = r10.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r10.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            ji.d r5 = r9.f20026e
            java.security.cert.X509Certificate r5 = r5.findByIssuerAndSignature(r3)
            if (r5 == 0) goto L6c
            int r2 = r10.size()
            if (r2 > r4) goto L4b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r2 != 0) goto L4e
        L4b:
            r10.add(r5)
        L4e:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r3 = r5.getSubjectDN()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L5d
            goto L66
        L5d:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L66
            r5.verify(r2)     // Catch: java.security.GeneralSecurityException -> L66
            r2 = r4
            goto L67
        L66:
            r2 = r0
        L67:
            if (r2 == 0) goto L6a
            return r10
        L6a:
            r2 = r4
            goto L25
        L6c:
            java.util.Iterator r5 = r11.iterator()
            java.lang.String r6 = "queue.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
        L75:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lad
            java.lang.Object r6 = r5.next()
            if (r6 == 0) goto La5
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r3.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r7 != 0) goto L92
            goto L9b
        L92:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L9b
            r3.verify(r7)     // Catch: java.security.GeneralSecurityException -> L9b
            r7 = r4
            goto L9c
        L9b:
            r7 = r0
        L9c:
            if (r7 == 0) goto L75
            r5.remove()
            r10.add(r6)
            goto L25
        La5:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r10.<init>(r11)
            throw r10
        Lad:
            if (r2 == 0) goto Lb0
            return r10
        Lb0:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r11 = "Failed to find a trusted cert that signed "
            java.lang.String r11 = kotlin.jvm.internal.Intrinsics.stringPlus(r11, r3)
            r10.<init>(r11)
            throw r10
        Lbc:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = "Certificate chain too long: "
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r10)
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.a.k(java.util.List, java.lang.String):java.util.List");
    }
}
