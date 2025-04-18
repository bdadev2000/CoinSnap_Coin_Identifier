package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzads implements zzacr {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacu zzf;
    private zzadx zzg;

    public zzads(int i10, int i11, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int i10 = this.zze;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzadx zzadxVar = this.zzg;
        zzadxVar.getClass();
        int zzf = zzadxVar.zzf(zzacsVar, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, true);
        if (zzf == -1) {
            this.zze = 2;
            this.zzg.zzs(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zzf;
        }
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
        this.zzf = zzacuVar;
        zzadx zzw = zzacuVar.zzw(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        this.zzg = zzw;
        zzab zzabVar = new zzab();
        zzabVar.zzZ(this.zzc);
        zzw.zzl(zzabVar.zzaf());
        this.zzf.zzD();
        this.zzf.zzO(new zzadt(C.TIME_UNSET));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        if (j3 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        boolean z10;
        if (this.zza != -1 && this.zzb != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        zzed zzedVar = new zzed(this.zzb);
        ((zzacg) zzacsVar).zzm(zzedVar.zzN(), 0, this.zzb, false);
        if (zzedVar.zzq() == this.zza) {
            return true;
        }
        return false;
    }
}
