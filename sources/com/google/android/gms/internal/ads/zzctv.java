package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzctv extends zzcsf {
    private final zzbjm zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzctv(zzcuo zzcuoVar, zzbjm zzbjmVar, Runnable runnable, Executor executor) {
        super(zzcuoVar);
        this.zzc = zzbjmVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final zzfgu zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final zzfgu zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final void zzj() {
        final zzctt zzcttVar = new zzctt(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctu
            @Override // java.lang.Runnable
            public final void run() {
                zzctv.this.zzk(zzcttVar);
            }
        });
    }

    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (!this.zzc.zze(ObjectWrapper.wrap(runnable))) {
                zzi(((zzctt) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzi(((zzctt) runnable).zza);
        }
    }
}
