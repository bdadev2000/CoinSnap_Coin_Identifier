package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzehm implements zzefh {
    private final Context zza;
    private final zzdgn zzb;

    public zzehm(Context context, zzdgn zzdgnVar) {
        this.zza = context;
        this.zzb = zzdgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        zzehg zzehgVar = new zzehg(zzfetVar, (zzbrf) zzefeVar.zzb, AdFormat.INTERSTITIAL);
        zzdfk zze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdfn(zzehgVar, null));
        zzehgVar.zzb(zze.zzc());
        ((zzegx) zzefeVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            ((zzbrf) zzefeVar.zzb).zzl(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehk(this, zzefeVar, null), (zzbpm) zzefeVar.zzc);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e2);
            throw new zzffv(e2);
        }
    }
}
