package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* loaded from: classes4.dex */
public final class AlphaKt {
    public static final Modifier a(Modifier modifier, float f2) {
        return f2 == 1.0f ? modifier : GraphicsLayerModifierKt.b(modifier, 0.0f, 0.0f, f2, 0.0f, 0.0f, null, true, 126971);
    }
}
