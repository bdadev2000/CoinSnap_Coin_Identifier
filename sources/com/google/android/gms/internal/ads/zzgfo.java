package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class zzgfo extends zzgfm implements f4.c {
    @Override // f4.c
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract f4.c zzc();
}
