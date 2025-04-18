package org.koin.compose.error;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class UnknownKoinContext extends RuntimeException {
    public static final int $stable = 0;

    public UnknownKoinContext() {
        super("No Koin context has been provided");
    }
}
