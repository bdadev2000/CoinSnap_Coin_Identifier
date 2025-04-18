package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes2.dex */
public final class PainterModifierKt {
    public static Modifier a(Modifier modifier, Painter painter, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2) {
        boolean z2 = (i2 & 2) != 0;
        if ((i2 & 4) != 0) {
            alignment = Alignment.Companion.e;
        }
        Alignment alignment2 = alignment;
        if ((i2 & 8) != 0) {
            contentScale = ContentScale.Companion.e;
        }
        ContentScale contentScale2 = contentScale;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 32) != 0) {
            colorFilter = null;
        }
        return modifier.T0(new PainterElement(painter, z2, alignment2, contentScale2, f3, colorFilter));
    }
}
