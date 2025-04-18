package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.p;
import h.c;
import k.g;
import m2.k;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = p.g("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            p.e().b(a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
        } else {
            ((c) k.v(context).f21461l).r(new g(1, this, intent, context, goAsync()));
        }
    }
}
