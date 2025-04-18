package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzcqw extends zzcpd {
    private final zzbhp zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcqw(zzcrp zzcrpVar, zzbhp zzbhpVar, Runnable runnable, Executor executor) {
        super(zzcrpVar);
        this.zzc = zzbhpVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzj(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final View zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzk() {
        final zzcqu zzcquVar = new zzcqu(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqv
            @Override // java.lang.Runnable
            public final void run() {
                zzcqw.this.zzl(zzcquVar);
            }
        });
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            if (!this.zzc.zze(ObjectWrapper.wrap(runnable))) {
                zzj(((zzcqu) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzj(((zzcqu) runnable).zza);
        }
    }
}
