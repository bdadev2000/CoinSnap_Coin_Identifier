package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzanu implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzant
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzanu()};
        }
    };
    private final zzanv zzb = new zzanv(null, 0);
    private final zzfu zzc = new zzfu(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int zza2 = zzadvVar.zza(this.zzc.zzM(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb.zzb(zzadxVar, new zzapo(Integer.MIN_VALUE, 0, 1));
        zzadxVar.zzD();
        zzadxVar.zzO(new zzaes(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        int i9;
        zzfu zzfuVar = new zzfu(10);
        int i10 = 0;
        while (true) {
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(zzfuVar.zzM(), 0, 10, false);
            zzfuVar.zzK(0);
            if (zzfuVar.zzo() != 4801587) {
                break;
            }
            zzfuVar.zzL(3);
            int zzl = zzfuVar.zzl();
            i10 += zzl + 10;
            zzadiVar.zzl(zzl, false);
        }
        zzadvVar.zzj();
        zzadi zzadiVar2 = (zzadi) zzadvVar;
        zzadiVar2.zzl(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            zzadiVar2.zzm(zzfuVar.zzM(), 0, 7, false);
            zzfuVar.zzK(0);
            int zzq = zzfuVar.zzq();
            if (zzq != 44096 && zzq != 44097) {
                zzadvVar.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzadiVar2.zzl(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] zzM = zzfuVar.zzM();
                if (zzM.length < 7) {
                    i9 = -1;
                } else {
                    int i14 = ((zzM[2] & 255) << 8) | (zzM[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((zzM[4] & 255) << 16) | ((zzM[5] & 255) << 8) | (zzM[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (zzq == 44097) {
                        i13 += 2;
                    }
                    i9 = i14 + i13;
                }
                if (i9 == -1) {
                    return false;
                }
                zzadiVar2.zzl(i9 - 7, false);
            }
        }
    }
}
