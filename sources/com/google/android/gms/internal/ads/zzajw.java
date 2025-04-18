package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzajw {
    private zzadx zzb;
    private zzacu zzc;
    private zzajr zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajp zza = new zzajp();
    private zzajt zzj = new zzajt();

    public abstract long zza(zzed zzedVar);

    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzajt();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzed zzedVar, long j3, zzajt zzajtVar) throws IOException;

    public final int zze(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        boolean z10;
        zzdb.zzb(this.zzb);
        int i10 = zzen.zza;
        int i11 = this.zzh;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -1;
                }
                long zzd = this.zzd.zzd(zzacsVar);
                if (zzd >= 0) {
                    zzadnVar.zza = zzd;
                    return 1;
                }
                if (zzd < -1) {
                    zzi(-(zzd + 2));
                }
                if (!this.zzl) {
                    zzadq zze = this.zzd.zze();
                    zzdb.zzb(zze);
                    this.zzc.zzO(zze);
                    this.zzl = true;
                }
                if (this.zzk <= 0 && !this.zza.zze(zzacsVar)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzed zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j3 = this.zzg;
                    if (j3 + zza2 >= this.zze) {
                        long zzf = zzf(j3);
                        this.zzb.zzq(zza, zza.zze());
                        this.zzb.zzs(zzf, 1, zza.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
            } else {
                zzacsVar.zzk((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
        } else {
            while (this.zza.zze(zzacsVar)) {
                long zzf2 = zzacsVar.zzf();
                long j10 = this.zzf;
                this.zzk = zzf2 - j10;
                if (zzc(this.zza.zza(), j10, this.zzj)) {
                    this.zzf = zzacsVar.zzf();
                } else {
                    zzad zzadVar = this.zzj.zza;
                    this.zzi = zzadVar.zzD;
                    if (!this.zzm) {
                        this.zzb.zzl(zzadVar);
                        this.zzm = true;
                    }
                    zzajr zzajrVar = this.zzj.zzb;
                    if (zzajrVar != null) {
                        this.zzd = zzajrVar;
                    } else if (zzacsVar.zzd() == -1) {
                        this.zzd = new zzaju(null);
                    } else {
                        zzajq zzb = this.zza.zzb();
                        if ((zzb.zza & 4) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zzd = new zzajl(this, this.zzf, zzacsVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, z10);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        return 0;
    }

    public final long zzf(long j3) {
        return (j3 * 1000000) / this.zzi;
    }

    public final long zzg(long j3) {
        return (this.zzi * j3) / 1000000;
    }

    public final void zzh(zzacu zzacuVar, zzadx zzadxVar) {
        this.zzc = zzacuVar;
        this.zzb = zzadxVar;
        zzb(true);
    }

    public void zzi(long j3) {
        this.zzg = j3;
    }

    public final void zzj(long j3, long j10) {
        this.zza.zzc();
        if (j3 == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long zzg = zzg(j10);
            this.zze = zzg;
            zzajr zzajrVar = this.zzd;
            int i10 = zzen.zza;
            zzajrVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
