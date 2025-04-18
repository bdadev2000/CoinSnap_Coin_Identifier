package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes4.dex */
public final class FocusRequesterModifierKt {
    public static final Modifier a(Modifier modifier, FocusRequester focusRequester) {
        return modifier.T0(new FocusRequesterElement(focusRequester));
    }
}
