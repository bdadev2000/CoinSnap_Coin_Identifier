package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzayx implements Callable {
    private final zzaye zza;
    private final zzatp zzb;

    public zzayx(zzaye zzayeVar, zzatp zzatpVar) {
        this.zza = zzayeVar;
        this.zzb = zzatpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaus zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    this.zzb.zzaY(zzc.zzaV(), zzhay.zza());
                }
                return null;
            } catch (zzhcd | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
