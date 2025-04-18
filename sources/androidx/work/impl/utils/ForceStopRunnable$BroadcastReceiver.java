package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.p;
import v2.e;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String a = p.g("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            if (p.e().f2227b <= 2) {
                Log.v(a, "Rescheduling alarm that keeps track of force-stops.");
            }
            e.c(context);
        }
    }
}
