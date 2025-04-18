package okhttp3;

import b1.f0;
import d0.h;
import e0.q;
import e0.u;
import e0.w;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.k;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;

/* loaded from: classes2.dex */
public final class Handshake {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final CipherSuite cipherSuite;

    @NotNull
    private final List<Certificate> localCertificates;

    @NotNull
    private final h peerCertificates$delegate;

    @NotNull
    private final TlsVersion tlsVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull a aVar) {
        p0.a.s(tlsVersion, "tlsVersion");
        p0.a.s(cipherSuite, "cipherSuite");
        p0.a.s(list, "localCertificates");
        p0.a.s(aVar, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = f0.t(new Handshake$peerCertificates$2(aVar));
    }

    @NotNull
    public static final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        p0.a.r(type, "type");
        return type;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m671deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m672deprecated_localCertificates() {
        return this.localCertificates;
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m673deprecated_localPrincipal() {
        return localPrincipal();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m674deprecated_peerCertificates() {
        return peerCertificates();
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m675deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m676deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && p0.a.g(handshake.cipherSuite, this.cipherSuite) && p0.a.g(handshake.peerCertificates(), peerCertificates()) && p0.a.g(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @Nullable
    public final Principal localPrincipal() {
        Object F0 = u.F0(this.localCertificates);
        X509Certificate x509Certificate = F0 instanceof X509Certificate ? (X509Certificate) F0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @NotNull
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    @Nullable
    public final Principal peerPrincipal() {
        Object F0 = u.F0(peerCertificates());
        X509Certificate x509Certificate = F0 instanceof X509Certificate ? (X509Certificate) F0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @NotNull
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(q.M(peerCertificates, 10));
        Iterator<T> it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(q.M(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    @NotNull
    public static final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : w.f30218a;
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m677deprecated_get(@NotNull SSLSession sSLSession) throws IOException {
            p0.a.s(sSLSession, "sslSession");
            return get(sSLSession);
        }

        @NotNull
        public final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            p0.a.s(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!p0.a.g(cipherSuite, "TLS_NULL_WITH_NULL_NULL") && !p0.a.g(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                    CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!p0.a.g("NONE", protocol)) {
                            TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                            try {
                                list = toImmutableList(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                list = w.f30218a;
                            }
                            return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        @NotNull
        public final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
            p0.a.s(tlsVersion, "tlsVersion");
            p0.a.s(cipherSuite, "cipherSuite");
            p0.a.s(list, "peerCertificates");
            p0.a.s(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }
}
