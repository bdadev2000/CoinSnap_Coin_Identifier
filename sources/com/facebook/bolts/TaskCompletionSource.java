package com.facebook.bolts;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class TaskCompletionSource<TResult> {

    @NotNull
    private final Task<TResult> task = new Task<>();

    @NotNull
    public final Task<TResult> getTask() {
        return this.task;
    }

    public final void setCancelled() {
        if (!trySetCancelled()) {
            throw new IllegalStateException("Cannot cancel a completed task.".toString());
        }
    }

    public final void setError(@Nullable Exception exc) {
        if (!trySetError(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.".toString());
        }
    }

    public final void setResult(@Nullable TResult tresult) {
        if (!trySetResult(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.".toString());
        }
    }

    public final boolean trySetCancelled() {
        return this.task.trySetCancelled();
    }

    public final boolean trySetError(@Nullable Exception exc) {
        return this.task.trySetError(exc);
    }

    public final boolean trySetResult(@Nullable TResult tresult) {
        return this.task.trySetResult(tresult);
    }
}
