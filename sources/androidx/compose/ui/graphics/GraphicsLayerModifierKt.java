package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import org.objectweb.asm.Opcodes;
import q0.l;

/* loaded from: classes3.dex */
public final class GraphicsLayerModifierKt {
    public static final Modifier a(Modifier modifier, l lVar) {
        return modifier.T0(new BlockGraphicsLayerElement(lVar));
    }

    public static Modifier b(Modifier modifier, float f2, float f3, float f4, float f5, float f6, Shape shape, boolean z2, int i2) {
        return modifier.T0(new GraphicsLayerElement((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1.0f : f3, (i2 & 4) != 0 ? 1.0f : f4, 0.0f, 0.0f, (i2 & 32) != 0 ? 0.0f : f5, 0.0f, 0.0f, (i2 & 256) != 0 ? 0.0f : f6, (i2 & 512) != 0 ? 8.0f : 0.0f, (i2 & 1024) != 0 ? TransformOrigin.f15059b : 0L, (i2 & Opcodes.ACC_STRICT) != 0 ? RectangleShapeKt.f15014a : shape, (i2 & 4096) != 0 ? false : z2, null, (i2 & 16384) != 0 ? GraphicsLayerScopeKt.f14985a : 0L, (i2 & 32768) != 0 ? GraphicsLayerScopeKt.f14985a : 0L, 0));
    }
}
