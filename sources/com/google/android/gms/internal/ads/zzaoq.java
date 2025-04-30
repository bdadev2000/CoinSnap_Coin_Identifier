package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaoq implements zzaoc {
    private final zzfu zza;
    private final zzaen zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private zzafa zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzaoq() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        boolean z8;
        boolean z9;
        zzeq.zzb(this.zze);
        while (zzfuVar.zzb() > 0) {
            int i9 = this.zzg;
            boolean z10 = true;
            if (i9 != 0) {
                if (i9 != 1) {
                    int min = Math.min(zzfuVar.zzb(), this.zzl - this.zzh);
                    this.zze.zzq(zzfuVar, min);
                    int i10 = this.zzh + min;
                    this.zzh = i10;
                    if (i10 >= this.zzl) {
                        if (this.zzm == C.TIME_UNSET) {
                            z10 = false;
                        }
                        zzeq.zzf(z10);
                        this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                        this.zzm += this.zzk;
                        this.zzh = 0;
                        this.zzg = 0;
                    }
                } else {
                    int min2 = Math.min(zzfuVar.zzb(), 4 - this.zzh);
                    zzfuVar.zzG(this.zza.zzM(), this.zzh, min2);
                    int i11 = this.zzh + min2;
                    this.zzh = i11;
                    if (i11 >= 4) {
                        this.zza.zzK(0);
                        if (!this.zzb.zza(this.zza.zzg())) {
                            this.zzh = 0;
                            this.zzg = 1;
                        } else {
                            this.zzl = this.zzb.zzc;
                            if (!this.zzi) {
                                this.zzk = (r0.zzg * 1000000) / r0.zzd;
                                zzal zzalVar = new zzal();
                                zzalVar.zzK(this.zzf);
                                zzalVar.zzX(this.zzb.zzb);
                                zzalVar.zzP(4096);
                                zzalVar.zzy(this.zzb.zze);
                                zzalVar.zzY(this.zzb.zzd);
                                zzalVar.zzO(this.zzc);
                                zzalVar.zzV(this.zzd);
                                this.zze.zzl(zzalVar.zzad());
                                this.zzi = true;
                            }
                            this.zza.zzK(0);
                            this.zze.zzq(this.zza, 4);
                            this.zzg = 2;
                        }
                    }
                }
            } else {
                byte[] zzM = zzfuVar.zzM();
                int zzd = zzfuVar.zzd();
                int zze = zzfuVar.zze();
                while (true) {
                    if (zzd < zze) {
                        int i12 = zzd + 1;
                        byte b = zzM[zzd];
                        if ((b & 255) == 255) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (this.zzj && (b & 224) == 224) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.zzj = z8;
                        if (z9) {
                            zzfuVar.zzK(i12);
                            this.zzj = false;
                            this.zza.zzM()[1] = zzM[zzd];
                            this.zzh = 2;
                            this.zzg = 1;
                            break;
                        }
                        zzd = i12;
                    } else {
                        zzfuVar.zzK(zze);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzf = zzapoVar.zzb();
        this.zze = zzadxVar.zzw(zzapoVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzm = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = C.TIME_UNSET;
    }

    public zzaoq(@Nullable String str, int i9) {
        this.zzg = 0;
        zzfu zzfuVar = new zzfu(4);
        this.zza = zzfuVar;
        zzfuVar.zzM()[0] = -1;
        this.zzb = new zzaen();
        this.zzm = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i9;
    }
}
