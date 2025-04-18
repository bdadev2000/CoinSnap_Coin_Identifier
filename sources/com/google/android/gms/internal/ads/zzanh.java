package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzanh implements zzacb {
    private final zzek zza;
    private final zzed zzb = new zzed();

    public /* synthetic */ zzanh(zzek zzekVar, zzani zzaniVar) {
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final zzaca zza(zzacs zzacsVar, long j3) throws IOException {
        int zzh;
        long j10;
        long zzf = zzacsVar.zzf();
        int min = (int) Math.min(20000L, zzacsVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzacsVar.zzh(this.zzb.zzN(), 0, min);
        int i10 = -1;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        while (true) {
            zzed zzedVar = this.zzb;
            if (zzedVar.zzb() >= 4) {
                if (zzanj.zzh(zzedVar.zzN(), zzedVar.zzd()) != 442) {
                    zzedVar.zzM(1);
                } else {
                    zzedVar.zzM(4);
                    long zzc = zzank.zzc(zzedVar);
                    if (zzc != C.TIME_UNSET) {
                        long zzb = this.zza.zzb(zzc);
                        if (zzb > j3) {
                            if (j11 == C.TIME_UNSET) {
                                return zzaca.zzd(zzb, zzf);
                            }
                            j10 = i11;
                        } else {
                            if (100000 + zzb > j3) {
                                j10 = zzedVar.zzd();
                                break;
                            }
                            i11 = zzedVar.zzd();
                            j11 = zzb;
                        }
                    }
                    int zze = zzedVar.zze();
                    if (zzedVar.zzb() < 10) {
                        zzedVar.zzL(zze);
                    } else {
                        zzedVar.zzM(9);
                        int zzm = zzedVar.zzm() & 7;
                        if (zzedVar.zzb() < zzm) {
                            zzedVar.zzL(zze);
                        } else {
                            zzedVar.zzM(zzm);
                            if (zzedVar.zzb() < 4) {
                                zzedVar.zzL(zze);
                            } else {
                                if (zzanj.zzh(zzedVar.zzN(), zzedVar.zzd()) == 443) {
                                    zzedVar.zzM(4);
                                    int zzq = zzedVar.zzq();
                                    if (zzedVar.zzb() < zzq) {
                                        zzedVar.zzL(zze);
                                    } else {
                                        zzedVar.zzM(zzq);
                                    }
                                }
                                while (true) {
                                    if (zzedVar.zzb() < 4 || (zzh = zzanj.zzh(zzedVar.zzN(), zzedVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                        break;
                                    }
                                    zzedVar.zzM(4);
                                    if (zzedVar.zzb() < 2) {
                                        zzedVar.zzL(zze);
                                        break;
                                    }
                                    zzedVar.zzL(Math.min(zzedVar.zze(), zzedVar.zzd() + zzedVar.zzq()));
                                }
                            }
                        }
                    }
                    i10 = zzedVar.zzd();
                }
            } else {
                if (j11 != C.TIME_UNSET) {
                    return zzaca.zzf(j11, zzf + i10);
                }
                return zzaca.zza;
            }
        }
        return zzaca.zze(zzf + j10);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zzb() {
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
