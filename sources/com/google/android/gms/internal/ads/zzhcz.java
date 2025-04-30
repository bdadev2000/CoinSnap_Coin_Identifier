package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhcz {
    public static final boolean zza(Object obj) {
        if (!((zzhcy) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhcy zzhcyVar = (zzhcy) obj;
        zzhcy zzhcyVar2 = (zzhcy) obj2;
        if (!zzhcyVar2.isEmpty()) {
            if (!zzhcyVar.zze()) {
                zzhcyVar = zzhcyVar.zzb();
            }
            zzhcyVar.zzd(zzhcyVar2);
        }
        return zzhcyVar;
    }
}
