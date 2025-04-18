package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.b0;
import h0.g;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred
/* loaded from: classes4.dex */
public final class CursorAnimationState {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f6392a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f6393b = PrimitiveSnapshotStateKt.a(0.0f);

    public final Object a(g gVar) {
        Object J = p0.a.J(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }
}
