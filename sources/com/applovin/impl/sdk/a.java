package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.j8;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: f, reason: collision with root package name */
    private static final long f26535f = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final j f26536a;

    /* renamed from: b, reason: collision with root package name */
    private final n f26537b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f26538c = new HashSet();
    private final Object d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0096a {
        void onAdExpired(j8 j8Var);
    }

    public a(j jVar) {
        this.f26536a = jVar;
        this.f26537b = jVar.J();
    }

    private b b(j8 j8Var) {
        synchronized (this.d) {
            try {
                if (j8Var == null) {
                    return null;
                }
                Iterator it = this.f26538c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (j8Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(j8 j8Var) {
        synchronized (this.d) {
            try {
                b b2 = b(j8Var);
                if (b2 != null) {
                    if (n.a()) {
                        this.f26537b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + j8Var);
                    }
                    b2.a();
                    a(b2);
                }
            } catch (Throwable th) {
                throw th;
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
        synchronized (this.d) {
            try {
                Iterator it = this.f26538c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    j8 b2 = bVar.b();
                    if (b2 == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = b2.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (n.a()) {
                                this.f26537b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + b2);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (n.a()) {
                                this.f26537b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + b2);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public boolean a(j8 j8Var, InterfaceC0096a interfaceC0096a) {
        synchronized (this.d) {
            try {
                if (b(j8Var) != null) {
                    if (n.a()) {
                        this.f26537b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + j8Var);
                    }
                    return true;
                }
                if (j8Var.getTimeToLiveMillis() <= f26535f) {
                    if (n.a()) {
                        this.f26537b.a("AdExpirationManager", "Ad has already expired: " + j8Var);
                    }
                    j8Var.setExpired();
                    return false;
                }
                if (n.a()) {
                    this.f26537b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(j8Var.getTimeToLiveMillis()) + " seconds from now for " + j8Var + "...");
                }
                if (this.f26538c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f26538c.add(b.a(j8Var, interfaceC0096a, this.f26536a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.d) {
            try {
                this.f26538c.remove(bVar);
                if (this.f26538c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.d) {
            try {
                Iterator it = this.f26538c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
