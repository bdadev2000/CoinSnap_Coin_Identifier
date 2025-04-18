package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaoh implements zzacr {
    private zzacu zza;
    private zzadx zzb;
    private zzaof zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r1 != 65534) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        if (r2 == 32) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r19, com.google.android.gms.internal.ads.zzadn r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoh.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zza = zzacuVar;
        this.zzb = zzacuVar.zzw(0, 1);
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzc = j3 == 0 ? 0 : 4;
        zzaof zzaofVar = this.zze;
        if (zzaofVar != null) {
            zzaofVar.zzb(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return zzaok.zzc(zzacsVar);
    }
}
