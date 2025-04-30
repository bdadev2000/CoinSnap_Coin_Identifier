package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzke implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zziv zzb;

    public zzke(zziv zzivVar, Boolean bool) {
        this.zza = bool;
        this.zzb = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza, true);
    }
}
