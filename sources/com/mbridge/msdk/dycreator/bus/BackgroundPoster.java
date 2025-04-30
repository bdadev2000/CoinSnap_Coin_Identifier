package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes3.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f15235a = new PendingPostQueue();
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f15236c;

    public BackgroundPoster(EventBus eventBus) {
        this.f15236c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost a6 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f15235a.a(a6);
                if (!this.b) {
                    this.b = true;
                    EventBus.f15237a.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    PendingPost a6 = this.f15235a.a(1000);
                    if (a6 == null) {
                        synchronized (this) {
                            a6 = this.f15235a.a();
                            if (a6 == null) {
                                this.b = false;
                                this.b = false;
                                return;
                            }
                        }
                    }
                    this.f15236c.a(a6);
                } catch (InterruptedException e4) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e4);
                    this.b = false;
                    return;
                }
            } catch (Throwable th) {
                this.b = false;
                throw th;
            }
        }
    }
}
