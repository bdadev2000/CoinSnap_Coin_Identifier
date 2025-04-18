package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzlj {
    private final zzli zza;
    private final zzlh zzb;
    private final zzbv zzc;
    private int zzd;

    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    public zzlj(zzlh zzlhVar, zzli zzliVar, zzbv zzbvVar, int i10, zzdc zzdcVar, Looper looper) {
        this.zzb = zzlhVar;
        this.zza = zzliVar;
        this.zzc = zzbvVar;
        this.zzf = looper;
        this.zzg = i10;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzli zzc() {
        return this.zza;
    }

    public final zzlj zzd() {
        zzdb.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlj zze(@Nullable Object obj) {
        zzdb.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzlj zzf(int i10) {
        zzdb.zzf(!this.zzh);
        this.zzd = i10;
        return this;
    }

    @Nullable
    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzi = z10 | this.zzi;
        this.zzj = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j3) throws InterruptedException, TimeoutException {
        boolean z10;
        zzdb.zzf(this.zzh);
        if (this.zzf.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j3;
        while (!this.zzj) {
            if (j3 > 0) {
                wait(j3);
                j3 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzi;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
