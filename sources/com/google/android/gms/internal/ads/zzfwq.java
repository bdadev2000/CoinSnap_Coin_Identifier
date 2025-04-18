package com.google.android.gms.internal.ads;

import eb.j;

/* loaded from: classes3.dex */
public final class zzfwq {
    public static int zza(int i10, int i11, String str) {
        String zzb;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException(j.i("negative size: ", i11));
            }
            zzb = zzfxf.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            zzb = zzfxf.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzm(i10, i11, "index"));
        }
        return i10;
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
        throw new NullPointerException(zzfxf.zzb(str, obj2));
    }

    public static void zze(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z10, Object obj) {
        if (z10) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzfxf.zzb(str, Character.valueOf(c10)));
        }
    }

    public static void zzh(boolean z10, String str, long j3) {
        if (!z10) {
            throw new IllegalArgumentException(zzfxf.zzb(str, Long.valueOf(j3)));
        }
    }

    public static void zzi(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(zzfxf.zzb(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void zzj(int i10, int i11, int i12) {
        String zzm;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                zzm = zzfxf.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                zzm = zzm(i11, i12, "end index");
            }
        } else {
            zzm = zzm(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(zzm);
    }

    public static void zzk(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzl(boolean z10, Object obj) {
        if (z10) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzm(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzfxf.zzb("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzfxf.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(j.i("negative size: ", i11));
    }
}
