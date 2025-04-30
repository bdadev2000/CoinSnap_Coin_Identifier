package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.il;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f6100e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f6101f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private k f6102a;
    private t b;

    /* renamed from: c, reason: collision with root package name */
    private final il f6103c = new il();

    /* renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f6104d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f6101f) {
            try {
                if (f6100e == null) {
                    f6100e = new AppLovinCommunicator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6100e;
    }

    public void a(k kVar) {
        this.f6102a = kVar;
        this.b = kVar.L();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f6104d;
    }

    public boolean hasSubscriber(String str) {
        return this.f6103c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f6102a.o().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f6102a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (!this.f6103c.a(appLovinCommunicatorSubscriber, str)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f6103c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.b == null || !t.a()) {
            return;
        }
        this.b.a("AppLovinCommunicator", str);
    }
}
