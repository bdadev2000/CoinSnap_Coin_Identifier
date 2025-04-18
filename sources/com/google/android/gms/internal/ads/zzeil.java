package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeil extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzdcf zzc;
    private final zzeiv zzd;
    private final zzefg zze;

    public zzeil(zzchk zzchkVar, zzcvu zzcvuVar, zzdcf zzdcfVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzdcfVar;
        this.zzd = zzeivVar;
        this.zze = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final ua.b zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzcoq zzd = zzchkVar.zzd();
        zzd.zzd(zzcvuVar2.zzj());
        zzd.zzc(this.zzc);
        zzcsy zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
