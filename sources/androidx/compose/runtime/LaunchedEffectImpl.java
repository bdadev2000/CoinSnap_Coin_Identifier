package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.a2;
import g1.f;
import h0.l;
import kotlin.jvm.internal.e;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LaunchedEffectImpl implements RememberObserver {

    /* renamed from: a, reason: collision with root package name */
    public final p f13826a;

    /* renamed from: b, reason: collision with root package name */
    public final f f13827b;

    /* renamed from: c, reason: collision with root package name */
    public a2 f13828c;

    public LaunchedEffectImpl(l lVar, p pVar) {
        this.f13826a = pVar;
        this.f13827b = p0.a.c(lVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        a2 a2Var = this.f13828c;
        if (a2Var != null) {
            a2Var.a(new LeftCompositionCancellationException());
        }
        this.f13828c = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        a2 a2Var = this.f13828c;
        if (a2Var != null) {
            a2Var.a(new LeftCompositionCancellationException());
        }
        this.f13828c = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        a2 a2Var = this.f13828c;
        if (a2Var != null) {
            a2Var.a(e.a("Old job was still running!", null));
        }
        this.f13828c = e.v(this.f13827b, null, 0, this.f13826a, 3);
    }
}
