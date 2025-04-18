package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzejm implements zzefh {
    private final Context zza;
    private final zzdow zzb;

    public zzejm(Context context, zzdow zzdowVar) {
        this.zza = context;
        this.zzb = zzdowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        zzehg zzehgVar = new zzehg(zzfetVar, (zzbrf) zzefeVar.zzb, AdFormat.REWARDED);
        zzdos zze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdot(zzehgVar));
        zzehgVar.zzb(zze.zzc());
        ((zzegx) zzefeVar.zzc).zzc(zze.zzo());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            zzejl zzejlVar = null;
            if (zzfffVar.zza.zza.zzo.zza == 3) {
                ((zzbrf) zzefeVar.zzb).zzo(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejk(this, zzefeVar, zzejlVar), (zzbpm) zzefeVar.zzc);
            } else {
                ((zzbrf) zzefeVar.zzb).zzp(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejk(this, zzefeVar, zzejlVar), (zzbpm) zzefeVar.zzc);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e2);
        }
    }
}
