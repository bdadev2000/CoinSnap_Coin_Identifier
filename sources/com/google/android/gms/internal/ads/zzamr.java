package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzamr implements zzamz {
    private final zzej zza;
    private final zzek zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzaeh zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzaf zzk;
    private int zzl;
    private long zzm;

    public zzamr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i2 = this.zzg;
            if (i2 == 0) {
                while (true) {
                    if (zzekVar.zzb() <= 0) {
                        break;
                    }
                    if (this.zzi) {
                        int zzm = zzekVar.zzm();
                        if (zzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzek zzekVar2 = this.zzb;
                            zzekVar2.zzN()[0] = 11;
                            zzekVar2.zzN()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        this.zzi = zzm == 11;
                    } else {
                        this.zzi = zzekVar.zzm() == 11;
                    }
                }
            } else if (i2 != 1) {
                int min = Math.min(zzekVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzq(zzekVar, min);
                int i3 = this.zzh + min;
                this.zzh = i3;
                if (i3 == this.zzl) {
                    zzdi.zzf(this.zzm != -9223372036854775807L);
                    this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] zzN = this.zzb.zzN();
                int min2 = Math.min(zzekVar.zzb(), 128 - this.zzh);
                zzekVar.zzH(zzN, this.zzh, min2);
                int i4 = this.zzh + min2;
                this.zzh = i4;
                if (i4 == 128) {
                    this.zza.zzl(0);
                    zzaca zze = zzacb.zze(this.zza);
                    zzaf zzafVar = this.zzk;
                    if (zzafVar == null || zze.zzc != zzafVar.zzB || zze.zzb != zzafVar.zzC || !Objects.equals(zze.zza, zzafVar.zzn)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzL(this.zze);
                        zzadVar.zzZ(zze.zza);
                        zzadVar.zzz(zze.zzc);
                        zzadVar.zzaa(zze.zzb);
                        zzadVar.zzP(this.zzc);
                        zzadVar.zzX(this.zzd);
                        zzadVar.zzU(zze.zzf);
                        if ("audio/ac3".equals(zze.zza)) {
                            zzadVar.zzy(zze.zzf);
                        }
                        zzaf zzaf = zzadVar.zzaf();
                        this.zzk = zzaf;
                        this.zzf.zzl(zzaf);
                    }
                    this.zzl = zze.zzd;
                    this.zzj = (zze.zze * 1000000) / this.zzk.zzC;
                    this.zzb.zzL(0);
                    this.zzf.zzq(this.zzb, 128);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zze = zzaonVar.zzb();
        this.zzf = zzadeVar.zzw(zzaonVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzm = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }

    public zzamr(@Nullable String str, int i2) {
        zzej zzejVar = new zzej(new byte[128], 128);
        this.zza = zzejVar;
        this.zzb = new zzek(zzejVar.zza);
        this.zzg = 0;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i2;
    }
}
