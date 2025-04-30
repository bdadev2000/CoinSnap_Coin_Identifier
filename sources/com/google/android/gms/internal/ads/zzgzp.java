package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzgzp extends zzgzl implements RandomAccess, zzhbq, zzhdn {
    private static final zzgzp zza = new zzgzp(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    public zzgzp() {
        this(new boolean[10], 0, true);
    }

    public static zzgzp zzd() {
        return zza;
    }

    private final String zzi(int i9) {
        return n0.e(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzj(int i9) {
        if (i9 >= 0 && i9 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzi(i9));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdJ();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            int i11 = i9 + 1;
            boolean[] zArr = this.zzb;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i9, zArr, i11, i10 - i9);
            } else {
                boolean[] zArr2 = new boolean[n0.v(i10, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i9);
                System.arraycopy(this.zzb, i9, zArr2, i11, this.zzc - i9);
                this.zzb = zArr2;
            }
            this.zzb[i9] = booleanValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i9));
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzhcb.zzd;
        collection.getClass();
        if (!(collection instanceof zzgzp)) {
            return super.addAll(collection);
        }
        zzgzp zzgzpVar = (zzgzp) collection;
        int i9 = zzgzpVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            boolean[] zArr = this.zzb;
            if (i11 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(zzgzpVar.zzb, 0, this.zzb, this.zzc, zzgzpVar.zzc);
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

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgzp)) {
            return super.equals(obj);
        }
        zzgzp zzgzpVar = (zzgzp) obj;
        if (this.zzc != zzgzpVar.zzc) {
            return false;
        }
        boolean[] zArr = zzgzpVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != zArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzj(i9);
        return Boolean.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + zzhcb.zza(this.zzb[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zzdJ();
        zzj(i9);
        boolean[] zArr = this.zzb;
        boolean z8 = zArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(zArr, i9 + 1, zArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zzdJ();
        if (i10 >= i9) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i10, zArr, i9, this.zzc - i10);
            this.zzc -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdJ();
        zzj(i9);
        boolean[] zArr = this.zzb;
        boolean z8 = zArr[i9];
        zArr[i9] = booleanValue;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhbq zzf(int i9) {
        if (i9 >= this.zzc) {
            return new zzgzp(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(boolean z8) {
        zzdJ();
        int i9 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i9 == zArr.length) {
            boolean[] zArr2 = new boolean[n0.v(i9, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i9);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr3[i10] = z8;
    }

    public final boolean zzh(int i9) {
        zzj(i9);
        return this.zzb[i9];
    }

    private zzgzp(boolean[] zArr, int i9, boolean z8) {
        super(z8);
        this.zzb = zArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
