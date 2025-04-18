package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@RestrictTo
/* loaded from: classes.dex */
public class WorkManagerTaskExecutor implements TaskExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialExecutor f22263a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f22264b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final Executor f22265c = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.f22264b.post(runnable);
        }
    };

    public WorkManagerTaskExecutor(ExecutorService executorService) {
        this.f22263a = new SerialExecutor(executorService);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final Executor a() {
        return this.f22265c;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final void b(Runnable runnable) {
        this.f22263a.execute(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final SerialExecutor c() {
        return this.f22263a;
    }
}
