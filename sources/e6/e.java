package e6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f17124b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public IBinder f17125c;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17124b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
        this.f17125c = serviceBinder;
        this.f17124b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
