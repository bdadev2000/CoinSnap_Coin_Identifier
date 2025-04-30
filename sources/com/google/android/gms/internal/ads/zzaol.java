package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaol implements zzaoc {
    private final zzapd zza;
    private long zze;
    private String zzg;
    private zzafa zzh;
    private zzaok zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaor zzb = new zzaor(7, 128);
    private final zzaor zzc = new zzaor(8, 128);
    private final zzaor zzd = new zzaor(6, 128);
    private long zzk = C.TIME_UNSET;
    private final zzfu zzm = new zzfu();

    public zzaol(zzapd zzapdVar, boolean z8, boolean z9) {
        this.zza = zzapdVar;
    }

    private final void zzf(byte[] bArr, int i9, int i10) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i9, i10);
            this.zzc.zza(bArr, i9, i10);
        }
        this.zzd.zza(bArr, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfu r19) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaol.zza(com.google.android.gms.internal.ads.zzfu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzg = zzapoVar.zzb();
        zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzaok(zzw, false, false);
        this.zza.zzb(zzadxVar, zzapoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzk = j7;
        int i10 = i9 & 2;
        this.zzl = (i10 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = C.TIME_UNSET;
        zzgr.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaok zzaokVar = this.zzi;
        if (zzaokVar != null) {
            zzaokVar.zzc();
        }
    }
}
