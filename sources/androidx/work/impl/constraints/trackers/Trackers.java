package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo
/* loaded from: classes2.dex */
public class Trackers {
    public static Trackers e;

    /* renamed from: a, reason: collision with root package name */
    public BatteryChargingTracker f22095a;

    /* renamed from: b, reason: collision with root package name */
    public BatteryNotLowTracker f22096b;

    /* renamed from: c, reason: collision with root package name */
    public NetworkStateTracker f22097c;
    public StorageNotLowTracker d;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.trackers.Trackers, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker, androidx.work.impl.constraints.trackers.BatteryChargingTracker] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker, androidx.work.impl.constraints.trackers.StorageNotLowTracker] */
    public static synchronized Trackers a(Context context, TaskExecutor taskExecutor) {
        Trackers trackers;
        synchronized (Trackers.class) {
            try {
                if (e == null) {
                    ?? obj = new Object();
                    Context applicationContext = context.getApplicationContext();
                    obj.f22095a = new BroadcastReceiverConstraintTracker(applicationContext, taskExecutor);
                    obj.f22096b = new BroadcastReceiverConstraintTracker(applicationContext, taskExecutor);
                    obj.f22097c = new NetworkStateTracker(applicationContext, taskExecutor);
                    obj.d = new BroadcastReceiverConstraintTracker(applicationContext, taskExecutor);
                    e = obj;
                }
                trackers = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return trackers;
    }
}
