package f0;

import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes4.dex */
public final class e implements Map.Entry, r0.d {

    /* renamed from: a, reason: collision with root package name */
    public final g f30424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30425b;

    public e(g gVar, int i2) {
        p0.a.s(gVar, "map");
        this.f30424a = gVar;
        this.f30425b = i2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (p0.a.g(entry.getKey(), getKey()) && p0.a.g(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30424a.f30430a[this.f30425b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f30424a.f30431b;
        p0.a.p(objArr);
        return objArr[this.f30425b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        g gVar = this.f30424a;
        gVar.c();
        Object[] objArr = gVar.f30431b;
        if (objArr == null) {
            int length = gVar.f30430a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            gVar.f30431b = objArr;
        }
        int i2 = this.f30425b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(getValue());
        return sb.toString();
    }
}
