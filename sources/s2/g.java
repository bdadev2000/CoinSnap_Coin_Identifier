package s2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.p;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f24167i = p.g("StorageNotLowTracker");

    public g(Context context, x2.a aVar) {
        super(context, aVar);
    }

    @Override // s2.d
    public final Object a() {
        Intent registerReceiver = this.f24159b.registerReceiver(null, e());
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

    @Override // s2.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // s2.c
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        p.e().b(f24167i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                b(Boolean.TRUE);
                return;
            }
            return;
        }
        b(Boolean.FALSE);
    }
}
