package N6;

import java.util.List;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f2116a;

    public h(List list) {
        this.f2116a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && G7.j.a(this.f2116a, ((h) obj).f2116a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2116a.hashCode();
    }

    public final String toString() {
        return "UIState(images=" + this.f2116a + ")";
    }
}
