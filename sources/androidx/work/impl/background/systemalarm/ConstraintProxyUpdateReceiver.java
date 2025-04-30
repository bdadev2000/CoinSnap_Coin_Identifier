package androidx.work.impl.background.systemalarm;

import A4.e;
import C.c;
import V0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.o;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5225a = o.g("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            o.e().b(f5225a, AbstractC2914a.d("Ignoring unknown action ", str), new Throwable[0]);
        } else {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            ((c) k.v(context).f3419d).p(new e(intent, context, goAsync));
        }
    }
}
