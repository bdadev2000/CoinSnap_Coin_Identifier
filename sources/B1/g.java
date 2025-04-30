package b1;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.o;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class g extends AbstractC0550c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f5268i = o.g("StorageNotLowTracker");

    @Override // b1.AbstractC0551d
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, f());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // b1.AbstractC0550c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // b1.AbstractC0550c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o.e().b(f5268i, AbstractC2914a.d("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c(Boolean.TRUE);
                return;
            }
            return;
        }
        c(Boolean.FALSE);
    }
}
