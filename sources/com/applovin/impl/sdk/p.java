package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f26835a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f26836b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f26836b) {
            try {
                if (b() <= 25) {
                    this.f26835a.offer(appLovinAdImpl);
                } else {
                    n.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f26836b) {
            size = this.f26835a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z2;
        synchronized (this.f26836b) {
            z2 = b() == 0;
        }
        return z2;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f26836b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f26835a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f26836b) {
            this.f26835a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f26836b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f26835a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
