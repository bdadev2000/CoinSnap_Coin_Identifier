package androidx.compose.ui.platform;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import b1.f0;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
final class MotionDurationScaleImpl implements MotionDurationScale {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f16531a = PrimitiveSnapshotStateKt.a(1.0f);

    @Override // h0.l
    public final Object H(Object obj, q0.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // h0.l
    public final h0.j i(h0.k kVar) {
        return q.e(this, kVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public final float o() {
        return this.f16531a.c();
    }

    @Override // h0.l
    public final h0.l s(h0.k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final h0.l u(h0.l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}
