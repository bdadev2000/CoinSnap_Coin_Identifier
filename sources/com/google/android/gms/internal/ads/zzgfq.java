package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfq implements Runnable {
    final Future zza;
    final zzgfp zzb;

    public zzgfq(Future future, zzgfp zzgfpVar) {
        this.zza = future;
        this.zzb = zzgfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Object obj = this.zza;
        if ((obj instanceof zzggw) && (zza = zzggx.zza((zzggw) obj)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgft.zzp(this.zza));
        } catch (ExecutionException e4) {
            this.zzb.zza(e4.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfxy zza = zzfxz.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
