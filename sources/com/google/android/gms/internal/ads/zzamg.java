package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzamg implements zzamm {
    private final zzec zza;
    private final zzed zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadx zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzad zzk;
    private int zzl;
    private long zzm;

    public zzamg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        boolean z10;
        boolean z11;
        zzdb.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i10 = this.zzg;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    int min = Math.min(zzedVar.zzb(), this.zzl - this.zzh);
                    this.zzf.zzq(zzedVar, min);
                    int i11 = this.zzh + min;
                    this.zzh = i11;
                    if (i11 == this.zzl) {
                        if (this.zzm == C.TIME_UNSET) {
                            z12 = false;
                        }
                        zzdb.zzf(z12);
                        this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                        this.zzm += this.zzj;
                        this.zzg = 0;
                    }
                } else {
                    byte[] zzN = this.zzb.zzN();
                    int min2 = Math.min(zzedVar.zzb(), 16 - this.zzh);
                    zzedVar.zzH(zzN, this.zzh, min2);
                    int i12 = this.zzh + min2;
                    this.zzh = i12;
                    if (i12 == 16) {
                        this.zza.zzl(0);
                        zzabs zza = zzabu.zza(this.zza);
                        zzad zzadVar = this.zzk;
                        if (zzadVar == null || zzadVar.zzC != 2 || zza.zza != zzadVar.zzD || !"audio/ac4".equals(zzadVar.zzo)) {
                            zzab zzabVar = new zzab();
                            zzabVar.zzL(this.zze);
                            zzabVar.zzZ("audio/ac4");
                            zzabVar.zzz(2);
                            zzabVar.zzaa(zza.zza);
                            zzabVar.zzP(this.zzc);
                            zzabVar.zzX(this.zzd);
                            zzad zzaf = zzabVar.zzaf();
                            this.zzk = zzaf;
                            this.zzf.zzl(zzaf);
                        }
                        this.zzl = zza.zzb;
                        this.zzj = (zza.zzc * 1000000) / this.zzk.zzD;
                        this.zzb.zzL(0);
                        this.zzf.zzq(this.zzb, 16);
                        this.zzg = 2;
                    }
                }
            } else {
                while (zzedVar.zzb() > 0) {
                    if (!this.zzi) {
                        if (zzedVar.zzm() == 172) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zzi = z10;
                    } else {
                        int zzm = zzedVar.zzm();
                        if (zzm == 172) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.zzi = z11;
                        byte b3 = 64;
                        if (zzm != 64) {
                            if (zzm == 65) {
                                zzm = 65;
                            }
                        }
                        this.zzg = 1;
                        zzed zzedVar2 = this.zzb;
                        zzedVar2.zzN()[0] = -84;
                        if (zzm == 65) {
                            b3 = 65;
                        }
                        zzedVar2.zzN()[1] = b3;
                        this.zzh = 2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zze = zzaoaVar.zzb();
        this.zzf = zzacuVar.zzw(zzaoaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzm = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = C.TIME_UNSET;
    }

    public zzamg(@Nullable String str, int i10) {
        zzec zzecVar = new zzec(new byte[16], 16);
        this.zza = zzecVar;
        this.zzb = new zzed(zzecVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i10;
    }
}
