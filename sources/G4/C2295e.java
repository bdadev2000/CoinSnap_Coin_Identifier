package g4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import x.k;

/* renamed from: g4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2295e extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f20431a;

    public C2295e(Context context) {
        this.f20431a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C2296f.f20432k) {
            try {
                Iterator it = ((k) C2296f.l.values()).iterator();
                while (it.hasNext()) {
                    ((C2296f) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20431a.unregisterReceiver(this);
    }
}
