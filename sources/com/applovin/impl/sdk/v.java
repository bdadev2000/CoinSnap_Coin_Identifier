package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f11170a = new LinkedList();
    private final Object b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            try {
                if (b() <= 25) {
                    this.f11170a.offer(appLovinAdImpl);
                } else {
                    t.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.b) {
            size = this.f11170a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z8;
        synchronized (this.b) {
            if (b() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f11170a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            this.f11170a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f11170a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
