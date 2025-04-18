package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;

@Stable
/* loaded from: classes.dex */
public interface PlatformMagnifierFactory {

    /* loaded from: classes.dex */
    public static final class Companion {
        public static PlatformMagnifierFactory a() {
            if (Magnifier_androidKt.a()) {
                return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.f2840a : PlatformMagnifierFactoryApi29Impl.f2842a;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    PlatformMagnifier a(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4);

    boolean b();
}
