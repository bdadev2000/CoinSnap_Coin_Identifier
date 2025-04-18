package wh;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f27177b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f27178c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27179d;

    public q(boolean z10) {
        this.a = z10;
    }

    public final r a() {
        return new r(this.a, this.f27179d, this.f27177b, this.f27178c);
    }

    public final void b(String... cipherSuites) {
        boolean z10;
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (this.a) {
            if (cipherSuites.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f27177b = (String[]) cipherSuites.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void c(p... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (this.a) {
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (p pVar : cipherSuites) {
                arrayList.add(pVar.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                b((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void d() {
        if (this.a) {
            this.f27179d = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public final void e(String... tlsVersions) {
        boolean z10;
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (this.a) {
            if (tlsVersions.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f27178c = (String[]) tlsVersions.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public final void f(a1... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (this.a) {
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (a1 a1Var : tlsVersions) {
                arrayList.add(a1Var.f27018b);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                e((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public q(r connectionSpec) {
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        this.a = connectionSpec.a;
        this.f27177b = connectionSpec.f27186c;
        this.f27178c = connectionSpec.f27187d;
        this.f27179d = connectionSpec.f27185b;
    }
}
