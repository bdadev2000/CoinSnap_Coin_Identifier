package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes4.dex */
public final class TextFieldSelectionManager_androidKt {
    public static final l a(ContextMenuState contextMenuState, TextFieldSelectionManager textFieldSelectionManager) {
        return new TextFieldSelectionManager_androidKt$contextMenuBuilder$1(contextMenuState, textFieldSelectionManager);
    }

    public static final Modifier b(TextFieldSelectionManager textFieldSelectionManager) {
        Modifier.Companion companion = Modifier.Companion.f14687a;
        return !Magnifier_androidKt.a() ? companion : ComposedModifierKt.a(companion, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(textFieldSelectionManager));
    }
}
