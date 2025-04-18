package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzchx implements zzhfx {
    private final zzhgp zza;

    public zzchx(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdur zzdurVar = (zzdur) this.zza.zzb();
        zzges zzc = zzfin.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbJ)).booleanValue()) {
            emptySet = Collections.singleton(new zzded(zzdurVar, zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhgf.zzb(emptySet);
        return emptySet;
    }
}
