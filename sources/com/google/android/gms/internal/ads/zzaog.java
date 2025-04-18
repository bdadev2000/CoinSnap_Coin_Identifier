package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class zzaog {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzer zza = new zzer(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzek zzb = new zzek();

    public zzaog(int i2) {
    }

    private final int zze(zzadc zzadcVar) {
        byte[] bArr = zzeu.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzadcVar.zzj();
        return 0;
    }

    public final int zza(zzadc zzadcVar, zzadx zzadxVar, int i2) throws IOException {
        if (i2 <= 0) {
            zze(zzadcVar);
            return 0;
        }
        long j2 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzadcVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j3 = zzd - min;
            if (zzadcVar.zzf() == j3) {
                this.zzb.zzI(min);
                zzadcVar.zzj();
                zzadcVar.zzh(this.zzb.zzN(), 0, min);
                zzek zzekVar = this.zzb;
                int zzd2 = zzekVar.zzd();
                int zze = zzekVar.zze();
                int i3 = zze - 188;
                while (true) {
                    if (i3 < zzd2) {
                        break;
                    }
                    byte[] zzN = zzekVar.zzN();
                    int i4 = -4;
                    int i5 = 0;
                    while (true) {
                        if (i4 > 4) {
                            break;
                        }
                        int i6 = (i4 * Opcodes.NEWARRAY) + i3;
                        if (i6 < zzd2 || i6 >= zze || zzN[i6] != 71) {
                            i5 = 0;
                        } else {
                            i5++;
                            if (i5 == 5) {
                                long zzb = zzaop.zzb(zzekVar, i3, i2);
                                if (zzb != -9223372036854775807L) {
                                    j2 = zzb;
                                    break;
                                }
                            }
                        }
                        i4++;
                    }
                    i3--;
                }
                this.zzg = j2;
                this.zze = true;
                return 0;
            }
            zzadxVar.zza = j3;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzadcVar);
                return 0;
            }
            if (this.zzd) {
                long j4 = this.zzf;
                if (j4 == -9223372036854775807L) {
                    zze(zzadcVar);
                    return 0;
                }
                zzer zzerVar = this.zza;
                this.zzh = zzerVar.zzc(this.zzg) - zzerVar.zzb(j4);
                zze(zzadcVar);
                return 0;
            }
            int min2 = (int) Math.min(112800L, zzadcVar.zzd());
            if (zzadcVar.zzf() == 0) {
                this.zzb.zzI(min2);
                zzadcVar.zzj();
                zzadcVar.zzh(this.zzb.zzN(), 0, min2);
                zzek zzekVar2 = this.zzb;
                int zzd3 = zzekVar2.zzd();
                int zze2 = zzekVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzekVar2.zzN()[zzd3] == 71) {
                        long zzb2 = zzaop.zzb(zzekVar2, zzd3, i2);
                        if (zzb2 != -9223372036854775807L) {
                            j2 = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j2;
                this.zzd = true;
                return 0;
            }
            zzadxVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzer zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
