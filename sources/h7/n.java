package h7;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class n extends x {
    public final List a;

    public n(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((n) ((x) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
