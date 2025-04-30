package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeia implements zzehr {
    private final Context zza;
    private final zzcrt zzb;
    private final Executor zzc;

    public zzeia(Context context, zzcrt zzcrtVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcrtVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        zzcrq zza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdik(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z8, Context context, zzczy zzczyVar) {
                zzeho zzehoVar2 = zzeho.this;
                try {
                    ((zzfim) zzehoVar2.zzb).zzv(z8);
                    ((zzfim) zzehoVar2.zzb).zzw(context);
                } catch (zzfhv e4) {
                    throw new zzdjo(e4.getCause());
                }
            }
        }, null), new zzcrr(zzfgtVar.zzab));
        zza.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzc);
        ((zzejh) zzehoVar.zzc).zzc(zza.zzk());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        zzfim zzfimVar = (zzfim) zzehoVar.zzb;
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        zzfimVar.zzl(this.zza, zzfhoVar.zzd, zzfgtVar.zzw.toString(), (zzbrl) zzehoVar.zzc);
    }
}
