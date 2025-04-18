package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class zzfxz {
    public static int zza(int i2, int i3, String str) {
        String zzb;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            zzb = zzfyo.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(d.i("negative size: ", i3));
            }
            zzb = zzfyo.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzl(i2, i3, FirebaseAnalytics.Param.INDEX));
        }
        return i2;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfyo.zzb(str, obj2));
    }

    public static void zze(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z2, String str, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(zzfyo.zzb(str, Long.valueOf(j2)));
        }
    }

    public static void zzh(boolean z2, String str, int i2, int i3) {
        if (!z2) {
            throw new IllegalArgumentException(zzfyo.zzb(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void zzi(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? zzl(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? zzl(i3, i4, "end index") : zzfyo.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void zzj(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void zzk(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzl(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzfyo.zzb("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzfyo.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(d.i("negative size: ", i3));
    }
}
