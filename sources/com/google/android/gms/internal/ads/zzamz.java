package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzamz implements zzamm {
    private String zze;
    private zzadx zzf;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzn;
    private int zzo;
    private int zzs;
    private boolean zzu;
    private int zzd = 0;
    private final zzed zza = new zzed(new byte[15], 2);
    private final zzec zzb = new zzec();
    private final zzed zzc = new zzed();
    private final zzana zzp = new zzana();
    private int zzq = -2147483647;
    private int zzr = -1;
    private long zzt = -1;
    private boolean zzj = true;
    private boolean zzm = true;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;

    private static final void zzf(zzed zzedVar, zzed zzedVar2, boolean z10) {
        int zzd = zzedVar.zzd();
        int min = Math.min(zzedVar.zzb(), zzedVar2.zzb());
        zzedVar.zzH(zzedVar2.zzN(), zzedVar2.zzd(), min);
        zzedVar2.zzM(min);
        if (z10) {
            zzedVar.zzL(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) throws zzbh {
        int i10;
        zzdb.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i11 = this.zzd;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 != 1) {
                    int i13 = this.zzp.zza;
                    if (i13 == 1 || i13 == 17) {
                        zzf(zzedVar, this.zzc, true);
                    }
                    int min = Math.min(zzedVar.zzb(), this.zzp.zzc - this.zzn);
                    this.zzf.zzq(zzedVar, min);
                    int i14 = this.zzn + min;
                    this.zzn = i14;
                    zzana zzanaVar = this.zzp;
                    if (i14 == zzanaVar.zzc) {
                        int i15 = zzanaVar.zza;
                        if (i15 == 1) {
                            byte[] zzN = this.zzc.zzN();
                            zzanb zza = zzand.zza(new zzec(zzN, zzN.length));
                            this.zzq = zza.zzb;
                            this.zzr = zza.zzc;
                            long j3 = this.zzt;
                            long j10 = this.zzp.zzb;
                            if (j3 != j10) {
                                this.zzt = j10;
                                int i16 = zza.zza;
                                String str = "mhm1";
                                if (i16 != -1) {
                                    str = "mhm1".concat(String.valueOf(String.format(".%02X", Integer.valueOf(i16))));
                                }
                                byte[] bArr = zza.zzd;
                                zzfzo zzfzoVar = null;
                                if (bArr != null && bArr.length > 0) {
                                    zzfzoVar = zzfzo.zzp(zzen.zzf, bArr);
                                }
                                zzab zzabVar = new zzab();
                                zzabVar.zzL(this.zze);
                                zzabVar.zzZ("audio/mhm1");
                                zzabVar.zzaa(this.zzq);
                                zzabVar.zzA(str);
                                zzabVar.zzM(zzfzoVar);
                                this.zzf.zzl(zzabVar.zzaf());
                            }
                            this.zzu = true;
                        } else if (i15 == 17) {
                            byte[] zzN2 = this.zzc.zzN();
                            zzec zzecVar = new zzec(zzN2, zzN2.length);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(2);
                                i12 = zzecVar.zzd(13);
                            }
                            this.zzs = i12;
                        } else if (i15 == 2) {
                            if (this.zzu) {
                                this.zzj = false;
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            int i17 = this.zzr - this.zzs;
                            double d10 = this.zzq;
                            long round = Math.round(this.zzg);
                            if (this.zzi) {
                                this.zzi = false;
                                this.zzg = this.zzh;
                            } else {
                                this.zzg += (i17 * 1000000.0d) / d10;
                            }
                            this.zzf.zzs(round, i10, this.zzo, 0, null);
                            this.zzu = false;
                            this.zzs = 0;
                            this.zzo = 0;
                        }
                        this.zzd = 1;
                    }
                } else {
                    zzf(zzedVar, this.zza, false);
                    zzed zzedVar2 = this.zza;
                    if (zzedVar2.zzb() == 0) {
                        zzec zzecVar2 = this.zzb;
                        int zze = zzedVar2.zze();
                        zzecVar2.zzk(zzedVar2.zzN(), zze);
                        if (zzand.zzb(this.zzb, this.zzp)) {
                            this.zzn = 0;
                            this.zzo = this.zzp.zzc + zze + this.zzo;
                            this.zza.zzL(0);
                            zzadx zzadxVar = this.zzf;
                            zzed zzedVar3 = this.zza;
                            zzadxVar.zzq(zzedVar3, zzedVar3.zze());
                            this.zza.zzI(2);
                            this.zzc.zzI(this.zzp.zzc);
                            this.zzm = true;
                            this.zzd = 2;
                        } else {
                            zzed zzedVar4 = this.zza;
                            if (zzedVar4.zze() < 15) {
                                zzedVar4.zzK(zzedVar4.zze() + 1);
                            }
                        }
                    }
                    this.zzm = false;
                }
            } else {
                int i18 = this.zzk;
                if ((i18 & 2) == 0) {
                    zzedVar.zzL(zzedVar.zze());
                } else {
                    if ((i18 & 4) != 0) {
                        this.zzd = 1;
                        break;
                    }
                    while (zzedVar.zzb() > 0) {
                        int i19 = this.zzl << 8;
                        this.zzl = i19;
                        int zzm = i19 | zzedVar.zzm();
                        this.zzl = zzm;
                        if ((zzm & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                            zzedVar.zzL(zzedVar.zzd() - 3);
                            this.zzl = 0;
                            this.zzd = 1;
                            break;
                            break;
                        }
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
        this.zzk = i10;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j3 != C.TIME_UNSET) {
            double d10 = j3;
            if (this.zzi) {
                this.zzh = d10;
            } else {
                this.zzg = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
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
