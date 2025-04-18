package androidx.compose.animation;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;

@StabilityInferred
/* loaded from: classes.dex */
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {

    /* renamed from: a, reason: collision with root package name */
    public Path f1911a;

    /* renamed from: b, reason: collision with root package name */
    public q0.a f1912b;

    /* renamed from: c, reason: collision with root package name */
    public SharedElementInternalState f1913c;

    @Override // androidx.compose.animation.LayerRenderer
    public final float a() {
        throw null;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final void b(DrawScope drawScope) {
        throw null;
    }

    public final BoundsAnimation c() {
        throw null;
    }

    public final SharedElement d() {
        throw null;
    }

    public final boolean e() {
        d().getClass();
        if (p0.a.g(null, this)) {
            return true;
        }
        throw null;
    }

    public final boolean f() {
        if (e() && d().b()) {
            throw null;
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        d().getClass();
        throw null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        d().getClass();
        throw null;
    }
}
