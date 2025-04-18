package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class zzauu implements zzaux {

    @Nullable
    private static zzauu zzb;
    private final Context zzc;
    private final zzfre zzd;
    private final zzfrl zze;
    private final zzfrn zzf;
    private final zzavz zzg;
    private final zzfpp zzh;
    private final Executor zzi;
    private final zzfrk zzj;
    private final zzawo zzl;

    @Nullable
    private final zzawg zzm;

    @Nullable
    private final zzavx zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzauu(@NonNull Context context, @NonNull zzfpp zzfppVar, @NonNull zzfre zzfreVar, @NonNull zzfrl zzfrlVar, @NonNull zzfrn zzfrnVar, @NonNull zzavz zzavzVar, @NonNull Executor executor, @NonNull zzfpk zzfpkVar, int i10, @Nullable zzawo zzawoVar, @Nullable zzawg zzawgVar, @Nullable zzavx zzavxVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfppVar;
        this.zzd = zzfreVar;
        this.zze = zzfrlVar;
        this.zzf = zzfrnVar;
        this.zzg = zzavzVar;
        this.zzi = executor;
        this.zzr = i10;
        this.zzl = zzawoVar;
        this.zzm = zzawgVar;
        this.zzn = zzavxVar;
        this.zzq = false;
        this.zzj = new zzaus(this, zzfpkVar);
    }

    public static synchronized zzauu zza(@NonNull Context context, @NonNull zzarj zzarjVar, boolean z10) {
        zzauu zzs;
        synchronized (zzauu.class) {
            zzfpq zzc = zzfpr.zzc();
            zzc.zza(zzarjVar.zzf());
            zzc.zzg(zzarjVar.zzi());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzc.zzh(), z10);
        }
        return zzs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r4.zzc().zzj().equals(r5.zzj()) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzauu r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauu.zzj(com.google.android.gms.internal.ads.zzauu):void");
    }

    private static synchronized zzauu zzs(@NonNull Context context, @NonNull Executor executor, zzfpr zzfprVar, boolean z10) {
        zzauu zzauuVar;
        zzavi zzaviVar;
        zzawo zzawoVar;
        zzawg zzawgVar;
        zzfpr zzfprVar2;
        zzavx zzavxVar;
        synchronized (zzauu.class) {
            if (zzb == null) {
                zzfpp zza = zzfpp.zza(context, executor, z10);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdv)).booleanValue()) {
                    zzaviVar = zzavi.zzc(context);
                } else {
                    zzaviVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdw)).booleanValue()) {
                    zzawoVar = zzawo.zzd(context, executor);
                } else {
                    zzawoVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
                    zzawgVar = new zzawg();
                } else {
                    zzawgVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue()) {
                    zzavxVar = new zzavx();
                    zzfprVar2 = zzfprVar;
                } else {
                    zzfprVar2 = zzfprVar;
                    zzavxVar = null;
                }
                zzfqi zze = zzfqi.zze(context, executor, zza, zzfprVar2);
                zzavy zzavyVar = new zzavy(context);
                zzavz zzavzVar = new zzavz(zzfprVar, zze, new zzawm(context, zzavyVar), zzavyVar, zzaviVar, zzawoVar, zzawgVar, zzavxVar);
                int zzb2 = zzfqr.zzb(context, zza);
                zzfpk zzfpkVar = new zzfpk();
                zzauu zzauuVar2 = new zzauu(context, zza, new zzfre(context, zzb2), new zzfrl(context, zzb2, new zzaur(zza), ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcv)).booleanValue()), new zzfrn(context, zzavzVar, zza, zzfpkVar), zzavzVar, executor, zzfpkVar, zzb2, zzawoVar, zzawgVar, zzavxVar);
                zzb = zzauuVar2;
                zzauuVar2.zzm();
                zzb.zzp();
            }
            zzauuVar = zzb;
        }
        return zzauuVar;
    }

    private final void zzt() {
        zzawo zzawoVar = this.zzl;
        if (zzawoVar != null) {
            zzawoVar.zzh();
        }
    }

    private final zzfrd zzu(int i10) {
        if (!zzfqr.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzct)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzd(Context context, @Nullable String str, @Nullable View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zze(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzk(@Nullable MotionEvent motionEvent) {
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfrm e2) {
                this.zzh.zzc(e2.zza(), -1L, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzl(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlG)).booleanValue() && (displayMetrics = this.zzc.getResources().getDisplayMetrics()) != null) {
            float f10 = i10;
            float f11 = displayMetrics.density;
            float f12 = i11;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain);
            obtain.recycle();
            float f13 = displayMetrics.density;
            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain2);
            obtain2.recycle();
            float f14 = displayMetrics.density;
            MotionEvent obtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain3);
            obtain3.recycle();
        }
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfrd zzu = zzu(1);
        if (zzu != null) {
            if (this.zzf.zzc(zzu)) {
                this.zzq = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavx zzavxVar = this.zzn;
        if (zzavxVar != null) {
            zzavxVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzo(@Nullable View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (!this.zzp) {
            synchronized (this.zzo) {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfrd zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzfqr.zza(this.zzr)) {
                        this.zzi.execute(new zzaut(this));
                    }
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
