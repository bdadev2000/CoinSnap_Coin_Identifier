package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzfcu implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;
    private final zzhja zzd;
    private final zzhja zze;
    private final zzhja zzf;
    private final zzhja zzg;

    public zzfcu(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4, zzhja zzhjaVar5, zzhja zzhjaVar6, zzhja zzhjaVar7, zzhja zzhjaVar8) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
        this.zzd = zzhjaVar4;
        this.zze = zzhjaVar5;
        this.zzf = zzhjaVar6;
        this.zzg = zzhjaVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfct((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (com.google.android.gms.ads.internal.client.zzs) this.zzc.zzb(), (zzcho) this.zzd.zzb(), (zzeob) this.zze.zzb(), (zzeof) this.zzf.zzb(), new zzfha(), (zzdcz) this.zzg.zzb());
    }
}
