package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final PlatformMagnifierFactoryApi28Impl f2840a = new Object();

    @StabilityInferred
    @RequiresApi
    /* loaded from: classes2.dex */
    public static class PlatformMagnifierImpl implements PlatformMagnifier {

        /* renamed from: a, reason: collision with root package name */
        public final Magnifier f2841a;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            this.f2841a = magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final long a() {
            Magnifier magnifier = this.f2841a;
            return IntSizeKt.a(magnifier.getWidth(), magnifier.getHeight());
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void b(long j2, long j3, float f2) {
            this.f2841a.show(Offset.g(j2), Offset.h(j2));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final void c() {
            this.f2841a.update();
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final void dismiss() {
            this.f2841a.dismiss();
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final PlatformMagnifier a(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4) {
        return new PlatformMagnifierImpl(new Magnifier(view));
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean b() {
        return false;
    }
}
