package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzejf implements zzehl {
    private final zzctg zza;
    private final zzeim zzb;
    private final zzgge zzc;
    private final zzczn zzd;
    private final ScheduledExecutorService zze;
    private final zzdux zzf;

    public zzejf(zzctg zzctgVar, zzeim zzeimVar, zzczn zzcznVar, ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar, zzdux zzduxVar) {
        this.zza = zzctgVar;
        this.zzb = zzeimVar;
        this.zzd = zzcznVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzggeVar;
        this.zzf = zzduxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzejd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzejf.this.zzc(zzfhfVar, zzfgtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        Object obj;
        zzbjm zza = zzfhfVar.zza.zza.zza();
        boolean zzb = this.zzb.zzb(zzfhfVar, zzfgtVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlV)).booleanValue()) {
            zzdux zzduxVar = this.zzf;
            String str = "0";
            if (zza == null) {
                obj = "0";
            } else {
                obj = "1";
            }
            zzduxVar.zzb().put("has_dbl", obj);
            zzdux zzduxVar2 = this.zzf;
            if (true == zzb) {
                str = "1";
            }
            zzduxVar2.zzb().put("crdb", str);
        }
        if (zza != null && zzb) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ zzcsf zzc(final zzfhf zzfhfVar, final zzfgt zzfgtVar) throws Exception {
        return this.zza.zzb(new zzcvf(zzfhfVar, zzfgtVar, null), new zzctx(zzfhfVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // java.lang.Runnable
            public final void run() {
                zzejf.this.zzf(zzfhfVar, zzfgtVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzgft.zzr(zzgft.zzo(this.zzb.zza(zzfhfVar, zzfgtVar), zzfgtVar.zzS, TimeUnit.SECONDS, this.zze), new zzeje(this), this.zzc);
    }
}
