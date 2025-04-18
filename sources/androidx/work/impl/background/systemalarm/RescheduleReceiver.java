package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.p;
import m2.k;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = p.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p.e().b(a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k v10 = k.v(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (k.f21457t) {
                v10.f21466q = goAsync;
                if (v10.f21465p) {
                    goAsync.finish();
                    v10.f21466q = null;
                }
            }
        } catch (IllegalStateException e2) {
            p.e().c(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
