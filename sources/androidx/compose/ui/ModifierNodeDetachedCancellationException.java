package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred
/* loaded from: classes.dex */
public final class ModifierNodeDetachedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(Modifier_jvmKt.f14700a);
        return this;
    }
}
