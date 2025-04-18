package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeip extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzelb zzc;
    private final zzdcf zzd;
    private final zzeiv zze;
    private final zzefg zzf;

    public zzeip(zzchk zzchkVar, zzcvu zzcvuVar, zzelb zzelbVar, zzdcf zzdcfVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzelbVar;
        this.zzd = zzdcfVar;
        this.zze = zzeivVar;
        this.zzf = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final ua.b zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzdgm zzg = zzchkVar.zzg();
        zzg.zze(zzcvuVar2.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcsy zza = zzg.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
