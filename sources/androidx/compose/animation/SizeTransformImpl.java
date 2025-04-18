package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import q0.p;

/* loaded from: classes4.dex */
final class SizeTransformImpl implements SizeTransform {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1960a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1961b;

    public SizeTransformImpl(p pVar, boolean z2) {
        this.f1960a = z2;
        this.f1961b = pVar;
    }

    @Override // androidx.compose.animation.SizeTransform
    public final boolean b() {
        return this.f1960a;
    }

    @Override // androidx.compose.animation.SizeTransform
    public final FiniteAnimationSpec c(long j2, long j3) {
        return (FiniteAnimationSpec) this.f1961b.invoke(new IntSize(j2), new IntSize(j3));
    }
}
