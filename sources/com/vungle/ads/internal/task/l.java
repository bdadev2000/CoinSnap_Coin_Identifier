package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class l implements com.vungle.ads.internal.executor.j {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof l) {
            return Intrinsics.compare(((l) other).getPriority(), getPriority());
        }
        return -1;
    }

    public abstract int getPriority();
}
