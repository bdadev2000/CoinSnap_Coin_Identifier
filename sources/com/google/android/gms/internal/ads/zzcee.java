package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzcee extends zzcdv implements zzcbz {
    public static final /* synthetic */ int zzd = 0;
    private zzcca zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdn zzi;
    private long zzj;
    private long zzk;

    public zzcee(zzccj zzccjVar, zzcci zzcciVar) {
        super(zzccjVar);
        zzcew zzcewVar = new zzcew(zzccjVar.getContext(), zzcciVar, (zzccj) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcewVar;
        zzcewVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + RemoteSettings.FORWARD_SLASH_STRING + exc.getClass().getCanonicalName() + CertificateUtil.DELIMITER + exc.getMessage();
    }

    private final void zzx(long j2) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzced
            @Override // java.lang.Runnable
            public final void run() {
                zzcee.this.zzb();
            }
        }, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcca zzccaVar = this.zze;
        if (zzccaVar != null) {
            zzccaVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzD(int i2, int i3) {
    }

    public final zzcca zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcca zzccaVar = this.zze;
        this.zze = null;
        return zzccaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb() {
        String str;
        zzcee zzceeVar;
        zzcee zzceeVar2;
        long longValue;
        long intValue;
        boolean booleanValue;
        zzcee zzceeVar3;
        long j2;
        long j3;
        String str2;
        zzcee zzceeVar4;
        long j4;
        String zzc = zzc(this.zzf);
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzE)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzq)).intValue();
            booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue();
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzceeVar = this;
        }
        try {
            synchronized (this) {
                try {
                    if (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zzj > longValue) {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.zzh) {
                        if (!this.zze.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long zzz = this.zze.zzz();
                        if (zzz > 0) {
                            long zzv = this.zze.zzv();
                            if (zzv != this.zzk) {
                                try {
                                    j3 = intValue;
                                    str2 = zzc;
                                    try {
                                        zzo(this.zzf, zzc, zzv, zzz, zzv > 0, booleanValue != 0 ? this.zze.zzA() : -1L, booleanValue != 0 ? this.zze.zzx() : -1L, booleanValue != 0 ? this.zze.zzB() : -1L, zzcca.zzs(), zzcca.zzu());
                                        zzceeVar4 = this;
                                        j2 = zzv;
                                    } catch (Throwable th) {
                                        th = th;
                                        zzceeVar4 = this;
                                        str = str2;
                                        zzceeVar = zzceeVar4;
                                        try {
                                            throw th;
                                        } catch (Exception e2) {
                                            e = e2;
                                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + zzceeVar.zzf + " Exception: " + e.getMessage());
                                            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            zzceeVar.zzg(zzceeVar.zzf, str, "error", zzd("error", e));
                                            zzceeVar2 = zzceeVar;
                                            com.google.android.gms.ads.internal.zzu.zzy().zzc(zzceeVar2.zzi);
                                        }
                                    }
                                    try {
                                        zzceeVar4.zzk = j2;
                                        j4 = zzz;
                                        zzceeVar4 = zzceeVar4;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str2;
                                        zzceeVar = zzceeVar4;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str2 = zzc;
                                    zzceeVar4 = this;
                                }
                            } else {
                                j2 = zzv;
                                j3 = intValue;
                                str2 = zzc;
                                zzceeVar4 = this;
                                j4 = zzz;
                            }
                            if (j2 >= j4) {
                                zzceeVar4.zzj(zzceeVar4.zzf, str2, j4);
                                zzceeVar2 = zzceeVar4;
                            } else {
                                long zzw = zzceeVar4.zze.zzw();
                                zzceeVar3 = zzceeVar4;
                                if (zzw >= j3) {
                                    zzceeVar3 = zzceeVar4;
                                    if (j2 > 0) {
                                        zzceeVar2 = zzceeVar4;
                                    }
                                }
                            }
                        } else {
                            zzceeVar3 = this;
                        }
                        zzceeVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzF)).longValue());
                        return;
                    }
                    zzceeVar2 = this;
                    com.google.android.gms.ads.internal.zzu.zzy().zzc(zzceeVar2.zzi);
                } catch (Throwable th4) {
                    th = th4;
                    str = zzc;
                    zzceeVar = this;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            zzceeVar = booleanValue;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
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

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(final boolean z2, final long j2) {
        final zzccj zzccjVar = (zzccj) this.zzc.get();
        if (zzccjVar != null) {
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcec
                @Override // java.lang.Runnable
                public final void run() {
                    zzccj.this.zzv(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzm(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzp(int i2) {
        this.zze.zzJ(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzq(int i2) {
        this.zze.zzK(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzr(int i2) {
        this.zze.zzM(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzs(int i2) {
        this.zze.zzN(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
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
    @Override // com.google.android.gms.internal.ads.zzcdv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzu(java.lang.String r46, java.lang.String[] r47) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcee.zzu(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzw(String str, String[] strArr, zzcdn zzcdnVar) {
        this.zzf = str;
        this.zzi = zzcdnVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzccj zzccjVar = (zzccj) this.zzc.get();
            if (zzccjVar != null) {
                zzccjVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e));
            return false;
        }
    }
}
