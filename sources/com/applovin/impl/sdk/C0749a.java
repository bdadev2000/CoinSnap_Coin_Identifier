package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.h8;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0749a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: f, reason: collision with root package name */
    private static final long f10733f = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final k f10734a;
    private final t b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f10735c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f10736d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0033a {
        void onAdExpired(h8 h8Var);
    }

    public C0749a(k kVar) {
        this.f10734a = kVar;
        this.b = kVar.L();
    }

    private C0750b b(h8 h8Var) {
        synchronized (this.f10736d) {
            try {
                if (h8Var == null) {
                    return null;
                }
                Iterator it = this.f10735c.iterator();
                while (it.hasNext()) {
                    C0750b c0750b = (C0750b) it.next();
                    if (h8Var == c0750b.b()) {
                        return c0750b;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(h8 h8Var) {
        synchronized (this.f10736d) {
            try {
                C0750b b = b(h8Var);
                if (b != null) {
                    if (t.a()) {
                        this.b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + h8Var);
                    }
                    b.a();
                    a(b);
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
        synchronized (this.f10736d) {
            try {
                Iterator it = this.f10735c.iterator();
                while (it.hasNext()) {
                    C0750b c0750b = (C0750b) it.next();
                    h8 b = c0750b.b();
                    if (b == null) {
                        hashSet.add(c0750b);
                    } else {
                        long timeToLiveMillis = b.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (t.a()) {
                                this.b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + b);
                            }
                            hashSet.add(c0750b);
                        } else {
                            if (t.a()) {
                                this.b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + b);
                            }
                            c0750b.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C0750b c0750b2 = (C0750b) it2.next();
            a(c0750b2);
            c0750b2.d();
        }
    }

    public boolean a(h8 h8Var, InterfaceC0033a interfaceC0033a) {
        synchronized (this.f10736d) {
            try {
                if (b(h8Var) != null) {
                    if (t.a()) {
                        this.b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + h8Var);
                    }
                    return true;
                }
                if (h8Var.getTimeToLiveMillis() <= f10733f) {
                    if (t.a()) {
                        this.b.a("AdExpirationManager", "Ad has already expired: " + h8Var);
                    }
                    h8Var.setExpired();
                    return false;
                }
                if (t.a()) {
                    this.b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(h8Var.getTimeToLiveMillis()) + " seconds from now for " + h8Var + "...");
                }
                if (this.f10735c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f10735c.add(C0750b.a(h8Var, interfaceC0033a, this.f10734a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(C0750b c0750b) {
        synchronized (this.f10736d) {
            try {
                this.f10735c.remove(c0750b);
                if (this.f10735c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.f10736d) {
            try {
                Iterator it = this.f10735c.iterator();
                while (it.hasNext()) {
                    ((C0750b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
