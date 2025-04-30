package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaoe implements zzaoc {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzafa zzc;

    @Nullable
    private final zzapr zzd;

    @Nullable
    private final zzfu zze;

    @Nullable
    private final zzaor zzf;
    private final boolean[] zzg;
    private final zzaod zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzaoe() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01da  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfu r28) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoe.zza(com.google.android.gms.internal.ads.zzfu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzb = zzapoVar.zzb();
        this.zzc = zzadxVar.zzw(zzapoVar.zza(), 2);
        zzapr zzaprVar = this.zzd;
        if (zzaprVar != null) {
            zzaprVar.zzb(zzadxVar, zzapoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzm = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        zzgr.zzf(this.zzg);
        this.zzh.zzb();
        zzaor zzaorVar = this.zzf;
        if (zzaorVar != null) {
            zzaorVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = C.TIME_UNSET;
        this.zzo = C.TIME_UNSET;
    }

    public zzaoe(@Nullable zzapr zzaprVar) {
        zzfu zzfuVar;
        this.zzd = zzaprVar;
        this.zzg = new boolean[4];
        this.zzh = new zzaod(128);
        if (zzaprVar != null) {
            this.zzf = new zzaor(178, 128);
            zzfuVar = new zzfu();
        } else {
            zzfuVar = null;
            this.zzf = null;
        }
        this.zze = zzfuVar;
        this.zzm = C.TIME_UNSET;
        this.zzo = C.TIME_UNSET;
    }
}
