package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes3.dex */
final class Api34PerformHandwritingGestureImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final Api34PerformHandwritingGestureImpl f6367a = new Object();

    @DoNotInline
    public final void a(@NotNull TextInputSession textInputSession, @NotNull HandwritingGesture handwritingGesture, @Nullable Executor executor, @Nullable IntConsumer intConsumer) {
        int c2 = textInputSession.c(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new c(intConsumer, c2, 1));
        } else {
            intConsumer.accept(c2);
        }
    }

    @DoNotInline
    public final boolean b(@NotNull TextInputSession textInputSession, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        return textInputSession.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
