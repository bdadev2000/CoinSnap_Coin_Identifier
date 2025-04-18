package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {
    private final PendingPostQueue a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f12886b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f12887c;

    public BackgroundPoster(EventBus eventBus) {
        this.f12887c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost a = PendingPost.a(subscription, obj);
        synchronized (this) {
            this.a.a(a);
            if (!this.f12886b) {
                this.f12886b = true;
                EventBus.a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                PendingPost a = this.a.a(1000);
                if (a == null) {
                    synchronized (this) {
                        a = this.a.a();
                        if (a == null) {
                            return;
                        }
                    }
                }
                this.f12887c.a(a);
            } catch (InterruptedException e2) {
                Log.w("Event", Thread.currentThread().getName() + " was interruppted", e2);
                return;
            } finally {
                this.f12886b = false;
            }
        }
    }
}
