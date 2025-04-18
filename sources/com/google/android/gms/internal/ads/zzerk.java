package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzerk implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzerk(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqp(zzetu.zza(), ((Long) zzbec.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzfin.zzc(), (zzdsm) this.zzb.zzb());
    }
}
