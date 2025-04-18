package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.ll;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {
    private static AppLovinCommunicator e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f22432f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private j f22433a;

    /* renamed from: b, reason: collision with root package name */
    private n f22434b;

    /* renamed from: c, reason: collision with root package name */
    private final ll f22435c = new ll();
    private final MessagingServiceImpl d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f22432f) {
            try {
                if (e == null) {
                    e = new AppLovinCommunicator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    public void a(j jVar) {
        this.f22433a = jVar;
        this.f22434b = jVar.J();
        a("Attached SDK instance: " + jVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.d;
    }

    public boolean hasSubscriber(String str) {
        return this.f22435c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f22433a.p().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f22433a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (!this.f22435c.a(appLovinCommunicatorSubscriber, str)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f22435c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f22434b == null || !n.a()) {
            return;
        }
        this.f22434b.a("AppLovinCommunicator", str);
    }
}
