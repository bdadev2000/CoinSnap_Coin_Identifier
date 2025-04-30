package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhdp extends zzgzl implements RandomAccess {
    private static final zzhdp zza = new zzhdp(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzhdp() {
        this(new Object[10], 0, true);
    }

    public static zzhdp zzd() {
        return zza;
    }

    private final String zze(int i9) {
        return n0.e(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i9) {
        if (i9 >= 0 && i9 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zze(i9));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        zzdJ();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            int i11 = i9 + 1;
            Object[] objArr = this.zzb;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i9, objArr, i11, i10 - i9);
            } else {
                Object[] objArr2 = new Object[n0.v(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(this.zzb, i9, objArr2, i11, this.zzc - i9);
                this.zzb = objArr2;
            }
            this.zzb[i9] = obj;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zze(i9));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        zzg(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        zzdJ();
        zzg(i9);
        Object[] objArr = this.zzb;
        Object obj = objArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        zzdJ();
        zzg(i9);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final /* bridge */ /* synthetic */ zzhca zzf(int i9) {
        if (i9 >= this.zzc) {
            return new zzhdp(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzhdp(Object[] objArr, int i9, boolean z8) {
        super(z8);
        this.zzb = objArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdJ();
        int i9 = this.zzc;
        Object[] objArr = this.zzb;
        if (i9 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
