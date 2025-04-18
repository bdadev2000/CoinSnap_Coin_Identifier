package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzamd implements zzacr {
    private final zzame zza = new zzame(null, 0);
    private final zzed zzb = new zzed(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int zza = zzacsVar.zza(this.zzb.zzN(), 0, 2786);
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
        zzed zzedVar = new zzed(10);
        int i10 = 0;
        while (true) {
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(zzedVar.zzN(), 0, 10, false);
            zzedVar.zzL(0);
            if (zzedVar.zzo() != 4801587) {
                break;
            }
            zzedVar.zzM(3);
            int zzl = zzedVar.zzl();
            i10 += zzl + 10;
            zzacgVar.zzl(zzl, false);
        }
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            zzacgVar2.zzm(zzedVar.zzN(), 0, 6, false);
            zzedVar.zzL(0);
            if (zzedVar.zzq() != 2935) {
                zzacsVar.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzacgVar2.zzl(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int zzb = zzabr.zzb(zzedVar.zzN());
                if (zzb == -1) {
                    return false;
                }
                zzacgVar2.zzl(zzb - 6, false);
            }
        }
    }
}
