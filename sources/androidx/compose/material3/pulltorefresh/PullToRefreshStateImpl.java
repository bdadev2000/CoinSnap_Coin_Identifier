package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import d0.b0;
import h0.g;
import i0.a;

@StabilityInferred
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {

    /* renamed from: b, reason: collision with root package name */
    public static final SaverKt$Saver$1 f13193b;

    /* renamed from: a, reason: collision with root package name */
    public final Animatable f13194a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    static {
        PullToRefreshStateImpl$Companion$Saver$1 pullToRefreshStateImpl$Companion$Saver$1 = PullToRefreshStateImpl$Companion$Saver$1.f13195a;
        PullToRefreshStateImpl$Companion$Saver$2 pullToRefreshStateImpl$Companion$Saver$2 = PullToRefreshStateImpl$Companion$Saver$2.f13196a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        f13193b = new SaverKt$Saver$1(pullToRefreshStateImpl$Companion$Saver$2, pullToRefreshStateImpl$Companion$Saver$1);
    }

    public PullToRefreshStateImpl(Animatable animatable) {
        this.f13194a = animatable;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final Object a(g gVar) {
        Object c2 = Animatable.c(this.f13194a, new Float(1.0f), null, null, null, gVar, 14);
        return c2 == a.f30806a ? c2 : b0.f30125a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final Object b(float f2, g gVar) {
        Object e = this.f13194a.e(new Float(f2), gVar);
        return e == a.f30806a ? e : b0.f30125a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final float c() {
        return ((Number) this.f13194a.d()).floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final Object d(g gVar) {
        Object c2 = Animatable.c(this.f13194a, new Float(0.0f), null, null, null, gVar, 14);
        return c2 == a.f30806a ? c2 : b0.f30125a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final boolean e() {
        return ((Boolean) this.f13194a.d.getValue()).booleanValue();
    }
}
