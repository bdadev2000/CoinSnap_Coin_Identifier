package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzaqt implements Executor {
    final /* synthetic */ Handler zza;

    public zzaqt(zzaqv zzaqvVar, Handler handler) {
        this.zza = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
