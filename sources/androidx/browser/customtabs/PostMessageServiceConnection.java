package androidx.browser.customtabs;

import a.g;
import a.h;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface queryLocalInterface;
        int i2 = g.f56a;
        if (iBinder == null || (queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.IPostMessageService")) == null || !(queryLocalInterface instanceof h)) {
            return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
