package G2;

import G7.j;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class e implements ServiceConnection {
    public final CountDownLatch b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public IBinder f1269c;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        j.e(componentName, "name");
        this.b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j.e(componentName, "name");
        j.e(iBinder, "serviceBinder");
        this.f1269c = iBinder;
        this.b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j.e(componentName, "name");
    }
}
