package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzcfy extends zzcfp implements zzcdu {
    public static final /* synthetic */ int zzd = 0;
    private zzcdv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcfh zzi;
    private long zzj;
    private long zzk;

    public zzcfy(zzcee zzceeVar, zzced zzcedVar) {
        super(zzceeVar);
        zzcgq zzcgqVar = new zzcgq(zzceeVar.getContext(), zzcedVar, (zzcee) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcgqVar;
        zzcgqVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j7) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
            @Override // java.lang.Runnable
            public final void run() {
                zzcfy.this.zzb();
            }
        }, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcdv zzcdvVar = this.zze;
        if (zzcdvVar != null) {
            zzcdvVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzD(int i9, int i10) {
    }

    public final zzcdv zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcdv zzcdvVar = this.zze;
        this.zze = null;
        return zzcdvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb() {
        String str;
        zzcfy zzcfyVar;
        zzcfy zzcfyVar2;
        long longValue;
        long intValue;
        boolean booleanValue;
        zzcfy zzcfyVar3;
        long j7;
        long j9;
        String str2;
        zzcfy zzcfyVar4;
        long j10;
        boolean z8;
        long j11;
        long j12;
        String zzc = zzc(this.zzf);
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzx)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzw)).intValue();
            booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue();
        } catch (Exception e4) {
            e = e4;
            str = zzc;
            zzcfyVar = this;
        }
        try {
            synchronized (this) {
                try {
                    if (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zzj <= longValue) {
                        if (!this.zzg) {
                            if (this.zzh) {
                                zzcfyVar2 = this;
                            } else {
                                if (this.zze.zzV()) {
                                    long zzz = this.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = this.zze.zzv();
                                        if (zzv != this.zzk) {
                                            if (zzv > 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            boolean z9 = z8;
                                            try {
                                                String str3 = this.zzf;
                                                long j13 = -1;
                                                if (booleanValue != 0) {
                                                    j11 = this.zze.zzA();
                                                } else {
                                                    j11 = -1;
                                                }
                                                if (booleanValue != 0) {
                                                    j12 = this.zze.zzx();
                                                } else {
                                                    j12 = -1;
                                                }
                                                if (booleanValue != 0) {
                                                    j13 = this.zze.zzB();
                                                }
                                                long j14 = j11;
                                                j9 = intValue;
                                                str2 = zzc;
                                                try {
                                                    zzo(str3, zzc, zzv, zzz, z9, j14, j12, j13, zzcdv.zzs(), zzcdv.zzu());
                                                    zzcfyVar4 = this;
                                                    j7 = zzv;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    zzcfyVar4 = this;
                                                    str = str2;
                                                    zzcfyVar = zzcfyVar4;
                                                    try {
                                                        throw th;
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + zzcfyVar.zzf + " Exception: " + e.getMessage());
                                                        com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                                        release();
                                                        zzcfyVar.zzg(zzcfyVar.zzf, str, "error", zzd("error", e));
                                                        zzcfyVar2 = zzcfyVar;
                                                        com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfyVar2.zzi);
                                                        return;
                                                    }
                                                }
                                                try {
                                                    zzcfyVar4.zzk = j7;
                                                    j10 = zzz;
                                                    zzcfyVar4 = zzcfyVar4;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str = str2;
                                                    zzcfyVar = zzcfyVar4;
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str2 = zzc;
                                                zzcfyVar4 = this;
                                            }
                                        } else {
                                            j7 = zzv;
                                            j9 = intValue;
                                            str2 = zzc;
                                            zzcfyVar4 = this;
                                            j10 = zzz;
                                        }
                                        if (j7 >= j10) {
                                            zzcfyVar4.zzj(zzcfyVar4.zzf, str2, j10);
                                            zzcfyVar2 = zzcfyVar4;
                                        } else {
                                            long zzw = zzcfyVar4.zze.zzw();
                                            zzcfyVar3 = zzcfyVar4;
                                            if (zzw >= j9) {
                                                zzcfyVar3 = zzcfyVar4;
                                                if (j7 > 0) {
                                                    zzcfyVar2 = zzcfyVar4;
                                                }
                                            }
                                        }
                                    } else {
                                        zzcfyVar3 = this;
                                    }
                                    zzcfyVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzy)).longValue());
                                    return;
                                }
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfyVar2.zzi);
                            return;
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                } catch (Throwable th4) {
                    th = th4;
                    str = zzc;
                    zzcfyVar = this;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            zzcfyVar = booleanValue;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
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

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzi(final boolean z8, final long j7) {
        final zzcee zzceeVar = (zzcee) this.zzc.get();
        if (zzceeVar != null) {
            zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcee.this.zzv(z8, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzm(int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzp(int i9) {
        this.zze.zzJ(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzq(int i9) {
        this.zze.zzK(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzr(int i9) {
        this.zze.zzM(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzs(int i9) {
        this.zze.zzN(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0162, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.zzcfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzu(java.lang.String r46, java.lang.String[] r47) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfy.zzu(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final boolean zzw(String str, String[] strArr, zzcfh zzcfhVar) {
        this.zzf = str;
        this.zzi = zzcfhVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i9 = 0; i9 < strArr.length; i9++) {
                uriArr[i9] = Uri.parse(strArr[i9]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcee zzceeVar = (zzcee) this.zzc.get();
            if (zzceeVar != null) {
                zzceeVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + e4.getMessage());
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e4, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e4));
            return false;
        }
    }
}
