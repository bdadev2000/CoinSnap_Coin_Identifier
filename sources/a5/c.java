package a5;

import android.util.Log;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class c extends LinkedBlockingDeque {

    /* renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f175b;

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public final boolean offer(Object obj) {
        synchronized (this) {
            int poolSize = this.f175b.getPoolSize();
            int activeCount = this.f175b.getActiveCount();
            int maximumPoolSize = this.f175b.getMaximumPoolSize();
            if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                if (v.a) {
                    Log.i("TAG_PROXY_TT", "create new preloader thread");
                }
                return false;
            }
            return offerFirst(obj);
        }
    }
}
