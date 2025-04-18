package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzejz implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;
    private final zzhgp zzg;
    private final zzhgp zzh;

    public zzejz(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7, zzhgp zzhgpVar8, zzhgp zzhgpVar9) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
        this.zzf = zzhgpVar6;
        this.zzg = zzhgpVar8;
        this.zzh = zzhgpVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejy((Context) this.zza.zzb(), ((zzcid) this.zzb).zza(), ((zzcwd) this.zzc).zza(), (Executor) this.zzd.zzb(), (zzdow) this.zze.zzb(), (zzdpn) this.zzf.zzb(), new zzbju(), (zzeea) this.zzg.zzb(), (zzdsh) this.zzh.zzb());
    }
}
