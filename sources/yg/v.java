package yg;

import java.util.Map;

/* loaded from: classes4.dex */
public final class v implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public v f28270b;

    /* renamed from: c, reason: collision with root package name */
    public v f28271c;

    /* renamed from: d, reason: collision with root package name */
    public v f28272d;

    /* renamed from: f, reason: collision with root package name */
    public v f28273f;

    /* renamed from: g, reason: collision with root package name */
    public v f28274g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f28275h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28276i;

    /* renamed from: j, reason: collision with root package name */
    public Object f28277j;

    /* renamed from: k, reason: collision with root package name */
    public int f28278k;

    public v() {
        this.f28275h = null;
        this.f28276i = -1;
        this.f28274g = this;
        this.f28273f = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f28275h;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f28277j;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28275h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28277j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f28275h;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f28277j;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f28277j;
        this.f28277j = obj;
        return obj2;
    }

    public final String toString() {
        return this.f28275h + "=" + this.f28277j;
    }

    public v(v vVar, Object obj, int i10, v vVar2, v vVar3) {
        this.f28270b = vVar;
        this.f28275h = obj;
        this.f28276i = i10;
        this.f28278k = 1;
        this.f28273f = vVar2;
        this.f28274g = vVar3;
        vVar3.f28273f = this;
        vVar2.f28274g = this;
    }
}
