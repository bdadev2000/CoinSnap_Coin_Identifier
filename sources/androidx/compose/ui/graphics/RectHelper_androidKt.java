package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;

/* loaded from: classes4.dex */
public final class RectHelper_androidKt {
    public static final Rect a(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.f14914a, (int) rect.f14915b, (int) rect.f14916c, (int) rect.d);
    }

    public static final Rect b(IntRect intRect) {
        return new Rect(intRect.f17490a, intRect.f17491b, intRect.f17492c, intRect.d);
    }

    public static final RectF c(androidx.compose.ui.geometry.Rect rect) {
        return new RectF(rect.f14914a, rect.f14915b, rect.f14916c, rect.d);
    }

    public static final androidx.compose.ui.geometry.Rect d(Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect e(RectF rectF) {
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
