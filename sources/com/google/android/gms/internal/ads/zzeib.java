package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzeib implements zzefh {
    private final Context zza;
    private final zzdhj zzb;
    private zzbpv zzc;
    private final VersionInfoParcel zzd;

    public zzeib(Context context, zzdhj zzdhjVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdhjVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        if (zzfffVar.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdiy zzt = zzdiy.zzt(this.zzc);
            zzffo zzffoVar = zzfffVar.zza.zza;
            if (zzffoVar.zzg.contains(Integer.toString(zzt.zzc()))) {
                zzdja zze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdjk(zzt), new zzdlb(null, null, this.zzc));
                ((zzegx) zzefeVar.zzc).zzc(zze.zzj());
                return zze.zza();
            }
            throw new zzeiz(1, "No corresponding native ad listener");
        }
        throw new zzeiz(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbN)).intValue()) {
                ((zzbrf) zzefeVar.zzb).zzm(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehz(this, zzefeVar, null), (zzbpm) zzefeVar.zzc);
            } else {
                ((zzbrf) zzefeVar.zzb).zzn(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehz(this, zzefeVar, null), (zzbpm) zzefeVar.zzc, zzfffVar.zza.zza.zzi);
            }
        } catch (RemoteException e2) {
            throw new zzffv(e2);
        }
    }
}
