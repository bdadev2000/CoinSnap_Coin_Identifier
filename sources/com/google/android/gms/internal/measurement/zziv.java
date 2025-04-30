package com.google.android.gms.internal.measurement;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zziv extends zzhu<Double> implements zzjt<Double>, zzlf, RandomAccess {
    private double[] zza;
    private int zzb;

    static {
        new zziv(new double[0], 0, false);
    }

    public zziv() {
        this(new double[10], 0, true);
    }

    private final String zzc(int i9) {
        return n0.e(i9, this.zzb, "Index:", ", Size:");
    }

    private final void zzd(int i9) {
        if (i9 >= 0 && i9 < this.zzb) {
        } else {
            throw new IndexOutOfBoundsException(zzc(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzb)) {
            double[] dArr = this.zza;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i9, dArr, i9 + 1, i10 - i9);
            } else {
                double[] dArr2 = new double[n0.v(i10, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i9);
                System.arraycopy(this.zza, i9, dArr2, i9 + 1, this.zzb - i9);
                this.zza = dArr2;
            }
            this.zza[i9] = doubleValue;
            this.zzb++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zziv)) {
            return super.addAll(collection);
        }
        zziv zzivVar = (zziv) collection;
        int i9 = zzivVar.zzb;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzb;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            double[] dArr = this.zza;
            if (i11 > dArr.length) {
                this.zza = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(zzivVar.zza, 0, this.zza, this.zzb, zzivVar.zzb);
            this.zzb = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return super.equals(obj);
        }
        zziv zzivVar = (zziv) obj;
        if (this.zzb != zzivVar.zzb) {
            return false;
        }
        double[] dArr = zzivVar.zza;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            if (Double.doubleToLongBits(this.zza[i9]) != Double.doubleToLongBits(dArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        return Double.valueOf(zzb(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            i9 = (i9 * 31) + zzjm.zza(Double.doubleToLongBits(this.zza[i10]));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.zza[i9] == doubleValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        zzd(i9);
        double[] dArr = this.zza;
        double d2 = dArr[i9];
        if (i9 < this.zzb - 1) {
            System.arraycopy(dArr, i9 + 1, dArr, i9, (r3 - i9) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 >= i9) {
            double[] dArr = this.zza;
            System.arraycopy(dArr, i10, dArr, i9, this.zzb - i10);
            this.zzb -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzd(i9);
        double[] dArr = this.zza;
        double d2 = dArr[i9];
        dArr[i9] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final /* synthetic */ zzjt<Double> zza(int i9) {
        if (i9 >= this.zzb) {
            return new zziv(Arrays.copyOf(this.zza, i9), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzb(int i9) {
        zzd(i9);
        return this.zza[i9];
    }

    private zziv(double[] dArr, int i9, boolean z8) {
        super(z8);
        this.zza = dArr;
        this.zzb = i9;
    }

    public final void zza(double d2) {
        zza();
        int i9 = this.zzb;
        double[] dArr = this.zza;
        if (i9 == dArr.length) {
            double[] dArr2 = new double[n0.v(i9, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i9);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        dArr3[i10] = d2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
