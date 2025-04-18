package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzgei;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzk implements Runnable, zzaux {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfpp zzi;
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

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzbe.zzc().zza(zzbcn.zzcx)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfpp.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzbe.zzc().zza(zzbcn.zzcu)).booleanValue();
        this.zzg = ((Boolean) zzbe.zzc().zza(zzbcn.zzcy)).booleanValue();
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzcw)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcn.zzdz)).booleanValue()) {
            this.zza = zzi();
        }
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzdt)).booleanValue()) {
            zzcaj.zza.execute(this);
            return;
        }
        zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            zzcaj.zza.execute(this);
        } else {
            run();
        }
    }

    @Nullable
    private final zzaux zzq() {
        if (zzm() == 2) {
            return (zzaux) this.zze.get();
        }
        return (zzaux) this.zzd.get();
    }

    private final void zzr() {
        List list = this.zzc;
        zzaux zzq = zzq();
        if (!list.isEmpty() && zzq != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzq.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzq.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzs(boolean z10) {
        String str = this.zzl.afmaVersion;
        Context zzt = zzt(this.zzj);
        zzarh zza = zzarj.zza();
        zza.zza(z10);
        zza.zzb(str);
        this.zzd.set(zzavb.zzu(zzt, new zzauz((zzarj) zza.zzbr())));
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzauu zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z10, boolean z11) {
        zzarh zza = zzarj.zza();
        zza.zza(z10);
        zza.zzb(versionInfoParcel.afmaVersion);
        return zzauu.zza(zzt(context), (zzarj) zza.zzbr(), z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzdz)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z10 = this.zzl.isClientJar;
            final boolean z11 = false;
            if (!((Boolean) zzbe.zzc().zza(zzbcn.zzbd)).booleanValue() && z10) {
                z11 = true;
            }
            if (zzm() == 1) {
                zzs(z11);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzk.this.zzc(z11);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzauu zzu = zzu(this.zzj, this.zzl, z11, this.zzn);
                    this.zze.set(zzu);
                    if (this.zzg && !zzu.zzr()) {
                        this.zzo = 1;
                        zzs(z11);
                    }
                } catch (NullPointerException e2) {
                    this.zzo = 1;
                    zzs(z11);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e2);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzaux zzq;
        if (zzj() && (zzq = zzq()) != null) {
            zzr();
            return zzq.zzf(zzt(context));
        }
        return "";
    }

    public final /* synthetic */ void zzc(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzk, this.zzm, z10, this.zzn).zzp();
        } catch (NullPointerException e2) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zze(Context context, String str, View view, Activity activity) {
        if (zzj()) {
            zzaux zzq = zzq();
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzko)).booleanValue()) {
                zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzJ(view, 4, null);
            }
            if (zzq != null) {
                zzr();
                return zzq.zze(zzt(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzf(Context context) {
        return zzb(context, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzg(final Context context) {
        try {
            return (String) zzgei.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.zzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzk.this.zzb(context, null);
                }
            }, this.zzh).get(((Integer) zzbe.zzc().zza(zzbcn.zzcO)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzauq.zza(context, this.zzm.afmaVersion, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkn)).booleanValue()) {
            if (zzj()) {
                zzaux zzq = zzq();
                if (((Boolean) zzbe.zzc().zza(zzbcn.zzko)).booleanValue()) {
                    zzv.zzq();
                    com.google.android.gms.ads.internal.util.zzs.zzJ(view, 2, null);
                }
                if (zzq != null) {
                    return zzq.zzh(context, view, activity);
                }
                return "";
            }
            return "";
        }
        zzaux zzq2 = zzq();
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzko)).booleanValue()) {
            zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzJ(view, 2, null);
        }
        if (zzq2 != null) {
            return zzq2.zzh(context, view, activity);
        }
        return "";
    }

    public final boolean zzi() {
        Context context = this.zzj;
        zzj zzjVar = new zzj(this);
        zzfpp zzfppVar = this.zzi;
        return new zzfrl(this.zzj, zzfqr.zzb(context, zzfppVar), zzjVar, ((Boolean) zzbe.zzc().zza(zzbcn.zzcv)).booleanValue()).zzd(1);
    }

    public final boolean zzj() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzk(MotionEvent motionEvent) {
        zzaux zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzk(motionEvent);
        } else {
            this.zzc.add(new Object[]{motionEvent});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzl(int i10, int i11, int i12) {
        zzaux zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzl(i10, i11, i12);
        } else {
            this.zzc.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        }
    }

    public final int zzm() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaux zzq;
        zzaux zzq2;
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzcT)).booleanValue()) {
            if (this.zzb.getCount() == 0 && (zzq2 = zzq()) != null) {
                zzq2.zzn(stackTraceElementArr);
                return;
            }
            return;
        }
        if (zzj() && (zzq = zzq()) != null) {
            zzq.zzn(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzo(View view) {
        zzaux zzq = zzq();
        if (zzq != null) {
            zzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzo;
    }
}
