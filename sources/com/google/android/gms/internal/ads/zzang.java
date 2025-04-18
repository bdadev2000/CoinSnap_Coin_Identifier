package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzang implements zzaob {
    private final zzamm zza;
    private final zzec zzb = new zzec(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzek zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzang(zzamm zzammVar) {
        this.zza = zzammVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzed zzedVar, @Nullable byte[] bArr, int i10) {
        int min = Math.min(zzedVar.zzb(), i10 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzedVar.zzM(min);
        } else {
            zzedVar.zzH(bArr, this.zzd, min);
        }
        int i11 = this.zzd + min;
        this.zzd = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zza(zzed zzedVar, int i10) throws zzbh {
        zzed zzedVar2;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        long j3;
        int i17;
        boolean z11;
        zzed zzedVar3 = zzedVar;
        zzdb.zzb(this.zze);
        int i18 = -1;
        int i19 = 2;
        boolean z12 = false;
        int i20 = 1;
        if ((i10 & 1) != 0) {
            int i21 = this.zzc;
            if (i21 != 0 && i21 != 1) {
                if (i21 != 2) {
                    int i22 = this.zzj;
                    if (i22 != -1) {
                        zzdt.zzf("PesReader", "Unexpected start indicator: expected " + i22 + " more bytes");
                    }
                    if (zzedVar.zze() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.zza.zzc(z11);
                } else {
                    zzdt.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i23 = i10;
        while (zzedVar.zzb() > 0) {
            int i24 = this.zzc;
            if (i24 != 0) {
                if (i24 != i20) {
                    if (i24 != i19) {
                        int zzb = zzedVar.zzb();
                        int i25 = this.zzj;
                        if (i25 == i18) {
                            i15 = z12 ? 1 : 0;
                        } else {
                            i15 = zzb - i25;
                        }
                        if (i15 > 0) {
                            zzb -= i15;
                            zzedVar3.zzK(zzedVar.zzd() + zzb);
                        }
                        this.zza.zza(zzedVar3);
                        int i26 = this.zzj;
                        if (i26 != i18) {
                            int i27 = i26 - zzb;
                            this.zzj = i27;
                            if (i27 == 0) {
                                this.zza.zzc(z12);
                                zze(i20);
                            }
                        }
                    } else {
                        if (zzf(zzedVar3, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzedVar3, null, this.zzi)) {
                            this.zzb.zzl(z12 ? 1 : 0);
                            if (this.zzf) {
                                this.zzb.zzn(4);
                                long zzd = this.zzb.zzd(3);
                                this.zzb.zzn(i20);
                                int zzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i20);
                                long zzd3 = this.zzb.zzd(15);
                                this.zzb.zzn(i20);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzn(4);
                                    this.zzb.zzn(i20);
                                    int zzd4 = this.zzb.zzd(15) << 15;
                                    this.zzb.zzn(i20);
                                    long zzd5 = this.zzb.zzd(15);
                                    this.zzb.zzn(i20);
                                    i16 = i23;
                                    this.zze.zzb(zzd4 | (this.zzb.zzd(3) << 30) | zzd5);
                                    this.zzh = true;
                                } else {
                                    i16 = i23;
                                }
                                j3 = this.zze.zzb((zzd << 30) | zzd2 | zzd3);
                            } else {
                                i16 = i23;
                                j3 = C.TIME_UNSET;
                            }
                            if (true != this.zzk) {
                                i17 = 0;
                            } else {
                                i17 = 4;
                            }
                            int i28 = i17 | i16;
                            this.zza.zzd(j3, i28);
                            zze(3);
                            i19 = 2;
                            z12 = false;
                            i20 = 1;
                            i23 = i28;
                            i18 = -1;
                            zzedVar3 = zzedVar;
                        }
                    }
                    i11 = i23;
                    zzedVar2 = zzedVar;
                } else {
                    i11 = i23;
                    zzedVar2 = zzedVar;
                    if (zzf(zzedVar2, this.zzb.zza, 9)) {
                        z10 = false;
                        this.zzb.zzl(0);
                        int zzd6 = this.zzb.zzd(24);
                        i13 = 1;
                        if (zzd6 != 1) {
                            e.r("Unexpected start code prefix: ", zzd6, "PesReader");
                            i12 = -1;
                            this.zzj = -1;
                            i19 = 2;
                            i14 = 0;
                        } else {
                            this.zzb.zzn(8);
                            zzec zzecVar = this.zzb;
                            int zzd7 = zzecVar.zzd(16);
                            zzecVar.zzn(5);
                            this.zzk = this.zzb.zzp();
                            i14 = 2;
                            this.zzb.zzn(2);
                            this.zzf = this.zzb.zzp();
                            this.zzg = this.zzb.zzp();
                            this.zzb.zzn(6);
                            int zzd8 = this.zzb.zzd(8);
                            this.zzi = zzd8;
                            if (zzd7 == 0) {
                                i12 = -1;
                                this.zzj = -1;
                            } else {
                                int i29 = (zzd7 - 3) - zzd8;
                                this.zzj = i29;
                                if (i29 < 0) {
                                    e.r("Found negative packet payload size: ", i29, "PesReader");
                                    i12 = -1;
                                    this.zzj = -1;
                                } else {
                                    i12 = -1;
                                }
                            }
                            i19 = 2;
                        }
                        zze(i14);
                    } else {
                        i12 = -1;
                        z10 = false;
                        i13 = 1;
                        i19 = 2;
                    }
                    z12 = z10;
                    i20 = i13;
                    i18 = i12;
                }
            } else {
                zzedVar2 = zzedVar3;
                i11 = i23;
                zzedVar2.zzM(zzedVar.zzb());
            }
            zzedVar3 = zzedVar2;
            i23 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
        this.zze = zzekVar;
        this.zza.zzb(zzacuVar, zzaoaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z10) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
