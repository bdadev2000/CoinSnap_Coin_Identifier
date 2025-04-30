package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdip implements zzhkp {
    private final zzdik zza;
    private final zzhlg zzb;

    public zzdip(zzdik zzdikVar, zzhlg zzhlgVar) {
        this.zza = zzdikVar;
        this.zzb = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdha((zzcyi) this.zzb.zzb(), zzcci.zzf));
        zzhkx.zzb(singleton);
        return singleton;
    }
}
