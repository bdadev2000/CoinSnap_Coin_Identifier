package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@RequiresApi
/* loaded from: classes3.dex */
final class Api34LegacyPerformHandwritingGestureImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final Api34LegacyPerformHandwritingGestureImpl f6366a = new Object();

    @DoNotInline
    public final void a(@Nullable LegacyTextFieldState legacyTextFieldState, @Nullable TextFieldSelectionManager textFieldSelectionManager, @NotNull HandwritingGesture handwritingGesture, @Nullable ViewConfiguration viewConfiguration, @Nullable Executor executor, @Nullable IntConsumer intConsumer, @NotNull l lVar) {
        int j2 = legacyTextFieldState != null ? HandwritingGestureApi34.f6408a.j(legacyTextFieldState, handwritingGesture, textFieldSelectionManager, viewConfiguration, lVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new c(intConsumer, j2, 0));
        } else {
            intConsumer.accept(j2);
        }
    }

    @DoNotInline
    public final boolean b(@Nullable LegacyTextFieldState legacyTextFieldState, @Nullable TextFieldSelectionManager textFieldSelectionManager, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return HandwritingGestureApi34.f6408a.B(legacyTextFieldState, previewableHandwritingGesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}
