package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgdt extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgdt(int[] iArr, int i2, int i3) {
        this.zza = iArr;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgdu.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgdt)) {
            return super.equals(obj);
        }
        zzgdt zzgdtVar = (zzgdt) obj;
        int i2 = this.zzc - this.zzb;
        if (zzgdtVar.zzc - zzgdtVar.zzb != i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zza[this.zzb + i3] != zzgdtVar.zza[zzgdtVar.zzb + i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        zzfxz.zza(i2, this.zzc - this.zzb, FirebaseAnalytics.Param.INDEX);
        return Integer.valueOf(this.zza[this.zzb + i2]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = this.zzb; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + this.zza[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int zza;
        if (!(obj instanceof Integer) || (zza = zzgdu.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return zza - this.zzb;
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
            int i2 = this.zzb;
            int i3 = this.zzc - 1;
            while (true) {
                if (i3 < i2) {
                    i3 = -1;
                    break;
                }
                if (iArr[i3] == intValue) {
                    break;
                }
                i3--;
            }
            if (i3 >= 0) {
                return i3 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        Integer num = (Integer) obj;
        zzfxz.zza(i2, this.zzc - this.zzb, FirebaseAnalytics.Param.INDEX);
        int[] iArr = this.zza;
        int i3 = this.zzb + i2;
        int i4 = iArr[i3];
        num.getClass();
        iArr[i3] = num.intValue();
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        zzfxz.zzi(i2, i3, this.zzc - this.zzb);
        if (i2 == i3) {
            return Collections.emptyList();
        }
        int[] iArr = this.zza;
        int i4 = this.zzb;
        return new zzgdt(iArr, i4 + i2, i3 + i4);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.zzc - this.zzb) * 5);
        sb.append('[');
        sb.append(this.zza[this.zzb]);
        int i2 = this.zzb;
        while (true) {
            i2++;
            if (i2 >= this.zzc) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.zza[i2]);
        }
    }
}
