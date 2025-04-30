package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class jl implements AppLovinBroadcastManager.Receiver {
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f8482c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8481a = true;

    /* renamed from: d, reason: collision with root package name */
    private final Set f8483d = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f8484f = new Object();

    public jl(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.b = str;
        this.f8482c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f8482c.get();
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.f8481a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8482c.get();
        jl jlVar = (jl) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) jlVar.f8482c.get();
        if (b().equals(jlVar.b())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int hashCode = this.b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8482c.get();
        int i10 = hashCode * 31;
        if (appLovinCommunicatorSubscriber != null) {
            i9 = appLovinCommunicatorSubscriber.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z8;
        if (a() == null) {
            com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f8484f) {
            try {
                if (!this.f8483d.contains(communicatorMessageImpl.getUniqueId())) {
                    this.f8483d.add(communicatorMessageImpl.getUniqueId());
                    z8 = true;
                } else {
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z8) {
        this.f8481a = z8;
    }
}
