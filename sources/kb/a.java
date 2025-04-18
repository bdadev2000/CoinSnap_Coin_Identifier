package kb;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f20629b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20630c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public Task f20631d = Tasks.forResult(null);

    public a(ExecutorService executorService) {
        this.f20629b = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f20630c) {
            continueWithTask = this.f20631d.continueWithTask(this.f20629b, new gb.d(runnable, 4));
            this.f20631d = continueWithTask;
        }
        return continueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20629b.execute(runnable);
    }
}
