package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.applovin.impl.sdk.g0;
import h.c;
import i7.i;
import i7.r;
import n7.e;
import r7.a;

/* loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        c a10 = i.a();
        a10.G(queryParameter);
        a10.I(a.b(intValue));
        if (queryParameter2 != null) {
            a10.f18524d = Base64.decode(queryParameter2, 0);
        }
        n7.i iVar = r.a().f19196d;
        i o10 = a10.o();
        g0 g0Var = new g0(17);
        iVar.getClass();
        iVar.f22489e.execute(new e(iVar, o10, i10, g0Var));
    }
}
