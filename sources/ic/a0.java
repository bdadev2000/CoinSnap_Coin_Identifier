package ic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a0 extends BroadcastReceiver {
    public b0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f19523b;

    public a0(b0 b0Var, b0 b0Var2) {
        this.f19523b = b0Var;
        this.a = b0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f19523b.f19528b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        b0 b0Var = this.a;
        if (b0Var == null) {
            return;
        }
        if (!b0Var.d()) {
            return;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
        b0 b0Var2 = this.a;
        b0Var2.f19531f.f19598f.schedule(b0Var2, 0L, TimeUnit.SECONDS);
        context.unregisterReceiver(this);
        this.a = null;
    }
}
