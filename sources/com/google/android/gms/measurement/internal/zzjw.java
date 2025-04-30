package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjw implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zziv zzb;

    public zzjw(zziv zzivVar, Bundle bundle) {
        this.zza = bundle;
        this.zzb = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziv.zza(this.zzb, this.zza);
    }
}
