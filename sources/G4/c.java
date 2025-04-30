package G4;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1274a;
    public final Map b;

    public c(String str, Map map) {
        this.f1274a = str;
        this.b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1274a.equals(cVar.f1274a) && this.b.equals(cVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1274a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f1274a + ", properties=" + this.b.values() + "}";
    }
}
