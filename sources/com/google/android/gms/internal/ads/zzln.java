package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzln {
    private final zzlm zza;
    private final zzll zzb;
    private final zzcc zzc;
    private int zzd;

    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    public zzln(zzll zzllVar, zzlm zzlmVar, zzcc zzccVar, int i2, zzdj zzdjVar, Looper looper) {
        this.zzb = zzllVar;
        this.zza = zzlmVar;
        this.zzc = zzccVar;
        this.zzf = looper;
        this.zzg = i2;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzlm zzc() {
        return this.zza;
    }

    public final zzln zzd() {
        zzdi.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzl(this);
        return this;
    }

    public final zzln zze(@Nullable Object obj) {
        zzdi.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzln zzf(int i2) {
        zzdi.zzf(!this.zzh);
        this.zzd = i2;
        return this;
    }

    @Nullable
    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z2) {
        this.zzi = z2 | this.zzi;
        this.zzj = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j2) throws InterruptedException, TimeoutException {
        try {
            zzdi.zzf(this.zzh);
            zzdi.zzf(this.zzf.getThread() != Thread.currentThread());
            long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
            while (!this.zzj) {
                if (j2 <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j2);
                j2 = elapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzi;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
