package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzanv implements zzacl {
    private final zzer zza;
    private final zzek zzb = new zzek();

    public /* synthetic */ zzanv(zzer zzerVar, zzanu zzanuVar) {
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final zzack zza(zzadc zzadcVar, long j2) throws IOException {
        int zzh;
        long j3;
        long zzf = zzadcVar.zzf();
        int min = (int) Math.min(20000L, zzadcVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzadcVar.zzh(this.zzb.zzN(), 0, min);
        int i2 = -1;
        long j4 = -9223372036854775807L;
        int i3 = -1;
        while (true) {
            zzek zzekVar = this.zzb;
            if (zzekVar.zzb() < 4) {
                return j4 != -9223372036854775807L ? zzack.zzf(j4, zzf + i2) : zzack.zza;
            }
            if (zzanw.zzh(zzekVar.zzN(), zzekVar.zzd()) != 442) {
                zzekVar.zzM(1);
            } else {
                zzekVar.zzM(4);
                long zzc = zzanx.zzc(zzekVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j2) {
                        if (j4 == -9223372036854775807L) {
                            return zzack.zzd(zzb, zzf);
                        }
                        j3 = i3;
                    } else {
                        if (100000 + zzb > j2) {
                            j3 = zzekVar.zzd();
                            break;
                        }
                        i3 = zzekVar.zzd();
                        j4 = zzb;
                    }
                }
                int zze = zzekVar.zze();
                if (zzekVar.zzb() >= 10) {
                    zzekVar.zzM(9);
                    int zzm = zzekVar.zzm() & 7;
                    if (zzekVar.zzb() >= zzm) {
                        zzekVar.zzM(zzm);
                        if (zzekVar.zzb() >= 4) {
                            if (zzanw.zzh(zzekVar.zzN(), zzekVar.zzd()) == 443) {
                                zzekVar.zzM(4);
                                int zzq = zzekVar.zzq();
                                if (zzekVar.zzb() < zzq) {
                                    zzekVar.zzL(zze);
                                } else {
                                    zzekVar.zzM(zzq);
                                }
                            }
                            while (true) {
                                if (zzekVar.zzb() < 4 || (zzh = zzanw.zzh(zzekVar.zzN(), zzekVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzekVar.zzM(4);
                                if (zzekVar.zzb() < 2) {
                                    zzekVar.zzL(zze);
                                    break;
                                }
                                zzekVar.zzL(Math.min(zzekVar.zze(), zzekVar.zzd() + zzekVar.zzq()));
                            }
                        } else {
                            zzekVar.zzL(zze);
                        }
                    } else {
                        zzekVar.zzL(zze);
                    }
                } else {
                    zzekVar.zzL(zze);
                }
                i2 = zzekVar.zzd();
            }
        }
        return zzack.zze(zzf + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzb() {
        byte[] bArr = zzeu.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
