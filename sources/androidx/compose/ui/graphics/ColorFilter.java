package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public class ColorFilter {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.ColorFilter f14965a;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static BlendModeColorFilter a(int i2, long j2) {
            return new BlendModeColorFilter(j2, i2, Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.f14944a.a(j2, i2) : new PorterDuffColorFilter(ColorKt.j(j2), AndroidBlendMode_androidKt.b(i2)));
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f14965a = colorFilter;
    }
}
