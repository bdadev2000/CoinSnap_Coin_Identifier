package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class p1 implements Map.Entry, Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f1449b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f1451d;

    public p1(m1 m1Var, Comparable comparable, Object obj) {
        this.f1451d = m1Var;
        this.f1449b = comparable;
        this.f1450c = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1449b.compareTo(((p1) obj).f1449b);
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
        Comparable comparable = this.f1449b;
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
            Object obj2 = this.f1450c;
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
        return this.f1449b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1450c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1449b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1450c;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = m1.f1434i;
        this.f1451d.b();
        Object obj2 = this.f1450c;
        this.f1450c = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1449b + "=" + this.f1450c;
    }
}
