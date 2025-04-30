package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdz extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgdz(int[] iArr, int i9, int i10) {
        this.zza = iArr;
        this.zzb = i9;
        this.zzc = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && zzgea.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgdz) {
            zzgdz zzgdzVar = (zzgdz) obj;
            int i9 = this.zzc - this.zzb;
            if (zzgdzVar.zzc - zzgdzVar.zzb != i9) {
                return false;
            }
            for (int i10 = 0; i10 < i9; i10++) {
                if (this.zza[this.zzb + i10] != zzgdzVar.zza[zzgdzVar.zzb + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        zzfyg.zza(i9, this.zzc - this.zzb, "index");
        return Integer.valueOf(this.zza[this.zzb + i9]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = this.zzb; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + this.zza[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int zza;
        if ((obj instanceof Integer) && (zza = zzgea.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc)) >= 0) {
            return zza - this.zzb;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i9 = this.zzb;
            int i10 = this.zzc - 1;
            while (true) {
                if (i10 >= i9) {
                    if (iArr[i10] == intValue) {
                        break;
                    }
                    i10--;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        Integer num = (Integer) obj;
        zzfyg.zza(i9, this.zzc - this.zzb, "index");
        int[] iArr = this.zza;
        int i10 = this.zzb + i9;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i9, int i10) {
        zzfyg.zzi(i9, i10, this.zzc - this.zzb);
        if (i9 == i10) {
            return Collections.emptyList();
        }
        int[] iArr = this.zza;
        int i11 = this.zzb;
        return new zzgdz(iArr, i11 + i9, i10 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.zzc - this.zzb) * 5);
        sb.append('[');
        sb.append(this.zza[this.zzb]);
        int i9 = this.zzb;
        while (true) {
            i9++;
            if (i9 < this.zzc) {
                sb.append(", ");
                sb.append(this.zza[i9]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
