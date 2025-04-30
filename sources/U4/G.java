package U4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class G extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public H f3266a;
    public final /* synthetic */ H b;

    public G(H h6, H h9) {
        this.b = h6;
        this.f3266a = h9;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            H h6 = this.f3266a;
            if (h6 == null) {
                return;
            }
            if (!h6.d()) {
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            H h9 = this.f3266a;
            h9.f3272f.f3263f.schedule(h9, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f3266a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
