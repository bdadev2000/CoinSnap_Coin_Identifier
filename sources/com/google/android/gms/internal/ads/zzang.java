package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public final class zzang implements zzamz {
    private final zzaod zza;
    private long zze;
    private String zzg;
    private zzaeh zzh;
    private zzanf zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzanr zzb = new zzanr(7, 128);
    private final zzanr zzc = new zzanr(8, 128);
    private final zzanr zzd = new zzanr(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzek zzm = new zzek();

    public zzang(zzaod zzaodVar, boolean z2, boolean z3) {
        this.zza = zzaodVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i2, int i3) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i2, i3);
            this.zzc.zza(bArr, i2, i3);
        }
        this.zzd.zza(bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzg = zzaonVar.zzb();
        zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzanf(zzw, false, false);
        this.zza.zzb(zzadeVar, zzaonVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
        zzdi.zzb(this.zzh);
        int i2 = zzeu.zza;
        if (z2) {
            this.zza.zzc();
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzk = j2;
        int i3 = i2 & 2;
        this.zzl = (i3 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfs.zzh(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        this.zza.zzc();
        zzanf zzanfVar = this.zzi;
        if (zzanfVar != null) {
            zzanfVar.zzd();
        }
    }
}
