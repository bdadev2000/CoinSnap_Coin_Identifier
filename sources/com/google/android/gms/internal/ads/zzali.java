package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzali {
    private zzafa zzb;
    private zzadx zzc;
    private zzald zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzalb zza = new zzalb();
    private zzalf zzj = new zzalf();

    public abstract long zza(zzfu zzfuVar);

    public void zzb(boolean z8) {
        int i9;
        if (z8) {
            this.zzj = new zzalf();
            this.zzf = 0L;
            i9 = 0;
        } else {
            i9 = 1;
        }
        this.zzh = i9;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzfu zzfuVar, long j7, zzalf zzalfVar) throws IOException;

    public final int zze(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        boolean z8;
        zzeq.zzb(this.zzb);
        int i9 = zzgd.zza;
        int i10 = this.zzh;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -1;
                }
                long zzd = this.zzd.zzd(zzadvVar);
                if (zzd >= 0) {
                    zzaeqVar.zza = zzd;
                    return 1;
                }
                if (zzd < -1) {
                    zzi(-(zzd + 2));
                }
                if (!this.zzl) {
                    zzaet zze = this.zzd.zze();
                    zzeq.zzb(zze);
                    this.zzc.zzO(zze);
                    this.zzl = true;
                }
                if (this.zzk <= 0 && !this.zza.zze(zzadvVar)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzfu zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j7 = this.zzg;
                    if (j7 + zza2 >= this.zze) {
                        long zzf = zzf(j7);
                        zzaey.zzb(this.zzb, zza, zza.zze());
                        this.zzb.zzs(zzf, 1, zza.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
            } else {
                ((zzadi) zzadvVar).zzo((int) this.zzf, false);
                this.zzh = 2;
                return 0;
            }
        } else {
            while (this.zza.zze(zzadvVar)) {
                long zzf2 = zzadvVar.zzf();
                long j9 = this.zzf;
                this.zzk = zzf2 - j9;
                if (zzc(this.zza.zza(), j9, this.zzj)) {
                    this.zzf = zzadvVar.zzf();
                } else {
                    zzan zzanVar = this.zzj.zza;
                    this.zzi = zzanVar.zzB;
                    if (!this.zzm) {
                        this.zzb.zzl(zzanVar);
                        this.zzm = true;
                    }
                    zzald zzaldVar = this.zzj.zzb;
                    if (zzaldVar != null) {
                        this.zzd = zzaldVar;
                    } else if (zzadvVar.zzd() == -1) {
                        this.zzd = new zzalh(null);
                    } else {
                        zzalc zzb = this.zza.zzb();
                        if ((zzb.zza & 4) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.zzd = new zzakw(this, this.zzf, zzadvVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, z8);
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

    public final long zzf(long j7) {
        return (j7 * 1000000) / this.zzi;
    }

    public final long zzg(long j7) {
        return (this.zzi * j7) / 1000000;
    }

    public final void zzh(zzadx zzadxVar, zzafa zzafaVar) {
        this.zzc = zzadxVar;
        this.zzb = zzafaVar;
        zzb(true);
    }

    public void zzi(long j7) {
        this.zzg = j7;
    }

    public final void zzj(long j7, long j9) {
        this.zza.zzc();
        if (j7 == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long zzg = zzg(j9);
            this.zze = zzg;
            zzald zzaldVar = this.zzd;
            int i9 = zzgd.zza;
            zzaldVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
