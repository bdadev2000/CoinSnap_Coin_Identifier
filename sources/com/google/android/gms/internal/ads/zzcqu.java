package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzcqu implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcqu(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcqw.zzj(this.zza);
    }
}
