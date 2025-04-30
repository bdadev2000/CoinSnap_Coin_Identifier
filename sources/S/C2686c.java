package s;

import java.util.Map;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2686c implements Map.Entry {
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22954c;

    /* renamed from: d, reason: collision with root package name */
    public C2686c f22955d;

    /* renamed from: f, reason: collision with root package name */
    public C2686c f22956f;

    public C2686c(Object obj, Object obj2) {
        this.b = obj;
        this.f22954c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2686c)) {
            return false;
        }
        C2686c c2686c = (C2686c) obj;
        if (this.b.equals(c2686c.b) && this.f22954c.equals(c2686c.f22954c)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22954c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.f22954c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.b + "=" + this.f22954c;
    }
}
