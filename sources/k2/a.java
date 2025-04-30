package K2;

import G7.j;
import Q7.n0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1644a;
    public final boolean b;

    public a(String str, boolean z8) {
        j.e(str, "name");
        this.f1644a = str;
        this.b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.f1644a, aVar.f1644a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f1644a.hashCode() * 31;
        boolean z8 = this.b;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        return hashCode + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GateKeeper(name=");
        sb.append(this.f1644a);
        sb.append(", value=");
        return n0.n(sb, this.b, ')');
    }
}
