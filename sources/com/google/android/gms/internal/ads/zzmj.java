package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzmj {
    private final zzmi zza;
    private final zzmh zzb;
    private final zzer zzc;
    private final zzdc zzd;
    private int zze;

    @Nullable
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzmj(zzmh zzmhVar, zzmi zzmiVar, zzdc zzdcVar, int i9, zzer zzerVar, Looper looper) {
        this.zzb = zzmhVar;
        this.zza = zzmiVar;
        this.zzd = zzdcVar;
        this.zzg = looper;
        this.zzc = zzerVar;
        this.zzh = i9;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzmi zzc() {
        return this.zza;
    }

    public final zzmj zzd() {
        zzeq.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzmj zze(@Nullable Object obj) {
        zzeq.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzmj zzf(int i9) {
        zzeq.zzf(!this.zzi);
        this.zze = i9;
        return this;
    }

    @Nullable
    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z8) {
        this.zzj = z8 | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j7) throws InterruptedException, TimeoutException {
        boolean z8;
        try {
            zzeq.zzf(this.zzi);
            if (this.zzg.getThread() != Thread.currentThread()) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzeq.zzf(z8);
            long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
            while (!this.zzk) {
                if (j7 > 0) {
                    wait(j7);
                    j7 = elapsedRealtime - SystemClock.elapsedRealtime();
                } else {
                    throw new TimeoutException("Message delivery timed out.");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
