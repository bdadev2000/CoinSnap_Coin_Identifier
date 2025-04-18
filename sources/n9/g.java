package n9;

import android.util.SparseBooleanArray;
import v8.u0;

/* loaded from: classes3.dex */
public final class g {
    public final SparseBooleanArray a;

    public g(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i10) {
        u0.i(i10, b());
        return this.a.keyAt(i10);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (h0.a < 24) {
            if (b() != gVar.b()) {
                return false;
            }
            for (int i10 = 0; i10 < b(); i10++) {
                if (a(i10) != gVar.a(i10)) {
                    return false;
                }
            }
            return true;
        }
        return this.a.equals(gVar.a);
    }

    public final int hashCode() {
        if (h0.a < 24) {
            int b3 = b();
            for (int i10 = 0; i10 < b(); i10++) {
                b3 = (b3 * 31) + a(i10);
            }
            return b3;
        }
        return this.a.hashCode();
    }
}
