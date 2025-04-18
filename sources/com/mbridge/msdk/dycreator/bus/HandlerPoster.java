package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes4.dex */
final class HandlerPoster extends Handler {
    private final PendingPostQueue a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12903b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f12904c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12905d;

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f12904c = eventBus;
        this.f12903b = i10;
        this.a = new PendingPostQueue();
    }

    public final void a(Subscription subscription, Object obj) {
        PendingPost a = PendingPost.a(subscription, obj);
        synchronized (this) {
            this.a.a(a);
            if (!this.f12905d) {
                this.f12905d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost a = this.a.a();
                if (a == null) {
                    synchronized (this) {
                        a = this.a.a();
                        if (a == null) {
                            return;
                        }
                    }
                }
                this.f12904c.a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f12903b);
            if (sendMessage(obtainMessage())) {
                this.f12905d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f12905d = false;
        }
    }
}
