package ai;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {
    public final ThreadPoolExecutor a;

    public d(xh.a threadFactory) {
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }
}
