package m;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final Object f21408b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21409c;

    /* renamed from: d, reason: collision with root package name */
    public c f21410d;

    /* renamed from: f, reason: collision with root package name */
    public c f21411f;

    public c(Object obj, Object obj2) {
        this.f21408b = obj;
        this.f21409c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21408b.equals(cVar.f21408b) && this.f21409c.equals(cVar.f21409c)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21408b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21409c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21408b.hashCode() ^ this.f21409c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21408b + "=" + this.f21409c;
    }
}
