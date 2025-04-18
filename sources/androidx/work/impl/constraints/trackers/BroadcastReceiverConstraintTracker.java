package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo
/* loaded from: classes3.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final String f22081h = Logger.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f22082g;

    public BroadcastReceiverConstraintTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.f22082g = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (intent != null) {
                    BroadcastReceiverConstraintTracker.this.g(intent);
                }
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void d() {
        Logger.c().a(f22081h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f22086b.registerReceiver(this.f22082g, f());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void e() {
        Logger.c().a(f22081h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f22086b.unregisterReceiver(this.f22082g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
