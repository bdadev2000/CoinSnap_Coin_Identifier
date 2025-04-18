package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcib implements zzhii {
    private final zzhja zza;

    public zzcib(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbG)).booleanValue() ? Collections.singleton(new zzdfs((zzdwi) this.zza.zzb(), zzfkb.zzc())) : Collections.emptySet();
        zzhiq.zzb(singleton);
        return singleton;
    }
}
