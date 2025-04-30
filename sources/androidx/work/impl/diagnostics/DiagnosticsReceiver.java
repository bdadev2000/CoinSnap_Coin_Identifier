package androidx.work.impl.diagnostics;

import C.c;
import V0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.o;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5232a = o.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f5232a;
        o.e().b(str, "Requesting diagnostics", new Throwable[0]);
        try {
            k.v(context).g(new c(DiagnosticsWorker.class).k());
        } catch (IllegalStateException e4) {
            o.e().d(str, "WorkManager is not initialized", e4);
        }
    }
}
