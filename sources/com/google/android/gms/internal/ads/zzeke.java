package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeke implements zzefh {
    private final Context zza;
    private final Executor zzb;
    private final zzdow zzc;

    public zzeke(Context context, Executor executor, zzdow zzdowVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdowVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzeke zzekeVar) {
        return zzekeVar.zzb;
    }

    public static final void zze(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) {
        try {
            ((zzfgm) zzefeVar.zzb).zzk(zzfffVar.zza.zza.zzd, zzfetVar.zzv.toString());
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefeVar.zza)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        zzdos zze = this.zzc.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdot(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
                zzefe zzefeVar2 = zzefe.this;
                try {
                    ((zzfgm) zzefeVar2.zzb).zzv(z10);
                    ((zzfgm) zzefeVar2.zzb).zzA();
                } catch (zzffv e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot show rewarded video.", e2);
                    throw new zzdgu(e2.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzb);
        zzcxt zze2 = zze.zze();
        zzcwk zzb = zze.zzb();
        ((zzegy) zzefeVar.zzc).zzc(new zzekd(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        if (!((zzfgm) zzefeVar.zzb).zzC()) {
            ((zzegy) zzefeVar.zzc).zzd(new zzekc(this, zzfffVar, zzfetVar, zzefeVar));
            Object obj = zzefeVar.zzb;
            Context context = this.zza;
            zzffo zzffoVar = zzfffVar.zza.zza;
            ((zzfgm) obj).zzh(context, zzffoVar.zzd, null, (zzbwu) zzefeVar.zzc, zzfetVar.zzv.toString());
            return;
        }
        zze(zzfffVar, zzfetVar, zzefeVar);
    }
}
