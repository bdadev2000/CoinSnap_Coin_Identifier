package j3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends x {

    /* renamed from: a, reason: collision with root package name */
    public final List f21079a;

    public n(ArrayList arrayList) {
        this.f21079a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return this.f21079a.equals(((n) ((x) obj)).f21079a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21079a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f21079a + "}";
    }
}
