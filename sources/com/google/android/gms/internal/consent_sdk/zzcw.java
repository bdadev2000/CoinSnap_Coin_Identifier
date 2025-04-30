package com.google.android.gms.internal.consent_sdk;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzcw {
    public static int zza(int i9, int i10, String str) {
        String zza;
        if (i9 >= 0 && i9 < i10) {
            return i9;
        }
        if (i9 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(o.h(i10, "negative size: "));
            }
            zza = zzcx.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        } else {
            zza = zzcx.zza("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i9, int i10, String str) {
        if (i9 >= 0 && i9 <= i10) {
            return i9;
        }
        throw new IndexOutOfBoundsException(zzd(i9, i10, "index"));
    }

    public static void zzc(int i9, int i10, int i11) {
        String zzd;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                zzd = zzcx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                zzd = zzd(i10, i11, "end index");
            }
        } else {
            zzd = zzd(i9, i11, "start index");
        }
        throw new IndexOutOfBoundsException(zzd);
    }

    private static String zzd(int i9, int i10, String str) {
        if (i9 < 0) {
            return zzcx.zza("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return zzcx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.h(i10, "negative size: "));
    }
}
