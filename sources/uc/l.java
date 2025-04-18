package uc;

import java.util.Map;

/* loaded from: classes3.dex */
public final class l implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public l f25774b;

    /* renamed from: c, reason: collision with root package name */
    public l f25775c;

    /* renamed from: d, reason: collision with root package name */
    public l f25776d;

    /* renamed from: f, reason: collision with root package name */
    public l f25777f;

    /* renamed from: g, reason: collision with root package name */
    public l f25778g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f25779h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f25780i;

    /* renamed from: j, reason: collision with root package name */
    public Object f25781j;

    /* renamed from: k, reason: collision with root package name */
    public int f25782k;

    public l(boolean z10) {
        this.f25779h = null;
        this.f25780i = z10;
        this.f25778g = this;
        this.f25777f = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f25779h;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f25781j;
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
        return this.f25779h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25781j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f25779h;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f25781j;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f25780i) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f25781j;
        this.f25781j = obj;
        return obj2;
    }

    public final String toString() {
        return this.f25779h + "=" + this.f25781j;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.f25774b = lVar;
        this.f25779h = obj;
        this.f25780i = z10;
        this.f25782k = 1;
        this.f25777f = lVar2;
        this.f25778g = lVar3;
        lVar3.f25777f = this;
        lVar2.f25778g = this;
    }
}
