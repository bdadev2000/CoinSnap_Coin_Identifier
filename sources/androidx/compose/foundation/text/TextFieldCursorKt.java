package androidx.compose.foundation.text;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;

/* loaded from: classes3.dex */
public final class TextFieldCursorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6116a;

    static {
        AnimationSpecKt.b(TextFieldCursorKt$cursorAnimationSpec$1.f6126a);
        f6116a = 2;
    }

    public static final Modifier a(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Brush brush, boolean z2) {
        Modifier.Companion companion = Modifier.Companion.f14687a;
        return z2 ? ComposedModifierKt.a(companion, new TextFieldCursorKt$cursor$1(brush, legacyTextFieldState, textFieldValue, offsetMapping)) : companion;
    }
}
