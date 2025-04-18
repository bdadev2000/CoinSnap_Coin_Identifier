package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzawy implements Callable {
    private final zzawf zza;
    private final zzasf zzb;

    public zzawy(zzawf zzawfVar, zzasf zzasfVar) {
        this.zza = zzawfVar;
        this.zzb = zzasfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzata zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    this.zzb.zzaY(zzc.zzaV(), zzgyh.zza());
                }
                return null;
            } catch (zzgzm | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
