package wh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final r f27183e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f27184f;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27185b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f27186c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f27187d;

    static {
        p pVar = p.f27172r;
        p pVar2 = p.f27173s;
        p pVar3 = p.f27174t;
        p pVar4 = p.f27166l;
        p pVar5 = p.f27168n;
        p pVar6 = p.f27167m;
        p pVar7 = p.f27169o;
        p pVar8 = p.f27171q;
        p pVar9 = p.f27170p;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9};
        p[] pVarArr2 = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, p.f27164j, p.f27165k, p.f27162h, p.f27163i, p.f27160f, p.f27161g, p.f27159e};
        q qVar = new q(true);
        qVar.c((p[]) Arrays.copyOf(pVarArr, 9));
        a1 a1Var = a1.TLS_1_3;
        a1 a1Var2 = a1.TLS_1_2;
        qVar.f(a1Var, a1Var2);
        qVar.d();
        qVar.a();
        q qVar2 = new q(true);
        qVar2.c((p[]) Arrays.copyOf(pVarArr2, 16));
        qVar2.f(a1Var, a1Var2);
        qVar2.d();
        f27183e = qVar2.a();
        q qVar3 = new q(true);
        qVar3.c((p[]) Arrays.copyOf(pVarArr2, 16));
        qVar3.f(a1Var, a1Var2, a1.TLS_1_1, a1.TLS_1_0);
        qVar3.d();
        qVar3.a();
        f27184f = new q(false).a();
    }

    public r(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.a = z10;
        this.f27185b = z11;
        this.f27186c = strArr;
        this.f27187d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f27186c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(p.f27156b.j(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f27187d;
        if (strArr != null) {
            if (!xh.b.i(ComparisonsKt.naturalOrder(), strArr, socket.getEnabledProtocols())) {
                return false;
            }
        }
        String[] strArr2 = this.f27186c;
        if (strArr2 != null) {
            if (!xh.b.i(p.f27157c, strArr2, socket.getEnabledCipherSuites())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final List c() {
        String[] strArr = this.f27187d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(c0.g(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        r rVar = (r) obj;
        boolean z10 = rVar.a;
        boolean z11 = this.a;
        if (z11 != z10) {
            return false;
        }
        if (z11 && (!Arrays.equals(this.f27186c, rVar.f27186c) || !Arrays.equals(this.f27187d, rVar.f27187d) || this.f27185b != rVar.f27185b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.a) {
            int i10 = 0;
            String[] strArr = this.f27186c;
            if (strArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(strArr);
            }
            int i11 = (527 + hashCode) * 31;
            String[] strArr2 = this.f27187d;
            if (strArr2 != null) {
                i10 = Arrays.hashCode(strArr2);
            }
            return ((i11 + i10) * 31) + (!this.f27185b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append((Object) Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append((Object) Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return a4.j.l(sb2, this.f27185b, ')');
    }
}
