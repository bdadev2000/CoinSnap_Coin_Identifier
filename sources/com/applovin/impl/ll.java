package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class ll {

    /* renamed from: a, reason: collision with root package name */
    private final Set f25098a = new HashSet(32);

    /* renamed from: b, reason: collision with root package name */
    private final Object f25099b = new Object();

    public boolean a(String str) {
        synchronized (this.f25099b) {
            try {
                Iterator it = this.f25098a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((ml) it.next()).b())) {
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
        ml a2;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f25099b) {
                a2 = a(str, appLovinCommunicatorSubscriber);
            }
            if (a2 != null) {
                a2.a(false);
                AppLovinBroadcastManager.unregisterReceiver(a2);
            }
        }
    }

    private ml a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (ml mlVar : this.f25098a) {
            if (str.equals(mlVar.b()) && appLovinCommunicatorSubscriber.equals(mlVar.a())) {
                return mlVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f25099b) {
                try {
                    ml a2 = a(str, appLovinCommunicatorSubscriber);
                    if (a2 != null) {
                        com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!a2.c()) {
                            a2.a(true);
                            AppLovinBroadcastManager.registerReceiver(a2, new IntentFilter(str));
                        }
                        return true;
                    }
                    ml mlVar = new ml(str, appLovinCommunicatorSubscriber);
                    this.f25098a.add(mlVar);
                    AppLovinBroadcastManager.registerReceiver(mlVar, new IntentFilter(str));
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }
}
