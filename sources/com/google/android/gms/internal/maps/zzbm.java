package com.google.android.gms.internal.maps;

import com.google.android.gms.maps.model.FeatureType;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public abstract class zzbm extends zzbf implements Set {

    @CheckForNull
    private transient zzbi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @SafeVarargs
    public static zzbm zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[7];
        objArr2[0] = FeatureType.ADMINISTRATIVE_AREA_LEVEL_1;
        objArr2[1] = FeatureType.ADMINISTRATIVE_AREA_LEVEL_2;
        objArr2[2] = FeatureType.COUNTRY;
        objArr2[3] = FeatureType.LOCALITY;
        objArr2[4] = FeatureType.POSTAL_CODE;
        objArr2[5] = FeatureType.SCHOOL_DISTRICT;
        System.arraycopy(objArr, 0, objArr2, 6, 1);
        return zzk(7, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbm) && zzj() && ((zzbm) obj).zzj() && hashCode() != obj.hashCode()) {
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
        return zzbv.zza(this);
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzbx iterator();

    public final zzbi zzg() {
        zzbi zzbiVar = this.zza;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzbi zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    zzbi zzh() {
        Object[] array = toArray();
        int i = zzbi.zzd;
        return zzbi.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }

    private static zzbm zzk(int i, Object... objArr) {
        if (i == 0) {
            return zzbu.zza;
        }
        if (i == 1) {
            return new zzbw(Objects.requireNonNull(objArr[0]));
        }
        int zzf = zzf(i);
        Object[] objArr2 = new Object[zzf];
        int i2 = zzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                throw new NullPointerException("at index " + i5);
            }
            int hashCode = obj.hashCode();
            int zza = zzbe.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                Object obj2 = objArr2[i6];
                if (obj2 != null) {
                    if (!obj2.equals(obj)) {
                        zza++;
                    }
                } else {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new zzbw(Objects.requireNonNull(objArr[0]));
        }
        if (zzf(i4) >= zzf / 2) {
            if (i4 < 4) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new zzbu(objArr, i3, objArr2, i2, i4);
        }
        return zzk(i4, objArr);
    }
}
