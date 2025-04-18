package i6;

import a4.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19155b;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.f19155b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && this.f19155b == aVar.f19155b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z10 = this.f19155b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GateKeeper(name=");
        sb2.append(this.a);
        sb2.append(", value=");
        return j.l(sb2, this.f19155b, ')');
    }
}
