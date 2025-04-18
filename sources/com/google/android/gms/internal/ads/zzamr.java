package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzamr implements zzamm {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzaod zzb;

    @Nullable
    private final zzed zzc;
    private final boolean[] zzd;
    private final zzamp zze;

    @Nullable
    private final zzane zzf;
    private zzamq zzg;
    private long zzh;
    private String zzi;
    private zzadx zzj;
    private boolean zzk;
    private long zzl;

    public zzamr() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    @Override // com.google.android.gms.internal.ads.zzamm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzed r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.zza(com.google.android.gms.internal.ads.zzed):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzi = zzaoaVar.zzb();
        zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzamq(zzw);
        zzaod zzaodVar = this.zzb;
        if (zzaodVar != null) {
            zzaodVar.zzb(zzacuVar, zzaoaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
        zzdb.zzb(this.zzg);
        if (z10) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzl = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        zzfp.zzh(this.zzd);
        this.zze.zzb();
        zzamq zzamqVar = this.zzg;
        if (zzamqVar != null) {
            zzamqVar.zzd();
        }
        zzane zzaneVar = this.zzf;
        if (zzaneVar != null) {
            zzaneVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = C.TIME_UNSET;
    }

    public zzamr(@Nullable zzaod zzaodVar) {
        zzed zzedVar;
        this.zzb = zzaodVar;
        this.zzd = new boolean[4];
        this.zze = new zzamp(128);
        this.zzl = C.TIME_UNSET;
        if (zzaodVar != null) {
            this.zzf = new zzane(178, 128);
            zzedVar = new zzed();
        } else {
            zzedVar = null;
            this.zzf = null;
        }
        this.zzc = zzedVar;
    }
}
