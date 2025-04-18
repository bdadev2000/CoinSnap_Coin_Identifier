package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzegd implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;
    private final zzhgp zzg;

    public zzegd(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
        this.zzf = zzhgpVar6;
        this.zzg = zzhgpVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegc zzb() {
        return new zzegc((zzcqh) this.zza.zzb(), (Context) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzdpn) this.zzd.zzb(), ((zzcwd) this.zze).zza(), (zzfwh) this.zzf.zzb(), (zzdsh) this.zzg.zzb());
    }
}
