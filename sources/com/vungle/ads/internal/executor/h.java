package com.vungle.ads.internal.executor;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements j {
    final /* synthetic */ Runnable $command;
    final /* synthetic */ Runnable $fail;

    public h(Runnable runnable, Runnable runnable2) {
        this.$command = runnable;
        this.$fail = runnable2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Runnable runnable = this.$command;
        if (runnable instanceof com.vungle.ads.internal.task.l) {
            return ((com.vungle.ads.internal.task.l) runnable).compareTo(other);
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        l.Companion.wrapRunnableWithFail(this.$command, this.$fail);
    }
}
