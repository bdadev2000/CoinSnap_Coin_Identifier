package X0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.o;

/* loaded from: classes.dex */
public abstract class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3634a = o.g("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.e().b(f3634a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = b.f3631f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
