package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes2.dex */
public interface TaskExecutor {
    Executor a();

    void b(Runnable runnable);

    SerialExecutor c();
}
