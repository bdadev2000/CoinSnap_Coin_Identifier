package com.google.android.gms.internal.play_billing;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzaa {
    public static int zza(int i9, int i10, String str) {
        String zza;
        if (i9 >= 0 && i9 < i10) {
            return i9;
        }
        if (i9 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(o.h(i10, "negative size: "));
            }
            zza = zzab.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        } else {
            zza = zzab.zza("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i9, int i10, String str) {
        if (i9 >= 0 && i9 <= i10) {
            return i9;
        }
        throw new IndexOutOfBoundsException(zze(i9, i10, "index"));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i9, int i10, int i11) {
        String zze;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                zze = zzab.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                zze = zze(i10, i11, "end index");
            }
        } else {
            zze = zze(i9, i11, "start index");
        }
        throw new IndexOutOfBoundsException(zze);
    }

    private static String zze(int i9, int i10, String str) {
        if (i9 < 0) {
            return zzab.zza("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return zzab.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.h(i10, "negative size: "));
    }
}
