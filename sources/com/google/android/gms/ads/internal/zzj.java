package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaww;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzfte;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzj implements Runnable, zzawz {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfre zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzj(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zza(zzbep.zzcr)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfre.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zza(zzbep.zzcn)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zza(zzbep.zzcs)).booleanValue();
        if (((Boolean) zzba.zzc().zza(zzbep.zzcq)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zza(zzbep.zzdu)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zzdn)).booleanValue()) {
            zzcci.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            zzcci.zza.execute(this);
        } else {
            run();
        }
    }

    @Nullable
    private final zzawz zzm() {
        if (zzi() == 2) {
            return (zzawz) this.zze.get();
        }
        return (zzawz) this.zzd.get();
    }

    private final void zzp() {
        List list = this.zzc;
        zzawz zzm = zzm();
        if (!list.isEmpty() && zzm != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzm.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzm.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzq(boolean z8) {
        this.zzd.set(zzaxc.zzu(this.zzl.afmaVersion, zzr(this.zzj), z8, this.zzo));
    }

    private static final Context zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zza(zzbep.zzdu)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z8 = this.zzl.isClientJar;
            final boolean z9 = false;
            if (!((Boolean) zzba.zzc().zza(zzbep.zzaX)).booleanValue() && z8) {
                z9 = true;
            }
            if (zzi() == 1) {
                zzq(z9);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzj.this.zzb(z9);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzaww zza = zzaww.zza(this.zzl.afmaVersion, zzr(this.zzj), z9, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzr()) {
                        this.zzo = 1;
                        zzq(z9);
                    }
                } catch (NullPointerException e4) {
                    this.zzo = 1;
                    zzq(z9);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e4);
                }
            }
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th;
        }
    }

    public final /* synthetic */ void zzb(boolean z8) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzaww.zza(this.zzm.afmaVersion, zzr(this.zzk), z8, this.zzn).zzp();
        } catch (NullPointerException e4) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e4);
        }
    }

    public final boolean zzc() {
        Context context = this.zzj;
        zzi zziVar = new zzi(this);
        zzfre zzfreVar = this.zzi;
        return new zzfte(this.zzj, zzfsk.zzb(context, zzfreVar), zziVar, ((Boolean) zzba.zzc().zza(zzbep.zzco)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", e4);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            zzawz zzm = zzm();
            if (((Boolean) zzba.zzc().zza(zzbep.zzkH)).booleanValue()) {
                zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzJ(view, 4, null);
            }
            if (zzm != null) {
                zzp();
                return zzm.zzf(zzr(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzg(Context context) {
        zzawz zzm;
        if (zzd() && (zzm = zzm()) != null) {
            zzp();
            return zzm.zzg(zzr(context));
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzba.zzc().zza(zzbep.zzkG)).booleanValue()) {
            if (zzd()) {
                zzawz zzm = zzm();
                if (((Boolean) zzba.zzc().zza(zzbep.zzkH)).booleanValue()) {
                    zzu.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
                }
                if (zzm != null) {
                    return zzm.zzh(context, view, activity);
                }
                return "";
            }
            return "";
        }
        zzawz zzm2 = zzm();
        if (((Boolean) zzba.zzc().zza(zzbep.zzkH)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
        }
        if (zzm2 != null) {
            return zzm2.zzh(context, view, activity);
        }
        return "";
    }

    public final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    public final int zzj() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzk(MotionEvent motionEvent) {
        zzawz zzm = zzm();
        if (zzm != null) {
            zzp();
            zzm.zzk(motionEvent);
        } else {
            this.zzc.add(new Object[]{motionEvent});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzl(int i9, int i10, int i11) {
        zzawz zzm = zzm();
        if (zzm != null) {
            zzp();
            zzm.zzl(i9, i10, i11);
        } else {
            this.zzc.add(new Object[]{Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawz zzm;
        if (zzd() && (zzm = zzm()) != null) {
            zzm.zzn(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzo(View view) {
        zzawz zzm = zzm();
        if (zzm != null) {
            zzm.zzo(view);
        }
    }
}
