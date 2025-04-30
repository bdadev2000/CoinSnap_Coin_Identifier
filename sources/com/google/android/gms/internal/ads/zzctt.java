package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzctt implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzctt(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzctv.zzi(this.zza);
    }
}
