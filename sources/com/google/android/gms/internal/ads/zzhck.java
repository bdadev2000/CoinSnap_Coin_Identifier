package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhck {
    public static final boolean zza(Object obj) {
        return !((zzhcj) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhcj zzhcjVar = (zzhcj) obj;
        zzhcj zzhcjVar2 = (zzhcj) obj2;
        if (!zzhcjVar2.isEmpty()) {
            if (!zzhcjVar.zze()) {
                zzhcjVar = zzhcjVar.zzb();
            }
            zzhcjVar.zzd(zzhcjVar2);
        }
        return zzhcjVar;
    }
}
