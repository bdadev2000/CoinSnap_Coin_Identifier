package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzamt implements zzamz {
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

    public zzamt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i2 = this.zzg;
            if (i2 == 0) {
                while (zzekVar.zzb() > 0) {
                    if (this.zzi) {
                        int zzm = zzekVar.zzm();
                        this.zzi = zzm == 172;
                        if (zzm != 64) {
                            if (zzm == 65) {
                                zzm = 65;
                            }
                        }
                        this.zzg = 1;
                        zzek zzekVar2 = this.zzb;
                        zzekVar2.zzN()[0] = -84;
                        zzekVar2.zzN()[1] = zzm == 65 ? (byte) 65 : (byte) 64;
                        this.zzh = 2;
                    } else {
                        this.zzi = zzekVar.zzm() == 172;
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
                int min2 = Math.min(zzekVar.zzb(), 16 - this.zzh);
                zzekVar.zzH(zzN, this.zzh, min2);
                int i4 = this.zzh + min2;
                this.zzh = i4;
                if (i4 == 16) {
                    this.zza.zzl(0);
                    zzacd zza = zzace.zza(this.zza);
                    zzaf zzafVar = this.zzk;
                    if (zzafVar == null || zzafVar.zzB != 2 || zza.zza != zzafVar.zzC || !"audio/ac4".equals(zzafVar.zzn)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzL(this.zze);
                        zzadVar.zzZ("audio/ac4");
                        zzadVar.zzz(2);
                        zzadVar.zzaa(zza.zza);
                        zzadVar.zzP(this.zzc);
                        zzadVar.zzX(this.zzd);
                        zzaf zzaf = zzadVar.zzaf();
                        this.zzk = zzaf;
                        this.zzf.zzl(zzaf);
                    }
                    this.zzl = zza.zzb;
                    this.zzj = (zza.zzc * 1000000) / this.zzk.zzC;
                    this.zzb.zzL(0);
                    this.zzf.zzq(this.zzb, 16);
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

    public zzamt(@Nullable String str, int i2) {
        zzej zzejVar = new zzej(new byte[16], 16);
        this.zza = zzejVar;
        this.zzb = new zzek(zzejVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i2;
    }
}
