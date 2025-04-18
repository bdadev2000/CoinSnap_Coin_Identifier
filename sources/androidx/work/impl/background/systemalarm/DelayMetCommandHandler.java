package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestrictTo
/* loaded from: classes3.dex */
public class DelayMetCommandHandler implements WorkConstraintsCallback, ExecutionListener, WorkTimer.TimeLimitExceededListener {

    /* renamed from: k, reason: collision with root package name */
    public static final String f22032k = Logger.e("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f22033a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22035c;
    public final SystemAlarmDispatcher d;

    /* renamed from: f, reason: collision with root package name */
    public final WorkConstraintsTracker f22036f;

    /* renamed from: i, reason: collision with root package name */
    public PowerManager.WakeLock f22039i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22040j = false;

    /* renamed from: h, reason: collision with root package name */
    public int f22038h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22037g = new Object();

    public DelayMetCommandHandler(Context context, int i2, String str, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f22033a = context;
        this.f22034b = i2;
        this.d = systemAlarmDispatcher;
        this.f22035c = str;
        this.f22036f = new WorkConstraintsTracker(context, systemAlarmDispatcher.f22044b, this);
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public final void a(String str) {
        Logger.c().a(f22032k, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void b(ArrayList arrayList) {
        g();
    }

    public final void c() {
        synchronized (this.f22037g) {
            try {
                this.f22036f.e();
                this.d.f22045c.b(this.f22035c);
                PowerManager.WakeLock wakeLock = this.f22039i;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger.c().a(f22032k, String.format("Releasing wakelock %s for WorkSpec %s", this.f22039i, this.f22035c), new Throwable[0]);
                    this.f22039i.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        Integer valueOf = Integer.valueOf(this.f22034b);
        String str = this.f22035c;
        this.f22039i = WakeLocks.a(this.f22033a, String.format("%s (%s)", str, valueOf));
        String str2 = f22032k;
        Logger.c().a(str2, String.format("Acquiring wakelock %s for WorkSpec %s", this.f22039i, str), new Throwable[0]);
        this.f22039i.acquire();
        WorkSpec j2 = this.d.f22046f.f21971c.h().j(str);
        if (j2 == null) {
            g();
            return;
        }
        boolean b2 = j2.b();
        this.f22040j = b2;
        if (b2) {
            this.f22036f.d(Collections.singletonList(j2));
        } else {
            Logger.c().a(str2, String.format("No constraints for %s", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        Logger.c().a(f22032k, String.format("onExecuted %s, %s", str, Boolean.valueOf(z2)), new Throwable[0]);
        c();
        int i2 = this.f22034b;
        SystemAlarmDispatcher systemAlarmDispatcher = this.d;
        Context context = this.f22033a;
        if (z2) {
            systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(i2, CommandHandler.b(context, this.f22035c), systemAlarmDispatcher));
        }
        if (this.f22040j) {
            String str2 = CommandHandler.d;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(i2, intent, systemAlarmDispatcher));
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
        if (list.contains(this.f22035c)) {
            synchronized (this.f22037g) {
                try {
                    if (this.f22038h == 0) {
                        this.f22038h = 1;
                        Logger.c().a(f22032k, String.format("onAllConstraintsMet for %s", this.f22035c), new Throwable[0]);
                        if (this.d.d.h(this.f22035c, null)) {
                            this.d.f22045c.a(this.f22035c, this);
                        } else {
                            c();
                        }
                    } else {
                        Logger.c().a(f22032k, String.format("Already started work for %s", this.f22035c), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f22037g) {
            try {
                if (this.f22038h < 2) {
                    this.f22038h = 2;
                    Logger c2 = Logger.c();
                    String str = f22032k;
                    c2.a(str, String.format("Stopping work for WorkSpec %s", this.f22035c), new Throwable[0]);
                    Context context = this.f22033a;
                    String str2 = this.f22035c;
                    String str3 = CommandHandler.d;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    SystemAlarmDispatcher systemAlarmDispatcher = this.d;
                    systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(this.f22034b, intent, systemAlarmDispatcher));
                    if (this.d.d.f(this.f22035c)) {
                        Logger.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f22035c), new Throwable[0]);
                        Intent b2 = CommandHandler.b(this.f22033a, this.f22035c);
                        SystemAlarmDispatcher systemAlarmDispatcher2 = this.d;
                        systemAlarmDispatcher2.d(new SystemAlarmDispatcher.AddRunnable(this.f22034b, b2, systemAlarmDispatcher2));
                    } else {
                        Logger.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f22035c), new Throwable[0]);
                    }
                } else {
                    Logger.c().a(f22032k, String.format("Already stopped work for %s", this.f22035c), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
