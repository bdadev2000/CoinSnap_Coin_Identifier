package i8;

import Q7.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import u7.AbstractC2816g;
import v7.C2858a;
import y2.AbstractC2947c;

/* renamed from: i8.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2378o {

    /* renamed from: e, reason: collision with root package name */
    public static final C2378o f20856e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2378o f20857f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20858a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f20859c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f20860d;

    static {
        C2377n c2377n = C2377n.f20852r;
        C2377n c2377n2 = C2377n.f20853s;
        C2377n c2377n3 = C2377n.f20854t;
        C2377n c2377n4 = C2377n.l;
        C2377n c2377n5 = C2377n.f20848n;
        C2377n c2377n6 = C2377n.m;
        C2377n c2377n7 = C2377n.f20849o;
        C2377n c2377n8 = C2377n.f20851q;
        C2377n c2377n9 = C2377n.f20850p;
        C2377n[] c2377nArr = {c2377n, c2377n2, c2377n3, c2377n4, c2377n5, c2377n6, c2377n7, c2377n8, c2377n9, C2377n.f20846j, C2377n.f20847k, C2377n.f20844h, C2377n.f20845i, C2377n.f20842f, C2377n.f20843g, C2377n.f20841e};
        com.facebook.A a6 = new com.facebook.A();
        a6.c((C2377n[]) Arrays.copyOf(new C2377n[]{c2377n, c2377n2, c2377n3, c2377n4, c2377n5, c2377n6, c2377n7, c2377n8, c2377n9}, 9));
        O o3 = O.TLS_1_3;
        O o9 = O.TLS_1_2;
        a6.f(o3, o9);
        a6.e();
        a6.b();
        com.facebook.A a9 = new com.facebook.A();
        a9.c((C2377n[]) Arrays.copyOf(c2377nArr, 16));
        a9.f(o3, o9);
        a9.e();
        f20856e = a9.b();
        com.facebook.A a10 = new com.facebook.A();
        a10.c((C2377n[]) Arrays.copyOf(c2377nArr, 16));
        a10.f(o3, o9, O.TLS_1_1, O.TLS_1_0);
        a10.e();
        a10.b();
        f20857f = new C2378o(false, false, null, null);
    }

    public C2378o(boolean z8, boolean z9, String[] strArr, String[] strArr2) {
        this.f20858a = z8;
        this.b = z9;
        this.f20859c = strArr;
        this.f20860d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f20859c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C2377n.b.c(str));
        }
        return AbstractC2816g.T(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f20858a) {
            return false;
        }
        String[] strArr = this.f20860d;
        if (strArr != null) {
            if (!j8.b.i(C2858a.f23642c, strArr, sSLSocket.getEnabledProtocols())) {
                return false;
            }
        }
        String[] strArr2 = this.f20859c;
        if (strArr2 != null) {
            if (!j8.b.i(C2377n.f20839c, strArr2, sSLSocket.getEnabledCipherSuites())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final List c() {
        String[] strArr = this.f20860d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC2947c.j(str));
        }
        return AbstractC2816g.T(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2378o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2378o c2378o = (C2378o) obj;
        boolean z8 = c2378o.f20858a;
        boolean z9 = this.f20858a;
        if (z9 != z8) {
            return false;
        }
        if (z9 && (!Arrays.equals(this.f20859c, c2378o.f20859c) || !Arrays.equals(this.f20860d, c2378o.f20860d) || this.b != c2378o.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f20858a) {
            int i9 = 0;
            String[] strArr = this.f20859c;
            if (strArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(strArr);
            }
            int i10 = (527 + hashCode) * 31;
            String[] strArr2 = this.f20860d;
            if (strArr2 != null) {
                i9 = Arrays.hashCode(strArr2);
            }
            return ((i10 + i9) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f20858a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append((Object) Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append((Object) Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return n0.n(sb, this.b, ')');
    }
}
