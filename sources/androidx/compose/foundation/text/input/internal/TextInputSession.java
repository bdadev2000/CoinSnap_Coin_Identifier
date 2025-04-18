package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import q0.l;

/* loaded from: classes2.dex */
public interface TextInputSession {
    TextFieldCharSequence a();

    void b(int i2);

    int c(HandwritingGesture handwritingGesture);

    boolean d(TransferableContent transferableContent);

    void e(l lVar);

    boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i2);

    void sendKeyEvent(KeyEvent keyEvent);
}
