package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaon implements zzaoc {
    private final zzapd zza;
    private String zzb;
    private zzafa zzc;
    private zzaom zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaor zzg = new zzaor(32, 128);
    private final zzaor zzh = new zzaor(33, 128);
    private final zzaor zzi = new zzaor(34, 128);
    private final zzaor zzj = new zzaor(39, 128);
    private final zzaor zzk = new zzaor(40, 128);
    private long zzm = C.TIME_UNSET;
    private final zzfu zzn = new zzfu();

    public zzaon(zzapd zzapdVar) {
        this.zza = zzapdVar;
    }

    private final void zzf(byte[] bArr, int i9, int i10) {
        this.zzd.zzb(bArr, i9, i10);
        if (!this.zze) {
            this.zzg.zza(bArr, i9, i10);
            this.zzh.zza(bArr, i9, i10);
            this.zzi.zza(bArr, i9, i10);
        }
        this.zzj.zza(bArr, i9, i10);
        this.zzk.zza(bArr, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfu r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaon.zza(com.google.android.gms.internal.ads.zzfu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzb = zzapoVar.zzb();
        zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzaom(zzw);
        this.zza.zzb(zzadxVar, zzapoVar);
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
        this.zzl = 0L;
        this.zzm = C.TIME_UNSET;
        zzgr.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzaom zzaomVar = this.zzd;
        if (zzaomVar != null) {
            zzaomVar.zzc();
        }
    }
}
