package com.facebook.bolts;

import androidx.annotation.VisibleForTesting;
import com.facebook.bolts.Task;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class UnobservedErrorNotifier {

    @Nullable
    private Task<?> task;

    public UnobservedErrorNotifier(@Nullable Task<?> task) {
        this.task = task;
    }

    @VisibleForTesting
    public final void finalize() {
        Task.UnobservedExceptionHandler unobservedExceptionHandler;
        Task<?> task = this.task;
        if (task == null || (unobservedExceptionHandler = Task.Companion.getUnobservedExceptionHandler()) == null) {
            return;
        }
        unobservedExceptionHandler.unobservedException(task, new UnobservedTaskException(task.getError()));
    }

    public final void setObserved() {
        this.task = null;
    }
}
