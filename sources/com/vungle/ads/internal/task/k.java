package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements q {
    @Override // com.vungle.ads.internal.task.q
    public int makeAndroidThreadPriority(g jobInfo) {
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
