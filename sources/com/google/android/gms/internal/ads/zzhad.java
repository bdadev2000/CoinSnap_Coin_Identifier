package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhad {
    public static final boolean zza(Object obj) {
        return !((zzhac) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhac zzhacVar = (zzhac) obj;
        zzhac zzhacVar2 = (zzhac) obj2;
        if (!zzhacVar2.isEmpty()) {
            if (!zzhacVar.zze()) {
                zzhacVar = zzhacVar.zzb();
            }
            zzhacVar.zzd(zzhacVar2);
        }
        return zzhacVar;
    }
}
