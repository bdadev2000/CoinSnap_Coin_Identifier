package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzant {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzek zza = new zzek(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzed zzb = new zzed();

    public zzant(int i10) {
    }

    private final int zze(zzacs zzacsVar) {
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacsVar.zzj();
        return 0;
    }

    public final int zza(zzacs zzacsVar, zzadn zzadnVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzacsVar);
            return 0;
        }
        boolean z10 = this.zze;
        long j3 = C.TIME_UNSET;
        if (!z10) {
            long zzd = zzacsVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j10 = zzd - min;
            if (zzacsVar.zzf() != j10) {
                zzadnVar.zza = j10;
            } else {
                this.zzb.zzI(min);
                zzacsVar.zzj();
                zzacsVar.zzh(this.zzb.zzN(), 0, min);
                zzed zzedVar = this.zzb;
                int zzd2 = zzedVar.zzd();
                int zze = zzedVar.zze();
                int i11 = zze - 188;
                while (true) {
                    if (i11 < zzd2) {
                        break;
                    }
                    byte[] zzN = zzedVar.zzN();
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 >= zzd2 && i14 < zze && zzN[i14] == 71) {
                            i13++;
                            if (i13 == 5) {
                                long zzb = zzaoc.zzb(zzedVar, i11, i10);
                                if (zzb != C.TIME_UNSET) {
                                    j3 = zzb;
                                    break;
                                }
                            }
                        } else {
                            i13 = 0;
                        }
                        i12++;
                    }
                    i11--;
                }
                this.zzg = j3;
                this.zze = true;
                return 0;
            }
        } else {
            if (this.zzg == C.TIME_UNSET) {
                zze(zzacsVar);
                return 0;
            }
            if (!this.zzd) {
                int min2 = (int) Math.min(112800L, zzacsVar.zzd());
                if (zzacsVar.zzf() != 0) {
                    zzadnVar.zza = 0L;
                } else {
                    this.zzb.zzI(min2);
                    zzacsVar.zzj();
                    zzacsVar.zzh(this.zzb.zzN(), 0, min2);
                    zzed zzedVar2 = this.zzb;
                    int zzd3 = zzedVar2.zzd();
                    int zze2 = zzedVar2.zze();
                    while (true) {
                        if (zzd3 >= zze2) {
                            break;
                        }
                        if (zzedVar2.zzN()[zzd3] == 71) {
                            long zzb2 = zzaoc.zzb(zzedVar2, zzd3, i10);
                            if (zzb2 != C.TIME_UNSET) {
                                j3 = zzb2;
                                break;
                            }
                        }
                        zzd3++;
                    }
                    this.zzf = j3;
                    this.zzd = true;
                    return 0;
                }
            } else {
                long j11 = this.zzf;
                if (j11 == C.TIME_UNSET) {
                    zze(zzacsVar);
                    return 0;
                }
                zzek zzekVar = this.zza;
                this.zzh = zzekVar.zzc(this.zzg) - zzekVar.zzb(j11);
                zze(zzacsVar);
                return 0;
            }
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzek zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
