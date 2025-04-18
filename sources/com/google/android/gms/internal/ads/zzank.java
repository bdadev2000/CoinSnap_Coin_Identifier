package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzank implements zzamz {

    @Nullable
    private final String zza;
    private final int zzb;
    private final zzek zzc;
    private final zzej zzd;
    private zzaeh zze;
    private String zzf;
    private zzaf zzg;
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

    public zzank(@Nullable String str, int i2) {
        this.zza = str;
        this.zzb = i2;
        zzek zzekVar = new zzek(1024);
        this.zzc = zzekVar;
        byte[] zzN = zzekVar.zzN();
        this.zzd = new zzej(zzN, zzN.length);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzej zzejVar) throws zzbo {
        int zza = zzejVar.zza();
        zzabx zzb = zzaby.zzb(zzejVar, true);
        this.zzv = zzb.zzc;
        this.zzs = zzb.zza;
        this.zzu = zzb.zzb;
        return zza - zzejVar.zza();
    }

    private static long zzg(zzej zzejVar) {
        return zzejVar.zzd((zzejVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0159, code lost:
    
        if (r14.zzm == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r15) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzank.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zze = zzadeVar.zzw(zzaonVar.zza(), 1);
        this.zzf = zzaonVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzl = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }
}
