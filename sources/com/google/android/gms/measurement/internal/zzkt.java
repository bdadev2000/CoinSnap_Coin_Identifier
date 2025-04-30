package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkt implements Runnable {
    private final /* synthetic */ zzks zza;

    public zzkt(zzks zzksVar) {
        this.zza = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzks zzksVar = this.zza;
        zzkpVar = zzksVar.zzh;
        zzksVar.zza = zzkpVar;
    }
}
