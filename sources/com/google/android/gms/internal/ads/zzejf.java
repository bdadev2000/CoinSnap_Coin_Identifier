package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzejf implements zzhfx {
    private final zzeje zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzejf(zzeje zzejeVar, zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzejeVar;
        this.zzb = zzhgpVar;
        this.zzc = zzhgpVar2;
        this.zzd = zzhgpVar3;
        this.zze = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzeiy) this.zzc).zzb(), (zzefg) this.zzd.zzb(), (zzflr) this.zze.zzb());
    }
}
