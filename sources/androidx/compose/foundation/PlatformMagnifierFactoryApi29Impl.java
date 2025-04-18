package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import p0.a;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final PlatformMagnifierFactoryApi29Impl f2842a = new Object();

    @StabilityInferred
    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        public final void b(long j2, long j3, float f2) {
            boolean isNaN = Float.isNaN(f2);
            Magnifier magnifier = this.f2841a;
            if (!isNaN) {
                magnifier.setZoom(f2);
            }
            if (OffsetKt.c(j3)) {
                magnifier.show(Offset.g(j2), Offset.h(j2), Offset.g(j3), Offset.h(j3));
            } else {
                magnifier.show(Offset.g(j2), Offset.h(j2));
            }
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final PlatformMagnifier a(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4) {
        if (z2) {
            return new PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl(new Magnifier(view));
        }
        long L = density.L(j2);
        float y1 = density.y1(f2);
        float y12 = density.y1(f3);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (L != 9205357640488583168L) {
            builder.setSize(a.t0(Size.d(L)), a.t0(Size.b(L)));
        }
        if (!Float.isNaN(y1)) {
            builder.setCornerRadius(y1);
        }
        if (!Float.isNaN(y12)) {
            builder.setElevation(y12);
        }
        if (!Float.isNaN(f4)) {
            builder.setInitialZoom(f4);
        }
        builder.setClippingEnabled(z3);
        return new PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl(builder.build());
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean b() {
        return true;
    }
}
