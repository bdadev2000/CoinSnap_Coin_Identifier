package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import q0.l;

/* loaded from: classes3.dex */
public final class TextFieldKeyInputKt {
    public static final Modifier a(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, l lVar, boolean z2, boolean z3, OffsetMapping offsetMapping, UndoManager undoManager, int i2) {
        return ComposedModifierKt.a(Modifier.Companion.f14687a, new TextFieldKeyInputKt$textFieldKeyInput$2(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z2, z3, offsetMapping, undoManager, lVar, i2));
    }
}
