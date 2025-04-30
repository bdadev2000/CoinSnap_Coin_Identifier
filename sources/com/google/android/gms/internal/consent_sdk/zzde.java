package com.google.android.gms.internal.consent_sdk;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzde extends zzda implements Set {
    private transient zzdd zza;

    public static int zzf(int i9) {
        int max = Math.max(i9, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static zzde zzi() {
        return zzdh.zza;
    }

    public static zzde zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static zzde zzl(int i9, Object... objArr) {
        if (i9 != 0) {
            if (i9 != 1) {
                int zzf = zzf(i9);
                Object[] objArr2 = new Object[zzf];
                int i10 = zzf - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int zza = zzcz.zza(hashCode);
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
                    } else {
                        throw new NullPointerException(o.h(i13, "at index "));
                    }
                }
                Arrays.fill(objArr, i12, i9, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new zzdi(obj3);
                }
                if (zzf(i12) >= zzf / 2) {
                    if (i12 < 3) {
                        objArr = Arrays.copyOf(objArr, i12);
                    }
                    return new zzdh(objArr, i11, objArr2, i10, i12);
                }
                return zzl(i12, objArr);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdi(obj4);
        }
        return zzdh.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzde) && zzk() && ((zzde) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i9;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 += i9;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdj iterator();

    public final zzdd zzg() {
        zzdd zzddVar = this.zza;
        if (zzddVar == null) {
            zzdd zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzddVar;
    }

    public zzdd zzh() {
        Object[] array = toArray();
        int i9 = zzdd.zzd;
        return zzdd.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
