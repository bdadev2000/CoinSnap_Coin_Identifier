package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.l.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f5846a = new ArrayList(3);

    private d(Handler handler, Context context) {
        if (com.apm.insight.l.a.b(context)) {
            this.f5846a.add(new c(handler, 0L, 15000L));
        }
    }

    public static d a(Handler handler, Context context) {
        return new d(handler, context);
    }

    public void a() {
        q.a((Object) ("[ScheduleTaskManager] execute, task size=" + this.f5846a.size()));
        Iterator<a> it = this.f5846a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Throwable unused) {
            }
        }
    }
}
