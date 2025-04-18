package androidx.compose.foundation;

import androidx.compose.ui.MotionDurationScale;
import b1.f0;
import h0.j;
import h0.k;
import h0.l;
import kotlin.jvm.internal.q;
import p0.a;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FixedMotionDurationScale implements MotionDurationScale {

    /* renamed from: a, reason: collision with root package name */
    public static final FixedMotionDurationScale f2700a = new Object();

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
        return 1.0f;
    }

    @Override // h0.l
    public final l s(k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final l u(l lVar) {
        a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}
