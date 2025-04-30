package I6;

import G7.j;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f1476a;

    public g(String str) {
        this.f1476a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && j.a(this.f1476a, ((g) obj).f1476a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1476a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC2914a.h(new StringBuilder("UIState(path="), this.f1476a, ")");
    }
}
