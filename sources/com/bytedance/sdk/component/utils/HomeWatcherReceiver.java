package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {
    private zp zp;

    /* loaded from: classes.dex */
    public interface zp {
        void lMd();

        void zp();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: ".concat(String.valueOf(action)));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                Log.i("HomeReceiver", "reason: ".concat(String.valueOf(stringExtra)));
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    zp zpVar = this.zp;
                    if (zpVar != null) {
                        zpVar.zp();
                        return;
                    }
                    return;
                }
                if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    zp zpVar2 = this.zp;
                    if (zpVar2 != null) {
                        zpVar2.lMd();
                        return;
                    }
                    return;
                }
                if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        } catch (Throwable unused) {
            tG.zp("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }

    public void zp(zp zpVar) {
        this.zp = zpVar;
    }
}
