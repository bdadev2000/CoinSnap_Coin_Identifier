package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaey implements zzacr {
    private zzacu zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaex zzo;
    private zzafc zzp;
    private final zzed zza = new zzed(4);
    private final zzed zzb = new zzed(9);
    private final zzed zzc = new zzed(11);
    private final zzed zzd = new zzed();
    private final zzaez zze = new zzaez();
    private int zzg = 1;

    private final zzed zza(zzacs zzacsVar) throws IOException {
        if (this.zzl > this.zzd.zzc()) {
            zzed zzedVar = this.zzd;
            int zzc = zzedVar.zzc();
            zzedVar.zzJ(new byte[Math.max(zzc + zzc, this.zzl)], 0);
        } else {
            this.zzd.zzL(0);
        }
        this.zzd.zzK(this.zzl);
        zzacsVar.zzi(this.zzd.zzN(), 0, this.zzl);
        return this.zzd;
    }

    private final void zzg() {
        if (!this.zzn) {
            this.zzf.zzO(new zzadp(C.TIME_UNSET, 0L));
            this.zzn = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r17, com.google.android.gms.internal.ads.zzadn r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaey.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
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
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        if (j3 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(this.zza.zzN(), 0, 3, false);
        this.zza.zzL(0);
        if (this.zza.zzo() != 4607062) {
            return false;
        }
        zzacgVar.zzm(this.zza.zzN(), 0, 2, false);
        this.zza.zzL(0);
        if ((this.zza.zzq() & 250) != 0) {
            return false;
        }
        zzacgVar.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        int zzg = this.zza.zzg();
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(zzg, false);
        zzacgVar2.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        if (this.zza.zzg() != 0) {
            return false;
        }
        return true;
    }
}
