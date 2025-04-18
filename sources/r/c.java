package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f23919g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f23920h = new Object[0];

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f23921i;

    /* renamed from: j, reason: collision with root package name */
    public static int f23922j;

    /* renamed from: k, reason: collision with root package name */
    public static Object[] f23923k;

    /* renamed from: l, reason: collision with root package name */
    public static int f23924l;

    /* renamed from: b, reason: collision with root package name */
    public int[] f23925b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f23926c;

    /* renamed from: d, reason: collision with root package name */
    public int f23927d;

    /* renamed from: f, reason: collision with root package name */
    public a f23928f;

    public c(int i10) {
        if (i10 == 0) {
            this.f23925b = f23919g;
            this.f23926c = f23920h;
        } else {
            a(i10);
        }
        this.f23927d = 0;
    }

    public static void b(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f23924l < 10) {
                    objArr[0] = f23923k;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f23923k = objArr;
                    f23924l++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                if (f23922j < 10) {
                    objArr[0] = f23921i;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f23921i = objArr;
                    f23922j++;
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (c.class) {
                Object[] objArr = f23923k;
                if (objArr != null) {
                    this.f23926c = objArr;
                    f23923k = (Object[]) objArr[0];
                    this.f23925b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23924l--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f23921i;
                if (objArr2 != null) {
                    this.f23926c = objArr2;
                    f23921i = (Object[]) objArr2[0];
                    this.f23925b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f23922j--;
                    return;
                }
            }
        }
        this.f23925b = new int[i10];
        this.f23926c = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int c10;
        if (obj == null) {
            c10 = d();
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            c10 = c(hashCode, obj);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        int i12 = this.f23927d;
        int[] iArr = this.f23925b;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f23926c;
            a(i13);
            int[] iArr2 = this.f23925b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f23926c, 0, objArr.length);
            }
            b(iArr, objArr, this.f23927d);
        }
        int i14 = this.f23927d;
        if (i11 < i14) {
            int[] iArr3 = this.f23925b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f23926c;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f23927d - i11);
        }
        this.f23925b[i11] = i10;
        this.f23926c[i11] = obj;
        this.f23927d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f23927d;
        int[] iArr = this.f23925b;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f23926c;
            a(size);
            int i10 = this.f23927d;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f23925b, 0, i10);
                System.arraycopy(objArr, 0, this.f23926c, 0, this.f23927d);
            }
            b(iArr, objArr, this.f23927d);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f23927d;
        if (i11 == 0) {
            return -1;
        }
        int d10 = c6.k.d(i11, i10, this.f23925b);
        if (d10 < 0) {
            return d10;
        }
        if (obj.equals(this.f23926c[d10])) {
            return d10;
        }
        int i12 = d10 + 1;
        while (i12 < i11 && this.f23925b[i12] == i10) {
            if (obj.equals(this.f23926c[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = d10 - 1; i13 >= 0 && this.f23925b[i13] == i10; i13--) {
            if (obj.equals(this.f23926c[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f23927d;
        if (i10 != 0) {
            b(this.f23925b, this.f23926c, i10);
            this.f23925b = f23919g;
            this.f23926c = f23920h;
            this.f23927d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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

    public final int d() {
        int i10 = this.f23927d;
        if (i10 == 0) {
            return -1;
        }
        int d10 = c6.k.d(i10, 0, this.f23925b);
        if (d10 < 0) {
            return d10;
        }
        if (this.f23926c[d10] == null) {
            return d10;
        }
        int i11 = d10 + 1;
        while (i11 < i10 && this.f23925b[i11] == 0) {
            if (this.f23926c[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = d10 - 1; i12 >= 0 && this.f23925b[i12] == 0; i12--) {
            if (this.f23926c[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void e(int i10) {
        Object[] objArr = this.f23926c;
        Object obj = objArr[i10];
        int i11 = this.f23927d;
        if (i11 <= 1) {
            b(this.f23925b, objArr, i11);
            this.f23925b = f23919g;
            this.f23926c = f23920h;
            this.f23927d = 0;
            return;
        }
        int[] iArr = this.f23925b;
        int i12 = 8;
        if (iArr.length > 8 && i11 < iArr.length / 3) {
            if (i11 > 8) {
                i12 = i11 + (i11 >> 1);
            }
            a(i12);
            this.f23927d--;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f23925b, 0, i10);
                System.arraycopy(objArr, 0, this.f23926c, 0, i10);
            }
            int i13 = this.f23927d;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, this.f23925b, i10, i13 - i10);
                System.arraycopy(objArr, i14, this.f23926c, i10, this.f23927d - i10);
                return;
            }
            return;
        }
        int i15 = i11 - 1;
        this.f23927d = i15;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, iArr, i10, i15 - i10);
            Object[] objArr2 = this.f23926c;
            System.arraycopy(objArr2, i16, objArr2, i10, this.f23927d - i10);
        }
        this.f23926c[this.f23927d] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f23927d != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f23927d; i10++) {
                try {
                    if (!set.contains(this.f23926c[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f23925b;
        int i10 = this.f23927d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23927d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = 1;
        if (this.f23928f == null) {
            this.f23928f = new a(this, i10);
        }
        a aVar = this.f23928f;
        if (((h) aVar.f20054b) == null) {
            aVar.f20054b = new h(aVar, i10);
        }
        return ((h) aVar.f20054b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int i10 = this.f23927d - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f23926c[i10])) {
                e(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f23927d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f23927d;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f23926c, 0, objArr, 0, i10);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f23927d * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.f23927d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f23926c[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f23927d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f23927d);
        }
        System.arraycopy(this.f23926c, 0, objArr, 0, this.f23927d);
        int length = objArr.length;
        int i10 = this.f23927d;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
