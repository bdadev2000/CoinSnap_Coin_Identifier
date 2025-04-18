package o2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.p;

/* loaded from: classes.dex */
public abstract class c extends BroadcastReceiver {
    public static final String a = p.g("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p.e().b(a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = b.f22970f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
