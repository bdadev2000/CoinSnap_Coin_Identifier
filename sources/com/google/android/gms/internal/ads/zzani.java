package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public final class zzani implements zzamz {
    private final zzaod zza;
    private String zzb;
    private zzaeh zzc;
    private zzanh zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzanr zzg = new zzanr(32, 128);
    private final zzanr zzh = new zzanr(33, 128);
    private final zzanr zzi = new zzanr(34, 128);
    private final zzanr zzj = new zzanr(39, 128);
    private final zzanr zzk = new zzanr(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzek zzn = new zzek();

    public zzani(zzaod zzaodVar) {
        this.zza = zzaodVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i2, int i3) {
        this.zzd.zzc(bArr, i2, i3);
        if (!this.zze) {
            this.zzg.zza(bArr, i2, i3);
            this.zzh.zza(bArr, i2, i3);
            this.zzi.zza(bArr, i2, i3);
        }
        this.zzj.zza(bArr, i2, i3);
        this.zzk.zza(bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c1  */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r29) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzani.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzb = zzaonVar.zzb();
        zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzanh(zzw);
        this.zza.zzb(zzadeVar, zzaonVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
        zzdi.zzb(this.zzc);
        int i2 = zzeu.zza;
        if (z2) {
            this.zza.zzc();
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzm = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfs.zzh(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzc();
        zzanh zzanhVar = this.zzd;
        if (zzanhVar != null) {
            zzanhVar.zzd();
        }
    }
}
