package org.koin.core.logger;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class EmptyLogger extends Logger {
    public EmptyLogger() {
        super(Level.NONE);
    }

    @Override // org.koin.core.logger.Logger
    public void display(@NotNull Level level, @NotNull String str) {
        a.s(level, "level");
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
    }
}
