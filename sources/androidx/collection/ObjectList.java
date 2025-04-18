package androidx.collection;

import p0.a;
import w0.g;

/* loaded from: classes4.dex */
public abstract class ObjectList<E> {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1549a;

    /* renamed from: b, reason: collision with root package name */
    public int f1550b;

    public final int a(Object obj) {
        int i2 = 0;
        if (obj == null) {
            Object[] objArr = this.f1549a;
            int i3 = this.f1550b;
            while (i2 < i3) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        Object[] objArr2 = this.f1549a;
        int i4 = this.f1550b;
        while (i2 < i4) {
            if (obj.equals(objArr2[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i2 = objectList.f1550b;
            int i3 = this.f1550b;
            if (i2 == i3) {
                Object[] objArr = this.f1549a;
                Object[] objArr2 = objectList.f1549a;
                g F0 = a.F0(0, i3);
                int i4 = F0.f31406a;
                int i5 = F0.f31407b;
                if (i4 > i5) {
                    return true;
                }
                while (a.g(objArr[i4], objArr2[i4])) {
                    if (i4 == i5) {
                        return true;
                    }
                    i4++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f1549a;
        int i2 = this.f1550b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            i3 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i3;
    }

    public final String toString() {
        ObjectList$toString$1 objectList$toString$1 = new ObjectList$toString$1(this);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f1549a;
        int i2 = this.f1550b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) objectList$toString$1.invoke(obj));
            i3++;
        }
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
