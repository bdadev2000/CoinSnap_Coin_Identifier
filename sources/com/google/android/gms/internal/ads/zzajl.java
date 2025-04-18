package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzajl implements zzajr {
    private final zzajq zza;
    private final long zzb;
    private final long zzc;
    private final zzajw zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajl(zzajw zzajwVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdb.zzd(z11);
        this.zzd = zzajwVar;
        this.zzb = j3;
        this.zzc = j10;
        if (j11 != j10 - j3 && !z10) {
            this.zze = 0;
        } else {
            this.zzf = j12;
            this.zze = 4;
        }
        this.zza = new zzajq();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // com.google.android.gms.internal.ads.zzajr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzacs r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajl.zzd(com.google.android.gms.internal.ads.zzacs):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    @Nullable
    public final /* bridge */ /* synthetic */ zzadq zze() {
        zzajk zzajkVar = null;
        if (this.zzf != 0) {
            return new zzajj(this, zzajkVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final void zzg(long j3) {
        this.zzh = Math.max(0L, Math.min(j3, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
