package com.vungle.ads.internal.executor;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class d implements ThreadFactory {
    private final AtomicInteger atomicInteger;
    private final String name;
    private final ThreadFactory threadFactory;

    public d(String str) {
        G7.j.e(str, "name");
        this.name = str;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        G7.j.e(runnable, CampaignEx.JSON_KEY_AD_R);
        Thread newThread = this.threadFactory.newThread(runnable);
        newThread.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        return newThread;
    }
}
