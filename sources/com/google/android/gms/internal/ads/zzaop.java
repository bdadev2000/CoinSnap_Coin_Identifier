package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaop implements zzaoc {

    @Nullable
    private final String zza;
    private final int zzb;
    private final zzfu zzc;
    private final zzft zzd;
    private zzafa zze;
    private String zzf;
    private zzan zzg;
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

    public zzaop(@Nullable String str, int i9) {
        this.zza = str;
        this.zzb = i9;
        zzfu zzfuVar = new zzfu(1024);
        this.zzc = zzfuVar;
        byte[] zzM = zzfuVar.zzM();
        this.zzd = new zzft(zzM, zzM.length);
        this.zzl = C.TIME_UNSET;
    }

    private final int zzf(zzft zzftVar) throws zzch {
        int zza = zzftVar.zza();
        zzacp zzb = zzacq.zzb(zzftVar, true);
        this.zzv = zzb.zzc;
        this.zzs = zzb.zza;
        this.zzu = zzb.zzb;
        return zza - zzftVar.zza();
    }

    private static long zzg(zzft zzftVar) {
        return zzftVar.zzd((zzftVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0159, code lost:
    
        if (r14.zzm == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfu r15) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaop.zza(com.google.android.gms.internal.ads.zzfu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zze = zzadxVar.zzw(zzapoVar.zza(), 1);
        this.zzf = zzapoVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzl = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzh = 0;
        this.zzl = C.TIME_UNSET;
        this.zzm = false;
    }
}
