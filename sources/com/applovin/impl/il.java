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
    private final Set a = new HashSet(32);

    /* renamed from: b, reason: collision with root package name */
    private final Object f5352b = new Object();

    public boolean a(String str) {
        synchronized (this.f5352b) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (str.equals(((jl) it.next()).b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        jl a;
        if (!StringUtils.isValidString(str)) {
            return;
        }
        synchronized (this.f5352b) {
            a = a(str, appLovinCommunicatorSubscriber);
        }
        if (a != null) {
            a.a(false);
            AppLovinBroadcastManager.unregisterReceiver(a);
        }
    }

    private jl a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (jl jlVar : this.a) {
            if (str.equals(jlVar.b()) && appLovinCommunicatorSubscriber.equals(jlVar.a())) {
                return jlVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f5352b) {
                jl a = a(str, appLovinCommunicatorSubscriber);
                if (a != null) {
                    com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!a.c()) {
                        a.a(true);
                        AppLovinBroadcastManager.registerReceiver(a, new IntentFilter(str));
                    }
                    return true;
                }
                jl jlVar = new jl(str, appLovinCommunicatorSubscriber);
                this.a.add(jlVar);
                AppLovinBroadcastManager.registerReceiver(jlVar, new IntentFilter(str));
                return true;
            }
        }
        com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }
}
