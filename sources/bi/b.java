package bi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import wh.p;
import wh.q;
import wh.r;

/* loaded from: classes5.dex */
public final class b {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public int f2440b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2441c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2442d;

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.a = connectionSpecs;
    }

    public final r a(SSLSocket sslSocket) {
        r rVar;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        boolean z11;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f2440b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i10 < size) {
                int i11 = i10 + 1;
                rVar = (r) list.get(i10);
                if (rVar.b(sslSocket)) {
                    this.f2440b = i11;
                    break;
                }
                i10 = i11;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            int i12 = this.f2440b;
            int size2 = list.size();
            while (true) {
                if (i12 < size2) {
                    int i13 = i12 + 1;
                    if (((r) list.get(i12)).b(sslSocket)) {
                        z10 = true;
                        break;
                    }
                    i12 = i13;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.f2441c = z10;
            boolean z12 = this.f2442d;
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            String[] strArr = rVar.f27186c;
            if (strArr != null) {
                String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
                Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                cipherSuitesIntersection = xh.b.o(p.f27157c, enabledCipherSuites, strArr);
            } else {
                cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = rVar.f27187d;
            if (strArr2 != null) {
                String[] enabledProtocols = sslSocket.getEnabledProtocols();
                Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
                tlsVersionsIntersection = xh.b.o(ComparisonsKt.naturalOrder(), enabledProtocols, strArr2);
            } else {
                tlsVersionsIntersection = sslSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
            Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
            b0.g comparator = p.f27157c;
            byte[] bArr = xh.b.a;
            Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
            Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            int length = supportedCipherSuites.length;
            int i14 = 0;
            while (true) {
                if (i14 < length) {
                    if (comparator.compare(supportedCipherSuites[i14], "TLS_FALLBACK_SCSV") == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = -1;
                    break;
                }
            }
            if (z12 && i14 != -1) {
                Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
                String value = supportedCipherSuites[i14];
                Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
                Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                cipherSuitesIntersection = (String[]) copyOf;
                cipherSuitesIntersection[ArraysKt.getLastIndex(cipherSuitesIntersection)] = value;
            }
            q qVar = new q(rVar);
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            qVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
            Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
            qVar.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
            r a = qVar.a();
            if (a.c() != null) {
                sslSocket.setEnabledProtocols(a.f27187d);
            }
            if (a.a() != null) {
                sslSocket.setEnabledCipherSuites(a.f27186c);
            }
            return rVar;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f2442d);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }
}
