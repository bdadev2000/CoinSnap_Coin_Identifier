package com.plantcare.ai.identifier.plantid.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executors;
import u1.d;

/* loaded from: classes4.dex */
public class BootReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Executors.newSingleThreadExecutor().execute(new d(context, 2));
        }
    }
}
