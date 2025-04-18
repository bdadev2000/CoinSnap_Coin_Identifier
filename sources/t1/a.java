package t1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25171b;

    public a(String adsSdkName, boolean z10) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.a = adsSdkName;
        this.f25171b = z10;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.f25171b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.a, aVar.a) && this.f25171b == aVar.f25171b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25171b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.a + ", shouldRecordObservation=" + this.f25171b;
    }
}
