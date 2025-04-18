package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23879b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23880c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23881d;

    public u(int i10, int i11, String processName, boolean z10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.a = processName;
        this.f23879b = i10;
        this.f23880c = i11;
        this.f23881d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.a, uVar.a) && this.f23879b == uVar.f23879b && this.f23880c == uVar.f23880c && this.f23881d == uVar.f23881d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int e2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f23880c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f23879b, this.a.hashCode() * 31, 31), 31);
        boolean z10 = this.f23881d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return e2 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.a);
        sb2.append(", pid=");
        sb2.append(this.f23879b);
        sb2.append(", importance=");
        sb2.append(this.f23880c);
        sb2.append(", isDefaultProcess=");
        return a4.j.l(sb2, this.f23881d, ')');
    }
}
