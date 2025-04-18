package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzamv implements zzamm {
    private final zzanq zza;
    private String zzb;
    private zzadx zzc;
    private zzamu zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzane zzg = new zzane(32, 128);
    private final zzane zzh = new zzane(33, 128);
    private final zzane zzi = new zzane(34, 128);
    private final zzane zzj = new zzane(39, 128);
    private final zzane zzk = new zzane(40, 128);
    private long zzm = C.TIME_UNSET;
    private final zzed zzn = new zzed();

    public zzamv(zzanq zzanqVar) {
        this.zza = zzanqVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzc(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c1  */
    @Override // com.google.android.gms.internal.ads.zzamm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzed r29) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zza(com.google.android.gms.internal.ads.zzed):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzb = zzaoaVar.zzb();
        zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzamu(zzw);
        this.zza.zzb(zzacuVar, zzaoaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
        zzdb.zzb(this.zzc);
        int i10 = zzen.zza;
        if (z10) {
            this.zza.zzc();
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzm = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzl = 0L;
        this.zzm = C.TIME_UNSET;
        zzfp.zzh(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzc();
        zzamu zzamuVar = this.zzd;
        if (zzamuVar != null) {
            zzamuVar.zzd();
        }
    }
}
