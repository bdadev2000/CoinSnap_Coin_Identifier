package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzefu implements zzefh {
    private final Context zza;
    private final zzcor zzb;

    public zzefu(Context context, zzcor zzcorVar) {
        this.zza = context;
        this.zzb = zzcorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        zzehg zzehgVar = new zzehg(zzfetVar, (zzbrf) zzefeVar.zzb, AdFormat.APP_OPEN_AD);
        zzcoo zza = this.zzb.zza(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdfn(zzehgVar, null), new zzcop(zzfetVar.zzaa));
        zzehgVar.zzb(zza.zzc());
        ((zzegx) zzefeVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            ((zzbrf) zzefeVar.zzb).zzi(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefs(zzefeVar, null), (zzbpm) zzefeVar.zzc);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e2);
            throw new zzffv(e2);
        }
    }
}
