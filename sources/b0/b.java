package B0;

import G7.j;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f254a;

    public b(List list) {
        j.e(list, "topics");
        this.f254a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f254a;
        b bVar = (b) obj;
        if (list.size() != bVar.f254a.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(bVar.f254a));
    }

    public final int hashCode() {
        return Objects.hash(this.f254a);
    }

    public final String toString() {
        return "Topics=" + this.f254a;
    }
}
