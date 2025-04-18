package androidx.work.impl.background.greedy;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.HashMap;

@RestrictTo
/* loaded from: classes.dex */
public class DelayedWorkTracker {
    public static final String d = Logger.e("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    public final GreedyScheduler f22007a;

    /* renamed from: b, reason: collision with root package name */
    public final RunnableScheduler f22008b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22009c = new HashMap();

    public DelayedWorkTracker(GreedyScheduler greedyScheduler, DefaultRunnableScheduler defaultRunnableScheduler) {
        this.f22007a = greedyScheduler;
        this.f22008b = defaultRunnableScheduler;
    }
}
