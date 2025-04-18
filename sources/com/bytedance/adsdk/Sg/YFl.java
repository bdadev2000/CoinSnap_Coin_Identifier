package com.bytedance.adsdk.Sg;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class YFl<E> implements Collection<E>, Set<E> {
    private static Object[] DSW;
    private static int qsH;

    /* renamed from: vc, reason: collision with root package name */
    private static int f10153vc;
    private static Object[] wN;
    private int[] NjR;
    int Sg;
    Object[] YFl;

    /* renamed from: nc, reason: collision with root package name */
    private EH<E, E> f10154nc;
    private static final int[] tN = new int[0];
    private static final Object[] AlY = new Object[0];

    public YFl() {
        this(0);
    }

    private void AlY(int i10) {
        if (i10 == 8) {
            synchronized (YFl.class) {
                Object[] objArr = DSW;
                if (objArr != null) {
                    this.YFl = objArr;
                    DSW = (Object[]) objArr[0];
                    this.NjR = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    qsH--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (YFl.class) {
                Object[] objArr2 = wN;
                if (objArr2 != null) {
                    this.YFl = objArr2;
                    wN = (Object[]) objArr2[0];
                    this.NjR = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10153vc--;
                    return;
                }
            }
        }
        this.NjR = new int[i10];
        this.YFl = new Object[i10];
    }

    private int YFl(Object obj, int i10) {
        int i11 = this.Sg;
        if (i11 == 0) {
            return -1;
        }
        int YFl = Sg.YFl(this.NjR, i11, i10);
        if (YFl < 0 || obj.equals(this.YFl[YFl])) {
            return YFl;
        }
        int i12 = YFl + 1;
        while (i12 < i11 && this.NjR[i12] == i10) {
            if (obj.equals(this.YFl[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = YFl - 1; i13 >= 0 && this.NjR[i13] == i10; i13--) {
            if (obj.equals(this.YFl[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public E Sg(int i10) {
        return (E) this.YFl[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i10;
        int YFl;
        if (e2 == null) {
            YFl = YFl();
            i10 = 0;
        } else {
            int hashCode = e2.hashCode();
            i10 = hashCode;
            YFl = YFl(e2, hashCode);
        }
        if (YFl >= 0) {
            return false;
        }
        int i11 = ~YFl;
        int i12 = this.Sg;
        int[] iArr = this.NjR;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.YFl;
            AlY(i13);
            int[] iArr2 = this.NjR;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.YFl, 0, objArr.length);
            }
            YFl(iArr, objArr, this.Sg);
        }
        int i14 = this.Sg;
        if (i11 < i14) {
            int[] iArr3 = this.NjR;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.YFl;
            System.arraycopy(objArr2, i11, objArr2, i15, this.Sg - i11);
        }
        this.NjR[i11] = i10;
        this.YFl[i11] = e2;
        this.Sg++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        YFl(collection.size() + this.Sg);
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.Sg;
        if (i10 != 0) {
            YFl(this.NjR, this.YFl, i10);
            this.NjR = tN;
            this.YFl = AlY;
            this.Sg = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return YFl(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.Sg; i10++) {
                try {
                    if (!set.contains(Sg(i10))) {
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
    public int hashCode() {
        int[] iArr = this.NjR;
        int i10 = this.Sg;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.Sg <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return Sg().AlY().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int YFl = YFl(obj);
        if (YFl >= 0) {
            tN(YFl);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.Sg - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.YFl[i10])) {
                tN(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.Sg;
    }

    public E tN(int i10) {
        Object[] objArr = this.YFl;
        E e2 = (E) objArr[i10];
        int i11 = this.Sg;
        if (i11 <= 1) {
            YFl(this.NjR, objArr, i11);
            this.NjR = tN;
            this.YFl = AlY;
            this.Sg = 0;
        } else {
            int[] iArr = this.NjR;
            int i12 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                AlY(i12);
                this.Sg--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.NjR, 0, i10);
                    System.arraycopy(objArr, 0, this.YFl, 0, i10);
                }
                int i13 = this.Sg;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, this.NjR, i10, i13 - i10);
                    System.arraycopy(objArr, i14, this.YFl, i10, this.Sg - i10);
                }
            } else {
                int i15 = i11 - 1;
                this.Sg = i15;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, iArr, i10, i15 - i10);
                    Object[] objArr2 = this.YFl;
                    System.arraycopy(objArr2, i16, objArr2, i10, this.Sg - i10);
                }
                this.YFl[this.Sg] = null;
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.Sg;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.YFl, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.Sg * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.Sg; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E Sg = Sg(i10);
            if (Sg != this) {
                sb2.append(Sg);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public YFl(int i10) {
        if (i10 == 0) {
            this.NjR = tN;
            this.YFl = AlY;
        } else {
            AlY(i10);
        }
        this.Sg = 0;
    }

    private EH<E, E> Sg() {
        if (this.f10154nc == null) {
            this.f10154nc = new EH<E, E>() { // from class: com.bytedance.adsdk.Sg.YFl.1
                @Override // com.bytedance.adsdk.Sg.EH
                public Map<E, E> Sg() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.Sg.EH
                public int YFl() {
                    return YFl.this.Sg;
                }

                @Override // com.bytedance.adsdk.Sg.EH
                public void tN() {
                    YFl.this.clear();
                }

                @Override // com.bytedance.adsdk.Sg.EH
                public Object YFl(int i10, int i11) {
                    return YFl.this.YFl[i10];
                }

                @Override // com.bytedance.adsdk.Sg.EH
                public int YFl(Object obj) {
                    return YFl.this.YFl(obj);
                }

                @Override // com.bytedance.adsdk.Sg.EH
                public void YFl(int i10) {
                    YFl.this.tN(i10);
                }
            };
        }
        return this.f10154nc;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.Sg) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.Sg));
        }
        System.arraycopy(this.YFl, 0, tArr, 0, this.Sg);
        int length = tArr.length;
        int i10 = this.Sg;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int YFl() {
        int i10 = this.Sg;
        if (i10 == 0) {
            return -1;
        }
        int YFl = Sg.YFl(this.NjR, i10, 0);
        if (YFl < 0 || this.YFl[YFl] == null) {
            return YFl;
        }
        int i11 = YFl + 1;
        while (i11 < i10 && this.NjR[i11] == 0) {
            if (this.YFl[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = YFl - 1; i12 >= 0 && this.NjR[i12] == 0; i12--) {
            if (this.YFl[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void YFl(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (YFl.class) {
                if (qsH < 10) {
                    objArr[0] = DSW;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    DSW = objArr;
                    qsH++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (YFl.class) {
                if (f10153vc < 10) {
                    objArr[0] = wN;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    wN = objArr;
                    f10153vc++;
                }
            }
        }
    }

    public void YFl(int i10) {
        int[] iArr = this.NjR;
        if (iArr.length < i10) {
            Object[] objArr = this.YFl;
            AlY(i10);
            int i11 = this.Sg;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.NjR, 0, i11);
                System.arraycopy(objArr, 0, this.YFl, 0, this.Sg);
            }
            YFl(iArr, objArr, this.Sg);
        }
    }

    public int YFl(Object obj) {
        return obj == null ? YFl() : YFl(obj, obj.hashCode());
    }
}
