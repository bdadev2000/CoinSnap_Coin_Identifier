package t1;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {
    public final List a;

    public b(List topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.a = topics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.a;
        b bVar = (b) obj;
        if (list.size() != bVar.a.size()) {
            return false;
        }
        return Intrinsics.areEqual(new HashSet(list), new HashSet(bVar.a));
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "Topics=" + this.a;
    }
}
