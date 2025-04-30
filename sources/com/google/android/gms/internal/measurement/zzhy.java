package com.google.android.gms.internal.measurement;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzhy extends zzhu<Boolean> implements zzjt<Boolean>, zzlf, RandomAccess {
    private boolean[] zza;
    private int zzb;

    static {
        new zzhy(new boolean[0], 0, false);
    }

    public zzhy() {
        this(new boolean[10], 0, true);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzb)) {
            boolean[] zArr = this.zza;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i9, zArr, i9 + 1, i10 - i9);
            } else {
                boolean[] zArr2 = new boolean[n0.v(i10, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i9);
                System.arraycopy(this.zza, i9, zArr2, i9 + 1, this.zzb - i9);
                this.zza = zArr2;
            }
            this.zza[i9] = booleanValue;
            this.zzb++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzhy)) {
            return super.addAll(collection);
        }
        zzhy zzhyVar = (zzhy) collection;
        int i9 = zzhyVar.zzb;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzb;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            boolean[] zArr = this.zza;
            if (i11 > zArr.length) {
                this.zza = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(zzhyVar.zza, 0, this.zza, this.zzb, zzhyVar.zzb);
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
        if (!(obj instanceof zzhy)) {
            return super.equals(obj);
        }
        zzhy zzhyVar = (zzhy) obj;
        if (this.zzb != zzhyVar.zzb) {
            return false;
        }
        boolean[] zArr = zzhyVar.zza;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            if (this.zza[i9] != zArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        return Boolean.valueOf(zzb(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            i9 = (i9 * 31) + zzjm.zza(this.zza[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.zza[i9] == booleanValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        zzd(i9);
        boolean[] zArr = this.zza;
        boolean z8 = zArr[i9];
        if (i9 < this.zzb - 1) {
            System.arraycopy(zArr, i9 + 1, zArr, i9, (r2 - i9) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 >= i9) {
            boolean[] zArr = this.zza;
            System.arraycopy(zArr, i10, zArr, i9, this.zzb - i10);
            this.zzb -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzd(i9);
        boolean[] zArr = this.zza;
        boolean z8 = zArr[i9];
        zArr[i9] = booleanValue;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final /* synthetic */ zzjt<Boolean> zza(int i9) {
        if (i9 >= this.zzb) {
            return new zzhy(Arrays.copyOf(this.zza, i9), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzb(int i9) {
        zzd(i9);
        return this.zza[i9];
    }

    private zzhy(boolean[] zArr, int i9, boolean z8) {
        super(z8);
        this.zza = zArr;
        this.zzb = i9;
    }

    public final void zza(boolean z8) {
        zza();
        int i9 = this.zzb;
        boolean[] zArr = this.zza;
        if (i9 == zArr.length) {
            boolean[] zArr2 = new boolean[n0.v(i9, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i9);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        zArr3[i10] = z8;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
