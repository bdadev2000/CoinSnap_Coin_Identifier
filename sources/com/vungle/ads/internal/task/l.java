package com.vungle.ads.internal.task;

/* loaded from: classes3.dex */
public abstract class l implements com.vungle.ads.internal.executor.j {
    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        G7.j.e(obj, "other");
        if (obj instanceof l) {
            return G7.j.f(((l) obj).getPriority(), getPriority());
        }
        return -1;
    }

    public abstract int getPriority();
}
