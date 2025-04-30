package androidx.work.impl.background.systemalarm;

import V0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.o;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5226a = o.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.e().b(f5226a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k v6 = k.v(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (k.l) {
                try {
                    v6.f3424i = goAsync;
                    if (v6.f3423h) {
                        goAsync.finish();
                        v6.f3424i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e4) {
            o.e().d(f5226a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
        }
    }
}
