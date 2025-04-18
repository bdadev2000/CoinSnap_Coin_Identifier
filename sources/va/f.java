package va;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import r.j;

/* loaded from: classes3.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f26385b = new AtomicReference();
    public final Context a;

    public f(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f26386k) {
            Iterator it = ((j) g.f26387l.values()).iterator();
            while (it.hasNext()) {
                ((g) it.next()).e();
            }
        }
        this.a.unregisterReceiver(this);
    }
}
