package ac;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final List f425b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.f425b = arrayList;
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
        if (this.a.equals(aVar.a) && this.f425b.equals(aVar.f425b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f425b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.f425b + "}";
    }
}
