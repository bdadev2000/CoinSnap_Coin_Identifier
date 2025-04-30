package com.google.android.gms.internal.measurement;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzke extends zzhu<Long> implements zzjq, zzlf, RandomAccess {
    private static final zzke zza = new zzke(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzke() {
        this(new long[10], 0, true);
    }

    public static zzke zzd() {
        return zza;
    }

    private final void zze(int i9) {
        if (i9 >= 0 && i9 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzd(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            long[] jArr = this.zzb;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i9, jArr, i9 + 1, i10 - i9);
            } else {
                long[] jArr2 = new long[n0.v(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i9);
                System.arraycopy(this.zzb, i9, jArr2, i9 + 1, this.zzc - i9);
                this.zzb = jArr2;
            }
            this.zzb[i9] = longValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzd(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzke)) {
            return super.addAll(collection);
        }
        zzke zzkeVar = (zzke) collection;
        int i9 = zzkeVar.zzc;
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
            System.arraycopy(zzkeVar.zzb, 0, this.zzb, this.zzc, zzkeVar.zzc);
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
        if (!(obj instanceof zzke)) {
            return super.equals(obj);
        }
        zzke zzkeVar = (zzke) obj;
        if (this.zzc != zzkeVar.zzc) {
            return false;
        }
        long[] jArr = zzkeVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        return Long.valueOf(zzb(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + zzjm.zza(this.zzb[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.zzb[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        zze(i9);
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
        zza();
        if (i10 >= i9) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i10, jArr, i9, this.zzc - i10);
            this.zzc -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zze(i9);
        long[] jArr = this.zzb;
        long j7 = jArr[i9];
        jArr[i9] = longValue;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzjq
    public final long zzb(int i9) {
        zze(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzjq zza(int i9) {
        if (i9 >= this.zzc) {
            return new zzke(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzke(long[] jArr, int i9, boolean z8) {
        super(z8);
        this.zzb = jArr;
        this.zzc = i9;
    }

    private final String zzd(int i9) {
        return n0.e(i9, this.zzc, "Index:", ", Size:");
    }

    public final void zza(long j7) {
        zza();
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

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }
}
