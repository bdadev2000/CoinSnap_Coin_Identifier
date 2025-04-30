package com.google.android.gms.internal.play_billing;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzca extends zzba implements RandomAccess, zzcz, zzek {
    private static final zzca zza = new zzca(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    public zzca() {
        this(new double[10], 0, true);
    }

    private final String zzg(int i9) {
        return n0.e(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzh(int i9) {
        if (i9 >= 0 && i9 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzg(i9));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            int i11 = i9 + 1;
            double[] dArr = this.zzb;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i9, dArr, i11, i10 - i9);
            } else {
                double[] dArr2 = new double[n0.v(i10, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i9);
                System.arraycopy(this.zzb, i9, dArr2, i11, this.zzc - i9);
                this.zzb = dArr2;
            }
            this.zzb[i9] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzg(i9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzda.zzd;
        collection.getClass();
        if (!(collection instanceof zzca)) {
            return super.addAll(collection);
        }
        zzca zzcaVar = (zzca) collection;
        int i9 = zzcaVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            double[] dArr = this.zzb;
            if (i11 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(zzcaVar.zzb, 0, this.zzb, this.zzc, zzcaVar.zzc);
            this.zzc = i11;
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

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzca)) {
            return super.equals(obj);
        }
        zzca zzcaVar = (zzca) obj;
        if (this.zzc != zzcaVar.zzc) {
            return false;
        }
        double[] dArr = zzcaVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (Double.doubleToLongBits(this.zzb[i9]) != Double.doubleToLongBits(dArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzh(i9);
        return Double.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i10]);
            byte[] bArr = zzda.zzd;
            i9 = (i9 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzh(i9);
        double[] dArr = this.zzb;
        double d2 = dArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(dArr, i9 + 1, dArr, i9, (r3 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 >= i9) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i10, dArr, i9, this.zzc - i10);
            this.zzc -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i9);
        double[] dArr = this.zzb;
        double d2 = dArr[i9];
        dArr[i9] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final /* bridge */ /* synthetic */ zzcz zzd(int i9) {
        if (i9 >= this.zzc) {
            return new zzca(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i9) {
        zzh(i9);
        return this.zzb[i9];
    }

    public final void zzf(double d2) {
        zza();
        int i9 = this.zzc;
        double[] dArr = this.zzb;
        if (i9 == dArr.length) {
            double[] dArr2 = new double[n0.v(i9, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i9);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        dArr3[i10] = d2;
    }

    private zzca(double[] dArr, int i9, boolean z8) {
        super(z8);
        this.zzb = dArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
