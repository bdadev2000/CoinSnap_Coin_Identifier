package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzanr implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzanq
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzanr()};
        }
    };
    private final zzans zzb = new zzans(null, 0);
    private final zzfu zzc = new zzfu(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int zza2 = zzadvVar.zza(this.zzc.zzM(), 0, 2786);
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
        zzfu zzfuVar = new zzfu(10);
        int i9 = 0;
        while (true) {
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(zzfuVar.zzM(), 0, 10, false);
            zzfuVar.zzK(0);
            if (zzfuVar.zzo() != 4801587) {
                break;
            }
            zzfuVar.zzL(3);
            int zzl = zzfuVar.zzl();
            i9 += zzl + 10;
            zzadiVar.zzl(zzl, false);
        }
        zzadvVar.zzj();
        zzadi zzadiVar2 = (zzadi) zzadvVar;
        zzadiVar2.zzl(i9, false);
        int i10 = 0;
        int i11 = i9;
        while (true) {
            zzadiVar2.zzm(zzfuVar.zzM(), 0, 6, false);
            zzfuVar.zzK(0);
            if (zzfuVar.zzq() != 2935) {
                zzadvVar.zzj();
                i11++;
                if (i11 - i9 >= 8192) {
                    return false;
                }
                zzadiVar2.zzl(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int zzb = zzact.zzb(zzfuVar.zzM());
                if (zzb == -1) {
                    return false;
                }
                zzadiVar2.zzl(zzb - 6, false);
            }
        }
    }
}
