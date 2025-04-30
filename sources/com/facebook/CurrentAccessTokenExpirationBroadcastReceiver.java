package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        G7.j.e(context, "context");
        G7.j.e(intent, "intent");
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && r.f13812o.get()) {
            C1827e s5 = C1827e.f13531f.s();
            C0785a c0785a = s5.f13534c;
            s5.b(c0785a, c0785a);
        }
    }
}
