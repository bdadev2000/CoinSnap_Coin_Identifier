package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzhav extends zzgze implements RandomAccess, zzhbl, zzhcy {
    private static final zzhav zza = new zzhav(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public zzhav() {
        this(new float[10], 0, true);
    }

    public static zzhav zze() {
        return zza;
    }

    private final String zzi(int i2) {
        return d.k("Index:", i2, ", Size:", this.zzc);
    }

    private final void zzj(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        zzdJ();
        if (i2 >= 0 && i2 <= (i3 = this.zzc)) {
            int i4 = i2 + 1;
            float[] fArr = this.zzb;
            if (i3 < fArr.length) {
                System.arraycopy(fArr, i2, fArr, i4, i3 - i2);
            } else {
                float[] fArr2 = new float[androidx.compose.foundation.text.input.a.z(i3, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i2);
                System.arraycopy(this.zzb, i2, fArr2, i4, this.zzc - i2);
                this.zzb = fArr2;
            }
            this.zzb[i2] = floatValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzhbr.zzb;
        collection.getClass();
        if (!(collection instanceof zzhav)) {
            return super.addAll(collection);
        }
        zzhav zzhavVar = (zzhav) collection;
        int i2 = zzhavVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.zzb;
        if (i4 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zzhavVar.zzb, 0, this.zzb, this.zzc, zzhavVar.zzc);
        this.zzc = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhav)) {
            return super.equals(obj);
        }
        zzhav zzhavVar = (zzhav) obj;
        if (this.zzc != zzhavVar.zzc) {
            return false;
        }
        float[] fArr = zzhavVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Float.floatToIntBits(this.zzb[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzj(i2);
        return Float.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.zzb[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.zzc;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzb[i3] == floatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzdJ();
        zzj(i2);
        float[] fArr = this.zzb;
        float f2 = fArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzdJ();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i3, fArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzdJ();
        zzj(i2);
        float[] fArr = this.zzb;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final float zzd(int i2) {
        zzj(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhbl zzf(int i2) {
        if (i2 >= this.zzc) {
            return new zzhav(Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f2) {
        zzdJ();
        int i2 = this.zzc;
        float[] fArr = this.zzb;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[androidx.compose.foundation.text.input.a.z(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        fArr3[i3] = f2;
    }

    private zzhav(float[] fArr, int i2, boolean z2) {
        super(z2);
        this.zzb = fArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
