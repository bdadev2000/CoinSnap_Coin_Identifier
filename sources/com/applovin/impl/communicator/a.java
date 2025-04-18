package com.applovin.impl.communicator;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a2;
        a2 = MessagingServiceImpl.a(runnable);
        return a2;
    }
}
