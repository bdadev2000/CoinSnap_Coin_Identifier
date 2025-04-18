package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import kotlin.UByte;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class zzamf implements zzacr {
    private final zzamg zza = new zzamg(null, 0);
    private final zzed zzb = new zzed(JsonLexerKt.BATCH_SIZE);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int zza = zzacsVar.zza(this.zzb.zzN(), 0, JsonLexerKt.BATCH_SIZE);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zza.zzb(zzacuVar, new zzaoa(Integer.MIN_VALUE, 0, 1));
        zzacuVar.zzD();
        zzacuVar.zzO(new zzadp(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        int i10;
        zzed zzedVar = new zzed(10);
        int i11 = 0;
        while (true) {
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(zzedVar.zzN(), 0, 10, false);
            zzedVar.zzL(0);
            if (zzedVar.zzo() != 4801587) {
                break;
            }
            zzedVar.zzM(3);
            int zzl = zzedVar.zzl();
            i11 += zzl + 10;
            zzacgVar.zzl(zzl, false);
        }
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzacgVar2.zzm(zzedVar.zzN(), 0, 7, false);
            zzedVar.zzL(0);
            int zzq = zzedVar.zzq();
            if (zzq != 44096 && zzq != 44097) {
                zzacsVar.zzj();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzacgVar2.zzl(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] zzN = zzedVar.zzN();
                if (zzN.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((zzN[2] & UByte.MAX_VALUE) << 8) | (zzN[3] & UByte.MAX_VALUE);
                    if (i15 == 65535) {
                        i15 = ((zzN[4] & UByte.MAX_VALUE) << 16) | ((zzN[5] & UByte.MAX_VALUE) << 8) | (zzN[6] & UByte.MAX_VALUE);
                    } else {
                        i14 = 4;
                    }
                    if (zzq == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzacgVar2.zzl(i10 - 7, false);
            }
        }
    }
}
