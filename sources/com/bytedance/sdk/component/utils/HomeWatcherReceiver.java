package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {
    private YFl YFl;

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg();

        void YFl();
    }

    public void YFl(YFl yFl) {
        this.YFl = yFl;
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
                    YFl yFl = this.YFl;
                    if (yFl != null) {
                        yFl.YFl();
                        return;
                    }
                    return;
                }
                if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    YFl yFl2 = this.YFl;
                    if (yFl2 != null) {
                        yFl2.Sg();
                        return;
                    }
                    return;
                }
                if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        } catch (Throwable unused) {
            YoT.YFl("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }
}
