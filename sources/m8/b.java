package m8;

import i8.C2376m;
import i8.C2377n;
import i8.C2378o;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import v7.C2858a;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f21757a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21758c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21759d;

    public b(List list) {
        G7.j.e(list, "connectionSpecs");
        this.f21757a = list;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.A, java.lang.Object] */
    public final C2378o a(SSLSocket sSLSocket) {
        C2378o c2378o;
        int i9;
        boolean z8;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i10 = this.b;
        List list = this.f21757a;
        int size = list.size();
        while (true) {
            if (i10 < size) {
                int i11 = i10 + 1;
                c2378o = (C2378o) list.get(i10);
                if (c2378o.b(sSLSocket)) {
                    this.b = i11;
                    break;
                }
                i10 = i11;
            } else {
                c2378o = null;
                break;
            }
        }
        if (c2378o != null) {
            int i12 = this.b;
            int size2 = list.size();
            while (true) {
                i9 = 0;
                if (i12 < size2) {
                    int i13 = i12 + 1;
                    if (((C2378o) list.get(i12)).b(sSLSocket)) {
                        z8 = true;
                        break;
                    }
                    i12 = i13;
                } else {
                    z8 = false;
                    break;
                }
            }
            this.f21758c = z8;
            boolean z9 = this.f21759d;
            String[] strArr = c2378o.f20859c;
            if (strArr != null) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                G7.j.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
                enabledCipherSuites = j8.b.o(C2377n.f20839c, enabledCipherSuites2, strArr);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = c2378o.f20860d;
            if (strArr2 != null) {
                String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                G7.j.d(enabledProtocols2, "sslSocket.enabledProtocols");
                enabledProtocols = j8.b.o(C2858a.f23642c, enabledProtocols2, strArr2);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            G7.j.d(supportedCipherSuites, "supportedCipherSuites");
            C2376m c2376m = C2377n.f20839c;
            byte[] bArr = j8.b.f21214a;
            int length = supportedCipherSuites.length;
            while (true) {
                if (i9 < length) {
                    if (c2376m.compare(supportedCipherSuites[i9], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (z9 && i9 != -1) {
                G7.j.d(enabledCipherSuites, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i9];
                G7.j.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                G7.j.d(copyOf, "copyOf(this, newSize)");
                enabledCipherSuites = (String[]) copyOf;
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            ?? obj = new Object();
            obj.f13376a = c2378o.f20858a;
            obj.f13377c = strArr;
            obj.f13378d = strArr2;
            obj.b = c2378o.b;
            G7.j.d(enabledCipherSuites, "cipherSuitesIntersection");
            obj.d((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            G7.j.d(enabledProtocols, "tlsVersionsIntersection");
            obj.g((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            C2378o b = obj.b();
            if (b.c() != null) {
                sSLSocket.setEnabledProtocols(b.f20860d);
            }
            if (b.a() != null) {
                sSLSocket.setEnabledCipherSuites(b.f20859c);
            }
            return c2378o;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f21759d);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
        G7.j.b(enabledProtocols3);
        String arrays = Arrays.toString(enabledProtocols3);
        G7.j.d(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
