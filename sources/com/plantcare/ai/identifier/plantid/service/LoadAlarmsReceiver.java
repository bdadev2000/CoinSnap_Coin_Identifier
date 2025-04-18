package com.plantcare.ai.identifier.plantid.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gg.e;
import nb.a;

/* loaded from: classes4.dex */
public final class LoadAlarmsReceiver extends BroadcastReceiver {
    public final a a;

    public LoadAlarmsReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getParcelableArrayListExtra("alarms_extra");
        this.a.getClass();
        int i10 = e.f18467j;
    }

    public LoadAlarmsReceiver(a aVar) {
        this.a = aVar;
    }
}
