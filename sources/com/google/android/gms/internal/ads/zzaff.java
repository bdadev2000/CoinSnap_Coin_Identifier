package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzaff implements zzacr {
    private zzacu zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzagz zzg;
    private zzacs zzh;
    private zzafi zzi;

    @Nullable
    private zzaiy zzj;
    private final zzed zza = new zzed(6);
    private long zzf = -1;

    private final int zza(zzacs zzacsVar) throws IOException {
        this.zza.zzI(2);
        ((zzacg) zzacsVar).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzD();
        this.zzb.zzO(new zzadp(C.TIME_UNSET, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r24, com.google.android.gms.internal.ads.zzadn r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
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
        this.zzb = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        if (j3 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaiy zzaiyVar = this.zzj;
            zzaiyVar.getClass();
            zzaiyVar.zzf(j3, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        if (zza(zzacsVar) != 65496) {
            return false;
        }
        int zza = zza(zzacsVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzI(2);
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(this.zza.zzN(), 0, 2, false);
            zzacgVar.zzl(this.zza.zzq() - 2, false);
            zza = zza(zzacsVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzacg zzacgVar2 = (zzacg) zzacsVar;
            zzacgVar2.zzl(2, false);
            this.zza.zzI(6);
            zzacgVar2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
