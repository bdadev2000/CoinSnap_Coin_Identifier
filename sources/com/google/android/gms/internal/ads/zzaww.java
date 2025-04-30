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

/* loaded from: classes2.dex */
public final class zzaww implements zzawz {

    @Nullable
    private static zzaww zzb;
    private final Context zzc;
    private final zzfsx zzd;
    private final zzfte zze;
    private final zzftg zzf;
    private final zzaxy zzg;
    private final zzfre zzh;
    private final Executor zzi;
    private final zzazw zzj;
    private final zzftd zzk;
    private final zzayn zzm;

    @Nullable
    private final zzayf zzn;

    @Nullable
    private final zzaxw zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    public zzaww(@NonNull Context context, @NonNull zzfre zzfreVar, @NonNull zzfsx zzfsxVar, @NonNull zzfte zzfteVar, @NonNull zzftg zzftgVar, @NonNull zzaxy zzaxyVar, @NonNull Executor executor, @NonNull zzfqx zzfqxVar, zzazw zzazwVar, @Nullable zzayn zzaynVar, @Nullable zzayf zzayfVar, @Nullable zzaxw zzaxwVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfreVar;
        this.zzd = zzfsxVar;
        this.zze = zzfteVar;
        this.zzf = zzftgVar;
        this.zzg = zzaxyVar;
        this.zzi = executor;
        this.zzj = zzazwVar;
        this.zzm = zzaynVar;
        this.zzn = zzayfVar;
        this.zzo = zzaxwVar;
        this.zzr = false;
        this.zzk = new zzawu(this, zzfqxVar);
    }

    public static synchronized zzaww zza(@NonNull String str, @NonNull Context context, boolean z8, boolean z9) {
        zzaww zzb2;
        synchronized (zzaww.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z8, z9);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzaww zzb(@NonNull String str, @NonNull Context context, @NonNull Executor executor, boolean z8, boolean z9) {
        zzaww zzawwVar;
        zzaxh zzaxhVar;
        zzayn zzaynVar;
        zzayf zzayfVar;
        zzaxw zzaxwVar;
        synchronized (zzaww.class) {
            try {
                if (zzb == null) {
                    zzfrf zza = zzfrg.zza();
                    zza.zza(str);
                    zza.zzc(z8);
                    zzfrg zzd = zza.zzd();
                    zzfre zza2 = zzfre.zza(context, executor, z9);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdq)).booleanValue()) {
                        zzaxhVar = zzaxh.zzc(context);
                    } else {
                        zzaxhVar = null;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdr)).booleanValue()) {
                        zzaynVar = zzayn.zzd(context, executor);
                    } else {
                        zzaynVar = null;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue()) {
                        zzayfVar = new zzayf();
                    } else {
                        zzayfVar = null;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue()) {
                        zzaxwVar = new zzaxw();
                    } else {
                        zzaxwVar = null;
                    }
                    zzfrx zze = zzfrx.zze(context, executor, zza2, zzd);
                    zzaxx zzaxxVar = new zzaxx(context);
                    zzaxy zzaxyVar = new zzaxy(zzd, zze, new zzayl(context, zzaxxVar), zzaxxVar, zzaxhVar, zzaynVar, zzayfVar, zzaxwVar);
                    zzazw zzb2 = zzfsk.zzb(context, zza2);
                    zzfqx zzfqxVar = new zzfqx();
                    zzaww zzawwVar2 = new zzaww(context, zza2, new zzfsx(context, zzb2), new zzfte(context, zzb2, new zzawt(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzco)).booleanValue()), new zzftg(context, zzaxyVar, zza2, zzfqxVar), zzaxyVar, executor, zzfqxVar, zzb2, zzaynVar, zzayfVar, zzaxwVar);
                    zzb = zzawwVar2;
                    zzawwVar2.zzm();
                    zzb.zzp();
                }
                zzawwVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzawwVar;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzaww zzawwVar) {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfsw zzt = zzawwVar.zzt(1);
        if (zzt != null) {
            String zzk = zzt.zza().zzk();
            str2 = zzt.zza().zzj();
            str = zzk;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzftb zza2 = zzfro.zza(zzawwVar.zzc, 1, zzawwVar.zzj, str, str2, "1", zzawwVar.zzh);
                byte[] bArr = zza2.zzb;
                if (bArr != null && (length = bArr.length) != 0) {
                    try {
                        zzazz zzc = zzazz.zzc(zzhac.zzv(bArr, 0, length), zzhay.zza());
                        if (!zzc.zzd().zzk().isEmpty() && !zzc.zzd().zzj().isEmpty() && zzc.zze().zzB().length != 0) {
                            zzfsw zzt2 = zzawwVar.zzt(1);
                            if (zzt2 != null) {
                                zzbac zza3 = zzt2.zza();
                                if (zzc.zzd().zzk().equals(zza3.zzk())) {
                                    if (!zzc.zzd().zzj().equals(zza3.zzj())) {
                                    }
                                }
                            }
                            zzftd zzftdVar = zzawwVar.zzk;
                            int i9 = zza2.zzc;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcm)).booleanValue()) {
                                if (i9 == 3) {
                                    zza = zzawwVar.zze.zza(zzc);
                                } else {
                                    if (i9 == 4) {
                                        zza = zzawwVar.zze.zzb(zzc, zzftdVar);
                                    }
                                    zzawwVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            } else {
                                zza = zzawwVar.zzd.zza(zzc, zzftdVar);
                            }
                            if (zza) {
                                zzfsw zzt3 = zzawwVar.zzt(1);
                                if (zzt3 != null) {
                                    if (zzawwVar.zzf.zzc(zzt3)) {
                                        zzawwVar.zzr = true;
                                    }
                                    zzawwVar.zza = System.currentTimeMillis() / 1000;
                                }
                            }
                            zzawwVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        zzawwVar.zzh.zzd(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        zzawwVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                } else {
                    zzawwVar.zzh.zzd(5009, System.currentTimeMillis() - currentTimeMillis);
                }
            } catch (Throwable th) {
                zzawwVar.zzl.countDown();
                throw th;
            }
        } catch (zzhcd e4) {
            zzawwVar.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e4);
        }
        zzawwVar.zzl.countDown();
    }

    private final void zzs() {
        zzayn zzaynVar = this.zzm;
        if (zzaynVar != null) {
            zzaynVar.zzh();
        }
    }

    private final zzfsw zzt(int i9) {
        if (!zzfsk.zza(this.zzj)) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcm)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zze(Context context, @Nullable String str, @Nullable View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzf(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue()) {
            this.zzn.zzi();
        }
        zzp();
        zzfrh zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue()) {
            this.zzn.zzj();
        }
        zzp();
        zzfrh zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue()) {
            this.zzn.zzk(context, view);
        }
        zzp();
        zzfrh zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzk(@Nullable MotionEvent motionEvent) {
        zzfrh zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzftf e4) {
                this.zzh.zzc(e4.zza(), -1L, e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzl(int i9, int i10, int i11) {
        DisplayMetrics displayMetrics;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlU)).booleanValue() && (displayMetrics = this.zzc.getResources().getDisplayMetrics()) != null) {
            float f9 = i9;
            float f10 = displayMetrics.density;
            float f11 = i10;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f9 * f10, f11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain);
            obtain.recycle();
            float f12 = displayMetrics.density;
            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f9 * f12, f11 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain2);
            obtain2.recycle();
            float f13 = displayMetrics.density;
            MotionEvent obtain3 = MotionEvent.obtain(0L, i11, 1, f9 * f13, f11 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain3);
            obtain3.recycle();
        }
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfsw zzt = zzt(1);
        if (zzt != null) {
            if (this.zzf.zzc(zzt)) {
                this.zzr = true;
                this.zzl.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaxw zzaxwVar = this.zzo;
        if (zzaxwVar != null) {
            zzaxwVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzo(@Nullable View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (!this.zzq) {
            synchronized (this.zzp) {
                try {
                    if (!this.zzq) {
                        if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                            return;
                        }
                        zzfsw zzb2 = this.zzf.zzb();
                        if ((zzb2 == null || zzb2.zzd(3600L)) && zzfsk.zza(this.zzj)) {
                            this.zzi.execute(new zzawv(this));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzr;
    }
}
