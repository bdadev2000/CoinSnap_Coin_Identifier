package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.il;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f3378e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f3379f = new Object();
    private k a;

    /* renamed from: b, reason: collision with root package name */
    private t f3380b;

    /* renamed from: c, reason: collision with root package name */
    private final il f3381c = new il();

    /* renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f3382d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f3379f) {
            if (f3378e == null) {
                f3378e = new AppLovinCommunicator();
            }
        }
        return f3378e;
    }

    public void a(k kVar) {
        this.a = kVar;
        this.f3380b = kVar.L();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f3382d;
    }

    public boolean hasSubscriber(String str) {
        return this.f3381c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.a.o().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.a + AbstractJsonLexerKt.END_OBJ;
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (!this.f3381c.a(appLovinCommunicatorSubscriber, str)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f3381c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f3380b == null || !t.a()) {
            return;
        }
        this.f3380b.a("AppLovinCommunicator", str);
    }
}
