package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.p;
import androidx.work.r;
import java.util.Collections;
import m2.k;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = p.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = a;
        p.e().b(str, "Requesting diagnostics", new Throwable[0]);
        try {
            k.v(context).u(Collections.singletonList(new r(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e2) {
            p.e().c(str, "WorkManager is not initialized", e2);
        }
    }
}
