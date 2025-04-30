package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaoz {
    private final zzaoc zza;
    private final zzgb zzb;
    private final zzft zzc = new zzft(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaoz(zzaoc zzaocVar, zzgb zzgbVar) {
        this.zza = zzaocVar;
        this.zzb = zzgbVar;
    }

    public final void zza(zzfu zzfuVar) throws zzch {
        long j7;
        char c9;
        zzfuVar.zzG(this.zzc.zza, 0, 3);
        this.zzc.zzk(0);
        this.zzc.zzm(8);
        this.zzd = this.zzc.zzo();
        this.zze = this.zzc.zzo();
        this.zzc.zzm(6);
        zzft zzftVar = this.zzc;
        zzfuVar.zzG(zzftVar.zza, 0, zzftVar.zzd(8));
        this.zzc.zzk(0);
        if (this.zzd) {
            this.zzc.zzm(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzm(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzm(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzm(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzm(4);
                this.zzc.zzm(1);
                int zzd4 = this.zzc.zzd(15) << 15;
                this.zzc.zzm(1);
                long zzd5 = this.zzc.zzd(15);
                this.zzc.zzm(1);
                this.zzb.zzb(zzd4 | (this.zzc.zzd(3) << 30) | zzd5);
                this.zzf = true;
                c9 = 30;
            } else {
                c9 = 30;
            }
            j7 = this.zzb.zzb((zzd << c9) | zzd2 | zzd3);
        } else {
            j7 = 0;
        }
        this.zza.zzd(j7, 4);
        this.zza.zza(zzfuVar);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
