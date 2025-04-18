package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import b1.f0;
import kotlin.jvm.internal.o;
import q0.l;

/* loaded from: classes4.dex */
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends o implements l {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public final Boolean b(KeyEvent keyEvent) {
        Integer a2;
        KeyCommand a3;
        TextFieldKeyInput textFieldKeyInput = (TextFieldKeyInput) this.receiver;
        textFieldKeyInput.getClass();
        boolean z2 = false;
        CommitTextCommand commitTextCommand = ((keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) && (a2 = textFieldKeyInput.f6140i.a(keyEvent)) != null) ? new CommitTextCommand(new StringBuilder().appendCodePoint(a2.intValue()).toString(), 1) : null;
        TextPreparedSelectionState textPreparedSelectionState = textFieldKeyInput.f6137f;
        boolean z3 = textFieldKeyInput.d;
        if (commitTextCommand != null) {
            if (z3) {
                textFieldKeyInput.a(f0.u(commitTextCommand));
                textPreparedSelectionState.f7357a = null;
                z2 = true;
            }
        } else if (KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 2) && (a3 = textFieldKeyInput.f6141j.a(keyEvent)) != null && (!a3.f6000a || z3)) {
            ?? obj = new Object();
            obj.f30919a = true;
            TextFieldKeyInput$process$2 textFieldKeyInput$process$2 = new TextFieldKeyInput$process$2(a3, textFieldKeyInput, obj);
            TextLayoutResultProxy d = textFieldKeyInput.f6134a.d();
            OffsetMapping offsetMapping = textFieldKeyInput.f6138g;
            TextFieldValue textFieldValue = textFieldKeyInput.f6136c;
            TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(textFieldValue, offsetMapping, d, textPreparedSelectionState);
            textFieldKeyInput$process$2.invoke(textFieldPreparedSelection);
            if (!TextRange.b(textFieldPreparedSelection.f7048f, textFieldValue.f17362b) || !p0.a.g(textFieldPreparedSelection.f7049g, textFieldValue.f17361a)) {
                textFieldKeyInput.f6142k.invoke(TextFieldValue.a(textFieldValue, textFieldPreparedSelection.f7049g, textFieldPreparedSelection.f7048f, 4));
            }
            UndoManager undoManager = textFieldKeyInput.f6139h;
            if (undoManager != null) {
                undoManager.f6248f = true;
            }
            z2 = obj.f30919a;
        }
        return Boolean.valueOf(z2);
    }

    @Override // q0.l
    public final /* synthetic */ Object invoke(Object obj) {
        return b(((androidx.compose.ui.input.key.KeyEvent) obj).f15514a);
    }
}
