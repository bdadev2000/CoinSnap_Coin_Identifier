package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaot implements zzapp {
    private final zzaoc zza;
    private final zzft zzb = new zzft(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzgb zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaot(zzaoc zzaocVar) {
        this.zza = zzaocVar;
    }

    private final void zzd(int i9) {
        this.zzc = i9;
        this.zzd = 0;
    }

    private final boolean zze(zzfu zzfuVar, @Nullable byte[] bArr, int i9) {
        int min = Math.min(zzfuVar.zzb(), i9 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfuVar.zzL(min);
        } else {
            zzfuVar.zzG(bArr, this.zzd, min);
        }
        int i10 = this.zzd + min;
        this.zzd = i10;
        if (i10 == i9) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zza(zzfu zzfuVar, int i9) throws zzch {
        int i10;
        int i11;
        int i12;
        long j7;
        int i13;
        int i14;
        zzeq.zzb(this.zze);
        int i15 = -1;
        int i16 = 2;
        int i17 = 1;
        if ((i9 & 1) != 0) {
            int i18 = this.zzc;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    int i19 = this.zzj;
                    if (i19 != -1) {
                        zzfk.zzf("PesReader", "Unexpected start indicator: expected " + i19 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    zzfk.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i20 = i9;
        while (zzfuVar.zzb() > 0) {
            int i21 = this.zzc;
            if (i21 != 0) {
                int i22 = 0;
                if (i21 != i17) {
                    if (i21 != i16) {
                        int zzb = zzfuVar.zzb();
                        int i23 = this.zzj;
                        if (i23 != i15) {
                            i22 = zzb - i23;
                        }
                        if (i22 > 0) {
                            zzb -= i22;
                            zzfuVar.zzJ(zzfuVar.zzd() + zzb);
                        }
                        this.zza.zza(zzfuVar);
                        int i24 = this.zzj;
                        if (i24 != i15) {
                            int i25 = i24 - zzb;
                            this.zzj = i25;
                            if (i25 == 0) {
                                this.zza.zzc();
                                zzd(i17);
                            }
                        }
                    } else {
                        if (zze(zzfuVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfuVar, null, this.zzi)) {
                            this.zzb.zzk(0);
                            if (this.zzf) {
                                this.zzb.zzm(4);
                                long zzd = this.zzb.zzd(3);
                                this.zzb.zzm(i17);
                                int zzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzm(i17);
                                long zzd3 = this.zzb.zzd(15);
                                this.zzb.zzm(i17);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzm(4);
                                    this.zzb.zzm(i17);
                                    int zzd4 = this.zzb.zzd(15) << 15;
                                    this.zzb.zzm(i17);
                                    long zzd5 = this.zzb.zzd(15);
                                    this.zzb.zzm(i17);
                                    i14 = zzd2;
                                    this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                    this.zzh = true;
                                } else {
                                    i14 = zzd2;
                                }
                                j7 = this.zze.zzb((zzd << 30) | i14 | zzd3);
                            } else {
                                j7 = C.TIME_UNSET;
                            }
                            if (true != this.zzk) {
                                i13 = 0;
                            } else {
                                i13 = 4;
                            }
                            i20 |= i13;
                            this.zza.zzd(j7, i20);
                            zzd(3);
                            i15 = -1;
                            i16 = 2;
                            i17 = 1;
                        }
                    }
                    i10 = i16;
                    i11 = i15;
                } else if (zze(zzfuVar, this.zzb.zza, 9)) {
                    this.zzb.zzk(0);
                    int zzd6 = this.zzb.zzd(24);
                    i17 = 1;
                    if (zzd6 != 1) {
                        L.z(zzd6, "Unexpected start code prefix: ", "PesReader");
                        this.zzj = -1;
                        i10 = 2;
                        i11 = -1;
                        i12 = 0;
                    } else {
                        this.zzb.zzm(8);
                        zzft zzftVar = this.zzb;
                        int zzd7 = zzftVar.zzd(16);
                        zzftVar.zzm(5);
                        this.zzk = this.zzb.zzo();
                        i10 = 2;
                        this.zzb.zzm(2);
                        this.zzf = this.zzb.zzo();
                        this.zzg = this.zzb.zzo();
                        this.zzb.zzm(6);
                        int zzd8 = this.zzb.zzd(8);
                        this.zzi = zzd8;
                        i11 = -1;
                        if (zzd7 == 0) {
                            this.zzj = -1;
                        } else {
                            int i26 = (zzd7 - 3) - zzd8;
                            this.zzj = i26;
                            if (i26 < 0) {
                                L.z(i26, "Found negative packet payload size: ", "PesReader");
                                this.zzj = -1;
                            }
                        }
                        i12 = 2;
                    }
                    zzd(i12);
                } else {
                    i11 = -1;
                    i17 = 1;
                    i10 = 2;
                }
            } else {
                i10 = i16;
                i11 = i15;
                zzfuVar.zzL(zzfuVar.zzb());
            }
            i15 = i11;
            i16 = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
        this.zze = zzgbVar;
        this.zza.zzb(zzadxVar, zzapoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
