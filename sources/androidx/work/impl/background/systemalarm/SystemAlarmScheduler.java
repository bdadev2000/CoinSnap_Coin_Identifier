package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;

@RestrictTo
/* loaded from: classes4.dex */
public class SystemAlarmScheduler implements Scheduler {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22057a = Logger.e("SystemAlarmScheduler");

    @Override // androidx.work.impl.Scheduler
    public final void a(String str) {
        String str2 = CommandHandler.d;
        Intent intent = new Intent((Context) null, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        throw null;
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        if (workSpecArr.length <= 0) {
            return;
        }
        WorkSpec workSpec = workSpecArr[0];
        Logger.c().a(f22057a, String.format("Scheduling work with workSpecId %s", workSpec.f22146a), new Throwable[0]);
        CommandHandler.b(null, workSpec.f22146a);
        throw null;
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean d() {
        return true;
    }
}
