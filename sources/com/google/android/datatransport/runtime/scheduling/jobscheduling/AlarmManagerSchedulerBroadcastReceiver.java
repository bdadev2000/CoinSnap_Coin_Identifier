package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C.c;
import C2.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import k3.j;
import k3.s;
import q3.e;
import q3.h;
import u3.AbstractC2753a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13882a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i9 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        c a6 = j.a();
        a6.A(queryParameter);
        a6.f349f = AbstractC2753a.b(intValue);
        if (queryParameter2 != null) {
            a6.f348d = Base64.decode(queryParameter2, 0);
        }
        h hVar = s.a().f21453d;
        j l = a6.l();
        b bVar = new b(20);
        hVar.getClass();
        hVar.f22770e.execute(new e(hVar, l, i9, bVar));
    }
}
