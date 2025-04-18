package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.h8;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: f, reason: collision with root package name */
    private static final long f7578f = TimeUnit.SECONDS.toMillis(2);
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final t f7579b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f7580c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f7581d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0033a {
        void onAdExpired(h8 h8Var);
    }

    public a(k kVar) {
        this.a = kVar;
        this.f7579b = kVar.L();
    }

    private b b(h8 h8Var) {
        synchronized (this.f7581d) {
            if (h8Var == null) {
                return null;
            }
            Iterator it = this.f7580c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (h8Var == bVar.b()) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public void a(h8 h8Var) {
        synchronized (this.f7581d) {
            b b3 = b(h8Var);
            if (b3 != null) {
                if (t.a()) {
                    this.f7579b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + h8Var);
                }
                b3.a();
                a(b3);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f7581d) {
            Iterator it = this.f7580c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                h8 b3 = bVar.b();
                if (b3 == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = b3.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (t.a()) {
                            this.f7579b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + b3);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (t.a()) {
                            this.f7579b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + b3);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public boolean a(h8 h8Var, InterfaceC0033a interfaceC0033a) {
        synchronized (this.f7581d) {
            if (b(h8Var) != null) {
                if (t.a()) {
                    this.f7579b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + h8Var);
                }
                return true;
            }
            if (h8Var.getTimeToLiveMillis() <= f7578f) {
                if (t.a()) {
                    this.f7579b.a("AdExpirationManager", "Ad has already expired: " + h8Var);
                }
                h8Var.setExpired();
                return false;
            }
            if (t.a()) {
                this.f7579b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(h8Var.getTimeToLiveMillis()) + " seconds from now for " + h8Var + "...");
            }
            if (this.f7580c.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.f7580c.add(b.a(h8Var, interfaceC0033a, this.a));
            return true;
        }
    }

    public void a(b bVar) {
        synchronized (this.f7581d) {
            this.f7580c.remove(bVar);
            if (this.f7580c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.f7581d) {
            Iterator it = this.f7580c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }
}
