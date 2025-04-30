package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzml implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzmm zzc;

    public zzml(zzmm zzmmVar, long j7, long j9) {
        this.zzc = zzmmVar;
        this.zza = j7;
        this.zzb = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmo
            @Override // java.lang.Runnable
            public final void run() {
                zzml zzmlVar = zzml.this;
                zzmm zzmmVar = zzmlVar.zzc;
                long j7 = zzmlVar.zza;
                long j9 = zzmlVar.zzb;
                zzmmVar.zza.zzt();
                zzmmVar.zza.zzj().zzc().zza("Application going to the background");
                zzmmVar.zza.zzk().zzn.zza(true);
                zzmmVar.zza.zza(true);
                if (!zzmmVar.zza.zze().zzv()) {
                    if (zzmmVar.zza.zze().zza(zzbf.zzch)) {
                        zzmmVar.zza.zza(false, false, j9);
                        zzmmVar.zza.zzb.zzb(j9);
                    } else {
                        zzmmVar.zza.zzb.zzb(j9);
                        zzmmVar.zza.zza(false, false, j9);
                    }
                }
                zzmmVar.zza.zzj().zzn().zza("Application backgrounded at: timestamp_millis", Long.valueOf(j7));
            }
        });
    }
}
