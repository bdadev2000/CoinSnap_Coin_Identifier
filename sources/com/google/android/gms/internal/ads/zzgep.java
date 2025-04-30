package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgep extends zzgfj implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    f4.c zza;
    Object zzb;

    public zzgep(f4.c cVar, Object obj) {
        cVar.getClass();
        this.zza = cVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        f4.c cVar = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z9 = true;
        if (cVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z10 = isCancelled | z8;
        if (obj != null) {
            z9 = false;
        }
        if (z10 | z9) {
            return;
        }
        this.zza = null;
        if (cVar.isCancelled()) {
            zzs(cVar);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgft.zzp(cVar));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th) {
                try {
                    zzggl.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e4) {
            zzd(e4);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e9) {
            zzd(e9.getCause());
        } catch (Exception e10) {
            zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final String zza() {
        String str;
        f4.c cVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (cVar != null) {
            str = AbstractC2914a.e("inputFuture=[", cVar.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return AbstractC2914a.f(str, "function=[", obj.toString(), "]");
        }
        if (zza != null) {
            return str.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2) throws Exception;

    public abstract void zzf(Object obj);
}
