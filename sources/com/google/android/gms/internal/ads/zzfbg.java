package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfbg implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;
    private final zzhgp zzg;

    public zzfbg(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7, zzhgp zzhgpVar8) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
        this.zzf = zzhgpVar6;
        this.zzg = zzhgpVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbf((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (com.google.android.gms.ads.internal.client.zzs) this.zzc.zzb(), (zzchk) this.zzd.zzb(), (zzems) this.zze.zzb(), (zzemw) this.zzf.zzb(), new zzffm(), (zzdbk) this.zzg.zzb());
    }
}
