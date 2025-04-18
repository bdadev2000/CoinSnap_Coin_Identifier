package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgef implements Runnable {
    final Future zza;
    final zzgee zzb;

    public zzgef(Future future, zzgee zzgeeVar) {
        this.zza = future;
        this.zzb = zzgeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Object obj = this.zza;
        if ((obj instanceof zzgfk) && (zza = zzgfl.zza((zzgfk) obj)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgei.zzp(this.zza));
        } catch (ExecutionException e2) {
            this.zzb.zza(e2.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzfwk zza = zzfwm.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
