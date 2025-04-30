package com.bytedance.adsdk.lottie;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zp<E> implements Collection<E>, Set<E> {
    private static Object[] COT;
    private static int HWF;
    private static Object[] QR;
    private static int ku;
    private int[] YW;
    private rV<E, E> dT;
    int lMd;
    Object[] zp;
    private static final int[] KS = new int[0];
    private static final Object[] jU = new Object[0];

    public zp() {
        this(0);
    }

    private void jU(int i9) {
        if (i9 == 8) {
            synchronized (zp.class) {
                Object[] objArr = QR;
                if (objArr != null) {
                    this.zp = objArr;
                    QR = (Object[]) objArr[0];
                    this.YW = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    ku--;
                    return;
                }
            }
        } else if (i9 == 4) {
            synchronized (zp.class) {
                Object[] objArr2 = COT;
                if (objArr2 != null) {
                    this.zp = objArr2;
                    COT = (Object[]) objArr2[0];
                    this.YW = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    HWF--;
                    return;
                }
            }
        }
        this.YW = new int[i9];
        this.zp = new Object[i9];
    }

    private int zp(Object obj, int i9) {
        int i10 = this.lMd;
        if (i10 == 0) {
            return -1;
        }
        int zp = lMd.zp(this.YW, i10, i9);
        if (zp < 0 || obj.equals(this.zp[zp])) {
            return zp;
        }
        int i11 = zp + 1;
        while (i11 < i10 && this.YW[i11] == i9) {
            if (obj.equals(this.zp[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = zp - 1; i12 >= 0 && this.YW[i12] == i9; i12--) {
            if (obj.equals(this.zp[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public E KS(int i9) {
        Object[] objArr = this.zp;
        E e4 = (E) objArr[i9];
        int i10 = this.lMd;
        if (i10 <= 1) {
            zp(this.YW, objArr, i10);
            this.YW = KS;
            this.zp = jU;
            this.lMd = 0;
        } else {
            int[] iArr = this.YW;
            int i11 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i11 = i10 + (i10 >> 1);
                }
                jU(i11);
                this.lMd--;
                if (i9 > 0) {
                    System.arraycopy(iArr, 0, this.YW, 0, i9);
                    System.arraycopy(objArr, 0, this.zp, 0, i9);
                }
                int i12 = this.lMd;
                if (i9 < i12) {
                    int i13 = i9 + 1;
                    System.arraycopy(iArr, i13, this.YW, i9, i12 - i9);
                    System.arraycopy(objArr, i13, this.zp, i9, this.lMd - i9);
                }
            } else {
                int i14 = i10 - 1;
                this.lMd = i14;
                if (i9 < i14) {
                    int i15 = i9 + 1;
                    System.arraycopy(iArr, i15, iArr, i9, i14 - i9);
                    Object[] objArr2 = this.zp;
                    System.arraycopy(objArr2, i15, objArr2, i9, this.lMd - i9);
                }
                this.zp[this.lMd] = null;
            }
        }
        return e4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e4) {
        int i9;
        int zp;
        if (e4 == null) {
            zp = zp();
            i9 = 0;
        } else {
            int hashCode = e4.hashCode();
            i9 = hashCode;
            zp = zp(e4, hashCode);
        }
        if (zp >= 0) {
            return false;
        }
        int i10 = ~zp;
        int i11 = this.lMd;
        int[] iArr = this.YW;
        if (i11 >= iArr.length) {
            int i12 = 8;
            if (i11 >= 8) {
                i12 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.zp;
            jU(i12);
            int[] iArr2 = this.YW;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.zp, 0, objArr.length);
            }
            zp(iArr, objArr, this.lMd);
        }
        int i13 = this.lMd;
        if (i10 < i13) {
            int[] iArr3 = this.YW;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr2 = this.zp;
            System.arraycopy(objArr2, i10, objArr2, i14, this.lMd - i10);
        }
        this.YW[i10] = i9;
        this.zp[i10] = e4;
        this.lMd++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        zp(collection.size() + this.lMd);
        Iterator<? extends E> it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= add(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i9 = this.lMd;
        if (i9 != 0) {
            zp(this.YW, this.zp, i9);
            this.YW = KS;
            this.zp = jU;
            this.lMd = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (zp(obj) >= 0) {
            return true;
        }
        return false;
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
            for (int i9 = 0; i9 < this.lMd; i9++) {
                try {
                    if (!set.contains(lMd(i9))) {
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
        int[] iArr = this.YW;
        int i9 = this.lMd;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.lMd <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return lMd().jU().iterator();
    }

    public E lMd(int i9) {
        return (E) this.zp[i9];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int zp = zp(obj);
        if (zp >= 0) {
            KS(zp);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z8 = false;
        for (int i9 = this.lMd - 1; i9 >= 0; i9--) {
            if (!collection.contains(this.zp[i9])) {
                KS(i9);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.lMd;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i9 = this.lMd;
        Object[] objArr = new Object[i9];
        System.arraycopy(this.zp, 0, objArr, 0, i9);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.lMd * 14);
        sb.append('{');
        for (int i9 = 0; i9 < this.lMd; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            E lMd = lMd(i9);
            if (lMd != this) {
                sb.append(lMd);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public zp(int i9) {
        if (i9 == 0) {
            this.YW = KS;
            this.zp = jU;
        } else {
            jU(i9);
        }
        this.lMd = 0;
    }

    private rV<E, E> lMd() {
        if (this.dT == null) {
            this.dT = new rV<E, E>() { // from class: com.bytedance.adsdk.lottie.zp.1
                @Override // com.bytedance.adsdk.lottie.rV
                public void KS() {
                    zp.this.clear();
                }

                @Override // com.bytedance.adsdk.lottie.rV
                public Map<E, E> lMd() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.lottie.rV
                public int zp() {
                    return zp.this.lMd;
                }

                @Override // com.bytedance.adsdk.lottie.rV
                public Object zp(int i9, int i10) {
                    return zp.this.zp[i9];
                }

                @Override // com.bytedance.adsdk.lottie.rV
                public int zp(Object obj) {
                    return zp.this.zp(obj);
                }

                @Override // com.bytedance.adsdk.lottie.rV
                public void zp(int i9) {
                    zp.this.KS(i9);
                }
            };
        }
        return this.dT;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.lMd) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.lMd));
        }
        System.arraycopy(this.zp, 0, tArr, 0, this.lMd);
        int length = tArr.length;
        int i9 = this.lMd;
        if (length > i9) {
            tArr[i9] = null;
        }
        return tArr;
    }

    private int zp() {
        int i9 = this.lMd;
        if (i9 == 0) {
            return -1;
        }
        int zp = lMd.zp(this.YW, i9, 0);
        if (zp < 0 || this.zp[zp] == null) {
            return zp;
        }
        int i10 = zp + 1;
        while (i10 < i9 && this.YW[i10] == 0) {
            if (this.zp[i10] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = zp - 1; i11 >= 0 && this.YW[i11] == 0; i11--) {
            if (this.zp[i11] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    private static void zp(int[] iArr, Object[] objArr, int i9) {
        if (iArr.length == 8) {
            synchronized (zp.class) {
                try {
                    if (ku < 10) {
                        objArr[0] = QR;
                        objArr[1] = iArr;
                        for (int i10 = i9 - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        QR = objArr;
                        ku++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (zp.class) {
                try {
                    if (HWF < 10) {
                        objArr[0] = COT;
                        objArr[1] = iArr;
                        for (int i11 = i9 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        COT = objArr;
                        HWF++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void zp(int i9) {
        int[] iArr = this.YW;
        if (iArr.length < i9) {
            Object[] objArr = this.zp;
            jU(i9);
            int i10 = this.lMd;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.YW, 0, i10);
                System.arraycopy(objArr, 0, this.zp, 0, this.lMd);
            }
            zp(iArr, objArr, this.lMd);
        }
    }

    public int zp(Object obj) {
        return obj == null ? zp() : zp(obj, obj.hashCode());
    }
}
