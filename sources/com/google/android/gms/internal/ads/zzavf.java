package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.AppEventsConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class zzavf implements zzavi {

    @Nullable
    private static zzavf zzb;
    private final Context zzc;
    private final zzfso zzd;
    private final zzfsv zze;
    private final zzfsx zzf;
    private final zzawi zzg;
    private final zzfqz zzh;
    private final Executor zzi;
    private final zzfsu zzj;
    private final zzawx zzl;

    @Nullable
    private final zzawp zzm;

    @Nullable
    private final zzawg zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;

    @VisibleForTesting
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    @VisibleForTesting
    public zzavf(@NonNull Context context, @NonNull zzfqz zzfqzVar, @NonNull zzfso zzfsoVar, @NonNull zzfsv zzfsvVar, @NonNull zzfsx zzfsxVar, @NonNull zzawi zzawiVar, @NonNull Executor executor, @NonNull zzfqu zzfquVar, int i2, @Nullable zzawx zzawxVar, @Nullable zzawp zzawpVar, @Nullable zzawg zzawgVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfqzVar;
        this.zzd = zzfsoVar;
        this.zze = zzfsvVar;
        this.zzf = zzfsxVar;
        this.zzg = zzawiVar;
        this.zzi = executor;
        this.zzr = i2;
        this.zzl = zzawxVar;
        this.zzm = zzawpVar;
        this.zzn = zzawgVar;
        this.zzq = false;
        this.zzj = new zzavd(this, zzfquVar);
    }

    public static synchronized zzavf zza(@NonNull String str, @NonNull Context context, boolean z2, boolean z3) {
        zzavf zzb2;
        synchronized (zzavf.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z2, z3);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzavf zzb(@NonNull String str, @NonNull Context context, @NonNull Executor executor, boolean z2, boolean z3) {
        zzavf zzavfVar;
        synchronized (zzavf.class) {
            try {
                if (zzb == null) {
                    zzfra zza = zzfrb.zza();
                    zza.zza(str);
                    zza.zzc(z2);
                    zzfrb zzd = zza.zzd();
                    zzfqz zza2 = zzfqz.zza(context, executor, z3);
                    zzavr zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdp)).booleanValue() ? zzavr.zzc(context) : null;
                    zzawx zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdq)).booleanValue() ? zzawx.zzd(context, executor) : null;
                    zzawp zzawpVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcI)).booleanValue() ? new zzawp() : null;
                    zzawg zzawgVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcJ)).booleanValue() ? new zzawg() : null;
                    zzfrs zze = zzfrs.zze(context, executor, zza2, zzd);
                    zzawh zzawhVar = new zzawh(context);
                    zzawi zzawiVar = new zzawi(zzd, zze, new zzawv(context, zzawhVar), zzawhVar, zzc, zzd2, zzawpVar, zzawgVar);
                    int zzb2 = zzfsb.zzb(context, zza2);
                    zzfqu zzfquVar = new zzfqu();
                    zzavf zzavfVar2 = new zzavf(context, zza2, new zzfso(context, zzb2), new zzfsv(context, zzb2, new zzavc(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcs)).booleanValue()), new zzfsx(context, zzawiVar, zza2, zzfquVar), zzawiVar, executor, zzfquVar, zzb2, zzd2, zzawpVar, zzawgVar);
                    zzb = zzavfVar2;
                    zzavfVar2.zzm();
                    zzb.zzp();
                }
                zzavfVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzavfVar;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzavf zzavfVar) {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfsn zzt = zzavfVar.zzt(1);
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
                zzfss zza2 = zzfrj.zza(zzavfVar.zzc, 1, zzavfVar.zzr, str, str2, AppEventsConstants.EVENT_PARAM_VALUE_YES, zzavfVar.zzh);
                byte[] bArr = zza2.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzavfVar.zzh.zzd(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzayh zzc = zzayh.zzc(zzgzs.zzv(bArr, 0, length), zzhao.zza());
                        if (!zzc.zzd().zzk().isEmpty() && !zzc.zzd().zzj().isEmpty() && zzc.zze().zzA().length != 0) {
                            zzfsn zzt2 = zzavfVar.zzt(1);
                            if (zzt2 != null) {
                                zzayk zza3 = zzt2.zza();
                                if (zzc.zzd().zzk().equals(zza3.zzk())) {
                                    if (!zzc.zzd().zzj().equals(zza3.zzj())) {
                                    }
                                }
                            }
                            zzfsu zzfsuVar = zzavfVar.zzj;
                            int i2 = zza2.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcq)).booleanValue()) {
                                zza = zzavfVar.zzd.zza(zzc, zzfsuVar);
                            } else if (i2 == 3) {
                                zza = zzavfVar.zze.zza(zzc);
                            } else {
                                if (i2 == 4) {
                                    zza = zzavfVar.zze.zzb(zzc, zzfsuVar);
                                }
                                zzavfVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (zza) {
                                zzfsn zzt3 = zzavfVar.zzt(1);
                                if (zzt3 != null) {
                                    if (zzavfVar.zzf.zzc(zzt3)) {
                                        zzavfVar.zzq = true;
                                    }
                                    zzavfVar.zza = System.currentTimeMillis() / 1000;
                                }
                            }
                            zzavfVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        zzavfVar.zzh.zzd(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        zzavfVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (Throwable th) {
                zzavfVar.zzk.countDown();
                throw th;
            }
        } catch (zzhbt e) {
            zzavfVar.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e);
        }
        zzavfVar.zzk.countDown();
    }

    private final void zzs() {
        zzawx zzawxVar = this.zzl;
        if (zzawxVar != null) {
            zzawxVar.zzh();
        }
    }

    private final zzfsn zzt(int i2) {
        if (zzfsb.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcq)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final String zze(Context context, @Nullable String str, @Nullable View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final String zzf(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcI)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfrc zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza2 = zza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcI)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfrc zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcI)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfrc zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzk(@Nullable MotionEvent motionEvent) {
        zzfrc zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfsw e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzl(int i2, int i3, int i4) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlA)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f2 = i2;
        float f3 = displayMetrics.density;
        float f4 = i3;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f2 * f3, f4 * f3, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain);
        obtain.recycle();
        float f5 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f2 * f5, f4 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain2);
        obtain2.recycle();
        float f6 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i4, 1, f2 * f6, f4 * f6, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain3);
        obtain3.recycle();
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfsn zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawg zzawgVar = this.zzn;
        if (zzawgVar != null) {
            zzawgVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzo(@Nullable View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            try {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfsn zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzfsb.zza(this.zzr)) {
                        this.zzi.execute(new zzave(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
