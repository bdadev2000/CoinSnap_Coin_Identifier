package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class ExecutorCompat {

    /* loaded from: classes3.dex */
    public static class HandlerExecutor implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f18611a;

        public HandlerExecutor(Handler handler) {
            this.f18611a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            Handler handler = this.f18611a;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new HandlerExecutor(handler);
    }
}
