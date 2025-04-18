package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzamo implements zzamm {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzadx zzc;

    @Nullable
    private final zzaod zzd;

    @Nullable
    private final zzed zze;

    @Nullable
    private final zzane zzf;
    private final boolean[] zzg;
    private final zzamn zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzamo() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    @Override // com.google.android.gms.internal.ads.zzamm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzed r21) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamo.zza(com.google.android.gms.internal.ads.zzed):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzb = zzaoaVar.zzb();
        this.zzc = zzacuVar.zzw(zzaoaVar.zza(), 2);
        zzaod zzaodVar = this.zzd;
        if (zzaodVar != null) {
            zzaodVar.zzb(zzacuVar, zzaoaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
        zzdb.zzb(this.zzc);
        if (z10) {
            boolean z11 = this.zzp;
            long j3 = this.zzi - this.zzn;
            this.zzc.zzs(this.zzo, z11 ? 1 : 0, (int) j3, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzm = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        zzfp.zzh(this.zzg);
        this.zzh.zzb();
        zzane zzaneVar = this.zzf;
        if (zzaneVar != null) {
            zzaneVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = C.TIME_UNSET;
        this.zzo = C.TIME_UNSET;
    }

    public zzamo(@Nullable zzaod zzaodVar) {
        zzed zzedVar;
        this.zzd = zzaodVar;
        this.zzg = new boolean[4];
        this.zzh = new zzamn(128);
        if (zzaodVar != null) {
            this.zzf = new zzane(178, 128);
            zzedVar = new zzed();
        } else {
            zzedVar = null;
            this.zzf = null;
        }
        this.zze = zzedVar;
        this.zzm = C.TIME_UNSET;
        this.zzo = C.TIME_UNSET;
    }
}
