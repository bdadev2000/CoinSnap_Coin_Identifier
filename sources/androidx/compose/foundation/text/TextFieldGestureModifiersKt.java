package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import q0.l;

/* loaded from: classes4.dex */
public final class TextFieldGestureModifiersKt {
    public static final Modifier a(boolean z2, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, l lVar) {
        return FocusableKt.a(mutableInteractionSource, FocusChangedModifierKt.a(FocusRequesterModifierKt.a(Modifier.Companion.f14687a, focusRequester), lVar), z2);
    }
}
