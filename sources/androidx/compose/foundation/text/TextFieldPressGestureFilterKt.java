package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes4.dex */
public final class TextFieldPressGestureFilterKt {
    public static final Modifier a(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z2, l lVar) {
        return z2 ? ComposedModifierKt.a(modifier, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(lVar, mutableInteractionSource)) : modifier;
    }
}
