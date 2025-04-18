package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidViewConfiguration implements ViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewConfiguration f16394a;

    public AndroidViewConfiguration(android.view.ViewConfiguration viewConfiguration) {
        this.f16394a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long a() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final void b() {
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long c() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AndroidViewConfigurationApi34.f16395a.b(this.f16394a);
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float f() {
        return this.f16394a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float g() {
        return this.f16394a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AndroidViewConfigurationApi34.f16395a.a(this.f16394a);
        }
        return 16.0f;
    }
}
