package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzemo implements zzehr {
    private final Context zza;
    private final Executor zzb;
    private final zzdrm zzc;

    public zzemo(Context context, Executor executor, zzdrm zzdrmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdrmVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzemo zzemoVar) {
        return zzemoVar.zzb;
    }

    public static final void zze(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) {
        try {
            ((zzfim) zzehoVar.zzb).zzk(zzfhfVar.zza.zza.zzd, zzfgtVar.zzw.toString());
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzehoVar.zza)), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        zzdri zze = this.zzc.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdrj(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzemk
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z8, Context context, zzczy zzczyVar) {
                zzeho zzehoVar2 = zzeho.this;
                try {
                    ((zzfim) zzehoVar2.zzb).zzv(z8);
                    ((zzfim) zzehoVar2.zzb).zzA();
                } catch (zzfhv e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot show rewarded video.", e4);
                    throw new zzdjo(e4.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzb);
        zzdas zze2 = zze.zze();
        zzczj zzb = zze.zzb();
        ((zzeji) zzehoVar.zzc).zzc(new zzemn(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        if (!((zzfim) zzehoVar.zzb).zzC()) {
            ((zzeji) zzehoVar.zzc).zzd(new zzemm(this, zzfhfVar, zzfgtVar, zzehoVar));
            Object obj = zzehoVar.zzb;
            Context context = this.zza;
            zzfho zzfhoVar = zzfhfVar.zza.zza;
            ((zzfim) obj).zzh(context, zzfhoVar.zzd, null, (zzbys) zzehoVar.zzc, zzfgtVar.zzw.toString());
            return;
        }
        zze(zzfhfVar, zzfgtVar, zzehoVar);
    }
}
