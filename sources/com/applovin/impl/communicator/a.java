package com.applovin.impl.communicator;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a6;
        a6 = MessagingServiceImpl.a(runnable);
        return a6;
    }
}
