package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import e0.q;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;
import p0.a;

/* loaded from: classes2.dex */
public class SimpleArrayMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1606a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1607b;

    /* renamed from: c, reason: collision with root package name */
    public int f1608c;

    public SimpleArrayMap() {
        this(0);
    }

    public final int b(Object obj) {
        int i2 = this.f1608c * 2;
        Object[] objArr = this.f1607b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (a.g(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i2) {
        int i3 = this.f1608c;
        int[] iArr = this.f1606a;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, i2);
            a.r(copyOf, "copyOf(this, newSize)");
            this.f1606a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f1607b, i2 * 2);
            a.r(copyOf2, "copyOf(this, newSize)");
            this.f1607b = copyOf2;
        }
        if (this.f1608c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        if (this.f1608c > 0) {
            this.f1606a = ContainerHelpersKt.f1617a;
            this.f1607b = ContainerHelpersKt.f1619c;
            this.f1608c = 0;
        }
        if (this.f1608c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final int d(int i2, Object obj) {
        int i3 = this.f1608c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = ContainerHelpersKt.a(i3, i2, this.f1606a);
        if (a2 < 0 || a.g(obj, this.f1607b[a2 << 1])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f1606a[i4] == i2) {
            if (a.g(obj, this.f1607b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f1606a[i5] == i2; i5--) {
            if (a.g(obj, this.f1607b[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i2 = this.f1608c;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object g2 = g(i3);
                    Object k2 = k(i3);
                    Object obj2 = simpleArrayMap.get(g2);
                    if (k2 == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(g2)) {
                            return false;
                        }
                    } else if (!a.g(k2, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.f1608c;
            for (int i5 = 0; i5 < i4; i5++) {
                Object g3 = g(i5);
                Object k3 = k(i5);
                Object obj3 = ((Map) obj).get(g3);
                if (k3 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(g3)) {
                        return false;
                    }
                } else if (!a.g(k3, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i2 = this.f1608c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = ContainerHelpersKt.a(i2, 0, this.f1606a);
        if (a2 < 0 || this.f1607b[a2 << 1] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f1606a[i3] == 0) {
            if (this.f1607b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f1606a[i4] == 0; i4--) {
            if (this.f1607b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object g(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f1608c) {
            z2 = true;
        }
        if (z2) {
            return this.f1607b[i2 << 1];
        }
        RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        throw null;
    }

    public Object get(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return this.f1607b[(e << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e = e(obj);
        return e >= 0 ? this.f1607b[(e << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f1606a;
        Object[] objArr = this.f1607b;
        int i2 = this.f1608c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i2) {
        if (!(i2 >= 0 && i2 < this.f1608c)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        Object[] objArr = this.f1607b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f1608c;
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.f1606a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    q.O(i2, i6, i4, iArr, iArr);
                    Object[] objArr2 = this.f1607b;
                    q.P(i3, i6 << 1, objArr2, i4 << 1, objArr2);
                }
                Object[] objArr3 = this.f1607b;
                int i7 = i5 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                int i8 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i8);
                a.r(copyOf, "copyOf(this, newSize)");
                this.f1606a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f1607b, i8 << 1);
                a.r(copyOf2, "copyOf(this, newSize)");
                this.f1607b = copyOf2;
                if (i4 != this.f1608c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    q.O(0, 0, i2, iArr, this.f1606a);
                    q.P(0, 0, objArr, i3, this.f1607b);
                }
                if (i2 < i5) {
                    int i9 = i2 + 1;
                    q.O(i2, i9, i4, iArr, this.f1606a);
                    q.P(i3, i9 << 1, objArr, i4 << 1, this.f1607b);
                }
            }
            if (i4 != this.f1608c) {
                throw new ConcurrentModificationException();
            }
            this.f1608c = i5;
        }
        return obj;
    }

    public final boolean isEmpty() {
        return this.f1608c <= 0;
    }

    public final Object j(int i2, Object obj) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f1608c) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1607b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final Object k(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f1608c) {
            z2 = true;
        }
        if (z2) {
            return this.f1607b[(i2 << 1) + 1];
        }
        RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.f1608c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int d = obj != null ? d(hashCode, obj) : f();
        if (d >= 0) {
            int i3 = (d << 1) + 1;
            Object[] objArr = this.f1607b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~d;
        int[] iArr = this.f1606a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            a.r(copyOf, "copyOf(this, newSize)");
            this.f1606a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f1607b, i5 << 1);
            a.r(copyOf2, "copyOf(this, newSize)");
            this.f1607b = copyOf2;
            if (i2 != this.f1608c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f1606a;
            int i6 = i4 + 1;
            q.O(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.f1607b;
            q.P(i6 << 1, i4 << 1, objArr2, this.f1608c << 1, objArr2);
        }
        int i7 = this.f1608c;
        if (i2 == i7) {
            int[] iArr3 = this.f1606a;
            if (i4 < iArr3.length) {
                iArr3[i4] = hashCode;
                Object[] objArr3 = this.f1607b;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f1608c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return i(e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return j(e, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f1608c;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1608c * 28);
        sb.append('{');
        int i2 = this.f1608c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object g2 = g(i3);
            if (g2 != sb) {
                sb.append(g2);
            } else {
                sb.append("(this Map)");
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object k2 = k(i3);
            if (k2 != sb) {
                sb.append(k2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public SimpleArrayMap(int i2) {
        this.f1606a = i2 == 0 ? ContainerHelpersKt.f1617a : new int[i2];
        this.f1607b = i2 == 0 ? ContainerHelpersKt.f1619c : new Object[i2 << 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = e(obj);
        if (e < 0 || !a.g(obj2, k(e))) {
            return false;
        }
        i(e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e = e(obj);
        if (e < 0 || !a.g(obj2, k(e))) {
            return false;
        }
        j(e, obj3);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleArrayMap(SimpleArrayMap simpleArrayMap) {
        this(0);
        if (simpleArrayMap != null) {
            int i2 = simpleArrayMap.f1608c;
            c(this.f1608c + i2);
            if (this.f1608c != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    put(simpleArrayMap.g(i3), simpleArrayMap.k(i3));
                }
            } else if (i2 > 0) {
                q.O(0, 0, i2, simpleArrayMap.f1606a, this.f1606a);
                q.P(0, 0, simpleArrayMap.f1607b, i2 << 1, this.f1607b);
                this.f1608c = i2;
            }
        }
    }
}
