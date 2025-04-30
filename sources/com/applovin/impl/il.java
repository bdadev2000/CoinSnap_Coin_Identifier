package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class il {

    /* renamed from: a, reason: collision with root package name */
    private final Set f8317a = new HashSet(32);
    private final Object b = new Object();

    public boolean a(String str) {
        synchronized (this.b) {
            try {
                Iterator it = this.f8317a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((jl) it.next()).b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        jl a6;
        if (!StringUtils.isValidString(str)) {
            return;
        }
        synchronized (this.b) {
            a6 = a(str, appLovinCommunicatorSubscriber);
        }
        if (a6 != null) {
            a6.a(false);
            AppLovinBroadcastManager.unregisterReceiver(a6);
        }
    }

    private jl a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (jl jlVar : this.f8317a) {
            if (str.equals(jlVar.b()) && appLovinCommunicatorSubscriber.equals(jlVar.a())) {
                return jlVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.b) {
                try {
                    jl a6 = a(str, appLovinCommunicatorSubscriber);
                    if (a6 != null) {
                        com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!a6.c()) {
                            a6.a(true);
                            AppLovinBroadcastManager.registerReceiver(a6, new IntentFilter(str));
                        }
                        return true;
                    }
                    jl jlVar = new jl(str, appLovinCommunicatorSubscriber);
                    this.f8317a.add(jlVar);
                    AppLovinBroadcastManager.registerReceiver(jlVar, new IntentFilter(str));
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }
}
