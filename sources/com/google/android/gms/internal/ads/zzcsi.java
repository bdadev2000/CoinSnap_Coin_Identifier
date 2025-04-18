package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzcsi implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcsi(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcsk.zzj(this.zza);
    }
}
