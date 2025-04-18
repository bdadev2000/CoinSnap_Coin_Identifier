package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class k {

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f23949f;

    /* renamed from: g, reason: collision with root package name */
    public static int f23950g;

    /* renamed from: h, reason: collision with root package name */
    public static Object[] f23951h;

    /* renamed from: i, reason: collision with root package name */
    public static int f23952i;

    /* renamed from: b, reason: collision with root package name */
    public int[] f23953b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f23954c;

    /* renamed from: d, reason: collision with root package name */
    public int f23955d;

    public k() {
        this.f23953b = c6.k.f2648h;
        this.f23954c = c6.k.f2650j;
        this.f23955d = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (k.class) {
                Object[] objArr = f23951h;
                if (objArr != null) {
                    this.f23954c = objArr;
                    f23951h = (Object[]) objArr[0];
                    this.f23953b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23952i--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (k.class) {
                Object[] objArr2 = f23949f;
                if (objArr2 != null) {
                    this.f23954c = objArr2;
                    f23949f = (Object[]) objArr2[0];
                    this.f23953b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f23950g--;
                    return;
                }
            }
        }
        this.f23953b = new int[i10];
        this.f23954c = new Object[i10 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                if (f23952i < 10) {
                    objArr[0] = f23951h;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f23951h = objArr;
                    f23952i++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                if (f23950g < 10) {
                    objArr[0] = f23949f;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f23949f = objArr;
                    f23950g++;
                }
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.f23955d;
        int[] iArr = this.f23953b;
        if (iArr.length < i10) {
            Object[] objArr = this.f23954c;
            a(i10);
            if (this.f23955d > 0) {
                System.arraycopy(iArr, 0, this.f23953b, 0, i11);
                System.arraycopy(objArr, 0, this.f23954c, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f23955d == i11) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f23955d;
        if (i10 > 0) {
            int[] iArr = this.f23953b;
            Object[] objArr = this.f23954c;
            this.f23953b = c6.k.f2648h;
            this.f23954c = c6.k.f2650j;
            this.f23955d = 0;
            c(iArr, objArr, i10);
        }
        if (this.f23955d <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f23955d;
        if (i11 == 0) {
            return -1;
        }
        try {
            int d10 = c6.k.d(i11, i10, this.f23953b);
            if (d10 < 0) {
                return d10;
            }
            if (obj.equals(this.f23954c[d10 << 1])) {
                return d10;
            }
            int i12 = d10 + 1;
            while (i12 < i11 && this.f23953b[i12] == i10) {
                if (obj.equals(this.f23954c[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = d10 - 1; i13 >= 0 && this.f23953b[i13] == i10; i13--) {
                if (obj.equals(this.f23954c[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f23955d != kVar.f23955d) {
                return false;
            }
            for (int i10 = 0; i10 < this.f23955d; i10++) {
                try {
                    Object h10 = h(i10);
                    Object l10 = l(i10);
                    Object orDefault = kVar.getOrDefault(h10, null);
                    if (l10 == null) {
                        if (orDefault != null || !kVar.containsKey(h10)) {
                            return false;
                        }
                    } else if (!l10.equals(orDefault)) {
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
            if (this.f23955d != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f23955d; i11++) {
                try {
                    Object h11 = h(i11);
                    Object l11 = l(i11);
                    Object obj2 = map.get(h11);
                    if (l11 == null) {
                        if (obj2 != null || !map.containsKey(h11)) {
                            return false;
                        }
                    } else if (!l11.equals(obj2)) {
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
        int i10 = this.f23955d;
        if (i10 == 0) {
            return -1;
        }
        try {
            int d10 = c6.k.d(i10, 0, this.f23953b);
            if (d10 < 0) {
                return d10;
            }
            if (this.f23954c[d10 << 1] == null) {
                return d10;
            }
            int i11 = d10 + 1;
            while (i11 < i10 && this.f23953b[i11] == 0) {
                if (this.f23954c[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = d10 - 1; i12 >= 0 && this.f23953b[i12] == 0; i12--) {
                if (this.f23954c[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i10 = this.f23955d * 2;
        Object[] objArr = this.f23954c;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return this.f23954c[(e2 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i10) {
        return this.f23954c[i10 << 1];
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f23953b;
        Object[] objArr = this.f23954c;
        int i10 = this.f23955d;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i13 += hashCode ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(k kVar) {
        int i10 = kVar.f23955d;
        b(this.f23955d + i10);
        if (this.f23955d == 0) {
            if (i10 > 0) {
                System.arraycopy(kVar.f23953b, 0, this.f23953b, 0, i10);
                System.arraycopy(kVar.f23954c, 0, this.f23954c, 0, i10 << 1);
                this.f23955d = i10;
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            put(kVar.h(i11), kVar.l(i11));
        }
    }

    public final boolean isEmpty() {
        return this.f23955d <= 0;
    }

    public Object j(int i10) {
        Object[] objArr = this.f23954c;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f23955d;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f23953b, objArr, i12);
            this.f23953b = c6.k.f2648h;
            this.f23954c = c6.k.f2650j;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f23953b;
            int i15 = 8;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f23955d) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f23953b, 0, i10);
                        System.arraycopy(objArr, 0, this.f23954c, 0, i11);
                    }
                    if (i10 < i14) {
                        int i16 = i10 + 1;
                        int i17 = i14 - i10;
                        System.arraycopy(iArr, i16, this.f23953b, i10, i17);
                        System.arraycopy(objArr, i16 << 1, this.f23954c, i11, i17 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, iArr, i10, i19);
                    Object[] objArr2 = this.f23954c;
                    System.arraycopy(objArr2, i18 << 1, objArr2, i11, i19 << 1);
                }
                Object[] objArr3 = this.f23954c;
                int i20 = i14 << 1;
                objArr3[i20] = null;
                objArr3[i20 + 1] = null;
            }
            i13 = i14;
        }
        if (i12 == this.f23955d) {
            this.f23955d = i13;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object k(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f23954c;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final Object l(int i10) {
        return this.f23954c[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int d10;
        int i11 = this.f23955d;
        if (obj == null) {
            d10 = f();
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            d10 = d(hashCode, obj);
        }
        if (d10 >= 0) {
            int i12 = (d10 << 1) + 1;
            Object[] objArr = this.f23954c;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~d10;
        int[] iArr = this.f23953b;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f23954c;
            a(i14);
            if (i11 == this.f23955d) {
                int[] iArr2 = this.f23953b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f23954c, 0, objArr2.length);
                }
                c(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f23953b;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f23954c;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f23955d - i13) << 1);
        }
        int i16 = this.f23955d;
        if (i11 == i16) {
            int[] iArr4 = this.f23953b;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f23954c;
                int i17 = i13 << 1;
                objArr4[i17] = obj;
                objArr4[i17 + 1] = obj2;
                this.f23955d = i16 + 1;
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
        int e2 = e(obj);
        if (e2 >= 0) {
            return j(e2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return k(e2, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f23955d;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f23955d * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.f23955d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object h10 = h(i10);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object l10 = l(e2);
        if (obj2 != l10 && (obj2 == null || !obj2.equals(l10))) {
            return false;
        }
        j(e2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object l10 = l(e2);
        if (l10 != obj2 && (obj2 == null || !obj2.equals(l10))) {
            return false;
        }
        k(e2, obj3);
        return true;
    }

    public k(int i10) {
        if (i10 == 0) {
            this.f23953b = c6.k.f2648h;
            this.f23954c = c6.k.f2650j;
        } else {
            a(i10);
        }
        this.f23955d = 0;
    }

    public k(k kVar) {
        this();
        if (kVar != null) {
            i(kVar);
        }
    }
}
