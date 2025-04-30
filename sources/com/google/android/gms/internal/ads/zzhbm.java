package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhde;

/* loaded from: classes2.dex */
public final class zzhbm<ContainingType extends zzhde, Type> extends zzhaw<ContainingType, Type> {
    final zzhde zza;
    final Object zzb;
    final zzhde zzc;
    final zzhbl zzd;

    public zzhbm(zzhde zzhdeVar, Object obj, zzhde zzhdeVar2, zzhbl zzhblVar, Class cls) {
        if (zzhdeVar != null) {
            if (zzhblVar.zzc == zzhfg.zzk && zzhdeVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.zza = zzhdeVar;
            this.zzb = obj;
            this.zzc = zzhdeVar2;
            this.zzd = zzhblVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
}
