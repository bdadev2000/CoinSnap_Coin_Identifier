package a6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.x;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        AtomicBoolean atomicBoolean = b.a;
        g gVar = g.a;
        Context context = x.a();
        Object obj = null;
        if (!m6.a.b(g.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                obj = g.a.h(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th2) {
                m6.a.a(g.class, th2);
            }
        }
        b.f249g = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
