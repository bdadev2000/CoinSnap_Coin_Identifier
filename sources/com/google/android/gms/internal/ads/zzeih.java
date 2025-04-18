package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeih implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzeih(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
        this.zzd = zzhgpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeif zzb() {
        return new zzeif(zzfin.zzc(), (ScheduledExecutorService) this.zza.zzb(), (zzcrt) this.zzb.zzb(), (zzeiv) this.zzc.zzb(), (zzfln) this.zzd.zzb());
    }
}
