package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfzg {
    public static int zza(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
