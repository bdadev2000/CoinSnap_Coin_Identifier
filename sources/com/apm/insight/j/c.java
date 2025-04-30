package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.i;
import com.apm.insight.l.q;

/* loaded from: classes.dex */
public class c extends a {
    public c(Handler handler, long j7, long j9) {
        super(handler, j7, j9);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (i.c().b()) {
            return;
        }
        String d2 = i.a().d();
        if (TextUtils.isEmpty(d2) || "0".equals(d2)) {
            a(c());
            str = "[DeviceIdTask] did is null, continue check.";
        } else {
            i.c().a(d2);
            str = "[DeviceIdTask] did is " + d2;
        }
        q.a((Object) str);
    }
}
