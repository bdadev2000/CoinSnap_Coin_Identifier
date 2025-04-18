package c1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {
    public final String a;

    public e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Intrinsics.areEqual(this.a, ((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
