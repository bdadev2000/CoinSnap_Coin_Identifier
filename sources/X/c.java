package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f24056g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f24057h = new Object[0];

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f24058i;

    /* renamed from: j, reason: collision with root package name */
    public static int f24059j;

    /* renamed from: k, reason: collision with root package name */
    public static Object[] f24060k;
    public static int l;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f24061c;

    /* renamed from: d, reason: collision with root package name */
    public int f24062d;

    /* renamed from: f, reason: collision with root package name */
    public C2913a f24063f;

    public c(int i9) {
        if (i9 == 0) {
            this.b = f24056g;
            this.f24061c = f24057h;
        } else {
            b(i9);
        }
        this.f24062d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i9) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (l < 10) {
                        objArr[0] = f24060k;
                        objArr[1] = iArr;
                        for (int i10 = i9 - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        f24060k = objArr;
                        l++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f24059j < 10) {
                        objArr[0] = f24058i;
                        objArr[1] = iArr;
                        for (int i11 = i9 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f24058i = objArr;
                        f24059j++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i9;
        int d2;
        if (obj == null) {
            d2 = e();
            i9 = 0;
        } else {
            int hashCode = obj.hashCode();
            i9 = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            return false;
        }
        int i10 = ~d2;
        int i11 = this.f24062d;
        int[] iArr = this.b;
        if (i11 >= iArr.length) {
            int i12 = 8;
            if (i11 >= 8) {
                i12 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f24061c;
            b(i12);
            int[] iArr2 = this.b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f24061c, 0, objArr.length);
            }
            c(iArr, objArr, this.f24062d);
        }
        int i13 = this.f24062d;
        if (i10 < i13) {
            int[] iArr3 = this.b;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr2 = this.f24061c;
            System.arraycopy(objArr2, i10, objArr2, i14, this.f24062d - i10);
        }
        this.b[i10] = i9;
        this.f24061c[i10] = obj;
        this.f24062d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f24062d;
        int[] iArr = this.b;
        boolean z8 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f24061c;
            b(size);
            int i9 = this.f24062d;
            if (i9 > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i9);
                System.arraycopy(objArr, 0, this.f24061c, 0, this.f24062d);
            }
            c(iArr, objArr, this.f24062d);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z8 |= add(it.next());
        }
        return z8;
    }

    public final void b(int i9) {
        if (i9 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f24060k;
                    if (objArr != null) {
                        this.f24061c = objArr;
                        f24060k = (Object[]) objArr[0];
                        this.b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        l--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i9 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f24058i;
                    if (objArr2 != null) {
                        this.f24061c = objArr2;
                        f24058i = (Object[]) objArr2[0];
                        this.b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f24059j--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.b = new int[i9];
        this.f24061c = new Object[i9];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i9 = this.f24062d;
        if (i9 != 0) {
            c(this.b, this.f24061c, i9);
            this.b = f24056g;
            this.f24061c = f24057h;
            this.f24062d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(int i9, Object obj) {
        int i10 = this.f24062d;
        if (i10 == 0) {
            return -1;
        }
        int a6 = e.a(i10, i9, this.b);
        if (a6 < 0) {
            return a6;
        }
        if (obj.equals(this.f24061c[a6])) {
            return a6;
        }
        int i11 = a6 + 1;
        while (i11 < i10 && this.b[i11] == i9) {
            if (obj.equals(this.f24061c[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a6 - 1; i12 >= 0 && this.b[i12] == i9; i12--) {
            if (obj.equals(this.f24061c[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int e() {
        int i9 = this.f24062d;
        if (i9 == 0) {
            return -1;
        }
        int a6 = e.a(i9, 0, this.b);
        if (a6 < 0) {
            return a6;
        }
        if (this.f24061c[a6] == null) {
            return a6;
        }
        int i10 = a6 + 1;
        while (i10 < i9 && this.b[i10] == 0) {
            if (this.f24061c[i10] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a6 - 1; i11 >= 0 && this.b[i11] == 0; i11--) {
            if (this.f24061c[i11] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f24062d != set.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f24062d; i9++) {
                try {
                    if (!set.contains(this.f24061c[i9])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i9) {
        Object[] objArr = this.f24061c;
        Object obj = objArr[i9];
        int i10 = this.f24062d;
        if (i10 <= 1) {
            c(this.b, objArr, i10);
            this.b = f24056g;
            this.f24061c = f24057h;
            this.f24062d = 0;
            return;
        }
        int[] iArr = this.b;
        int i11 = 8;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            if (i10 > 8) {
                i11 = i10 + (i10 >> 1);
            }
            b(i11);
            this.f24062d--;
            if (i9 > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i9);
                System.arraycopy(objArr, 0, this.f24061c, 0, i9);
            }
            int i12 = this.f24062d;
            if (i9 < i12) {
                int i13 = i9 + 1;
                System.arraycopy(iArr, i13, this.b, i9, i12 - i9);
                System.arraycopy(objArr, i13, this.f24061c, i9, this.f24062d - i9);
                return;
            }
            return;
        }
        int i14 = i10 - 1;
        this.f24062d = i14;
        if (i9 < i14) {
            int i15 = i9 + 1;
            System.arraycopy(iArr, i15, iArr, i9, i14 - i9);
            Object[] objArr2 = this.f24061c;
            System.arraycopy(objArr2, i15, objArr2, i9, this.f24062d - i9);
        }
        this.f24061c[this.f24062d] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.b;
        int i9 = this.f24062d;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return e();
        }
        return d(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f24062d <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f24063f == null) {
            this.f24063f = new C2913a(this, 1);
        }
        C2913a c2913a = this.f24063f;
        if (c2913a.b == null) {
            c2913a.b = new i(c2913a, 1);
        }
        return c2913a.b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            f(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z8 = false;
        for (int i9 = this.f24062d - 1; i9 >= 0; i9--) {
            if (!collection.contains(this.f24061c[i9])) {
                f(i9);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f24062d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i9 = this.f24062d;
        Object[] objArr = new Object[i9];
        System.arraycopy(this.f24061c, 0, objArr, 0, i9);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f24062d * 14);
        sb.append('{');
        for (int i9 = 0; i9 < this.f24062d; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = this.f24061c[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f24062d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f24062d);
        }
        System.arraycopy(this.f24061c, 0, objArr, 0, this.f24062d);
        int length = objArr.length;
        int i9 = this.f24062d;
        if (length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }
}
