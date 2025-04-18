package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11021b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque f11022c = new LinkedBlockingDeque();

    public final IBinder a() {
        if (!this.f11021b.compareAndSet(true, true)) {
            Object take = this.f11022c.take();
            Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
            return (IBinder) take;
        }
        throw new IllegalStateException("Binder already consumed".toString());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.f11022c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
