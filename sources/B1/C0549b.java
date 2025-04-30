package b1;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import androidx.work.o;
import com.applovin.sdk.AppLovinEventTypes;
import x0.AbstractC2914a;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549b extends AbstractC0550c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f5256i = o.g("BatteryNotLowTracker");

    @Override // b1.AbstractC0551d
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z8 = false;
        if (registerReceiver == null) {
            o.e().d(f5256i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 1 || intExtra > 0.15f) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }

    @Override // b1.AbstractC0550c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // b1.AbstractC0550c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o.e().b(f5256i, AbstractC2914a.d("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                c(Boolean.FALSE);
                return;
            }
            return;
        }
        c(Boolean.TRUE);
    }
}
