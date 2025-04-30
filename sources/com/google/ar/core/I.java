package com.google.ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class I implements ServiceConnection {
    public final /* synthetic */ H b;

    public I(H h6) {
        this.b = h6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        H h6 = this.b;
        synchronized (h6) {
            com.google.ar.core.dependencies.h b = com.google.ar.core.dependencies.g.b(iBinder);
            Log.i("ARCore-InstallService", "Install service connected");
            h6.f14265c = b;
            h6.f14271i = 3;
            Iterator it = h6.f14264a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        H h6 = this.b;
        synchronized (h6) {
            Log.i("ARCore-InstallService", "Install service disconnected");
            h6.f14271i = 1;
            h6.f14265c = null;
        }
    }
}
