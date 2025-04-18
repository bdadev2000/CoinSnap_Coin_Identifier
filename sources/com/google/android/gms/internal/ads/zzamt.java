package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzamt implements zzamm {
    private final zzanq zza;
    private long zze;
    private String zzg;
    private zzadx zzh;
    private zzams zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzane zzb = new zzane(7, 128);
    private final zzane zzc = new zzane(8, 128);
    private final zzane zzd = new zzane(6, 128);
    private long zzk = C.TIME_UNSET;
    private final zzed zzm = new zzed();

    public zzamt(zzanq zzanqVar, boolean z10, boolean z11) {
        this.zza = zzanqVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i10, i11);
            this.zzc.zza(bArr, i10, i11);
        }
        this.zzd.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzed r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamt.zza(com.google.android.gms.internal.ads.zzed):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzg = zzaoaVar.zzb();
        zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzams(zzw, false, false);
        this.zza.zzb(zzacuVar, zzaoaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
        zzdb.zzb(this.zzh);
        int i10 = zzen.zza;
        if (z10) {
            this.zza.zzc();
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzk = j3;
        int i11 = i10 & 2;
        this.zzl = (i11 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = C.TIME_UNSET;
        zzfp.zzh(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        this.zza.zzc();
        zzams zzamsVar = this.zzi;
        if (zzamsVar != null) {
            zzamsVar.zzd();
        }
    }
}
