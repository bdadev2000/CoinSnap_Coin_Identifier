package com.google.android.gms.internal.common;

import eb.j;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
public final class zzs {
    public static int zza(int i10, int i11, String str) {
        String zza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException(j.i("negative size: ", i11));
            }
            zza = zzy.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            zza = zzy.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzd(i10, i11, "index"));
        }
        return i10;
    }

    public static void zzc(int i10, int i11, int i12) {
        String zzd;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                zzd = zzy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                zzd = zzd(i11, i12, "end index");
            }
        } else {
            zzd = zzd(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(zzd);
    }

    private static String zzd(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzy.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(j.i("negative size: ", i11));
    }
}
