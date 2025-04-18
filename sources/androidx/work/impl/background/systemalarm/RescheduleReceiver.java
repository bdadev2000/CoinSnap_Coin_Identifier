package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

/* loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22041a = Logger.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.c().a(f22041a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            WorkManagerImpl b2 = WorkManagerImpl.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            b2.getClass();
            synchronized (WorkManagerImpl.f21968l) {
                try {
                    b2.f21975i = goAsync;
                    if (b2.f21974h) {
                        goAsync.finish();
                        b2.f21975i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            Logger.c().b(f22041a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
