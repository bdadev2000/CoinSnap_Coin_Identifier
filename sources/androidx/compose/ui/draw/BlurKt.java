package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;

/* loaded from: classes3.dex */
public final class BlurKt {
    public static Modifier a(Modifier modifier, float f2) {
        boolean z2;
        int i2;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f15014a;
        if (rectangleShapeKt$RectangleShape$1 != null) {
            i2 = 0;
            z2 = true;
        } else {
            z2 = false;
            i2 = 3;
        }
        float f3 = 0;
        return ((Float.compare(f2, f3) <= 0 || Float.compare(f2, f3) <= 0) && !z2) ? modifier : GraphicsLayerModifierKt.a(modifier, new BlurKt$blur$1(f2, f2, i2, rectangleShapeKt$RectangleShape$1, z2));
    }
}
