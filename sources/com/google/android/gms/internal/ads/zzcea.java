package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzcea extends zzcdr implements zzcbv {
    public static final /* synthetic */ int zzd = 0;
    private zzcbw zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdj zzi;
    private long zzj;
    private long zzk;

    public zzcea(zzccf zzccfVar, zzcce zzcceVar) {
        super(zzccfVar);
        zzces zzcesVar = new zzces(zzccfVar.getContext(), zzcceVar, (zzccf) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcesVar;
        zzcesVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j3) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdz
            @Override // java.lang.Runnable
            public final void run() {
                zzcea.this.zzb();
            }
        }, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcbw zzcbwVar = this.zze;
        if (zzcbwVar != null) {
            zzcbwVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzD(int i10, int i11) {
    }

    public final zzcbw zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbw zzcbwVar = this.zze;
        this.zze = null;
        return zzcbwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzcdr, com.google.android.gms.internal.ads.zzcea] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcea] */
    /* JADX WARN: Type inference failed for: r3v31 */
    public final /* synthetic */ void zzb() {
        String str;
        zzcea zzceaVar;
        zzcea zzceaVar2;
        ?? longValue;
        long intValue;
        zzcea zzceaVar3;
        long j3;
        long j10;
        String str2;
        long j11;
        boolean z10;
        String str3;
        long j12;
        long j13;
        long j14;
        long j15;
        String zzc = zzc(this.zzf);
        String str4 = "error";
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzH)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzr)).intValue();
            zzceaVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue();
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            str = zzc;
            zzceaVar = this;
        }
        synchronized (this) {
            try {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                long j16 = this.zzj;
                if (currentTimeMillis - j16 <= longValue) {
                    try {
                        if (!this.zzg) {
                            if (this.zzh) {
                                zzceaVar2 = this;
                            } else {
                                if (this.zze.zzV()) {
                                    long zzz = this.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = this.zze.zzv();
                                        if (zzv != this.zzk) {
                                            if (zzv > 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            boolean z11 = z10;
                                            try {
                                                str3 = this.zzf;
                                                j12 = -1;
                                                if (zzceaVar != 0) {
                                                    j13 = this.zze.zzA();
                                                } else {
                                                    j13 = -1;
                                                }
                                                if (zzceaVar != 0) {
                                                    j14 = this.zze.zzx();
                                                } else {
                                                    j14 = -1;
                                                }
                                                if (zzceaVar != 0) {
                                                    j12 = this.zze.zzB();
                                                }
                                                j15 = j13;
                                                j10 = intValue;
                                                str2 = zzc;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzceaVar = this;
                                                str = zzc;
                                            }
                                            try {
                                                zzo(str3, zzc, zzv, zzz, z11, j15, j14, j12, zzcbw.zzs(), zzcbw.zzu());
                                                zzceaVar = this;
                                                j3 = zzv;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                zzceaVar = this;
                                                str = str2;
                                                throw th;
                                            }
                                            try {
                                                zzceaVar.zzk = j3;
                                                j11 = zzz;
                                                zzceaVar = zzceaVar;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                str = str2;
                                                throw th;
                                            }
                                        } else {
                                            j3 = zzv;
                                            j10 = intValue;
                                            str2 = zzc;
                                            zzceaVar = this;
                                            j11 = zzz;
                                        }
                                        if (j3 >= j11) {
                                            zzceaVar.zzj(zzceaVar.zzf, str2, j11);
                                            zzceaVar2 = zzceaVar;
                                        } else {
                                            long zzw = zzceaVar.zze.zzw();
                                            zzceaVar3 = zzceaVar;
                                            if (zzw >= j10) {
                                                zzceaVar3 = zzceaVar;
                                                if (j3 > 0) {
                                                    zzceaVar2 = zzceaVar;
                                                }
                                            }
                                        }
                                    } else {
                                        zzceaVar3 = this;
                                    }
                                    zzceaVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzI)).longValue());
                                    return;
                                }
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            com.google.android.gms.ads.internal.zzv.zzz().zzc(zzceaVar2.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th6) {
                        th = th6;
                        str4 = longValue;
                        str = j16;
                    }
                } else {
                    str = zzc;
                    zzceaVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + ((long) longValue) + " ms");
                    } catch (Throwable th7) {
                        th = th7;
                        str4 = "downloadTimeout";
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                str = zzc;
                zzceaVar = this;
            }
            try {
                throw th;
            } catch (Exception e10) {
                e = e10;
                String str5 = str4;
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + zzceaVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzceaVar.zzg(zzceaVar.zzf, str, str5, zzd(str5, e));
                zzceaVar2 = zzceaVar;
                com.google.android.gms.ads.internal.zzv.zzz().zzc(zzceaVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzi(final boolean z10, final long j3) {
        final zzccf zzccfVar = (zzccf) this.zzc.get();
        if (zzccfVar != null) {
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // java.lang.Runnable
                public final void run() {
                    zzccf.this.zzv(z10, j3);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzm(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcdr] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzu(String str, String[] strArr) {
        ?? r6;
        String str2;
        ?? r52;
        long j3;
        long j10;
        long j11;
        ?? r12;
        long j12;
        String str3;
        long j13;
        long j14;
        boolean z10;
        long j15;
        long j16;
        long j17;
        zzcea zzceaVar = this;
        String str4 = str;
        zzceaVar.zzf = str4;
        String str5 = "error";
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            zzceaVar.zze.zzF(uriArr, zzceaVar.zzb);
            zzccf zzccfVar = (zzccf) zzceaVar.zzc.get();
            if (zzccfVar != null) {
                zzccfVar.zzt(zzc, zzceaVar);
            }
            Clock zzC = com.google.android.gms.ads.internal.zzv.zzC();
            long currentTimeMillis = zzC.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzI)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzH)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzr)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue();
            long j18 = -1;
            long j19 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzC.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!zzceaVar.zzg) {
                                if (zzceaVar.zzh) {
                                    break;
                                }
                                if (zzceaVar.zze.zzV()) {
                                    long zzz = zzceaVar.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = zzceaVar.zze.zzv();
                                        if (zzv != j18) {
                                            if (zzv > 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (booleanValue) {
                                                j15 = zzceaVar.zze.zzA();
                                            } else {
                                                j15 = -1;
                                            }
                                            if (booleanValue) {
                                                j16 = zzceaVar.zze.zzx();
                                            } else {
                                                j16 = -1;
                                            }
                                            if (booleanValue) {
                                                j17 = zzceaVar.zze.zzB();
                                            } else {
                                                j17 = -1;
                                            }
                                            try {
                                                j3 = j19;
                                                long j20 = zzz;
                                                j10 = longValue2;
                                                j12 = longValue;
                                                str3 = zzc;
                                                try {
                                                    zzo(str, zzc, zzv, j20, z10, j15, j16, j17, zzcbw.zzs(), zzcbw.zzu());
                                                    j14 = zzv;
                                                    j13 = zzz;
                                                    r6 = j20;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r52 = this;
                                                    r6 = str;
                                                    str2 = str3;
                                                    try {
                                                        throw th;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        String str6 = str5;
                                                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                                        com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                                                        release();
                                                        r52.zzg(r6, str2, str6, zzd(str6, e));
                                                        return false;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r52 = this;
                                                r6 = str;
                                                str2 = zzc;
                                            }
                                        } else {
                                            j3 = j19;
                                            j10 = longValue2;
                                            j12 = longValue;
                                            str3 = zzc;
                                            j13 = zzz;
                                            j14 = j18;
                                            r6 = j19;
                                        }
                                        r52 = (zzv > j13 ? 1 : (zzv == j13 ? 0 : -1));
                                        if (r52 >= 0) {
                                            zzj(str, str3, j13);
                                        } else {
                                            try {
                                                zzcea zzceaVar2 = this;
                                                r6 = str;
                                                str2 = str3;
                                                if (zzceaVar2.zze.zzw() < j3 || zzv <= 0) {
                                                    j11 = j12;
                                                    r12 = j14;
                                                    r52 = zzceaVar2;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        j3 = j19;
                                        j10 = longValue2;
                                        r6 = str4;
                                        str2 = zzc;
                                        r52 = zzceaVar;
                                        j11 = longValue;
                                        r12 = j18;
                                    }
                                    try {
                                        try {
                                            r52.wait(j11);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            str5 = r12;
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r6 = str4;
                        str2 = zzc;
                        r52 = zzceaVar;
                    }
                }
                longValue = j11;
                zzceaVar = r52;
                str4 = r6;
                zzc = str2;
                j19 = j3;
                longValue2 = j10;
                j18 = r12;
            }
            return true;
        } catch (Exception e10) {
            e = e10;
            r6 = str4;
            str2 = zzc;
            r52 = zzceaVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzw(String str, String[] strArr, zzcdj zzcdjVar) {
        this.zzf = str;
        this.zzi = zzcdjVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzccf zzccfVar = (zzccf) this.zzc.get();
            if (zzccfVar != null) {
                zzccfVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + e2.getMessage());
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e2));
            return false;
        }
    }
}
