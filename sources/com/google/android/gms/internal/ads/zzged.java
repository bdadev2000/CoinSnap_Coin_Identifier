package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public abstract class zzged extends zzgeb implements ua.b {
    @Override // ua.b
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract ua.b zzc();
}
