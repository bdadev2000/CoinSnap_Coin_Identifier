package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzakw implements zzald {
    private final zzalc zza;
    private final long zzb;
    private final long zzc;
    private final zzali zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzakw(zzali zzaliVar, long j7, long j9, long j10, long j11, boolean z8) {
        boolean z9;
        if (j7 >= 0 && j9 > j7) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzeq.zzd(z9);
        this.zzd = zzaliVar;
        this.zzb = j7;
        this.zzc = j9;
        if (j10 != j9 - j7 && !z8) {
            this.zze = 0;
        } else {
            this.zzf = j11;
            this.zze = 4;
        }
        this.zza = new zzalc();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzald
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzadv r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.zzd(com.google.android.gms.internal.ads.zzadv):long");
    }

    @Override // com.google.android.gms.internal.ads.zzald
    @Nullable
    public final /* bridge */ /* synthetic */ zzaet zze() {
        zzaku zzakuVar = null;
        if (this.zzf != 0) {
            return new zzakv(this, zzakuVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final void zzg(long j7) {
        this.zzh = Math.max(0L, Math.min(j7, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
