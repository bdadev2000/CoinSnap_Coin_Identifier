package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements Runnable {
    private WeakReference<w> runner;

    public v(WeakReference<w> runner) {
        Intrinsics.checkNotNullParameter(runner, "runner");
        this.runner = runner;
    }

    public final WeakReference<w> getRunner() {
        return this.runner;
    }

    @Override // java.lang.Runnable
    public void run() {
        w wVar = this.runner.get();
        if (wVar != null) {
            wVar.executePendingJobs();
        }
    }

    public final void setRunner(WeakReference<w> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.runner = weakReference;
    }
}
