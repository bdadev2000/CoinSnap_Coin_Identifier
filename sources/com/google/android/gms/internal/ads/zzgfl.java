package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfl implements Runnable {
    final Future zza;
    final zzgfk zzb;

    public zzgfl(Future future, zzgfk zzgfkVar) {
        this.zza = future;
        this.zzb = zzgfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Object obj = this.zza;
        if ((obj instanceof zzggr) && (zza = zzggs.zza((zzggr) obj)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgfo.zzp(this.zza));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfxu zza = zzfxv.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
