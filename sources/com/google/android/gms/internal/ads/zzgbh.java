package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class zzgbh<E> extends zzgax<E> implements Set<E> {
    private transient zzgbc zza;

    public static int zzh(int i9) {
        boolean z8;
        int max = Math.max(i9, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzf(z8, "collection too large");
        return 1073741824;
    }

    public static zzgbg zzj(int i9) {
        return new zzgbg(i9);
    }

    public static zzgbh zzl(Collection collection) {
        if ((collection instanceof zzgbh) && !(collection instanceof SortedSet)) {
            zzgbh zzgbhVar = (zzgbh) collection;
            if (!zzgbhVar.zzf()) {
                return zzgbhVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgbh zzm(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return zzv(length, (Object[]) objArr.clone());
            }
            return new zzgdf(objArr[0]);
        }
        return zzgcu.zza;
    }

    public static zzgbh zzn() {
        return zzgcu.zza;
    }

    public static zzgbh zzo(Object obj) {
        return new zzgdf(obj);
    }

    public static zzgbh zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgbh zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgbh zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgbh zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzv(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgbh zzv(int i9, Object... objArr) {
        if (i9 != 0) {
            if (i9 != 1) {
                int zzh = zzh(i9);
                Object[] objArr2 = new Object[zzh];
                int i10 = zzh - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    Object obj = objArr[i13];
                    zzgcm.zza(obj, i13);
                    int hashCode = obj.hashCode();
                    int zza = zzgau.zza(hashCode);
                    while (true) {
                        int i14 = zza & i10;
                        Object obj2 = objArr2[i14];
                        if (obj2 == null) {
                            objArr[i12] = obj;
                            objArr2[i14] = obj;
                            i11 += hashCode;
                            i12++;
                            break;
                        }
                        if (!obj2.equals(obj)) {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i12, i9, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new zzgdf(obj3);
                }
                if (zzh(i12) < zzh / 2) {
                    return zzv(i12, objArr);
                }
                if (zzw(i12, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new zzgcu(objArr, i11, objArr2, i10, i12);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgdf(obj4);
        }
        return zzgcu.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i9, int i10) {
        return i9 < (i10 >> 1) + (i10 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgbh) && zzu() && ((zzgbh) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgde.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgde.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public zzgbc zzd() {
        zzgbc zzgbcVar = this.zza;
        if (zzgbcVar == null) {
            zzgbc zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzgbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzgdi iterator();

    public zzgbc zzi() {
        Object[] array = toArray();
        int i9 = zzgbc.zzd;
        return zzgbc.zzj(array, array.length);
    }

    public boolean zzu() {
        return false;
    }
}
