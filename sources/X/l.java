package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f24081f;

    /* renamed from: g, reason: collision with root package name */
    public static int f24082g;

    /* renamed from: h, reason: collision with root package name */
    public static Object[] f24083h;

    /* renamed from: i, reason: collision with root package name */
    public static int f24084i;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f24085c;

    /* renamed from: d, reason: collision with root package name */
    public int f24086d;

    public l() {
        this.b = e.f24067a;
        this.f24085c = e.f24068c;
        this.f24086d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i9) {
        if (iArr.length == 8) {
            synchronized (l.class) {
                try {
                    if (f24084i < 10) {
                        objArr[0] = f24083h;
                        objArr[1] = iArr;
                        for (int i10 = (i9 << 1) - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        f24083h = objArr;
                        f24084i++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (l.class) {
                try {
                    if (f24082g < 10) {
                        objArr[0] = f24081f;
                        objArr[1] = iArr;
                        for (int i11 = (i9 << 1) - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f24081f = objArr;
                        f24082g++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i9) {
        if (i9 == 8) {
            synchronized (l.class) {
                try {
                    Object[] objArr = f24083h;
                    if (objArr != null) {
                        this.f24085c = objArr;
                        f24083h = (Object[]) objArr[0];
                        this.b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f24084i--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i9 == 4) {
            synchronized (l.class) {
                try {
                    Object[] objArr2 = f24081f;
                    if (objArr2 != null) {
                        this.f24085c = objArr2;
                        f24081f = (Object[]) objArr2[0];
                        this.b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f24082g--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.b = new int[i9];
        this.f24085c = new Object[i9 << 1];
    }

    public final void b(int i9) {
        int i10 = this.f24086d;
        int[] iArr = this.b;
        if (iArr.length < i9) {
            Object[] objArr = this.f24085c;
            a(i9);
            if (this.f24086d > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i10);
                System.arraycopy(objArr, 0, this.f24085c, 0, i10 << 1);
            }
            c(iArr, objArr, i10);
        }
        if (this.f24086d == i10) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i9 = this.f24086d;
        if (i9 > 0) {
            int[] iArr = this.b;
            Object[] objArr = this.f24085c;
            this.b = e.f24067a;
            this.f24085c = e.f24068c;
            this.f24086d = 0;
            c(iArr, objArr, i9);
        }
        if (this.f24086d <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i9, Object obj) {
        int i10 = this.f24086d;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a6 = e.a(i10, i9, this.b);
            if (a6 < 0) {
                return a6;
            }
            if (obj.equals(this.f24085c[a6 << 1])) {
                return a6;
            }
            int i11 = a6 + 1;
            while (i11 < i10 && this.b[i11] == i9) {
                if (obj.equals(this.f24085c[i11 << 1])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a6 - 1; i12 >= 0 && this.b[i12] == i9; i12--) {
                if (obj.equals(this.f24085c[i12 << 1])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f24086d != lVar.f24086d) {
                return false;
            }
            for (int i9 = 0; i9 < this.f24086d; i9++) {
                try {
                    Object h6 = h(i9);
                    Object m = m(i9);
                    Object orDefault = lVar.getOrDefault(h6, null);
                    if (m == null) {
                        if (orDefault != null || !lVar.containsKey(h6)) {
                            return false;
                        }
                    } else if (!m.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f24086d != map.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f24086d; i10++) {
                try {
                    Object h9 = h(i10);
                    Object m2 = m(i10);
                    Object obj2 = map.get(h9);
                    if (m2 == null) {
                        if (obj2 != null || !map.containsKey(h9)) {
                            return false;
                        }
                    } else if (!m2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i9 = this.f24086d;
        if (i9 == 0) {
            return -1;
        }
        try {
            int a6 = e.a(i9, 0, this.b);
            if (a6 < 0) {
                return a6;
            }
            if (this.f24085c[a6 << 1] == null) {
                return a6;
            }
            int i10 = a6 + 1;
            while (i10 < i9 && this.b[i10] == 0) {
                if (this.f24085c[i10 << 1] == null) {
                    return i10;
                }
                i10++;
            }
            for (int i11 = a6 - 1; i11 >= 0 && this.b[i11] == 0; i11--) {
                if (this.f24085c[i11 << 1] == null) {
                    return i11;
                }
            }
            return ~i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i9 = this.f24086d * 2;
        Object[] objArr = this.f24085c;
        if (obj == null) {
            for (int i10 = 1; i10 < i9; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i9; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e4 = e(obj);
        if (e4 >= 0) {
            return this.f24085c[(e4 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i9) {
        return this.f24085c[i9 << 1];
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.b;
        Object[] objArr = this.f24085c;
        int i9 = this.f24086d;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            Object obj = objArr[i10];
            int i13 = iArr[i11];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i12 += hashCode ^ i13;
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public void i(l lVar) {
        int i9 = lVar.f24086d;
        b(this.f24086d + i9);
        if (this.f24086d == 0) {
            if (i9 > 0) {
                System.arraycopy(lVar.b, 0, this.b, 0, i9);
                System.arraycopy(lVar.f24085c, 0, this.f24085c, 0, i9 << 1);
                this.f24086d = i9;
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            put(lVar.h(i10), lVar.m(i10));
        }
    }

    public final boolean isEmpty() {
        if (this.f24086d <= 0) {
            return true;
        }
        return false;
    }

    public Object k(int i9) {
        Object[] objArr = this.f24085c;
        int i10 = i9 << 1;
        Object obj = objArr[i10 + 1];
        int i11 = this.f24086d;
        int i12 = 0;
        if (i11 <= 1) {
            c(this.b, objArr, i11);
            this.b = e.f24067a;
            this.f24085c = e.f24068c;
        } else {
            int i13 = i11 - 1;
            int[] iArr = this.b;
            int i14 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i14 = i11 + (i11 >> 1);
                }
                a(i14);
                if (i11 == this.f24086d) {
                    if (i9 > 0) {
                        System.arraycopy(iArr, 0, this.b, 0, i9);
                        System.arraycopy(objArr, 0, this.f24085c, 0, i10);
                    }
                    if (i9 < i13) {
                        int i15 = i9 + 1;
                        int i16 = i13 - i9;
                        System.arraycopy(iArr, i15, this.b, i9, i16);
                        System.arraycopy(objArr, i15 << 1, this.f24085c, i10, i16 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i9 < i13) {
                    int i17 = i9 + 1;
                    int i18 = i13 - i9;
                    System.arraycopy(iArr, i17, iArr, i9, i18);
                    Object[] objArr2 = this.f24085c;
                    System.arraycopy(objArr2, i17 << 1, objArr2, i10, i18 << 1);
                }
                Object[] objArr3 = this.f24085c;
                int i19 = i13 << 1;
                objArr3[i19] = null;
                objArr3[i19 + 1] = null;
            }
            i12 = i13;
        }
        if (i11 == this.f24086d) {
            this.f24086d = i12;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object l(int i9, Object obj) {
        int i10 = (i9 << 1) + 1;
        Object[] objArr = this.f24085c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final Object m(int i9) {
        return this.f24085c[(i9 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i9;
        int d2;
        int i10 = this.f24086d;
        if (obj == null) {
            d2 = f();
            i9 = 0;
        } else {
            int hashCode = obj.hashCode();
            i9 = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            int i11 = (d2 << 1) + 1;
            Object[] objArr = this.f24085c;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~d2;
        int[] iArr = this.b;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            Object[] objArr2 = this.f24085c;
            a(i13);
            if (i10 == this.f24086d) {
                int[] iArr2 = this.b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f24085c, 0, objArr2.length);
                }
                c(iArr, objArr2, i10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr3 = this.b;
            int i14 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i14, i10 - i12);
            Object[] objArr3 = this.f24085c;
            System.arraycopy(objArr3, i12 << 1, objArr3, i14 << 1, (this.f24086d - i12) << 1);
        }
        int i15 = this.f24086d;
        if (i10 == i15) {
            int[] iArr4 = this.b;
            if (i12 < iArr4.length) {
                iArr4[i12] = i9;
                Object[] objArr4 = this.f24085c;
                int i16 = i12 << 1;
                objArr4[i16] = obj;
                objArr4[i16 + 1] = obj2;
                this.f24086d = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int e4 = e(obj);
        if (e4 >= 0) {
            return k(e4);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e4 = e(obj);
        if (e4 >= 0) {
            return l(e4, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f24086d;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f24086d * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.f24086d; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object h6 = h(i9);
            if (h6 != this) {
                sb.append(h6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = m(i9);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e4 = e(obj);
        if (e4 < 0) {
            return false;
        }
        Object m = m(e4);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        k(e4);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e4 = e(obj);
        if (e4 < 0) {
            return false;
        }
        Object m = m(e4);
        if (m != obj2 && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        l(e4, obj3);
        return true;
    }

    public l(l lVar) {
        this();
        if (lVar != null) {
            i(lVar);
        }
    }
}
