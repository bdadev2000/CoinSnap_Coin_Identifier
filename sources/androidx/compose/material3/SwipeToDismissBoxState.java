package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableDefaults;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SwipeToDismissBoxState {

    /* renamed from: a, reason: collision with root package name */
    public final Density f11668a = null;

    /* renamed from: b, reason: collision with root package name */
    public final AnchoredDraggableState f11669b;

    /* renamed from: androidx.compose.material3.SwipeToDismissBoxState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        this.f11669b = new AnchoredDraggableState(swipeToDismissBoxValue, null, new SwipeToDismissBoxState$anchoredDraggableState$1(this), AnchoredDraggableDefaults.f12788a, null);
    }
}
