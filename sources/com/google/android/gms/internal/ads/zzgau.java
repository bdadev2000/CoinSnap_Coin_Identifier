package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgau {
    public static int zza(int i9) {
        return (int) (Integer.rotateLeft((int) (i9 * (-862048943)), 15) * 461845907);
    }

    public static int zzb(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return zza(hashCode);
    }
}
