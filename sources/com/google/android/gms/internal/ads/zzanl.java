package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzanl {
    private final zzamm zza;
    private final zzek zzb;
    private final zzec zzc = new zzec(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzanl(zzamm zzammVar, zzek zzekVar) {
        this.zza = zzammVar;
        this.zzb = zzekVar;
    }

    public final void zza(zzed zzedVar) throws zzbh {
        long j3;
        long j10;
        zzedVar.zzH(this.zzc.zza, 0, 3);
        this.zzc.zzl(0);
        this.zzc.zzn(8);
        this.zzd = this.zzc.zzp();
        this.zze = this.zzc.zzp();
        this.zzc.zzn(6);
        zzec zzecVar = this.zzc;
        zzedVar.zzH(zzecVar.zza, 0, zzecVar.zzd(8));
        this.zzc.zzl(0);
        if (this.zzd) {
            this.zzc.zzn(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzn(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzn(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzn(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzn(4);
                this.zzc.zzn(1);
                int zzd4 = this.zzc.zzd(15) << 15;
                this.zzc.zzn(1);
                j10 = zzd;
                long zzd5 = this.zzc.zzd(15);
                this.zzc.zzn(1);
                this.zzb.zzb(zzd4 | (this.zzc.zzd(3) << 30) | zzd5);
                this.zzf = true;
            } else {
                j10 = zzd;
            }
            j3 = this.zzb.zzb((j10 << 30) | zzd2 | zzd3);
        } else {
            j3 = 0;
        }
        this.zza.zzd(j3, 4);
        this.zza.zza(zzedVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
