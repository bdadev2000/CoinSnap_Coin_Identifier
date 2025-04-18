package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzehi implements zzefh {
    private final Context zza;
    private final zzdgn zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzehi(Context context, VersionInfoParcel versionInfoParcel, zzdgn zzdgnVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdgnVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        zzdfk zze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdfn(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzehh
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
                zzehi.this.zzc(zzefeVar, z10, context, zzcwzVar);
            }
        }, null));
        zze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzd);
        ((zzegx) zzefeVar.zzc).zzc(zze.zzk());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        zzfgm zzfgmVar = (zzfgm) zzefeVar.zzb;
        zzffo zzffoVar = zzfffVar.zza.zza;
        String jSONObject = zzfetVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbr.zzm(zzfetVar.zzs);
        zzfgmVar.zzo(this.zza, zzffoVar.zzd, jSONObject, zzm, (zzbpm) zzefeVar.zzc);
    }

    public final /* synthetic */ void zzc(zzefe zzefeVar, boolean z10, Context context, zzcwz zzcwzVar) throws zzdgu {
        try {
            ((zzfgm) zzefeVar.zzb).zzv(z10);
            if (this.zzc.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaP)).intValue()) {
                ((zzfgm) zzefeVar.zzb).zzx();
            } else {
                ((zzfgm) zzefeVar.zzb).zzy(context);
            }
        } catch (zzffv e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Cannot show interstitial.");
            throw new zzdgu(e2.getCause());
        }
    }
}
