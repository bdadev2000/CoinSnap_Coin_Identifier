package com.facebook.bolts;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface Continuation<TTaskResult, TContinuationResult> {
    @Nullable
    TContinuationResult then(@NotNull Task<TTaskResult> task) throws Exception;
}
