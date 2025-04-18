package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22024a = Logger.e("ConstraintProxy");

    /* loaded from: classes2.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* loaded from: classes2.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* loaded from: classes2.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* loaded from: classes2.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.c().a(f22024a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = CommandHandler.d;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
