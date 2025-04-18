package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbyp extends zzbyw {
    private final Clock zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;
    private final zzhgg zzj;

    public /* synthetic */ zzbyp(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyv zzbyvVar, zzbyq zzbyqVar) {
        this.zzb = clock;
        zzhfx zza = zzhfy.zza(context);
        this.zzc = zza;
        zzhfx zza2 = zzhfy.zza(zzgVar);
        this.zzd = zza2;
        this.zze = zzhfw.zzc(new zzbyj(zza, zza2));
        zzhfx zza3 = zzhfy.zza(clock);
        this.zzf = zza3;
        zzhfx zza4 = zzhfy.zza(zzbyvVar);
        this.zzg = zza4;
        zzhgg zzc = zzhfw.zzc(new zzbyl(zza3, zza2, zza4));
        this.zzh = zzc;
        zzbyn zzbynVar = new zzbyn(zza3, zzc);
        this.zzi = zzbynVar;
        this.zzj = zzhfw.zzc(new zzbzb(zza, zzbynVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final zzbyi zza() {
        return (zzbyi) this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final zzbym zzb() {
        return new zzbym(this.zzb, (zzbyk) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final zzbza zzc() {
        return (zzbza) this.zzj.zzb();
    }
}
