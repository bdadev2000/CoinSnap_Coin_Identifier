package com.google.ar.core;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface Future {
    boolean cancel();

    @NonNull
    FutureState getState();
}
