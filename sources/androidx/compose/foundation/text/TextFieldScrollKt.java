package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TransformedText;

/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final Rect a(MeasureScope measureScope, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z2, int i3) {
        Rect c2 = textLayoutResult != null ? textLayoutResult.c(transformedText.f17393b.b(i2)) : Rect.e;
        int F0 = measureScope.F0(TextFieldCursorKt.f6116a);
        float f2 = c2.f14914a;
        return Rect.b(c2, z2 ? (i3 - f2) - F0 : f2, z2 ? i3 - f2 : F0 + f2, 0.0f, 10);
    }

    public static final Modifier b(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z2) {
        return ComposedModifierKt.a(modifier, new TextFieldScrollKt$textFieldScrollable$2(mutableInteractionSource, textFieldScrollerPosition, z2));
    }
}
