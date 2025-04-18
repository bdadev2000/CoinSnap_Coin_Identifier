package com.apm.insight.runtime.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.runtime.p;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {
    private int a;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    d.this.a = (int) ((intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) * 100.0f) / intent.getIntExtra("scale", 100));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public d(final Context context) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.a.d.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    d.this.a(context);
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
            }
        });
    }

    public int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }
}
