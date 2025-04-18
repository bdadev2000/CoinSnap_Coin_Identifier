package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;

/* loaded from: classes4.dex */
public final class ClipKt {
    public static final Modifier a(Modifier modifier, Shape shape) {
        return GraphicsLayerModifierKt.b(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, shape, true, 124927);
    }

    public static final Modifier b(Modifier modifier) {
        return GraphicsLayerModifierKt.b(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }
}
