package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.i;
import com.apm.insight.l.p;

/* loaded from: classes.dex */
public class c extends a {
    public c(Handler handler, long j3, long j10) {
        super(handler, j3, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (i.c().b()) {
            return;
        }
        String d10 = i.a().d();
        if (TextUtils.isEmpty(d10) || "0".equals(d10)) {
            a(c());
            str = "[DeviceIdTask] did is null, continue check.";
        } else {
            i.c().a(d10);
            str = "[DeviceIdTask] did is " + d10;
        }
        p.a((Object) str);
    }
}
