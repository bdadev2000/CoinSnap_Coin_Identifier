package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzefq implements zzefh {
    private final Context zza;
    private final zzcor zzb;
    private final Executor zzc;

    public zzefq(Context context, zzcor zzcorVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcorVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        zzcoo zza = this.zzb.zza(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdfn(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
                zzefe zzefeVar2 = zzefe.this;
                try {
                    ((zzfgm) zzefeVar2.zzb).zzv(z10);
                    ((zzfgm) zzefeVar2.zzb).zzw(context);
                } catch (zzffv e2) {
                    throw new zzdgu(e2.getCause());
                }
            }
        }, null), new zzcop(zzfetVar.zzaa));
        zza.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzc);
        ((zzegx) zzefeVar.zzc).zzc(zza.zzk());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        zzfgm zzfgmVar = (zzfgm) zzefeVar.zzb;
        zzffo zzffoVar = zzfffVar.zza.zza;
        String jSONObject = zzfetVar.zzv.toString();
        zzfgmVar.zzl(this.zza, zzffoVar.zzd, jSONObject, (zzbpm) zzefeVar.zzc);
    }
}
