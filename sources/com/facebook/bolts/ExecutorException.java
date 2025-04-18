package com.facebook.bolts;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ExecutorException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecutorException(@NotNull Exception exc) {
        super("An exception was thrown by an Executor", exc);
        p0.a.s(exc, "e");
    }
}
