package com.google.android.gms.internal.measurement;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzjj extends zzhu<Float> implements zzjt<Float>, zzlf, RandomAccess {
    private float[] zza;
    private int zzb;

    static {
        new zzjj(new float[0], 0, false);
    }

    public zzjj() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzb)) {
            float[] fArr = this.zza;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i9, fArr, i9 + 1, i10 - i9);
            } else {
                float[] fArr2 = new float[n0.v(i10, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i9);
                System.arraycopy(this.zza, i9, fArr2, i9 + 1, this.zzb - i9);
                this.zza = fArr2;
            }
            this.zza[i9] = floatValue;
            this.zzb++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzjj)) {
            return super.addAll(collection);
        }
        zzjj zzjjVar = (zzjj) collection;
        int i9 = zzjjVar.zzb;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzb;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            float[] fArr = this.zza;
            if (i11 > fArr.length) {
                this.zza = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(zzjjVar.zza, 0, this.zza, this.zzb, zzjjVar.zzb);
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
        if (!(obj instanceof zzjj)) {
            return super.equals(obj);
        }
        zzjj zzjjVar = (zzjj) obj;
        if (this.zzb != zzjjVar.zzb) {
            return false;
        }
        float[] fArr = zzjjVar.zza;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            if (Float.floatToIntBits(this.zza[i9]) != Float.floatToIntBits(fArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        return Float.valueOf(zzb(i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            i9 = (i9 * 31) + Float.floatToIntBits(this.zza[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.zza[i9] == floatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        zzd(i9);
        float[] fArr = this.zza;
        float f9 = fArr[i9];
        if (i9 < this.zzb - 1) {
            System.arraycopy(fArr, i9 + 1, fArr, i9, (r2 - i9) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 >= i9) {
            float[] fArr = this.zza;
            System.arraycopy(fArr, i10, fArr, i9, this.zzb - i10);
            this.zzb -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzd(i9);
        float[] fArr = this.zza;
        float f9 = fArr[i9];
        fArr[i9] = floatValue;
        return Float.valueOf(f9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final /* synthetic */ zzjt<Float> zza(int i9) {
        if (i9 >= this.zzb) {
            return new zzjj(Arrays.copyOf(this.zza, i9), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzb(int i9) {
        zzd(i9);
        return this.zza[i9];
    }

    private zzjj(float[] fArr, int i9, boolean z8) {
        super(z8);
        this.zza = fArr;
        this.zzb = i9;
    }

    public final void zza(float f9) {
        zza();
        int i9 = this.zzb;
        float[] fArr = this.zza;
        if (i9 == fArr.length) {
            float[] fArr2 = new float[n0.v(i9, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i9);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        fArr3[i10] = f9;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
