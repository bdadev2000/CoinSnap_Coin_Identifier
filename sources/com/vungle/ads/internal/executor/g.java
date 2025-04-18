package com.vungle.ads.internal.executor;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends com.vungle.ads.internal.task.l {
    final /* synthetic */ Runnable $command;
    final /* synthetic */ Runnable $fail;

    public g(Runnable runnable, Runnable runnable2) {
        this.$command = runnable;
        this.$fail = runnable2;
    }

    @Override // com.vungle.ads.internal.task.l, java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof com.vungle.ads.internal.task.l) {
            return Intrinsics.compare(((com.vungle.ads.internal.task.l) other).getPriority(), getPriority());
        }
        return 0;
    }

    @Override // com.vungle.ads.internal.task.l
    public int getPriority() {
        return ((com.vungle.ads.internal.task.l) this.$command).getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        l.Companion.wrapRunnableWithFail(this.$command, this.$fail);
    }
}
