package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.MotionDurationScale;
import b1.f0;
import h0.j;
import h0.k;
import h0.l;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes2.dex */
final class DisableAnimationMotionDurationScale implements MotionDurationScale {

    /* renamed from: a, reason: collision with root package name */
    public static final DisableAnimationMotionDurationScale f16758a = new Object();

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // h0.l
    public final j i(k kVar) {
        return q.e(this, kVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public final float o() {
        return 0.0f;
    }

    @Override // h0.l
    public final l s(k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final l u(l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}
