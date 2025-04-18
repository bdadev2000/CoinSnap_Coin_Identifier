package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzaxh implements Callable {
    private final zzawo zza;
    private final zzasm zzb;

    public zzaxh(zzawo zzawoVar, zzasm zzasmVar) {
        this.zza = zzawoVar;
        this.zzb = zzasmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzath zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                this.zzb.zzaY(zzc.zzaV(), zzhao.zza());
            }
            return null;
        } catch (zzhbt | NullPointerException unused) {
            return null;
        }
    }
}
