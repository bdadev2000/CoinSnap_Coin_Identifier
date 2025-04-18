package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeir extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzdcf zzc;
    private final zzeiv zzd;
    private final zzffg zze;
    private final zzefg zzf;

    public zzeir(zzchk zzchkVar, zzcvu zzcvuVar, zzdcf zzdcfVar, zzffg zzffgVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzdcfVar;
        this.zze = zzffgVar;
        this.zzd = zzeivVar;
        this.zzf = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final ua.b zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzffg zzffgVar;
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdF)).booleanValue() && (zzffgVar = this.zze) != null) {
            this.zzb.zzh(zzffgVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzdov zzi = zzchkVar.zzi();
        zzi.zzd(zzcvuVar2.zzj());
        zzi.zzc(this.zzc);
        zzcsy zzb = zzi.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
