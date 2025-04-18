package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes3.dex */
public final class TextUndoManagerKt {
    public static final void a(TextUndoManager textUndoManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, ChangeTracker changeTracker, boolean z2) {
        int i2 = changeTracker.f6369a.f14144c;
        if (i2 > 1) {
            textUndoManager.b(new TextUndoOperation(0, textFieldCharSequence.f6297a.toString(), textFieldCharSequence2.f6297a.toString(), textFieldCharSequence.f6298b, textFieldCharSequence2.f6298b, 0L, false, 32));
            return;
        }
        if (i2 == 1) {
            long c2 = changeTracker.c(0);
            long d = changeTracker.d(0);
            if (TextRange.c(c2) && TextRange.c(d)) {
                return;
            }
            textUndoManager.b(new TextUndoOperation(TextRange.f(c2), TextRangeKt.c(c2, textFieldCharSequence), TextRangeKt.c(d, textFieldCharSequence2), textFieldCharSequence.f6298b, textFieldCharSequence2.f6298b, 0L, z2, 32));
        }
    }
}
