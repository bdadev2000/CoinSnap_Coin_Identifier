package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$5$1$alpha$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f1799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$alpha$2(FiniteAnimationSpec finiteAnimationSpec) {
        super(3);
        this.f1799a = finiteAnimationSpec;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(438406499);
        composer.D();
        return this.f1799a;
    }
}
