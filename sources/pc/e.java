package pc;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e {
    public final Set a;

    public e(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
