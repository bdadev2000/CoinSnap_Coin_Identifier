package com.applovin.impl.communicator;

import D3.b;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f7117a;
    private final Object b = new Object();

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        ScheduledThreadPoolExecutor a6 = a();
        this.f7117a = a6;
        a6.execute(new b(appLovinCommunicatorMessage, 20));
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    private ScheduledThreadPoolExecutor a() {
        synchronized (this.b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f7117a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, (ThreadFactory) new Object());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
