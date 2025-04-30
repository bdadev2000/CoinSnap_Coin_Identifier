package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class v implements Runnable {
    private WeakReference<w> runner;

    public v(WeakReference<w> weakReference) {
        G7.j.e(weakReference, "runner");
        this.runner = weakReference;
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
        G7.j.e(weakReference, "<set-?>");
        this.runner = weakReference;
    }
}
