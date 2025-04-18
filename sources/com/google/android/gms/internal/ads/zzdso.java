package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdso implements zzhii {
    private final zzhja zza;

    public zzdso(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgfz zzc = zzfkb.zzc();
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeO)).booleanValue() ? Collections.singleton(new zzdfs(((zzdth) this.zza).zzb(), zzc)) : Collections.emptySet();
        zzhiq.zzb(singleton);
        return singleton;
    }
}
