package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v {
    private final Queue a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f8008b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8008b) {
            if (b() <= 25) {
                this.a.offer(appLovinAdImpl);
            } else {
                t.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f8008b) {
            size = this.a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f8008b) {
            if (b() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f8008b) {
            appLovinAdImpl = (AppLovinAdImpl) this.a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8008b) {
            this.a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f8008b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
