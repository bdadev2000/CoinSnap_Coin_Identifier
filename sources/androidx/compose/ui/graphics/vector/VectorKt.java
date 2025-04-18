package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;

/* loaded from: classes2.dex */
public final class VectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15465a = 0;

    static {
        int i2 = Color.f14963j;
    }

    public static final boolean a(ColorFilter colorFilter) {
        if (colorFilter instanceof BlendModeColorFilter) {
            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
            if (BlendMode.a(blendModeColorFilter.f14943c, 5) || BlendMode.a(blendModeColorFilter.f14943c, 3)) {
                return true;
            }
        } else if (colorFilter == null) {
            return true;
        }
        return false;
    }
}
