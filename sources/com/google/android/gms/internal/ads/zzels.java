package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzels implements zzehr {
    private final Context zza;
    private final Executor zzb;
    private final zzdrm zzc;

    public zzels(Context context, Executor executor, zzdrm zzdrmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        zzdri zze = this.zzc.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdrj(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z8, Context context, zzczy zzczyVar) {
                zzeho zzehoVar2 = zzeho.this;
                try {
                    ((zzfim) zzehoVar2.zzb).zzv(z8);
                    ((zzfim) zzehoVar2.zzb).zzz(context);
                } catch (zzfhv e4) {
                    throw new zzdjo(e4.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzb);
        ((zzejh) zzehoVar.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            zzfho zzfhoVar = zzfhfVar.zza.zza;
            if (zzfhoVar.zzo.zza == 3) {
                ((zzfim) zzehoVar.zzb).zzr(this.zza, zzfhoVar.zzd, zzfgtVar.zzw.toString(), (zzbrl) zzehoVar.zzc);
            } else {
                ((zzfim) zzehoVar.zzb).zzq(this.zza, zzfhoVar.zzd, zzfgtVar.zzw.toString(), (zzbrl) zzehoVar.zzc);
            }
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzehoVar.zza)), e4);
        }
    }
}
