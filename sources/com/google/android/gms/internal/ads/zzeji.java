package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeji implements zzefh {
    private final Context zza;
    private final Executor zzb;
    private final zzdow zzc;

    public zzeji(Context context, Executor executor, zzdow zzdowVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        zzdos zze = this.zzc.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdot(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzejh
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
                zzefe zzefeVar2 = zzefe.this;
                try {
                    ((zzfgm) zzefeVar2.zzb).zzv(z10);
                    ((zzfgm) zzefeVar2.zzb).zzz(context);
                } catch (zzffv e2) {
                    throw new zzdgu(e2.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzb);
        ((zzegx) zzefeVar.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            zzffo zzffoVar = zzfffVar.zza.zza;
            if (zzffoVar.zzo.zza == 3) {
                ((zzfgm) zzefeVar.zzb).zzr(this.zza, zzffoVar.zzd, zzfetVar.zzv.toString(), (zzbpm) zzefeVar.zzc);
            } else {
                ((zzfgm) zzefeVar.zzb).zzq(this.zza, zzffoVar.zzd, zzfetVar.zzv.toString(), (zzbpm) zzefeVar.zzc);
            }
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefeVar.zza)), e2);
        }
    }
}
