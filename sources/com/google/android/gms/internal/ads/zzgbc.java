package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public abstract class zzgbc<E> extends zzgas<E> implements Set<E> {
    private transient zzgax zza;

    public static int zzh(int i2) {
        int max = Math.max(i2, 2);
        if (max >= 751619276) {
            zzfxz.zzf(max < 1073741824, "collection too large");
            return Ints.MAX_POWER_OF_TWO;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzgbb zzj(int i2) {
        return new zzgbb(i2);
    }

    public static zzgbc zzl(Collection collection) {
        if ((collection instanceof zzgbc) && !(collection instanceof SortedSet)) {
            zzgbc zzgbcVar = (zzgbc) collection;
            if (!zzgbcVar.zzf()) {
                return zzgbcVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgbc zzm(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgda(objArr[0]) : zzgcp.zza;
    }

    public static zzgbc zzn() {
        return zzgcp.zza;
    }

    public static zzgbc zzo(Object obj) {
        return new zzgda(obj);
    }

    public static zzgbc zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgbc zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgbc zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgbc zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[11];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 5);
        return zzv(11, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgbc zzv(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzgcp.zza;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgda(obj);
        }
        int zzh = zzh(i2);
        Object[] objArr2 = new Object[zzh];
        int i3 = zzh - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            zzgch.zza(obj2, i6);
            int hashCode = obj2.hashCode();
            int zza = zzgap.zza(hashCode);
            while (true) {
                int i7 = zza & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += hashCode;
                    i5++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgda(obj4);
        }
        if (zzh(i5) < zzh / 2) {
            return zzv(i5, objArr);
        }
        if (zzw(i5, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzgcp(objArr, i4, objArr2, i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgbc) && zzu() && ((zzgbc) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgcz.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgcz.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public zzgax zzd() {
        zzgax zzgaxVar = this.zza;
        if (zzgaxVar != null) {
            return zzgaxVar;
        }
        zzgax zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzgdd iterator();

    public zzgax zzi() {
        Object[] array = toArray();
        int i2 = zzgax.zzd;
        return zzgax.zzj(array, array.length);
    }

    public boolean zzu() {
        return false;
    }
}
