package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzgdf extends zzgdy implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ua.b zza;
    Object zzb;

    public zzgdf(ua.b bVar, Object obj) {
        bVar.getClass();
        this.zza = bVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ua.b bVar = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z11 = true;
        if (bVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = isCancelled | z10;
        if (obj != null) {
            z11 = false;
        }
        if (z12 | z11) {
            return;
        }
        this.zza = null;
        if (bVar.isCancelled()) {
            zzs(bVar);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgei.zzp(bVar));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th2) {
                try {
                    zzgez.zza(th2);
                    zzd(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e2) {
            zzd(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            zzd(e10.getCause());
        } catch (Exception e11) {
            zzd(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        String str;
        ua.b bVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (bVar != null) {
            str = e.f("inputFuture=[", bVar.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        }
        if (zza != null) {
            return str.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2) throws Exception;

    public abstract void zzf(Object obj);
}
