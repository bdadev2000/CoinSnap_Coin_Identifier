package d0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class d {
    public static Intent a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        Intent registerReceiver;
        if ((i10 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, h.obtainAndCheckReceiverPermission(context), handler);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
        return registerReceiver;
    }

    public static ComponentName b(Context context, Intent intent) {
        ComponentName startForegroundService;
        startForegroundService = context.startForegroundService(intent);
        return startForegroundService;
    }
}
