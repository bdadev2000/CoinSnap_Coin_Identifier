package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaov implements zzadd {
    private final zzgb zza;
    private final zzfu zzb = new zzfu();

    public /* synthetic */ zzaov(zzgb zzgbVar, zzaou zzaouVar) {
        this.zza = zzgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final zzadc zza(zzadv zzadvVar, long j7) throws IOException {
        int zzh;
        long j9;
        long zzf = zzadvVar.zzf();
        int min = (int) Math.min(20000L, zzadvVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, min, false);
        int i9 = -1;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        while (true) {
            zzfu zzfuVar = this.zzb;
            if (zzfuVar.zzb() >= 4) {
                if (zzaow.zzh(zzfuVar.zzM(), zzfuVar.zzd()) != 442) {
                    zzfuVar.zzL(1);
                } else {
                    zzfuVar.zzL(4);
                    long zzc = zzaox.zzc(zzfuVar);
                    if (zzc != C.TIME_UNSET) {
                        long zzb = this.zza.zzb(zzc);
                        if (zzb > j7) {
                            if (j10 == C.TIME_UNSET) {
                                return zzadc.zzd(zzb, zzf);
                            }
                            j9 = i10;
                        } else {
                            if (100000 + zzb > j7) {
                                j9 = zzfuVar.zzd();
                                break;
                            }
                            i10 = zzfuVar.zzd();
                            j10 = zzb;
                        }
                    }
                    int zze = zzfuVar.zze();
                    if (zzfuVar.zzb() < 10) {
                        zzfuVar.zzK(zze);
                    } else {
                        zzfuVar.zzL(9);
                        int zzm = zzfuVar.zzm() & 7;
                        if (zzfuVar.zzb() < zzm) {
                            zzfuVar.zzK(zze);
                        } else {
                            zzfuVar.zzL(zzm);
                            if (zzfuVar.zzb() < 4) {
                                zzfuVar.zzK(zze);
                            } else {
                                if (zzaow.zzh(zzfuVar.zzM(), zzfuVar.zzd()) == 443) {
                                    zzfuVar.zzL(4);
                                    int zzq = zzfuVar.zzq();
                                    if (zzfuVar.zzb() < zzq) {
                                        zzfuVar.zzK(zze);
                                    } else {
                                        zzfuVar.zzL(zzq);
                                    }
                                }
                                while (true) {
                                    if (zzfuVar.zzb() < 4 || (zzh = zzaow.zzh(zzfuVar.zzM(), zzfuVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                        break;
                                    }
                                    zzfuVar.zzL(4);
                                    if (zzfuVar.zzb() < 2) {
                                        zzfuVar.zzK(zze);
                                        break;
                                    }
                                    zzfuVar.zzK(Math.min(zzfuVar.zze(), zzfuVar.zzd() + zzfuVar.zzq()));
                                }
                            }
                        }
                    }
                    i9 = zzfuVar.zzd();
                }
            } else {
                if (j10 != C.TIME_UNSET) {
                    return zzadc.zzf(j10, zzf + i9);
                }
                return zzadc.zza;
            }
        }
        return zzadc.zze(zzf + j9);
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final void zzb() {
        byte[] bArr = zzgd.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
