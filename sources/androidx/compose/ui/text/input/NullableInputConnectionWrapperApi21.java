package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import q0.l;

/* loaded from: classes4.dex */
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final l f17343a;

    /* renamed from: b, reason: collision with root package name */
    public InputConnection f17344b;

    public NullableInputConnectionWrapperApi21(InputConnection inputConnection, l lVar) {
        this.f17343a = lVar;
        this.f17344b = inputConnection;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapper
    public final void a() {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f17344b = null;
        }
    }

    public void b(InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f17344b != null) {
            a();
            this.f17343a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i2);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        ExtractedText extractedText;
        InputConnection inputConnection = this.f17344b;
        return (inputConnection == null || (extractedText = inputConnection.getExtractedText(extractedTextRequest, i2)) == null) ? new ExtractedText() : extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        CharSequence selectedText;
        InputConnection inputConnection = this.f17344b;
        return (inputConnection == null || (selectedText = inputConnection.getSelectedText(i2)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i3) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i2, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i3) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i2, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i3) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        InputConnection inputConnection = this.f17344b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i2, i3);
        }
        return false;
    }
}
