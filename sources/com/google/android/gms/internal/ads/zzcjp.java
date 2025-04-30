package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcjp implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcjp(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdxh zzdxhVar = (zzdxh) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbE)).booleanValue()) {
            emptySet = Collections.singleton(new zzdha(zzdxhVar, zzggeVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhkx.zzb(emptySet);
        return emptySet;
    }
}
