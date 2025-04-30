package d4;

import java.util.Map;

/* renamed from: d4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2176d implements Map.Entry {
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public int f19857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2178f f19858d;

    public C2176d(C2178f c2178f, int i9) {
        this.f19858d = c2178f;
        Object obj = C2178f.l;
        this.b = c2178f.i()[i9];
        this.f19857c = i9;
    }

    public final void a() {
        int i9 = this.f19857c;
        Object obj = this.b;
        C2178f c2178f = this.f19858d;
        if (i9 != -1 && i9 < c2178f.size()) {
            if (z2.i.h(obj, c2178f.i()[this.f19857c])) {
                return;
            }
        }
        Object obj2 = C2178f.l;
        this.f19857c = c2178f.d(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!z2.i.h(getKey(), entry.getKey()) || !z2.i.h(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C2178f c2178f = this.f19858d;
        Map b = c2178f.b();
        if (b != null) {
            return b.get(this.b);
        }
        a();
        int i9 = this.f19857c;
        if (i9 == -1) {
            return null;
        }
        return c2178f.k()[i9];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i9 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i9 = value.hashCode();
        }
        return hashCode ^ i9;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2178f c2178f = this.f19858d;
        Map b = c2178f.b();
        Object obj2 = this.b;
        if (b != null) {
            return b.put(obj2, obj);
        }
        a();
        int i9 = this.f19857c;
        if (i9 == -1) {
            c2178f.put(obj2, obj);
            return null;
        }
        Object obj3 = c2178f.k()[i9];
        c2178f.k()[this.f19857c] = obj;
        return obj3;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
