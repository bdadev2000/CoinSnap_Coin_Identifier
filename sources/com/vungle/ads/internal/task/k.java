package com.vungle.ads.internal.task;

/* loaded from: classes3.dex */
public final class k implements q {
    @Override // com.vungle.ads.internal.task.q
    public int makeAndroidThreadPriority(g gVar) {
        G7.j.e(gVar, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, gVar.getPriority() - 2)) + 10);
    }
}
