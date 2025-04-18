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

    /* renamed from: b, reason: collision with root package name */
    private final String f5523b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f5524c;
    private boolean a = true;

    /* renamed from: d, reason: collision with root package name */
    private final Set f5525d = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f5526f = new Object();

    public jl(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f5523b = str;
        this.f5524c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f5524c.get();
    }

    public String b() {
        return this.f5523b;
    }

    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f5524c.get();
        jl jlVar = (jl) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) jlVar.f5524c.get();
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
        int i10;
        int hashCode = this.f5523b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f5524c.get();
        int i11 = hashCode * 31;
        if (appLovinCommunicatorSubscriber != null) {
            i10 = appLovinCommunicatorSubscriber.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z10;
        if (a() == null) {
            com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f5526f) {
            if (!this.f5525d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f5525d.add(communicatorMessageImpl.getUniqueId());
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.a = z10;
    }
}
