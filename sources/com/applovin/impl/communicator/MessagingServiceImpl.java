package com.applovin.impl.communicator;

import androidx.activity.d;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    private ScheduledThreadPoolExecutor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4127b = new Object();

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        ScheduledThreadPoolExecutor a = a();
        this.a = a;
        a.execute(new d(appLovinCommunicatorMessage, 14));
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.f4127b) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
            if (scheduledThreadPoolExecutor != null) {
                return scheduledThreadPoolExecutor;
            }
            return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.a
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread a;
                    a = MessagingServiceImpl.a(runnable);
                    return a;
                }
            });
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
