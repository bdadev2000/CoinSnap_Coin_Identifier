package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes3.dex */
final class HandlerPoster extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f15254a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f15255c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15256d;

    public HandlerPoster(EventBus eventBus, Looper looper, int i9) {
        super(looper);
        this.f15255c = eventBus;
        this.b = i9;
        this.f15254a = new PendingPostQueue();
    }

    public final void a(Subscription subscription, Object obj) {
        PendingPost a6 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f15254a.a(a6);
                if (!this.f15256d) {
                    this.f15256d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost a6 = this.f15254a.a();
                if (a6 == null) {
                    synchronized (this) {
                        a6 = this.f15254a.a();
                        if (a6 == null) {
                            this.f15256d = false;
                            return;
                        }
                    }
                }
                this.f15255c.a(a6);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.b);
            if (sendMessage(obtainMessage())) {
                this.f15256d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f15256d = false;
            throw th;
        }
    }
}
