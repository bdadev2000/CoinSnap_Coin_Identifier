package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements ThreadFactory {
    private final AtomicInteger atomicInteger;
    private final String name;
    private final ThreadFactory threadFactory;

    public d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r6) {
        Intrinsics.checkNotNullParameter(r6, "r");
        Thread t5 = this.threadFactory.newThread(r6);
        t5.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        Intrinsics.checkNotNullExpressionValue(t5, "t");
        return t5;
    }
}
