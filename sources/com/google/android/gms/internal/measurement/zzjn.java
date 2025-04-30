package com.google.android.gms.internal.measurement;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjn extends zzhu<Integer> implements zzjr, zzlf, RandomAccess {
    private static final zzjn zza = new zzjn(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzjn() {
        this(new int[10], 0, true);
    }

    public static zzjn zzd() {
        return zza;
    }

    private final String zze(int i9) {
        return n0.e(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzf(int i9) {
        if (i9 >= 0 && i9 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zze(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            int[] iArr = this.zzb;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i9, iArr, i9 + 1, i10 - i9);
            } else {
                int[] iArr2 = new int[n0.v(i10, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i9);
                System.arraycopy(this.zzb, i9, iArr2, i9 + 1, this.zzc - i9);
                this.zzb = iArr2;
            }
            this.zzb[i9] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zze(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzjn)) {
            return super.addAll(collection);
        }
        zzjn zzjnVar = (zzjn) collection;
        int i9 = zzjnVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            int[] iArr = this.zzb;
            if (i11 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(zzjnVar.zzb, 0, this.zzb, this.zzc, zzjnVar.zzc);
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

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjn)) {
            return super.equals(obj);
        }
        zzjn zzjnVar = (zzjn) obj;
        if (this.zzc != zzjnVar.zzc) {
            return false;
        }
        int[] iArr = zzjnVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        return Integer.valueOf(zzb(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + this.zzb[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.zzb[i9] == intValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        zzf(i9);
        int[] iArr = this.zzb;
        int i10 = iArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(iArr, i9 + 1, iArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 >= i9) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i10, iArr, i9, this.zzc - i10);
            this.zzc -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzf(i9);
        int[] iArr = this.zzb;
        int i10 = iArr[i9];
        iArr[i9] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zzb(int i9) {
        zzf(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzjr zza(int i9) {
        if (i9 >= this.zzc) {
            return new zzjn(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzjn(int[] iArr, int i9, boolean z8) {
        super(z8);
        this.zzb = iArr;
        this.zzc = i9;
    }

    public final void zzd(int i9) {
        zza();
        int i10 = this.zzc;
        int[] iArr = this.zzb;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[n0.v(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        iArr3[i11] = i9;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzd(((Integer) obj).intValue());
        return true;
    }
}
