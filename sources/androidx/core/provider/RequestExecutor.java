package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
class RequestExecutor {

    /* loaded from: classes.dex */
    public static class DefaultThreadFactory implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public String f18646a;

        /* renamed from: b, reason: collision with root package name */
        public int f18647b;

        /* loaded from: classes.dex */
        public static class ProcessPriorityThread extends Thread {

            /* renamed from: a, reason: collision with root package name */
            public final int f18648a;

            public ProcessPriorityThread(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f18648a = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(this.f18648a);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.f18646a, this.f18647b);
        }
    }

    /* loaded from: classes.dex */
    public static class HandlerExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class ReplyRunnable<T> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Callable f18649a;

        /* renamed from: b, reason: collision with root package name */
        public Consumer f18650b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f18651c;

        @Override // java.lang.Runnable
        public final void run() {
            final Object obj;
            try {
                obj = this.f18649a.call();
            } catch (Exception unused) {
                obj = null;
            }
            final Consumer consumer = this.f18650b;
            this.f18651c.post(new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                @Override // java.lang.Runnable
                public final void run() {
                    Consumer.this.accept(obj);
                }
            });
        }
    }
}
