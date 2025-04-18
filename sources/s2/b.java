package s2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import androidx.work.p;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f24155i = p.g("BatteryNotLowTracker");

    public b(Context context, x2.a aVar) {
        super(context, aVar);
    }

    @Override // s2.d
    public final Object a() {
        Intent registerReceiver = this.f24159b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            p.e().c(f24155i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 1 || intExtra > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // s2.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // s2.c
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        p.e().b(f24155i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                b(Boolean.FALSE);
                return;
            }
            return;
        }
        b(Boolean.TRUE);
    }
}
