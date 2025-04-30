package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzhbf extends zzgzl implements RandomAccess, zzhbv, zzhdn {
    private static final zzhbf zza = new zzhbf(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public zzhbf() {
        this(new float[10], 0, true);
    }

    public static zzhbf zze() {
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
        float floatValue = ((Float) obj).floatValue();
        zzdJ();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            int i11 = i9 + 1;
            float[] fArr = this.zzb;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i9, fArr, i11, i10 - i9);
            } else {
                float[] fArr2 = new float[n0.v(i10, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i9);
                System.arraycopy(this.zzb, i9, fArr2, i11, this.zzc - i9);
                this.zzb = fArr2;
            }
            this.zzb[i9] = floatValue;
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
        if (!(collection instanceof zzhbf)) {
            return super.addAll(collection);
        }
        zzhbf zzhbfVar = (zzhbf) collection;
        int i9 = zzhbfVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            float[] fArr = this.zzb;
            if (i11 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(zzhbfVar.zzb, 0, this.zzb, this.zzc, zzhbfVar.zzc);
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
        if (!(obj instanceof zzhbf)) {
            return super.equals(obj);
        }
        zzhbf zzhbfVar = (zzhbf) obj;
        if (this.zzc != zzhbfVar.zzc) {
            return false;
        }
        float[] fArr = zzhbfVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (Float.floatToIntBits(this.zzb[i9]) != Float.floatToIntBits(fArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzj(i9);
        return Float.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + Float.floatToIntBits(this.zzb[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zzdJ();
        zzj(i9);
        float[] fArr = this.zzb;
        float f9 = fArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(fArr, i9 + 1, fArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zzdJ();
        if (i10 >= i9) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i10, fArr, i9, this.zzc - i10);
            this.zzc -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzdJ();
        zzj(i9);
        float[] fArr = this.zzb;
        float f9 = fArr[i9];
        fArr[i9] = floatValue;
        return Float.valueOf(f9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final float zzd(int i9) {
        zzj(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhbv zzf(int i9) {
        if (i9 >= this.zzc) {
            return new zzhbf(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f9) {
        zzdJ();
        int i9 = this.zzc;
        float[] fArr = this.zzb;
        if (i9 == fArr.length) {
            float[] fArr2 = new float[n0.v(i9, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i9);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        fArr3[i10] = f9;
    }

    private zzhbf(float[] fArr, int i9, boolean z8) {
        super(z8);
        this.zzb = fArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
