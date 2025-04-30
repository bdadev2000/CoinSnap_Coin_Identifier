package L4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1806a;
    public final List b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f1806a = str;
            this.b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1806a.equals(aVar.f1806a) && this.b.equals(aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1806a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f1806a + ", usedDates=" + this.b + "}";
    }
}
