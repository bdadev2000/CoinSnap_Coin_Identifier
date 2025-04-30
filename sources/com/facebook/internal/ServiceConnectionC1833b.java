package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1833b implements ServiceConnection {
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque f13604c = new LinkedBlockingDeque();

    public final IBinder a() {
        if (!this.b.compareAndSet(true, true)) {
            Object take = this.f13604c.take();
            G7.j.d(take, "queue.take()");
            return (IBinder) take;
        }
        throw new IllegalStateException("Binder already consumed".toString());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.f13604c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
