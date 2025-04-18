package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdqx implements zzhfx {
    private final zzhgp zza;

    public zzdqx(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzges zzc = zzfin.zzc();
        zzdrp zzb = ((zzdrq) this.zza).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeV)).booleanValue()) {
            emptySet = Collections.singleton(new zzded(zzb, zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhgf.zzb(emptySet);
        return emptySet;
    }
}
