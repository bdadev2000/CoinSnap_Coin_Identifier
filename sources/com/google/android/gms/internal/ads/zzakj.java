package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzakj {
    private zzaeh zzb;
    private zzade zzc;
    private zzake zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzakc zza = new zzakc();
    private zzakg zzj = new zzakg();

    public abstract long zza(zzek zzekVar);

    public void zzb(boolean z2) {
        int i2;
        if (z2) {
            this.zzj = new zzakg();
            this.zzf = 0L;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.zzh = i2;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzek zzekVar, long j2, zzakg zzakgVar) throws IOException;

    public final int zze(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        zzdi.zzb(this.zzb);
        int i2 = zzeu.zza;
        int i3 = this.zzh;
        if (i3 == 0) {
            while (this.zza.zze(zzadcVar)) {
                long zzf = zzadcVar.zzf();
                long j2 = this.zzf;
                this.zzk = zzf - j2;
                if (zzc(this.zza.zza(), j2, this.zzj)) {
                    this.zzf = zzadcVar.zzf();
                } else {
                    zzaf zzafVar = this.zzj.zza;
                    this.zzi = zzafVar.zzC;
                    if (!this.zzm) {
                        this.zzb.zzl(zzafVar);
                        this.zzm = true;
                    }
                    zzake zzakeVar = this.zzj.zzb;
                    if (zzakeVar != null) {
                        this.zzd = zzakeVar;
                    } else if (zzadcVar.zzd() == -1) {
                        this.zzd = new zzaki(null);
                    } else {
                        zzakd zzb = this.zza.zzb();
                        this.zzd = new zzajy(this, this.zzf, zzadcVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        if (i3 == 1) {
            zzadcVar.zzk((int) this.zzf);
            this.zzh = 2;
            return 0;
        }
        if (i3 != 2) {
            return -1;
        }
        long zzd = this.zzd.zzd(zzadcVar);
        if (zzd >= 0) {
            zzadxVar.zza = zzd;
            return 1;
        }
        if (zzd < -1) {
            zzi(-(zzd + 2));
        }
        if (!this.zzl) {
            zzaea zze = this.zzd.zze();
            zzdi.zzb(zze);
            this.zzc.zzO(zze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzadcVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzek zza = this.zza.zza();
        long zza2 = zza(zza);
        if (zza2 >= 0) {
            long j3 = this.zzg;
            if (j3 + zza2 >= this.zze) {
                long zzf2 = zzf(j3);
                this.zzb.zzq(zza, zza.zze());
                this.zzb.zzs(zzf2, 1, zza.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += zza2;
        return 0;
    }

    public final long zzf(long j2) {
        return (j2 * 1000000) / this.zzi;
    }

    public final long zzg(long j2) {
        return (this.zzi * j2) / 1000000;
    }

    public final void zzh(zzade zzadeVar, zzaeh zzaehVar) {
        this.zzc = zzadeVar;
        this.zzb = zzaehVar;
        zzb(true);
    }

    public void zzi(long j2) {
        this.zzg = j2;
    }

    public final void zzj(long j2, long j3) {
        this.zza.zzc();
        if (j2 == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long zzg = zzg(j3);
            this.zze = zzg;
            zzake zzakeVar = this.zzd;
            int i2 = zzeu.zza;
            zzakeVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
