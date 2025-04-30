package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzfyg {
    public static int zza(int i9, int i10, String str) {
        String zzb;
        if (i9 >= 0 && i9 < i10) {
            return i9;
        }
        if (i9 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(o.h(i10, "negative size: "));
            }
            zzb = zzfyv.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        } else {
            zzb = zzfyv.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i9, int i10, String str) {
        if (i9 >= 0 && i9 <= i10) {
            return i9;
        }
        throw new IndexOutOfBoundsException(zzl(i9, i10, "index"));
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
        throw new NullPointerException(zzfyv.zzb(str, obj2));
    }

    public static void zze(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z8, String str, long j7) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(zzfyv.zzb(str, Long.valueOf(j7)));
        }
    }

    public static void zzh(boolean z8, String str, int i9, int i10) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(zzfyv.zzb(str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
    }

    public static void zzi(int i9, int i10, int i11) {
        String zzl;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                zzl = zzfyv.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                zzl = zzl(i10, i11, "end index");
            }
        } else {
            zzl = zzl(i9, i11, "start index");
        }
        throw new IndexOutOfBoundsException(zzl);
    }

    public static void zzj(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void zzk(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzl(int i9, int i10, String str) {
        if (i9 < 0) {
            return zzfyv.zzb("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return zzfyv.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.h(i10, "negative size: "));
    }
}
