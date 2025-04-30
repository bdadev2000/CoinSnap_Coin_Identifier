package C2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.facebook.r;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        G7.j.e(componentName, "name");
        G7.j.e(iBinder, NotificationCompat.CATEGORY_SERVICE);
        AtomicBoolean atomicBoolean = d.f488a;
        i iVar = i.f519a;
        Context a6 = r.a();
        Object obj = null;
        if (!O2.a.b(i.class)) {
            try {
                obj = i.f519a.h(a6, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
            } catch (Throwable th) {
                O2.a.a(i.class, th);
            }
        }
        d.f493g = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        G7.j.e(componentName, "name");
    }
}
