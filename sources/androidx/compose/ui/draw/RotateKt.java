package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* loaded from: classes3.dex */
public final class RotateKt {
    public static final Modifier a(Modifier modifier, float f2) {
        return f2 == 0.0f ? modifier : GraphicsLayerModifierKt.b(modifier, 0.0f, 0.0f, 0.0f, 0.0f, f2, null, false, 130815);
    }
}
