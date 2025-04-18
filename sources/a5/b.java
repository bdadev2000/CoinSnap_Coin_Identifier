package a5;

import android.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class b implements RejectedExecutionHandler {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            this.a.offerFirst(runnable);
            if (v.a) {
                Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
            }
        } catch (Throwable unused) {
        }
    }
}
