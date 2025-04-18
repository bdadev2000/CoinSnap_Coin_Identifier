package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzesb implements zzhfx {
    private final zzhgp zza;

    public zzesb(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeun(zzesx.zza(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlU)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
