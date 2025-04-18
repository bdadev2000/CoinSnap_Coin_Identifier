package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred
/* loaded from: classes4.dex */
public final class CancelTimeoutCancellationException extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public static final CancelTimeoutCancellationException f15545a = new CancellationException();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(SuspendingPointerInputFilter_jvmKt.f15644a);
        return this;
    }
}
