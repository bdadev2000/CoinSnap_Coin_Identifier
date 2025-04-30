package Y3;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class f implements Runnable {
    public final TaskCompletionSource b;

    public f() {
        this.b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e4) {
            TaskCompletionSource taskCompletionSource = this.b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e4);
            }
        }
    }

    public f(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }
}
