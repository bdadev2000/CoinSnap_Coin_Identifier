package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzajy implements zzake {
    private final zzakd zza;
    private final long zzb;
    private final long zzc;
    private final zzakj zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajy(zzakj zzakjVar, long j2, long j3, long j4, long j5, boolean z2) {
        zzdi.zzd(j2 >= 0 && j3 > j2);
        this.zzd = zzakjVar;
        this.zzb = j2;
        this.zzc = j3;
        if (j4 == j3 - j2 || z2) {
            this.zzf = j5;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzakd();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // com.google.android.gms.internal.ads.zzake
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzadc r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajy.zzd(com.google.android.gms.internal.ads.zzadc):long");
    }

    @Override // com.google.android.gms.internal.ads.zzake
    @Nullable
    public final /* bridge */ /* synthetic */ zzaea zze() {
        zzajw zzajwVar = null;
        if (this.zzf != 0) {
            return new zzajx(this, zzajwVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzg(long j2) {
        this.zzh = Math.max(0L, Math.min(j2, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
