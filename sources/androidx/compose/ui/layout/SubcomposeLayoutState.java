package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SubcomposeLayoutState {

    /* renamed from: a, reason: collision with root package name */
    public final SubcomposeSlotReusePolicy f15850a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutNodeSubcompositionsState f15851b;

    /* renamed from: c, reason: collision with root package name */
    public final p f15852c = new SubcomposeLayoutState$setRoot$1(this);
    public final p d = new SubcomposeLayoutState$setCompositionContext$1(this);
    public final p e = new SubcomposeLayoutState$setMeasurePolicy$1(this);

    /* loaded from: classes2.dex */
    public interface PrecomposedSlotHandle {
        default void a(int i2, long j2) {
        }

        default int b() {
            return 0;
        }

        default void c(l lVar) {
        }

        void dispose();
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.f15850a = subcomposeSlotReusePolicy;
    }

    public final LayoutNodeSubcompositionsState a() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f15851b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
}
