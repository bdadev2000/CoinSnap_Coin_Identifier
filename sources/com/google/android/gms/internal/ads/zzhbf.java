package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhbf extends zzgze implements RandomAccess, zzhbm, zzhcy {
    private static final zzhbf zza = new zzhbf(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzhbf() {
        this(new int[10], 0, true);
    }

    public static zzhbf zzg() {
        return zza;
    }

    private final String zzj(int i2) {
        return d.k("Index:", i2, ", Size:", this.zzc);
    }

    private final void zzk(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzj(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        zzdJ();
        if (i2 >= 0 && i2 <= (i3 = this.zzc)) {
            int i4 = i2 + 1;
            int[] iArr = this.zzb;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
            } else {
                int[] iArr2 = new int[androidx.compose.foundation.text.input.a.z(i3, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.zzb, i2, iArr2, i4, this.zzc - i2);
                this.zzb = iArr2;
            }
            this.zzb[i2] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzj(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzhbr.zzb;
        collection.getClass();
        if (!(collection instanceof zzhbf)) {
            return super.addAll(collection);
        }
        zzhbf zzhbfVar = (zzhbf) collection;
        int i2 = zzhbfVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.zzb;
        if (i4 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(zzhbfVar.zzb, 0, this.zzb, this.zzc, zzhbfVar.zzc);
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
        if (!(obj instanceof zzhbf)) {
            return super.equals(obj);
        }
        zzhbf zzhbfVar = (zzhbf) obj;
        if (this.zzc != zzhbfVar.zzc) {
            return false;
        }
        int[] iArr = zzhbfVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzk(i2);
        return Integer.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + this.zzb[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.zzc;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzb[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzdJ();
        zzk(i2);
        int[] iArr = this.zzb;
        int i3 = iArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzdJ();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i3, iArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        return Integer.valueOf(zze(i2, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    public final int zzd(int i2) {
        zzk(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    public final int zze(int i2, int i3) {
        zzdJ();
        zzk(i2);
        int[] iArr = this.zzb;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzhbm zzf(int i2) {
        if (i2 >= this.zzc) {
            return new zzhbf(Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    public final void zzi(int i2) {
        zzdJ();
        int i3 = this.zzc;
        int[] iArr = this.zzb;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[androidx.compose.foundation.text.input.a.z(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        iArr3[i4] = i2;
    }

    private zzhbf(int[] iArr, int i2, boolean z2) {
        super(z2);
        this.zzb = iArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
