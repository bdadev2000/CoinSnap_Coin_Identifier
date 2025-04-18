package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeii extends zzeik {
    private final zzchk zza;
    private final zzdhe zzb;
    private final zzcvu zzc;
    private final zzdcf zzd;
    private final zzeiv zze;
    private final zzefg zzf;

    public zzeii(zzchk zzchkVar, zzdhe zzdheVar, zzcvu zzcvuVar, zzdcf zzdcfVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzdheVar;
        this.zzc = zzcvuVar;
        this.zzd = zzdcfVar;
        this.zze = zzeivVar;
        this.zzf = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final ua.b zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzc;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdG)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzc;
        zzdhi zzh = zzchkVar.zzh();
        zzh.zzf(zzcvuVar2.zzj());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcpa(null));
        zzcsy zza = zzh.zzg().zza();
        return zza.zzi(zza.zzj());
    }
}
