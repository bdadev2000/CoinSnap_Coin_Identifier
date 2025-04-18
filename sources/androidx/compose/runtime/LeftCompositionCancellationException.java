package androidx.compose.runtime;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;

/* loaded from: classes3.dex */
final class LeftCompositionCancellationException extends PlatformOptimizedCancellationException {
    public LeftCompositionCancellationException() {
        super("The coroutine scope left the composition");
    }
}
