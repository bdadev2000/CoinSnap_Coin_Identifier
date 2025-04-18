package com.facebook.bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class CancellationToken {

    @NotNull
    private final CancellationTokenSource tokenSource;

    public CancellationToken(@NotNull CancellationTokenSource cancellationTokenSource) {
        p0.a.s(cancellationTokenSource, "tokenSource");
        this.tokenSource = cancellationTokenSource;
    }

    public final boolean isCancellationRequested() {
        return this.tokenSource.isCancellationRequested();
    }

    @NotNull
    public final CancellationTokenRegistration register(@Nullable Runnable runnable) {
        return this.tokenSource.register$facebook_bolts_release(runnable);
    }

    public final void throwIfCancellationRequested() throws CancellationException {
        this.tokenSource.throwIfCancellationRequested$facebook_bolts_release();
    }

    @NotNull
    public String toString() {
        return androidx.compose.foundation.text.input.a.p(new Object[]{CancellationToken.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.tokenSource.isCancellationRequested())}, 3, Locale.US, "%s@%s[cancellationRequested=%s]", "java.lang.String.format(locale, format, *args)");
    }
}
