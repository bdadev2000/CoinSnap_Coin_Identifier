package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzesh implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzesh(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeun(((zzetx) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmi)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
