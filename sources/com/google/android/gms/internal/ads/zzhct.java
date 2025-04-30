package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhct extends zzgzl implements RandomAccess, zzhbz, zzhdn {
    private static final zzhct zza = new zzhct(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzhct() {
        this(new long[10], 0, true);
    }

    public static zzhct zzh() {
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
        long longValue = ((Long) obj).longValue();
        zzdJ();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            int i11 = i9 + 1;
            long[] jArr = this.zzb;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i9, jArr, i11, i10 - i9);
            } else {
                long[] jArr2 = new long[n0.v(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i9);
                System.arraycopy(this.zzb, i9, jArr2, i11, this.zzc - i9);
                this.zzb = jArr2;
            }
            this.zzb[i9] = longValue;
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
        if (!(collection instanceof zzhct)) {
            return super.addAll(collection);
        }
        zzhct zzhctVar = (zzhct) collection;
        int i9 = zzhctVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            long[] jArr = this.zzb;
            if (i11 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(zzhctVar.zzb, 0, this.zzb, this.zzc, zzhctVar.zzc);
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
        if (!(obj instanceof zzhct)) {
            return super.equals(obj);
        }
        zzhct zzhctVar = (zzhct) obj;
        if (this.zzc != zzhctVar.zzc) {
            return false;
        }
        long[] jArr = zzhctVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzj(i9);
        return Long.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long j7 = this.zzb[i10];
            byte[] bArr = zzhcb.zzd;
            i9 = (i9 * 31) + ((int) (j7 ^ (j7 >>> 32)));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zzdJ();
        zzj(i9);
        long[] jArr = this.zzb;
        long j7 = jArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zzdJ();
        if (i10 >= i9) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i10, jArr, i9, this.zzc - i10);
            this.zzc -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        return Long.valueOf(zzd(i9, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbz
    public final long zza(int i9) {
        zzj(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzhbz
    public final long zzd(int i9, long j7) {
        zzdJ();
        zzj(i9);
        long[] jArr = this.zzb;
        long j9 = jArr[i9];
        jArr[i9] = j7;
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhbz zzf(int i9) {
        if (i9 >= this.zzc) {
            return new zzhct(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzhbz
    public final void zzg(long j7) {
        zzdJ();
        int i9 = this.zzc;
        long[] jArr = this.zzb;
        if (i9 == jArr.length) {
            long[] jArr2 = new long[n0.v(i9, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        jArr3[i10] = j7;
    }

    private zzhct(long[] jArr, int i9, boolean z8) {
        super(z8);
        this.zzb = jArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
