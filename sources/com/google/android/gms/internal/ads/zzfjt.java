package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfjt implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzfjt(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfjr(zzfin.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzfju) this.zzb).zzb());
    }
}
