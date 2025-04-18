package com.google.android.gms.internal.ads;

import a4.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgzx extends zzgxb implements RandomAccess, zzgzi, zzhar {
    private static final zzgzx zza = new zzgzx(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzgzx() {
        this(new long[10], 0, true);
    }

    public static zzgzx zzh() {
        return zza;
    }

    private final String zzi(int i10) {
        return j.e("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzj(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zzdJ();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            int i12 = i10 + 1;
            long[] jArr = this.zzb;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
            } else {
                long[] jArr2 = new long[j.z(i11, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.zzb, i10, jArr2, i12, this.zzc - i10);
                this.zzb = jArr2;
            }
            this.zzb[i10] = longValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzgzk.zzb;
        collection.getClass();
        if (!(collection instanceof zzgzx)) {
            return super.addAll(collection);
        }
        zzgzx zzgzxVar = (zzgzx) collection;
        int i10 = zzgzxVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzb;
            if (i12 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzgzxVar.zzb, 0, this.zzb, this.zzc, zzgzxVar.zzc);
            this.zzc = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgzx)) {
            return super.equals(obj);
        }
        zzgzx zzgzxVar = (zzgzx) obj;
        if (this.zzc != zzgzxVar.zzc) {
            return false;
        }
        long[] jArr = zzgzxVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzj(i10);
        return Long.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            long j3 = this.zzb[i11];
            byte[] bArr = zzgzk.zzb;
            i10 = (i10 * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzdJ();
        zzj(i10);
        long[] jArr = this.zzb;
        long j3 = jArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zzdJ();
        if (i11 >= i10) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i11, jArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Long.valueOf(zzd(i10, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final long zza(int i10) {
        zzj(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final long zzd(int i10, long j3) {
        zzdJ();
        zzj(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        jArr[i10] = j3;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgzi zzf(int i10) {
        if (i10 >= this.zzc) {
            return new zzgzx(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final void zzg(long j3) {
        zzdJ();
        int i10 = this.zzc;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[j.z(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        jArr3[i11] = j3;
    }

    private zzgzx(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzb = jArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
