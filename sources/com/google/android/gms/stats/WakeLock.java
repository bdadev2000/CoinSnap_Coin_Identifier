package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class WakeLock {
    private static final long zzb = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService zzc = null;
    private static final Object zzd = new Object();
    private static volatile zzd zze = new zzb();
    com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;
    private final PowerManager.WakeLock zzg;
    private int zzh;
    private Future<?> zzi;
    private long zzj;
    private final Set<zze> zzk;
    private boolean zzl;
    private int zzm;
    private Clock zzn;
    private WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final Context zzr;
    private final Map<String, zzc> zzs;
    private AtomicInteger zzt;
    private final ScheduledExecutorService zzu;

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i9, @NonNull String str) {
        String str2;
        String packageName = context.getPackageName();
        this.zzf = new Object();
        this.zzh = 0;
        this.zzk = new HashSet();
        this.zzl = true;
        this.zzn = DefaultClock.getInstance();
        this.zzs = new HashMap();
        this.zzt = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.zzr = context.getApplicationContext();
        this.zzq = str;
        this.zza = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.zzp = str2;
        } else {
            this.zzp = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i9, str);
            this.zzg = newWakeLock;
            if (WorkSourceUtil.hasWorkSourcePermission(context)) {
                WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
                this.zzo = fromPackage;
                if (fromPackage != null) {
                    zze(newWakeLock, fromPackage);
                }
            }
            ScheduledExecutorService scheduledExecutorService = zzc;
            if (scheduledExecutorService == null) {
                synchronized (zzd) {
                    try {
                        scheduledExecutorService = zzc;
                        if (scheduledExecutorService == null) {
                            zzh.zza();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            zzc = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.zzu = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.zzf) {
            try {
                if (!wakeLock.isHeld()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.zzc();
                if (!wakeLock.isHeld()) {
                    return;
                }
                wakeLock.zzh = 1;
                wakeLock.zzd(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String zzb(String str) {
        if (this.zzl) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void zzc() {
        if (this.zzk.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.zzk);
        this.zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void zzd(int i9) {
        synchronized (this.zzf) {
            try {
                if (!isHeld()) {
                    return;
                }
                if (this.zzl) {
                    int i10 = this.zzh - 1;
                    this.zzh = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.zzh = 0;
                }
                zzc();
                Iterator<zzc> it = this.zzs.values().iterator();
                while (it.hasNext()) {
                    it.next().zza = 0;
                }
                this.zzs.clear();
                Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                    this.zzi = null;
                    this.zzj = 0L;
                }
                this.zzm = 0;
                if (this.zzg.isHeld()) {
                    try {
                        try {
                            this.zzg.release();
                            if (this.zza != null) {
                                this.zza = null;
                            }
                        } catch (RuntimeException e4) {
                            if (e4.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.zzp).concat(" failed to release!"), e4);
                                if (this.zza != null) {
                                    this.zza = null;
                                }
                            } else {
                                throw e4;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.zza != null) {
                            this.zza = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.zzp).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void zze(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e4) {
            Log.wtf("WakeLock", e4.toString());
        }
    }

    @KeepForSdk
    public void acquire(long j7) {
        this.zzt.incrementAndGet();
        long j9 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, zzb), 1L);
        if (j7 > 0) {
            max = Math.min(j7, max);
        }
        synchronized (this.zzf) {
            try {
                if (!isHeld()) {
                    this.zza = com.google.android.gms.internal.stats.zzb.zza(false, null);
                    this.zzg.acquire();
                    this.zzn.elapsedRealtime();
                }
                this.zzh++;
                this.zzm++;
                zzb(null);
                zzc zzcVar = this.zzs.get(null);
                if (zzcVar == null) {
                    zzcVar = new zzc(null);
                    this.zzs.put(null, zzcVar);
                }
                zzcVar.zza++;
                long elapsedRealtime = this.zzn.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j9 = elapsedRealtime + max;
                }
                if (j9 > this.zzj) {
                    this.zzj = j9;
                    Future<?> future = this.zzi;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.zzi = this.zzu.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock.zza(WakeLock.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z8;
        synchronized (this.zzf) {
            if (this.zzh > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    @KeepForSdk
    public void release() {
        if (this.zzt.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.zzp).concat(" release without a matched acquire!"));
        }
        synchronized (this.zzf) {
            try {
                zzb(null);
                if (this.zzs.containsKey(null)) {
                    zzc zzcVar = this.zzs.get(null);
                    if (zzcVar != null) {
                        int i9 = zzcVar.zza - 1;
                        zzcVar.zza = i9;
                        if (i9 == 0) {
                            this.zzs.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.zzp).concat(" counter does not exist"));
                }
                zzd(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z8) {
        synchronized (this.zzf) {
            this.zzl = z8;
        }
    }
}
