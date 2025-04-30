package com.google.android.gms.internal.play_billing;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzct extends zzba implements RandomAccess, zzcx, zzek {
    private static final zzct zza = new zzct(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzct() {
        this(new int[10], 0, true);
    }

    public static zzct zzf() {
        return zza;
    }

    private final String zzh(int i9) {
        return n0.e(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i9) {
        if (i9 >= 0 && i9 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzh(i9));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            int i11 = i9 + 1;
            int[] iArr = this.zzb;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i9, iArr, i11, i10 - i9);
            } else {
                int[] iArr2 = new int[n0.v(i10, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i9);
                System.arraycopy(this.zzb, i9, iArr2, i11, this.zzc - i9);
                this.zzb = iArr2;
            }
            this.zzb[i9] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzda.zzd;
        collection.getClass();
        if (!(collection instanceof zzct)) {
            return super.addAll(collection);
        }
        zzct zzctVar = (zzct) collection;
        int i9 = zzctVar.zzc;
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
            System.arraycopy(zzctVar.zzb, 0, this.zzb, this.zzc, zzctVar.zzc);
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
        if (!(obj instanceof zzct)) {
            return super.equals(obj);
        }
        zzct zzctVar = (zzct) obj;
        if (this.zzc != zzctVar.zzc) {
            return false;
        }
        int[] iArr = zzctVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzi(i9);
        return Integer.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzi(i9);
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

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzi(i9);
        int[] iArr = this.zzb;
        int i10 = iArr[i9];
        iArr[i9] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final /* bridge */ /* synthetic */ zzcz zzd(int i9) {
        if (i9 >= this.zzc) {
            return new zzct(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i9) {
        zzi(i9);
        return this.zzb[i9];
    }

    public final void zzg(int i9) {
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

    private zzct(int[] iArr, int i9, boolean z8) {
        super(z8);
        this.zzb = iArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Integer) obj).intValue());
        return true;
    }
}
