package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzamx implements zzamm {

    @Nullable
    private final String zza;
    private final int zzb;
    private final zzed zzc;
    private final zzec zzd;
    private zzadx zze;
    private String zzf;
    private zzad zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;

    @Nullable
    private String zzv;

    public zzamx(@Nullable String str, int i10) {
        this.zza = str;
        this.zzb = i10;
        zzed zzedVar = new zzed(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.zzc = zzedVar;
        byte[] zzN = zzedVar.zzN();
        this.zzd = new zzec(zzN, zzN.length);
        this.zzl = C.TIME_UNSET;
    }

    private final int zzf(zzec zzecVar) throws zzbh {
        int zza = zzecVar.zza();
        zzabm zzb = zzabo.zzb(zzecVar, true);
        this.zzv = zzb.zzc;
        this.zzs = zzb.zza;
        this.zzu = zzb.zzb;
        return zza - zzecVar.zza();
    }

    private static long zzg(zzec zzecVar) {
        return zzecVar.zzd((zzecVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0159, code lost:
    
        if (r14.zzm == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzamm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzed r15) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zza(com.google.android.gms.internal.ads.zzed):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zze = zzacuVar.zzw(zzaoaVar.zza(), 1);
        this.zzf = zzaoaVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzl = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzh = 0;
        this.zzl = C.TIME_UNSET;
        this.zzm = false;
    }
}
