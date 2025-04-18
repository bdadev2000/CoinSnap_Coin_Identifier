package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes3.dex */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyBuildDrawCacheParams f14806a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Density f14807b = DensityKt.a(1.0f, 1.0f);

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long b() {
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return f14807b;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return LayoutDirection.f17494a;
    }
}
