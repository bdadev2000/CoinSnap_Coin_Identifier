package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 implements Map.Entry, Comparable {
    public final Comparable b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f4559d;

    public f0(c0 c0Var, Comparable comparable, Object obj) {
        this.f4559d = c0Var;
        this.b = comparable;
        this.f4558c = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b.compareTo(((f0) obj).b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.b;
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f4558c;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4558c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Comparable comparable = this.b;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f4558c;
        if (obj != null) {
            i9 = obj.hashCode();
        }
        return i9 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4559d.b();
        Object obj2 = this.f4558c;
        this.f4558c = obj;
        return obj2;
    }

    public final String toString() {
        return this.b + "=" + this.f4558c;
    }
}
