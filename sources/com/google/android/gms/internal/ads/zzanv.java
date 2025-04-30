package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzanv implements zzaoc {
    private final zzft zza;
    private final zzfu zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzafa zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzan zzk;
    private int zzl;
    private long zzm;

    public zzanv() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        boolean z8;
        boolean z9;
        zzeq.zzb(this.zzf);
        while (zzfuVar.zzb() > 0) {
            int i9 = this.zzg;
            boolean z10 = true;
            if (i9 != 0) {
                if (i9 != 1) {
                    int min = Math.min(zzfuVar.zzb(), this.zzl - this.zzh);
                    this.zzf.zzq(zzfuVar, min);
                    int i10 = this.zzh + min;
                    this.zzh = i10;
                    if (i10 == this.zzl) {
                        if (this.zzm == C.TIME_UNSET) {
                            z10 = false;
                        }
                        zzeq.zzf(z10);
                        this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                        this.zzm += this.zzj;
                        this.zzg = 0;
                    }
                } else {
                    byte[] zzM = this.zzb.zzM();
                    int min2 = Math.min(zzfuVar.zzb(), 16 - this.zzh);
                    zzfuVar.zzG(zzM, this.zzh, min2);
                    int i11 = this.zzh + min2;
                    this.zzh = i11;
                    if (i11 == 16) {
                        this.zza.zzk(0);
                        zzacv zza = zzacw.zza(this.zza);
                        zzan zzanVar = this.zzk;
                        if (zzanVar == null || zzanVar.zzA != 2 || zza.zza != zzanVar.zzB || !"audio/ac4".equals(zzanVar.zzn)) {
                            zzal zzalVar = new zzal();
                            zzalVar.zzK(this.zze);
                            zzalVar.zzX("audio/ac4");
                            zzalVar.zzy(2);
                            zzalVar.zzY(zza.zza);
                            zzalVar.zzO(this.zzc);
                            zzalVar.zzV(this.zzd);
                            zzan zzad = zzalVar.zzad();
                            this.zzk = zzad;
                            this.zzf.zzl(zzad);
                        }
                        this.zzl = zza.zzb;
                        this.zzj = (zza.zzc * 1000000) / this.zzk.zzB;
                        this.zzb.zzK(0);
                        this.zzf.zzq(this.zzb, 16);
                        this.zzg = 2;
                    }
                }
            } else {
                while (zzfuVar.zzb() > 0) {
                    if (!this.zzi) {
                        if (zzfuVar.zzm() == 172) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.zzi = z8;
                    } else {
                        int zzm = zzfuVar.zzm();
                        if (zzm == 172) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.zzi = z9;
                        byte b = 64;
                        if (zzm != 64) {
                            if (zzm == 65) {
                                zzm = 65;
                            }
                        }
                        this.zzg = 1;
                        zzfu zzfuVar2 = this.zzb;
                        zzfuVar2.zzM()[0] = -84;
                        if (zzm == 65) {
                            b = 65;
                        }
                        zzfuVar2.zzM()[1] = b;
                        this.zzh = 2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zze = zzapoVar.zzb();
        this.zzf = zzadxVar.zzw(zzapoVar.zza(), 1);
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
        this.zzi = false;
        this.zzm = C.TIME_UNSET;
    }

    public zzanv(@Nullable String str, int i9) {
        zzft zzftVar = new zzft(new byte[16], 16);
        this.zza = zzftVar;
        this.zzb = new zzfu(zzftVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i9;
    }
}
