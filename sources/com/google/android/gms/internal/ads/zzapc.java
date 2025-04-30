package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzapc implements zzapp {
    private final zzapb zza;
    private final zzfu zzb = new zzfu(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzapc(zzapb zzapbVar) {
        this.zza = zzapbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zza(zzfu zzfuVar, int i9) {
        int i10;
        boolean z8;
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = zzfuVar.zzd() + zzfuVar.zzm();
        } else {
            i10 = -1;
        }
        if (this.zzf) {
            if (i11 != 0) {
                this.zzf = false;
                zzfuVar.zzK(i10);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzfuVar.zzb() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int zzm = zzfuVar.zzm();
                    zzfuVar.zzK(zzfuVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzfuVar.zzb(), 3 - this.zzd);
                zzfuVar.zzG(this.zzb.zzM(), this.zzd, min);
                int i13 = this.zzd + min;
                this.zzd = i13;
                if (i13 == 3) {
                    this.zzb.zzK(0);
                    this.zzb.zzJ(3);
                    this.zzb.zzL(1);
                    zzfu zzfuVar2 = this.zzb;
                    int zzm2 = zzfuVar2.zzm();
                    if ((zzm2 & 128) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int zzm3 = zzfuVar2.zzm();
                    this.zze = z8;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i14 = this.zzc;
                    if (zzc < i14) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzE(Math.min(4098, Math.max(i14, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzfuVar.zzb(), this.zzc - i12);
                zzfuVar.zzG(this.zzb.zzM(), this.zzd, min2);
                int i15 = this.zzd + min2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzgd.zze(this.zzb.zzM(), 0, i16, -1) == 0) {
                            this.zzb.zzJ(this.zzc - 4);
                        } else {
                            this.zzf = true;
                            return;
                        }
                    } else {
                        this.zzb.zzJ(i16);
                    }
                    this.zzb.zzK(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
        this.zza.zzb(zzgbVar, zzadxVar, zzapoVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzc() {
        this.zzf = true;
    }
}
