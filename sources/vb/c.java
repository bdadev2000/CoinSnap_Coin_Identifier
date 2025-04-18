package vb;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f26412b;

    public c(String str, Map map) {
        this.a = str;
        this.f26412b = map;
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
        if (this.a.equals(cVar.a) && this.f26412b.equals(cVar.f26412b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26412b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.f26412b.values() + "}";
    }
}
