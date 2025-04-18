package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeok implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzeok(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeoj((ua.b) this.zza.zzb(), zzfin.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
