package u4;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: u4.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2754A implements Continuation {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f23107c;

    public /* synthetic */ C2754A(int i9, TaskCompletionSource taskCompletionSource) {
        this.b = i9;
        this.f23107c = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.b) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = this.f23107c;
                if (isSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                    return null;
                }
                if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                    return null;
                }
                return null;
            case 1:
                boolean isSuccessful2 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = this.f23107c;
                if (isSuccessful2) {
                    taskCompletionSource2.trySetResult(task.getResult());
                    return null;
                }
                if (task.getException() != null) {
                    taskCompletionSource2.trySetException(task.getException());
                    return null;
                }
                return null;
            default:
                boolean isSuccessful3 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource3 = this.f23107c;
                if (isSuccessful3) {
                    taskCompletionSource3.setResult(task.getResult());
                    return null;
                }
                if (task.getException() != null) {
                    taskCompletionSource3.setException(task.getException());
                    return null;
                }
                return null;
        }
    }
}
