package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzanm implements zzamz {
    private String zze;
    private zzaeh zzf;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzn;
    private int zzo;
    private int zzs;
    private boolean zzu;
    private int zzd = 0;
    private final zzek zza = new zzek(new byte[15], 2);
    private final zzej zzb = new zzej();
    private final zzek zzc = new zzek();
    private final zzann zzp = new zzann();
    private int zzq = -2147483647;
    private int zzr = -1;
    private long zzt = -1;
    private boolean zzj = true;
    private boolean zzm = true;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;

    private static final void zzf(zzek zzekVar, zzek zzekVar2, boolean z2) {
        int zzd = zzekVar.zzd();
        int min = Math.min(zzekVar.zzb(), zzekVar2.zzb());
        zzekVar.zzH(zzekVar2.zzN(), zzekVar2.zzd(), min);
        zzekVar2.zzM(min);
        if (z2) {
            zzekVar.zzL(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzek zzekVar) throws zzbo {
        int i2;
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i3 = this.zzd;
            int i4 = 0;
            if (i3 == 0) {
                int i5 = this.zzk;
                if ((i5 & 2) == 0) {
                    zzekVar.zzL(zzekVar.zze());
                } else {
                    if ((i5 & 4) != 0) {
                        this.zzd = 1;
                        break;
                    }
                    while (zzekVar.zzb() > 0) {
                        int i6 = this.zzl << 8;
                        this.zzl = i6;
                        int zzm = i6 | zzekVar.zzm();
                        this.zzl = zzm;
                        if ((zzm & 16777215) == 12583333) {
                            zzekVar.zzL(zzekVar.zzd() - 3);
                            this.zzl = 0;
                            this.zzd = 1;
                            break;
                            break;
                        }
                    }
                }
            } else if (i3 != 1) {
                int i7 = this.zzp.zza;
                if (i7 == 1 || i7 == 17) {
                    zzf(zzekVar, this.zzc, true);
                }
                int min = Math.min(zzekVar.zzb(), this.zzp.zzc - this.zzn);
                this.zzf.zzq(zzekVar, min);
                int i8 = this.zzn + min;
                this.zzn = i8;
                zzann zzannVar = this.zzp;
                if (i8 == zzannVar.zzc) {
                    int i9 = zzannVar.zza;
                    if (i9 == 1) {
                        byte[] zzN = this.zzc.zzN();
                        zzanp zza = zzanq.zza(new zzej(zzN, zzN.length));
                        this.zzq = zza.zzb;
                        this.zzr = zza.zzc;
                        long j2 = this.zzt;
                        long j3 = this.zzp.zzb;
                        if (j2 != j3) {
                            this.zzt = j3;
                            int i10 = zza.zza;
                            String concat = i10 != -1 ? "mhm1".concat(String.valueOf(String.format(".%02X", Integer.valueOf(i10)))) : "mhm1";
                            byte[] bArr = zza.zzd;
                            zzgax zzgaxVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgaxVar = zzgax.zzp(zzeu.zzf, bArr);
                            }
                            zzad zzadVar = new zzad();
                            zzadVar.zzL(this.zze);
                            zzadVar.zzZ("audio/mhm1");
                            zzadVar.zzaa(this.zzq);
                            zzadVar.zzA(concat);
                            zzadVar.zzM(zzgaxVar);
                            this.zzf.zzl(zzadVar.zzaf());
                        }
                        this.zzu = true;
                    } else if (i9 == 17) {
                        byte[] zzN2 = this.zzc.zzN();
                        zzej zzejVar = new zzej(zzN2, zzN2.length);
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(2);
                            i4 = zzejVar.zzd(13);
                        }
                        this.zzs = i4;
                    } else if (i9 == 2) {
                        if (this.zzu) {
                            this.zzj = false;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        int i11 = this.zzr - this.zzs;
                        double d = this.zzq;
                        long round = Math.round(this.zzg);
                        if (this.zzi) {
                            this.zzi = false;
                            this.zzg = this.zzh;
                        } else {
                            this.zzg += (i11 * 1000000.0d) / d;
                        }
                        this.zzf.zzs(round, i2, this.zzo, 0, null);
                        this.zzu = false;
                        this.zzs = 0;
                        this.zzo = 0;
                    }
                    this.zzd = 1;
                }
            } else {
                zzf(zzekVar, this.zza, false);
                zzek zzekVar2 = this.zza;
                if (zzekVar2.zzb() == 0) {
                    zzej zzejVar2 = this.zzb;
                    int zze = zzekVar2.zze();
                    zzejVar2.zzk(zzekVar2.zzN(), zze);
                    if (zzanq.zzb(this.zzb, this.zzp)) {
                        this.zzn = 0;
                        this.zzo = this.zzp.zzc + zze + this.zzo;
                        this.zza.zzL(0);
                        zzaeh zzaehVar = this.zzf;
                        zzek zzekVar3 = this.zza;
                        zzaehVar.zzq(zzekVar3, zzekVar3.zze());
                        this.zza.zzI(2);
                        this.zzc.zzI(this.zzp.zzc);
                        this.zzm = true;
                        this.zzd = 2;
                    } else {
                        zzek zzekVar4 = this.zza;
                        if (zzekVar4.zze() < 15) {
                            zzekVar4.zzK(zzekVar4.zze() + 1);
                        }
                    }
                }
                this.zzm = false;
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
        this.zzk = i2;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j2 != -9223372036854775807L) {
            double d = j2;
            if (this.zzi) {
                this.zzh = d;
            } else {
                this.zzg = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzI(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = -2147483647;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1L;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9.223372036854776E18d;
        this.zzh = -9.223372036854776E18d;
    }
}
